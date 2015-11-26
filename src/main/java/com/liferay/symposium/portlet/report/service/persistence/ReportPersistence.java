package com.liferay.symposium.portlet.report.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.liferay.symposium.portlet.report.model.Report;

/**
 * The persistence interface for the report service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ReportPersistenceImpl
 * @see ReportUtil
 * @generated
 */
public interface ReportPersistence extends BasePersistence<Report> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link ReportUtil} to access the report persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the reports where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching reports
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.symposium.portlet.report.model.Report> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.symposium.portlet.report.model.Report> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.symposium.portlet.report.model.Report> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first report in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching report
    * @throws com.liferay.symposium.portlet.report.NoSuchReportException if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.symposium.portlet.report.model.Report findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.symposium.portlet.report.NoSuchReportException;

    /**
    * Returns the first report in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching report, or <code>null</code> if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.symposium.portlet.report.model.Report fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last report in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching report
    * @throws com.liferay.symposium.portlet.report.NoSuchReportException if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.symposium.portlet.report.model.Report findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.symposium.portlet.report.NoSuchReportException;

    /**
    * Returns the last report in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching report, or <code>null</code> if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.symposium.portlet.report.model.Report fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.liferay.symposium.portlet.report.model.Report[] findByUuid_PrevAndNext(
        long reportId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.symposium.portlet.report.NoSuchReportException;

    /**
    * Removes all the reports where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of reports where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching reports
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the report where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.symposium.portlet.report.NoSuchReportException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching report
    * @throws com.liferay.symposium.portlet.report.NoSuchReportException if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.symposium.portlet.report.model.Report findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.symposium.portlet.report.NoSuchReportException;

    /**
    * Returns the report where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching report, or <code>null</code> if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.symposium.portlet.report.model.Report fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the report where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching report, or <code>null</code> if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.symposium.portlet.report.model.Report fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the report where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the report that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.symposium.portlet.report.model.Report removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.symposium.portlet.report.NoSuchReportException;

    /**
    * Returns the number of reports where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching reports
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the reports where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching reports
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.symposium.portlet.report.model.Report> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.symposium.portlet.report.model.Report> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.symposium.portlet.report.model.Report> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.liferay.symposium.portlet.report.model.Report findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.symposium.portlet.report.NoSuchReportException;

    /**
    * Returns the first report in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching report, or <code>null</code> if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.symposium.portlet.report.model.Report fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.liferay.symposium.portlet.report.model.Report findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.symposium.portlet.report.NoSuchReportException;

    /**
    * Returns the last report in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching report, or <code>null</code> if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.symposium.portlet.report.model.Report fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.liferay.symposium.portlet.report.model.Report[] findByUuid_C_PrevAndNext(
        long reportId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.symposium.portlet.report.NoSuchReportException;

    /**
    * Removes all the reports where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of reports where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching reports
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the reports where reportStatus = &#63;.
    *
    * @param reportStatus the report status
    * @return the matching reports
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.symposium.portlet.report.model.Report> findByReportStatus(
        java.lang.String reportStatus)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.symposium.portlet.report.model.Report> findByReportStatus(
        java.lang.String reportStatus, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.symposium.portlet.report.model.Report> findByReportStatus(
        java.lang.String reportStatus, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first report in the ordered set where reportStatus = &#63;.
    *
    * @param reportStatus the report status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching report
    * @throws com.liferay.symposium.portlet.report.NoSuchReportException if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.symposium.portlet.report.model.Report findByReportStatus_First(
        java.lang.String reportStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.symposium.portlet.report.NoSuchReportException;

    /**
    * Returns the first report in the ordered set where reportStatus = &#63;.
    *
    * @param reportStatus the report status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching report, or <code>null</code> if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.symposium.portlet.report.model.Report fetchByReportStatus_First(
        java.lang.String reportStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last report in the ordered set where reportStatus = &#63;.
    *
    * @param reportStatus the report status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching report
    * @throws com.liferay.symposium.portlet.report.NoSuchReportException if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.symposium.portlet.report.model.Report findByReportStatus_Last(
        java.lang.String reportStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.symposium.portlet.report.NoSuchReportException;

    /**
    * Returns the last report in the ordered set where reportStatus = &#63;.
    *
    * @param reportStatus the report status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching report, or <code>null</code> if a matching report could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.symposium.portlet.report.model.Report fetchByReportStatus_Last(
        java.lang.String reportStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.liferay.symposium.portlet.report.model.Report[] findByReportStatus_PrevAndNext(
        long reportId, java.lang.String reportStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.symposium.portlet.report.NoSuchReportException;

    /**
    * Removes all the reports where reportStatus = &#63; from the database.
    *
    * @param reportStatus the report status
    * @throws SystemException if a system exception occurred
    */
    public void removeByReportStatus(java.lang.String reportStatus)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of reports where reportStatus = &#63;.
    *
    * @param reportStatus the report status
    * @return the number of matching reports
    * @throws SystemException if a system exception occurred
    */
    public int countByReportStatus(java.lang.String reportStatus)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the report in the entity cache if it is enabled.
    *
    * @param report the report
    */
    public void cacheResult(
        com.liferay.symposium.portlet.report.model.Report report);

    /**
    * Caches the reports in the entity cache if it is enabled.
    *
    * @param reports the reports
    */
    public void cacheResult(
        java.util.List<com.liferay.symposium.portlet.report.model.Report> reports);

    /**
    * Creates a new report with the primary key. Does not add the report to the database.
    *
    * @param reportId the primary key for the new report
    * @return the new report
    */
    public com.liferay.symposium.portlet.report.model.Report create(
        long reportId);

    /**
    * Removes the report with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param reportId the primary key of the report
    * @return the report that was removed
    * @throws com.liferay.symposium.portlet.report.NoSuchReportException if a report with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.symposium.portlet.report.model.Report remove(
        long reportId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.symposium.portlet.report.NoSuchReportException;

    public com.liferay.symposium.portlet.report.model.Report updateImpl(
        com.liferay.symposium.portlet.report.model.Report report)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the report with the primary key or throws a {@link com.liferay.symposium.portlet.report.NoSuchReportException} if it could not be found.
    *
    * @param reportId the primary key of the report
    * @return the report
    * @throws com.liferay.symposium.portlet.report.NoSuchReportException if a report with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.symposium.portlet.report.model.Report findByPrimaryKey(
        long reportId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.symposium.portlet.report.NoSuchReportException;

    /**
    * Returns the report with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param reportId the primary key of the report
    * @return the report, or <code>null</code> if a report with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.symposium.portlet.report.model.Report fetchByPrimaryKey(
        long reportId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the reports.
    *
    * @return the reports
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.symposium.portlet.report.model.Report> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.symposium.portlet.report.model.Report> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.symposium.portlet.report.model.Report> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the reports from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of reports.
    *
    * @return the number of reports
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
