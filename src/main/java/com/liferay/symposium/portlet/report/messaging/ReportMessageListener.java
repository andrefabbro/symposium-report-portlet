package com.liferay.symposium.portlet.report.messaging;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.*;
import com.liferay.symposium.portlet.report.model.Report;
import com.liferay.symposium.portlet.report.service.ReportLocalServiceUtil;
import com.liferay.symposium.portlet.report.util.ReportStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReportMessageListener implements MessageListener {

    private static final Log _log = LogFactoryUtil.getLog(ReportMessageListener.class);

    private static final String DESTINATION_NAME = "symposium/report_create";

    @Override
    public void receive(Message message) throws MessageListenerException {
        try {
            _doReceive(message);
        } catch (Exception e) {
            _log.error("Houve um problema para processar a mensagem para o destino: " + message.getDestinationName());
        }
    }

    private void _doReceive(Message message) {

        _log.info("Iniciando o processamento da mensagem para " + this.getClass().getCanonicalName());

        try {
            // cria alguns relatorios de exemplo e guarda no banco
            List<Report> reports = _makeReports(5);

            for (Report r : reports) {
                if (r.getReportStatus().equals(ReportStatus.STATUS_PENDING)) {

                    _sendJob(r);

                    _log.info("Job para o relatorio id " + r.getReportId() + " enviado.");
                }
            }

        } catch (Exception e) {
            _log.error("Houve um erro no processamento dos relatorios.", e);
        }
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

                // campos de auditoria
                r.setCreateDate(new Date());
                r.setModifiedDate(new Date());

                // status inicial do relatorio
                r.setReportStatus(ReportStatus.STATUS_PENDING);

                ReportLocalServiceUtil.addReport(r);

                reports.add(r);

            } catch (Exception e) {
                _log.error("Falha ao salva relatorio exemplo => " + e.getMessage() + " :: " + e.getCause());
            }
        }

        return reports;
    }

    private void _sendJob(Report report) {

        // verifica se ja existe um destino registrado com esse topico. Se nao existir, cria sob demanda
        if (!MessageBusUtil.hasMessageListener(DESTINATION_NAME)) {

            _log.info("Criando destino paralelo para o message listener de criacao de relatorios...");

            ParallelDestination destination = new ParallelDestination();
            destination.setName(DESTINATION_NAME);
            destination.setWorkersCoreSize(5);
            destination.setWorkersMaxSize(5);
            destination.setMaximumQueueSize(10000);

            // essa chamada e necessaria para aplicar os valores no destino, caso contrario carrega o default
            destination.afterPropertiesSet();

            MessageBusUtil.addDestination(destination);
            MessageBusUtil.registerMessageListener(DESTINATION_NAME, new CreateReportMessageListener());

            _log.info("Destino incluido.");
        }

        // cria a mensagem
        Message message = new Message();
        message.put("reportId", report.getReportId());
        message.setDestinationName(DESTINATION_NAME);

        // inclui a mensagem no barramento
        MessageBusUtil.sendMessage(DESTINATION_NAME, message);
    }
}