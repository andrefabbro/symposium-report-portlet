package com.liferay.symposium.portlet.report.messaging;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.symposium.portlet.report.model.Report;
import com.liferay.symposium.portlet.report.service.ReportLocalServiceUtil;
import com.liferay.symposium.portlet.report.util.ReportStatus;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ReportAssemblerMessageListener implements MessageListener {

    private static final Log _log = LogFactoryUtil.getLog(ReportAssemblerMessageListener.class);

    private Map<Long, Report> reports = new ConcurrentHashMap<Long, Report>();

    @Override
    public void receive(Message message) throws MessageListenerException {
        try {
            _doReceive(message);
        } catch (Exception e) {
            _log.error("Problemas ao processar mensagens para o destino: " + message.getDestinationName());
        }
    }

    private void _doReceive(Message message) throws SystemException {

        long reportId = GetterUtil.getLong(message.get("reportId"));
        String section = GetterUtil.getString(message.get("section"));
        boolean error = GetterUtil.getBoolean(message.get("error"));

        String status = error ? ReportStatus.STATUS_ERROR : ReportStatus.STATUS_COMPLETE;

        Report r = _getReport(reportId);

        _log.info("Consolidando " + section + " para o relatorio " + r.getReportName() + "...");

        switch (section) {
            case "summary":
                r.setSectionSummaryStatus(status);
                break;
            case "roi":
                r.setSectionROIStatus(status);
                break;
            case "recommendations":
                r.setSectionRecommendationsStatus(status);
                break;
            case "metrics":
                r.setSectionMetricsStatus(status);
                break;
            case "costs":
                r.setSectionCostsStatus(status);
                break;
            default:
                _log.warn("Secao inesperada: " + section);
        }

        // caso o relatorio esteja completo ou com erro, remove do map e grava no banco
        if (_isAssembled(r)) {

            long end = System.currentTimeMillis();
            r.setEndTime(new Date(end));

            ReportLocalServiceUtil.updateReport(r);

            // remove do map para nao ser processado novamente
            reports.remove(reportId);

            long start = r.getStartTime().getTime();
            _log.info(r.getReportName() + " finalizou em " + ((end - start) / 1000) + " segundos.");

        } else {
            // nesse caso retorna o relatorio ao map para continuar na espera
            reports.put(reportId, r);
        }
    }

    private Report _getReport(long reportId) {
        try {
            if (reports.containsKey(reportId)) {

                // retorna a instância que está armazenada no Map
                return reports.get(reportId);

            } else {

                // retorna o registro do banco e o armazena no Map
                Report r = ReportLocalServiceUtil.getReport(reportId);
                reports.put(reportId, r);
                return r;
            }
        } catch (Exception e) {
            _log.error("Falha ao recuperar relatorio com o id: " + reportId, e);
        }
        return null;
    }

    private boolean _isAssembled(Report report) {

        if (report.getSectionSummaryStatus().equals(ReportStatus.STATUS_COMPLETE) &&
                report.getSectionROIStatus().equals(ReportStatus.STATUS_COMPLETE) &&
                report.getSectionRecommendationsStatus().equals(ReportStatus.STATUS_COMPLETE) &&
                report.getSectionMetricsStatus().equals(ReportStatus.STATUS_COMPLETE) &&
                report.getSectionCostsStatus().equals(ReportStatus.STATUS_COMPLETE)
                ) {
            report.setReportStatus(ReportStatus.STATUS_COMPLETE);
            return Boolean.TRUE;
        }

        return Boolean.FALSE;
    }
}