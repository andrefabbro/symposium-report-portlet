package com.liferay.symposium.portlet.report;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.symposium.portlet.report.model.Report;
import com.liferay.symposium.portlet.report.service.ReportLocalServiceUtil;
import com.liferay.symposium.portlet.report.util.ReportStatus;
import com.liferay.util.bridges.mvc.MVCPortlet;
import org.restlet.Client;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.Method;
import org.restlet.data.Protocol;
import org.restlet.data.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.ProcessAction;
import java.util.Date;

public class ReportRequestPortlet extends MVCPortlet {

    // logger
    private static final Log _log = LogFactoryUtil.getLog(ReportRequestPortlet.class);

    @ProcessAction(name = "requestReport")
    public void requestReport(ActionRequest actionRequest, ActionResponse actionResponse) {

        _log.info("Acionada requisicao para o relatorio");

        String reportName = ParamUtil.getString(actionRequest, "reportName");
        boolean summary = ParamUtil.getBoolean(actionRequest, "reportSectionSummary");
        boolean costs = ParamUtil.getBoolean(actionRequest, "reportSectionCosts");
        boolean roi = ParamUtil.getBoolean(actionRequest, "reportSectionROI");
        boolean metrics = ParamUtil.getBoolean(actionRequest, "reportSectionMetrics");
        boolean recommendations = ParamUtil.getBoolean(actionRequest, "reportSectionRecommendations");

        try {
            // cria o objeto Report
            Report r = ReportLocalServiceUtil.createReport(CounterLocalServiceUtil.increment(Report.class.getCanonicalName()));

            // detalhes do objeto
            r.setReportName(reportName);
            r.setSectionSummary(summary);
            r.setSectionCosts(costs);
            r.setSectionROI(roi);
            r.setSectionMetrics(metrics);
            r.setSectionRecommendations(recommendations);

            // campos de auditoria
            r.setUserId(PortalUtil.getUserId(actionRequest));
            r.setUserName(PortalUtil.getUser(actionRequest).getEmailAddress());
            r.setCompanyId(PortalUtil.getCompanyId(actionRequest));
            r.setGroupId(PortalUtil.getScopeGroupId(actionRequest));
            r.setCreateDate(new Date());
            r.setModifiedDate(new Date());

            // status inicial do relatorio: pendente
            r.setReportStatus(ReportStatus.STATUS_PROCESSING);

            long start = System.currentTimeMillis();

            _log.info("------------------------[ INICIO ]-------------------------------");

            if (r.getSectionSummary()) _processSection(r, "summary");
            if (r.getSectionROI()) _processSection(r, "roi");
            if (r.getSectionRecommendations()) _processSection(r, "recommendations");
            if (r.getSectionMetrics()) _processSection(r, "metrics");
            if (r.getSectionCosts()) _processSection(r, "costs");

            _log.info("------------------------[ FIM ]-------------------------------");

            long end = System.currentTimeMillis();

            _log.info(r.getReportName() + " finalizou em " + ((end - start) / 1000) + " segundos.");

            ReportLocalServiceUtil.addReport(r);

        } catch (Exception e) {
            _log.error("Erro ao gravar relatorio " + reportName, e);
        }
        _log.info("Requisicao para o relatorio " + reportName + " processada.");
    }

    private void _processSection(Report report, String section) {

        _log.info("Processando secao " + section + ", relatorio: " + report.getReportName());

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