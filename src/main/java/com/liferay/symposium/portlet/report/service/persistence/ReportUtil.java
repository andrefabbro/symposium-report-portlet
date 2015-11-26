package com.liferay.symposium.portlet.report.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.liferay.symposium.portlet.report.model.Report;

import java.util.List;

/**
 * The persistence utility for the report service. This utility wraps {@link ReportPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ReportPersistence
 * @see ReportPersistenceImpl
 * @generated
 */
public class ReportUtil {
    private static ReportPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Report report) {
        getPersistence().clearCache(report);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Report> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Report> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Report> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Report update(Report report) throws SystemException {
        return getPersistence().update(report);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Report update(Report report, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(report, serviceContext);
    }

    /**
    * Returns all the reports where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching reports
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.symposium.portlet.report.model.Report> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid);
    }

    /**
    * Returns a range of all the reports where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.portlet.report.model.impl.ReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of reports
    * @param end the upper bound of the range of reports (not inclusive)
    * @return the range of matching reports
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.symposium.portlet.report.model.Report> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end);
    }

    /**
    * Returns an ordered range of all the reports where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.portlet.report.model.impl.ReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of reports
    * @param end the upper bound of the range of reports (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching reports
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.symposium.portlet.report.model.Report> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
    }

    /**
    * Returns the first report in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching report
    * @throws com.liferay.symposium.portlet.report.NoSuchReportException if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.symposium.portlet.report.NoSuchReportException {
        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the first report in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching report, or <code>null</code> if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the last report in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching report
    * @throws com.liferay.symposium.portlet.report.NoSuchReportException if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.symposium.portlet.report.NoSuchReportException {
        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the last report in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching report, or <code>null</code> if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the reports before and after the current report in the ordered set where uuid = &#63;.
    *
    * @param reportId the primary key of the current report
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next report
    * @throws com.liferay.symposium.portlet.report.NoSuchReportException if a report with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report[] findByUuid_PrevAndNext(
        long reportId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.symposium.portlet.report.NoSuchReportException {
        return getPersistence()
                   .findByUuid_PrevAndNext(reportId, uuid, orderByComparator);
    }

    /**
    * Removes all the reports where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid(uuid);
    }

    /**
    * Returns the number of reports where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching reports
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid(uuid);
    }

    /**
    * Returns the report where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.symposium.portlet.report.NoSuchReportException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching report
    * @throws com.liferay.symposium.portlet.report.NoSuchReportException if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.symposium.portlet.report.NoSuchReportException {
        return getPersistence().findByUUID_G(uuid, groupId);
    }

    /**
    * Returns the report where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching report, or <code>null</code> if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId);
    }

    /**
    * Returns the report where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching report, or <code>null</code> if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
    }

    /**
    * Removes the report where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the report that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.symposium.portlet.report.NoSuchReportException {
        return getPersistence().removeByUUID_G(uuid, groupId);
    }

    /**
    * Returns the number of reports where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching reports
    * @throws SystemException if a system exception occurred
    */
    public static int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUUID_G(uuid, groupId);
    }

    /**
    * Returns all the reports where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching reports
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.symposium.portlet.report.model.Report> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId);
    }

    /**
    * Returns a range of all the reports where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.portlet.report.model.impl.ReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of reports
    * @param end the upper bound of the range of reports (not inclusive)
    * @return the range of matching reports
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.symposium.portlet.report.model.Report> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId, start, end);
    }

    /**
    * Returns an ordered range of all the reports where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.portlet.report.model.impl.ReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of reports
    * @param end the upper bound of the range of reports (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching reports
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.symposium.portlet.report.model.Report> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
    }

    /**
    * Returns the first report in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching report
    * @throws com.liferay.symposium.portlet.report.NoSuchReportException if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.symposium.portlet.report.NoSuchReportException {
        return getPersistence()
                   .findByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the first report in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching report, or <code>null</code> if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last report in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching report
    * @throws com.liferay.symposium.portlet.report.NoSuchReportException if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.symposium.portlet.report.NoSuchReportException {
        return getPersistence()
                   .findByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last report in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching report, or <code>null</code> if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the reports before and after the current report in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param reportId the primary key of the current report
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next report
    * @throws com.liferay.symposium.portlet.report.NoSuchReportException if a report with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report[] findByUuid_C_PrevAndNext(
        long reportId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.symposium.portlet.report.NoSuchReportException {
        return getPersistence()
                   .findByUuid_C_PrevAndNext(reportId, uuid, companyId,
            orderByComparator);
    }

    /**
    * Removes all the reports where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid_C(uuid, companyId);
    }

    /**
    * Returns the number of reports where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching reports
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid_C(uuid, companyId);
    }

    /**
    * Returns all the reports where reportStatus = &#63;.
    *
    * @param reportStatus the report status
    * @return the matching reports
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.symposium.portlet.report.model.Report> findByReportStatus(
        java.lang.String reportStatus)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByReportStatus(reportStatus);
    }

    /**
    * Returns a range of all the reports where reportStatus = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.portlet.report.model.impl.ReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param reportStatus the report status
    * @param start the lower bound of the range of reports
    * @param end the upper bound of the range of reports (not inclusive)
    * @return the range of matching reports
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.symposium.portlet.report.model.Report> findByReportStatus(
        java.lang.String reportStatus, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByReportStatus(reportStatus, start, end);
    }

    /**
    * Returns an ordered range of all the reports where reportStatus = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.portlet.report.model.impl.ReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param reportStatus the report status
    * @param start the lower bound of the range of reports
    * @param end the upper bound of the range of reports (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching reports
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.symposium.portlet.report.model.Report> findByReportStatus(
        java.lang.String reportStatus, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByReportStatus(reportStatus, start, end,
            orderByComparator);
    }

    /**
    * Returns the first report in the ordered set where reportStatus = &#63;.
    *
    * @param reportStatus the report status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching report
    * @throws com.liferay.symposium.portlet.report.NoSuchReportException if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report findByReportStatus_First(
        java.lang.String reportStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.symposium.portlet.report.NoSuchReportException {
        return getPersistence()
                   .findByReportStatus_First(reportStatus, orderByComparator);
    }

    /**
    * Returns the first report in the ordered set where reportStatus = &#63;.
    *
    * @param reportStatus the report status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching report, or <code>null</code> if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report fetchByReportStatus_First(
        java.lang.String reportStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByReportStatus_First(reportStatus, orderByComparator);
    }

    /**
    * Returns the last report in the ordered set where reportStatus = &#63;.
    *
    * @param reportStatus the report status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching report
    * @throws com.liferay.symposium.portlet.report.NoSuchReportException if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report findByReportStatus_Last(
        java.lang.String reportStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.symposium.portlet.report.NoSuchReportException {
        return getPersistence()
                   .findByReportStatus_Last(reportStatus, orderByComparator);
    }

    /**
    * Returns the last report in the ordered set where reportStatus = &#63;.
    *
    * @param reportStatus the report status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching report, or <code>null</code> if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report fetchByReportStatus_Last(
        java.lang.String reportStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByReportStatus_Last(reportStatus, orderByComparator);
    }

    /**
    * Returns the reports before and after the current report in the ordered set where reportStatus = &#63;.
    *
    * @param reportId the primary key of the current report
    * @param reportStatus the report status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next report
    * @throws com.liferay.symposium.portlet.report.NoSuchReportException if a report with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report[] findByReportStatus_PrevAndNext(
        long reportId, java.lang.String reportStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.symposium.portlet.report.NoSuchReportException {
        return getPersistence()
                   .findByReportStatus_PrevAndNext(reportId, reportStatus,
            orderByComparator);
    }

    /**
    * Removes all the reports where reportStatus = &#63; from the database.
    *
    * @param reportStatus the report status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByReportStatus(java.lang.String reportStatus)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByReportStatus(reportStatus);
    }

    /**
    * Returns the number of reports where reportStatus = &#63;.
    *
    * @param reportStatus the report status
    * @return the number of matching reports
    * @throws SystemException if a system exception occurred
    */
    public static int countByReportStatus(java.lang.String reportStatus)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByReportStatus(reportStatus);
    }

    /**
    * Caches the report in the entity cache if it is enabled.
    *
    * @param report the report
    */
    public static void cacheResult(
        com.liferay.symposium.portlet.report.model.Report report) {
        getPersistence().cacheResult(report);
    }

    /**
    * Caches the reports in the entity cache if it is enabled.
    *
    * @param reports the reports
    */
    public static void cacheResult(
        java.util.List<com.liferay.symposium.portlet.report.model.Report> reports) {
        getPersistence().cacheResult(reports);
    }

    /**
    * Creates a new report with the primary key. Does not add the report to the database.
    *
    * @param reportId the primary key for the new report
    * @return the new report
    */
    public static com.liferay.symposium.portlet.report.model.Report create(
        long reportId) {
        return getPersistence().create(reportId);
    }

    /**
    * Removes the report with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param reportId the primary key of the report
    * @return the report that was removed
    * @throws com.liferay.symposium.portlet.report.NoSuchReportException if a report with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report remove(
        long reportId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.symposium.portlet.report.NoSuchReportException {
        return getPersistence().remove(reportId);
    }

    public static com.liferay.symposium.portlet.report.model.Report updateImpl(
        com.liferay.symposium.portlet.report.model.Report report)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(report);
    }

    /**
    * Returns the report with the primary key or throws a {@link com.liferay.symposium.portlet.report.NoSuchReportException} if it could not be found.
    *
    * @param reportId the primary key of the report
    * @return the report
    * @throws com.liferay.symposium.portlet.report.NoSuchReportException if a report with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report findByPrimaryKey(
        long reportId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.symposium.portlet.report.NoSuchReportException {
        return getPersistence().findByPrimaryKey(reportId);
    }

    /**
    * Returns the report with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param reportId the primary key of the report
    * @return the report, or <code>null</code> if a report with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.symposium.portlet.report.model.Report fetchByPrimaryKey(
        long reportId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(reportId);
    }

    /**
    * Returns all the reports.
    *
    * @return the reports
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.symposium.portlet.report.model.Report> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.liferay.symposium.portlet.report.model.Report> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the reports.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.portlet.report.model.impl.ReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of reports
    * @param end the upper bound of the range of reports (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of reports
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.symposium.portlet.report.model.Report> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the reports from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of reports.
    *
    * @return the number of reports
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static ReportPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (ReportPersistence) PortletBeanLocatorUtil.locate(com.liferay.symposium.portlet.report.service.ClpSerializer.getServletContextName(),
                    ReportPersistence.class.getName());

            ReferenceRegistry.registerReference(ReportUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(ReportPersistence persistence) {
    }
}
