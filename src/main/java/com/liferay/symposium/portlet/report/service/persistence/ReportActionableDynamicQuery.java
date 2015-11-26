package com.liferay.symposium.portlet.report.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.liferay.symposium.portlet.report.model.Report;
import com.liferay.symposium.portlet.report.service.ReportLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ReportActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ReportActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ReportLocalServiceUtil.getService());
        setClass(Report.class);

        setClassLoader(com.liferay.symposium.portlet.report.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("reportId");
    }
}
