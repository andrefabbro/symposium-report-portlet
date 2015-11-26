package com.liferay.symposium.portlet.report.messaging;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class ReportSectionROIMessageListener extends AbstractCreateReportSectionMessageListener {

    protected static final Log _log = LogFactoryUtil.getLog(ReportSectionROIMessageListener.class);

    @Override
    protected Log getLog() { return _log; }

    @Override
    public String getSectionName() { return "roi"; }
}