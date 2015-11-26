package com.liferay.symposium.portlet.report.messaging;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;
import com.liferay.symposium.portlet.report.model.Report;
import com.liferay.symposium.portlet.report.service.ReportLocalServiceUtil;
import com.liferay.symposium.portlet.report.util.ReportStatus;
import org.restlet.Client;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.Method;
import org.restlet.data.Protocol;
import org.restlet.data.Reference;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReportMessageListener implements MessageListener {

    private static final Log _log = LogFactoryUtil.getLog(ReportMessageListener.class);

    @Override
    public void receive(Message message) throws MessageListenerException {
        try {
            _doReceive(message);
        } catch (Exception e) {
            _log.error("Houve um problema para processar a mensagem para o destino: " + message.getDestinationName());
        }
    }

    private void _doReceive(Message message) {

        _log.info("=======================================================================");
        _log.info("Iniciando o processamento da mensagem para " + this.getClass().getName());
        _log.info("=======================================================================");

        long processStart = 0L;
        long processEnd = 0L;

        long start;
        long end;

        try {
            // cria alguns relatorios de exemplo e guarda no banco
            List<Report> reports = _makeReports(5);

            _log.info("------------------------[ INICIO ]-------------------------------");
            processStart = System.currentTimeMillis();

            for (Report r : reports) {
                if (r.getReportStatus().equals(ReportStatus.STATUS_PENDING)) {
                    _log.info("Processando relatorio " + r.getReportName() + "...");

                    start = System.currentTimeMillis();

                    r.setReportStatus(ReportStatus.STATUS_PROCESSING);
                    ReportLocalServiceUtil.updateReport(r);

                    boolean result = Boolean.FALSE;

                    // gera cada secao do relatorio a partir do servico remoto
                    if (r.getSectionSummary()) result = _process(r, "summary");
                    if (r.getSectionCosts()) result = _process(r, "costs");
                    if (r.getSectionMetrics()) result = _process(r, "metrics");
                    if (r.getSectionROI()) result = _process(r, "roi");
                    if (r.getSectionRecommendations()) result = _process(r, "recommendations");

                    if (result)
                        r.setReportStatus(ReportStatus.STATUS_COMPLETE);
                    else
                        r.setReportStatus(ReportStatus.STATUS_ERROR);

                    ReportLocalServiceUtil.updateReport(r);

                    end = System.currentTimeMillis();

                    _log.info(r.getReportName() + " finalizou em " + ((end - start) / 1000) + " segundos.");
                }
            }

            processEnd = System.currentTimeMillis();

            _log.info("------------------------[ FIM ]-------------------------------");

        } catch (Exception e) {
            _log.error("Houve um erro no processamento dos relatorios.", e);
        }

        _log.info("Tempo de execucao total: " + ((processEnd - processStart) / 1000));
    }

    private List<Report> _makeReports(int makeCount) {

        List<Report> reports = new ArrayList<Report>(makeCount);

        for (int i = 0; i < makeCount; ++i) {
            try {

                // cria o objeto report
                Report r = ReportLocalServiceUtil.createReport(CounterLocalServiceUtil.increment(Report.class.getCanonicalName()));

                // detalhes do report
                r.setReportName("RelatorioTeste" + r.getReportId());

                _log.info("Gerando relatorio exemplo " + r.getReportName());

                // sessoes -- para fins de demonstracao, todas sao ativadas
                r.setSectionSummary(true);
                r.setSectionCosts(true);
                r.setSectionROI(true);
                r.setSectionMetrics(true);
                r.setSectionRecommendations(true);

                // auditing fields
                r.setCreateDate(new Date());
                r.setModifiedDate(new Date());

                // status inicial
                r.setReportStatus(ReportStatus.STATUS_PENDING);

                ReportLocalServiceUtil.addReport(r);

                reports.add(r);

            } catch (Exception e) {
                _log.error("Falha ao salva relatorio exemplo => " + e.getMessage() + " :: " + e.getCause());
            }
        }

        return reports;
    }

    private boolean _process(Report report, String section) {
        boolean result = Boolean.FALSE;

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

            result = Boolean.TRUE;
        } catch (Exception e) {
            _log.error("Erro ao processar secao " + section + " do relatorio " + report.getReportName(), e);
        }

        return result;
    }
}