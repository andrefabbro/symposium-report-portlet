package com.liferay.symposium.portlet.report.messaging;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.symposium.portlet.report.model.Report;
import com.liferay.symposium.portlet.report.service.ReportLocalServiceUtil;
import org.restlet.Client;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.Method;
import org.restlet.data.Protocol;
import org.restlet.data.Reference;

public abstract class AbstractCreateReportSectionMessageListener implements MessageListener {

    protected abstract Log getLog();

    protected abstract String getSectionName();

    @Override
    public void receive(Message message) throws MessageListenerException {
        try {
            _doReceive(message);
        } catch (Exception e) {
            getLog().error("Houve um problema para processar a mensagem para o destino: " + message.getDestinationName());
        }
    }

    private void _doReceive(Message message) {

        try {

            // pega o id do relatorio na mensagem
            long reportId = GetterUtil.getLong(message.get("reportId"));

            // recupera o relatorio a partir do banco
            Report r = _getReport(reportId);

            getLog().info("Processando sessao " + getSectionName() + " do relatorio " + r.getReportName() + "...");

            _process(r);

        } catch (Exception e) {
            getLog().error("Erro ao gerar secao " + getSectionName() + " do relatorio", e);
        }

    }

    private Report _getReport(long reportId) {
        try {
            return ReportLocalServiceUtil.getReport(reportId);
        } catch (Exception e) {
            getLog().error("Falha ao retornar relatorio com o ID " + reportId, e);
        }
        return null;
    }

    private void _process(Report report) {

        try {
            Client client = new Client(Protocol.HTTP);

            Reference reference = new Reference();
            reference.setProtocol(Protocol.HTTP);
            reference.setHostDomain("localhost");
            reference.setHostPort(9090);
            reference.setPath("/relatorio/processar/" + report.getReportId() + "/secao/" + getSectionName());

            Request request = new Request(Method.GET, reference);

            getLog().info("request: " + request.toString());

            Response response = client.handle(request);

            getLog().info("response: " + response.getEntity().getText());

        } catch (Exception e) {
            getLog().error("Erro ao processar secao " + getSectionName() + " do relatorio " + report.getReportName(), e);
        }
    }
}