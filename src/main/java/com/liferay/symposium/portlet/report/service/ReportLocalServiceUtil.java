package com.liferay.symposium.portlet.report.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Report. This utility wraps
 * {@link com.liferay.symposium.portlet.report.service.impl.ReportLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ReportLocalService
 * @see com.liferay.symposium.portlet.report.service.base.ReportLocalServiceBaseImpl
 * @see com.liferay.symposium.portlet.report.service.impl.ReportLocalServiceImpl
 * @generated
 */
public class ReportLocalServiceUtil {
    private static ReportLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.symposium.portlet.report.service.impl.ReportLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the report to the database. Also notifies the appropriate model listeners.
    *
    * @param report the report
    * @return the report that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report addReport(
        com.liferay.symposium.portlet.report.model.Report report)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addReport(report);
    }

    /**
    * Creates a new report with the primary key. Does not add the report to the database.
    *
    * @param reportId the primary key for the new report
    * @return the new report
    */
    public static com.liferay.symposium.portlet.report.model.Report createReport(
        long reportId) {
        return getService().createReport(reportId);
    }

    /**
    * Deletes the report with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param reportId the primary key of the report
    * @return the report that was removed
    * @throws PortalException if a report with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report deleteReport(
        long reportId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteReport(reportId);
    }

    /**
    * Deletes the report from the database. Also notifies the appropriate model listeners.
    *
    * @param report the report
    * @return the report that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report deleteReport(
        com.liferay.symposium.portlet.report.model.Report report)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteReport(report);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.portlet.report.model.impl.ReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.portlet.report.model.impl.ReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.liferay.symposium.portlet.report.model.Report fetchReport(
        long reportId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchReport(reportId);
    }

    /**
    * Returns the report with the matching UUID and company.
    *
    * @param uuid the report's UUID
    * @param companyId the primary key of the company
    * @return the matching report, or <code>null</code> if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report fetchReportByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchReportByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the report matching the UUID and group.
    *
    * @param uuid the report's UUID
    * @param groupId the primary key of the group
    * @return the matching report, or <code>null</code> if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report fetchReportByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchReportByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the report with the primary key.
    *
    * @param reportId the primary key of the report
    * @return the report
    * @throws PortalException if a report with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report getReport(
        long reportId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getReport(reportId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the report with the matching UUID and company.
    *
    * @param uuid the report's UUID
    * @param companyId the primary key of the company
    * @return the matching report
    * @throws PortalException if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report getReportByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getReportByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the report matching the UUID and group.
    *
    * @param uuid the report's UUID
    * @param groupId the primary key of the group
    * @return the matching report
    * @throws PortalException if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report getReportByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getReportByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns a range of all the reports.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.portlet.report.model.impl.ReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of reports
    * @param end the upper bound of the range of reports (not inclusive)
    * @return the range of reports
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.symposium.portlet.report.model.Report> getReports(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getReports(start, end);
    }

    /**
    * Returns the number of reports.
    *
    * @return the number of reports
    * @throws SystemException if a system exception occurred
    */
    public static int getReportsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getReportsCount();
    }

    /**
    * Updates the report in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param report the report
    * @return the report that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report updateReport(
        com.liferay.symposium.portlet.report.model.Report report)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateReport(report);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void clearService() {
        _service = null;
    }

    public static ReportLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    ReportLocalService.class.getName());

            if (invokableLocalService instanceof ReportLocalService) {
                _service = (ReportLocalService) invokableLocalService;
            } else {
                _service = new ReportLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(ReportLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(ReportLocalService service) {
    }
}
