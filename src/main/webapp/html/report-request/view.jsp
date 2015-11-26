<%@ include file="init.jsp" %>

<portlet:actionURL name="requestReport" var="reportRequestActionURL" />

<aui:form name="fm" method="post" action="${reportRequestActionURL}">

    <aui:fieldset>
        <aui:input name="reportName" />
    </aui:fieldset>

    <aui:fieldset>
        <aui:input type="checkbox" name="reportSectionSummary" label="report-section-summary" inlineLabel="true" />
        <aui:input type="checkbox" name="reportSectionCosts" label="report-section-costs" inlineLabel="true" />
        <aui:input type="checkbox" name="reportSectionROI" label="report-section-roi" inlineLabel="true" />
        <aui:input type="checkbox" name="reportSectionMetrics" label="report-section-metrics" inlineLabel="true" />
        <aui:input type="checkbox" name="reportSectionRecommendations" label="report-section-recommendations" inlineLabel="true" />
    </aui:fieldset>


    <aui:button-row>
        <aui:button type="submit" value="report-request-submit" />
    </aui:button-row>

</aui:form>
