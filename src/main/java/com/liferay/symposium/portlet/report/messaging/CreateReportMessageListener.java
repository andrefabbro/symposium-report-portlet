package com.liferay.symposium.portlet.report.messaging;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.symposium.portlet.report.model.Report;
import com.liferay.symposium.portlet.report.service.ReportLocalServiceUtil;
import com.liferay.symposium.portlet.report.util.ReportStatus;
import org.restlet.Client;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.Method;
import org.restlet.data.Protocol;
import org.restlet.data.Reference;

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

            // busca o relatorio no banco
            Report r = _getReport(GetterUtil.getLong(message.get("reportId")));

            _log.info("Processando relatorio " + r.getReportName() + "...");

            long start = System.currentTimeMillis();

            r.setReportStatus(ReportStatus.STATUS_PROCESSING);
            r.setStartTime(new Date());
            ReportLocalServiceUtil.updateReport(r);

            // gera cada secao do relatorio a partir do servico remoto
            if (r.getSectionSummary()) _process(r, "summary");
            if (r.getSectionCosts()) _process(r, "costs");
            if (r.getSectionMetrics()) _process(r, "metrics");
            if (r.getSectionROI()) _process(r, "roi");
            if (r.getSectionRecommendations()) _process(r, "recommendations");

            r.setReportStatus(ReportStatus.STATUS_COMPLETE);
            ReportLocalServiceUtil.updateReport(r);

            long end = System.currentTimeMillis();

            _log.info(r.getReportName() + " finalizou em " + ((end - start) / 1000) + " segundos.");

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

    private void _process(Report report, String section) {
        try {
            Client client = new Client(Protocol.HTTP);

            Reference reference = new Reference();
            reference.setProtocol(Protocol.HTTP);
            reference.setHostDomain("localhost");
            reference.setHostPort(9090);
            reference.setPath("/relatorio/processar/" + report.getReportId() + "/secao/" + section);

            Request request = new Request(Method.GET, reference);

            _log.info("request: " + request.toString());

            Response response = client.handle(request);

            _log.info("response: " + response.getEntity().getText());

        } catch (Exception e) {
            _log.error("Erro ao processar secao " + section + " do relatorio " + report.getReportName(), e);
        }
    }
}