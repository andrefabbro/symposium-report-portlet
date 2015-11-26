package com.liferay.symposium.portlet.report.messaging;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBusUtil;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.symposium.portlet.report.model.Report;
import com.liferay.symposium.portlet.report.service.ReportLocalServiceUtil;
import com.liferay.symposium.portlet.report.util.ReportStatus;

import java.util.Date;

public class CreateReportMessageListener implements MessageListener {

    private static final Log _log = LogFactoryUtil.getLog(CreateReportMessageListener.class);

    @Override
    public void receive(Message message) throws MessageListenerException {
        try {
            _doReceive(message);
        } catch (Exception e) {
            _log.error("Houve um problema para processar a mensagem para o destino: " + message.getDestinationName());
        }
    }

    private void _doReceive(Message message) {
        try {

            Report r = _getReport(GetterUtil.getLong(message.get("reportId")));

            if (Validator.isNotNull(r) && r.getReportStatus().equals(ReportStatus.STATUS_PENDING)) {

                _log.info("Processando relatorio " + r.getReportName() + "...");

                // atualiza o status para PROCESSING
                r.setReportStatus(ReportStatus.STATUS_PROCESSING);
                r.setStartTime(new Date());
                ReportLocalServiceUtil.updateReport(r);

                boolean result = _process(r);

                if (result)
                    r.setReportStatus(ReportStatus.STATUS_COMPLETE);
                else
                    r.setReportStatus(ReportStatus.STATUS_ERROR);

                ReportLocalServiceUtil.updateReport(r);
            }

        } catch (Exception e) {
            _log.error("Ocorreu um erro ao gerar o relatorio.", e);
        }
    }

    private Report _getReport(long reportId) {
        try {
            return ReportLocalServiceUtil.getReport(reportId);
        } catch (Exception e) {
            _log.error("Falha ao retornar relatorio com o ID " + reportId, e);
        }

        return null;
    }

    private boolean _process(Report report) {

        boolean result = Boolean.FALSE;

        try {
            if (report.getSectionSummary())
                _processSection(report, "summary");

            if (report.getSectionROI())
                _processSection(report, "roi");

            if (report.getSectionRecommendations())
                _processSection(report, "recommendations");

            if (report.getSectionMetrics())
                _processSection(report, "metrics");

            if (report.getSectionCosts())
                _processSection(report, "costs");

        } catch (Exception e) {
            _log.error("Falha ao criar relatorio, sera considerado com ERRO");
        }

        return result;
    }

    private void _processSection(Report report, String section) throws IllegalAccessException, InstantiationException {

        String destinationName = "symposium/report-section-" + section;

        // cria a mensagem
        Message message = new Message();
        message.put("reportId", report.getReportId());
        message.put("section", section);
        message.setDestinationName(destinationName);

        // envia para o barramento
        MessageBusUtil.sendMessage(destinationName, message);
    }
}