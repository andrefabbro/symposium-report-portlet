package com.liferay.symposium.portlet.report.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Report}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Report
 * @generated
 */
public class ReportWrapper implements Report, ModelWrapper<Report> {
    private Report _report;

    public ReportWrapper(Report report) {
        _report = report;
    }

    @Override
    public Class<?> getModelClass() {
        return Report.class;
    }

    @Override
    public String getModelClassName() {
        return Report.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("reportId", getReportId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("reportName", getReportName());
        attributes.put("reportStatus", getReportStatus());
        attributes.put("startTime", getStartTime());
        attributes.put("endTime", getEndTime());
        attributes.put("sectionSummary", getSectionSummary());
        attributes.put("sectionSummaryStatus", getSectionSummaryStatus());
        attributes.put("sectionCosts", getSectionCosts());
        attributes.put("sectionCostsStatus", getSectionCostsStatus());
        attributes.put("sectionROI", getSectionROI());
        attributes.put("sectionROIStatus", getSectionROIStatus());
        attributes.put("sectionMetrics", getSectionMetrics());
        attributes.put("sectionMetricsStatus", getSectionMetricsStatus());
        attributes.put("sectionRecommendations", getSectionRecommendations());
        attributes.put("sectionRecommendationsStatus",
            getSectionRecommendationsStatus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long reportId = (Long) attributes.get("reportId");

        if (reportId != null) {
            setReportId(reportId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String reportName = (String) attributes.get("reportName");

        if (reportName != null) {
            setReportName(reportName);
        }

        String reportStatus = (String) attributes.get("reportStatus");

        if (reportStatus != null) {
            setReportStatus(reportStatus);
        }

        Date startTime = (Date) attributes.get("startTime");

        if (startTime != null) {
            setStartTime(startTime);
        }

        Date endTime = (Date) attributes.get("endTime");

        if (endTime != null) {
            setEndTime(endTime);
        }

        Boolean sectionSummary = (Boolean) attributes.get("sectionSummary");

        if (sectionSummary != null) {
            setSectionSummary(sectionSummary);
        }

        String sectionSummaryStatus = (String) attributes.get(
                "sectionSummaryStatus");

        if (sectionSummaryStatus != null) {
            setSectionSummaryStatus(sectionSummaryStatus);
        }

        Boolean sectionCosts = (Boolean) attributes.get("sectionCosts");

        if (sectionCosts != null) {
            setSectionCosts(sectionCosts);
        }

        String sectionCostsStatus = (String) attributes.get(
                "sectionCostsStatus");

        if (sectionCostsStatus != null) {
            setSectionCostsStatus(sectionCostsStatus);
        }

        Boolean sectionROI = (Boolean) attributes.get("sectionROI");

        if (sectionROI != null) {
            setSectionROI(sectionROI);
        }

        String sectionROIStatus = (String) attributes.get("sectionROIStatus");

        if (sectionROIStatus != null) {
            setSectionROIStatus(sectionROIStatus);
        }

        Boolean sectionMetrics = (Boolean) attributes.get("sectionMetrics");

        if (sectionMetrics != null) {
            setSectionMetrics(sectionMetrics);
        }

        String sectionMetricsStatus = (String) attributes.get(
                "sectionMetricsStatus");

        if (sectionMetricsStatus != null) {
            setSectionMetricsStatus(sectionMetricsStatus);
        }

        Boolean sectionRecommendations = (Boolean) attributes.get(
                "sectionRecommendations");

        if (sectionRecommendations != null) {
            setSectionRecommendations(sectionRecommendations);
        }

        String sectionRecommendationsStatus = (String) attributes.get(
                "sectionRecommendationsStatus");

        if (sectionRecommendationsStatus != null) {
            setSectionRecommendationsStatus(sectionRecommendationsStatus);
        }
    }

    /**
    * Returns the primary key of this report.
    *
    * @return the primary key of this report
    */
    @Override
    public long getPrimaryKey() {
        return _report.getPrimaryKey();
    }

    /**
    * Sets the primary key of this report.
    *
    * @param primaryKey the primary key of this report
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _report.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this report.
    *
    * @return the uuid of this report
    */
    @Override
    public java.lang.String getUuid() {
        return _report.getUuid();
    }

    /**
    * Sets the uuid of this report.
    *
    * @param uuid the uuid of this report
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _report.setUuid(uuid);
    }

    /**
    * Returns the report ID of this report.
    *
    * @return the report ID of this report
    */
    @Override
    public long getReportId() {
        return _report.getReportId();
    }

    /**
    * Sets the report ID of this report.
    *
    * @param reportId the report ID of this report
    */
    @Override
    public void setReportId(long reportId) {
        _report.setReportId(reportId);
    }

    /**
    * Returns the group ID of this report.
    *
    * @return the group ID of this report
    */
    @Override
    public long getGroupId() {
        return _report.getGroupId();
    }

    /**
    * Sets the group ID of this report.
    *
    * @param groupId the group ID of this report
    */
    @Override
    public void setGroupId(long groupId) {
        _report.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this report.
    *
    * @return the company ID of this report
    */
    @Override
    public long getCompanyId() {
        return _report.getCompanyId();
    }

    /**
    * Sets the company ID of this report.
    *
    * @param companyId the company ID of this report
    */
    @Override
    public void setCompanyId(long companyId) {
        _report.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this report.
    *
    * @return the user ID of this report
    */
    @Override
    public long getUserId() {
        return _report.getUserId();
    }

    /**
    * Sets the user ID of this report.
    *
    * @param userId the user ID of this report
    */
    @Override
    public void setUserId(long userId) {
        _report.setUserId(userId);
    }

    /**
    * Returns the user uuid of this report.
    *
    * @return the user uuid of this report
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _report.getUserUuid();
    }

    /**
    * Sets the user uuid of this report.
    *
    * @param userUuid the user uuid of this report
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _report.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this report.
    *
    * @return the user name of this report
    */
    @Override
    public java.lang.String getUserName() {
        return _report.getUserName();
    }

    /**
    * Sets the user name of this report.
    *
    * @param userName the user name of this report
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _report.setUserName(userName);
    }

    /**
    * Returns the create date of this report.
    *
    * @return the create date of this report
    */
    @Override
    public java.util.Date getCreateDate() {
        return _report.getCreateDate();
    }

    /**
    * Sets the create date of this report.
    *
    * @param createDate the create date of this report
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _report.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this report.
    *
    * @return the modified date of this report
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _report.getModifiedDate();
    }

    /**
    * Sets the modified date of this report.
    *
    * @param modifiedDate the modified date of this report
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _report.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the report name of this report.
    *
    * @return the report name of this report
    */
    @Override
    public java.lang.String getReportName() {
        return _report.getReportName();
    }

    /**
    * Sets the report name of this report.
    *
    * @param reportName the report name of this report
    */
    @Override
    public void setReportName(java.lang.String reportName) {
        _report.setReportName(reportName);
    }

    /**
    * Returns the report status of this report.
    *
    * @return the report status of this report
    */
    @Override
    public java.lang.String getReportStatus() {
        return _report.getReportStatus();
    }

    /**
    * Sets the report status of this report.
    *
    * @param reportStatus the report status of this report
    */
    @Override
    public void setReportStatus(java.lang.String reportStatus) {
        _report.setReportStatus(reportStatus);
    }

    /**
    * Returns the start time of this report.
    *
    * @return the start time of this report
    */
    @Override
    public java.util.Date getStartTime() {
        return _report.getStartTime();
    }

    /**
    * Sets the start time of this report.
    *
    * @param startTime the start time of this report
    */
    @Override
    public void setStartTime(java.util.Date startTime) {
        _report.setStartTime(startTime);
    }

    /**
    * Returns the end time of this report.
    *
    * @return the end time of this report
    */
    @Override
    public java.util.Date getEndTime() {
        return _report.getEndTime();
    }

    /**
    * Sets the end time of this report.
    *
    * @param endTime the end time of this report
    */
    @Override
    public void setEndTime(java.util.Date endTime) {
        _report.setEndTime(endTime);
    }

    /**
    * Returns the section summary of this report.
    *
    * @return the section summary of this report
    */
    @Override
    public boolean getSectionSummary() {
        return _report.getSectionSummary();
    }

    /**
    * Returns <code>true</code> if this report is section summary.
    *
    * @return <code>true</code> if this report is section summary; <code>false</code> otherwise
    */
    @Override
    public boolean isSectionSummary() {
        return _report.isSectionSummary();
    }

    /**
    * Sets whether this report is section summary.
    *
    * @param sectionSummary the section summary of this report
    */
    @Override
    public void setSectionSummary(boolean sectionSummary) {
        _report.setSectionSummary(sectionSummary);
    }

    /**
    * Returns the section summary status of this report.
    *
    * @return the section summary status of this report
    */
    @Override
    public java.lang.String getSectionSummaryStatus() {
        return _report.getSectionSummaryStatus();
    }

    /**
    * Sets the section summary status of this report.
    *
    * @param sectionSummaryStatus the section summary status of this report
    */
    @Override
    public void setSectionSummaryStatus(java.lang.String sectionSummaryStatus) {
        _report.setSectionSummaryStatus(sectionSummaryStatus);
    }

    /**
    * Returns the section costs of this report.
    *
    * @return the section costs of this report
    */
    @Override
    public boolean getSectionCosts() {
        return _report.getSectionCosts();
    }

    /**
    * Returns <code>true</code> if this report is section costs.
    *
    * @return <code>true</code> if this report is section costs; <code>false</code> otherwise
    */
    @Override
    public boolean isSectionCosts() {
        return _report.isSectionCosts();
    }

    /**
    * Sets whether this report is section costs.
    *
    * @param sectionCosts the section costs of this report
    */
    @Override
    public void setSectionCosts(boolean sectionCosts) {
        _report.setSectionCosts(sectionCosts);
    }

    /**
    * Returns the section costs status of this report.
    *
    * @return the section costs status of this report
    */
    @Override
    public java.lang.String getSectionCostsStatus() {
        return _report.getSectionCostsStatus();
    }

    /**
    * Sets the section costs status of this report.
    *
    * @param sectionCostsStatus the section costs status of this report
    */
    @Override
    public void setSectionCostsStatus(java.lang.String sectionCostsStatus) {
        _report.setSectionCostsStatus(sectionCostsStatus);
    }

    /**
    * Returns the section r o i of this report.
    *
    * @return the section r o i of this report
    */
    @Override
    public boolean getSectionROI() {
        return _report.getSectionROI();
    }

    /**
    * Returns <code>true</code> if this report is section r o i.
    *
    * @return <code>true</code> if this report is section r o i; <code>false</code> otherwise
    */
    @Override
    public boolean isSectionROI() {
        return _report.isSectionROI();
    }

    /**
    * Sets whether this report is section r o i.
    *
    * @param sectionROI the section r o i of this report
    */
    @Override
    public void setSectionROI(boolean sectionROI) {
        _report.setSectionROI(sectionROI);
    }

    /**
    * Returns the section r o i status of this report.
    *
    * @return the section r o i status of this report
    */
    @Override
    public java.lang.String getSectionROIStatus() {
        return _report.getSectionROIStatus();
    }

    /**
    * Sets the section r o i status of this report.
    *
    * @param sectionROIStatus the section r o i status of this report
    */
    @Override
    public void setSectionROIStatus(java.lang.String sectionROIStatus) {
        _report.setSectionROIStatus(sectionROIStatus);
    }

    /**
    * Returns the section metrics of this report.
    *
    * @return the section metrics of this report
    */
    @Override
    public boolean getSectionMetrics() {
        return _report.getSectionMetrics();
    }

    /**
    * Returns <code>true</code> if this report is section metrics.
    *
    * @return <code>true</code> if this report is section metrics; <code>false</code> otherwise
    */
    @Override
    public boolean isSectionMetrics() {
        return _report.isSectionMetrics();
    }

    /**
    * Sets whether this report is section metrics.
    *
    * @param sectionMetrics the section metrics of this report
    */
    @Override
    public void setSectionMetrics(boolean sectionMetrics) {
        _report.setSectionMetrics(sectionMetrics);
    }

    /**
    * Returns the section metrics status of this report.
    *
    * @return the section metrics status of this report
    */
    @Override
    public java.lang.String getSectionMetricsStatus() {
        return _report.getSectionMetricsStatus();
    }

    /**
    * Sets the section metrics status of this report.
    *
    * @param sectionMetricsStatus the section metrics status of this report
    */
    @Override
    public void setSectionMetricsStatus(java.lang.String sectionMetricsStatus) {
        _report.setSectionMetricsStatus(sectionMetricsStatus);
    }

    /**
    * Returns the section recommendations of this report.
    *
    * @return the section recommendations of this report
    */
    @Override
    public boolean getSectionRecommendations() {
        return _report.getSectionRecommendations();
    }

    /**
    * Returns <code>true</code> if this report is section recommendations.
    *
    * @return <code>true</code> if this report is section recommendations; <code>false</code> otherwise
    */
    @Override
    public boolean isSectionRecommendations() {
        return _report.isSectionRecommendations();
    }

    /**
    * Sets whether this report is section recommendations.
    *
    * @param sectionRecommendations the section recommendations of this report
    */
    @Override
    public void setSectionRecommendations(boolean sectionRecommendations) {
        _report.setSectionRecommendations(sectionRecommendations);
    }

    /**
    * Returns the section recommendations status of this report.
    *
    * @return the section recommendations status of this report
    */
    @Override
    public java.lang.String getSectionRecommendationsStatus() {
        return _report.getSectionRecommendationsStatus();
    }

    /**
    * Sets the section recommendations status of this report.
    *
    * @param sectionRecommendationsStatus the section recommendations status of this report
    */
    @Override
    public void setSectionRecommendationsStatus(
        java.lang.String sectionRecommendationsStatus) {
        _report.setSectionRecommendationsStatus(sectionRecommendationsStatus);
    }

    @Override
    public boolean isNew() {
        return _report.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _report.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _report.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _report.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _report.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _report.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _report.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _report.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _report.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _report.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _report.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new ReportWrapper((Report) _report.clone());
    }

    @Override
    public int compareTo(
        com.liferay.symposium.portlet.report.model.Report report) {
        return _report.compareTo(report);
    }

    @Override
    public int hashCode() {
        return _report.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.liferay.symposium.portlet.report.model.Report> toCacheModel() {
        return _report.toCacheModel();
    }

    @Override
    public com.liferay.symposium.portlet.report.model.Report toEscapedModel() {
        return new ReportWrapper(_report.toEscapedModel());
    }

    @Override
    public com.liferay.symposium.portlet.report.model.Report toUnescapedModel() {
        return new ReportWrapper(_report.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _report.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _report.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _report.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ReportWrapper)) {
            return false;
        }

        ReportWrapper reportWrapper = (ReportWrapper) obj;

        if (Validator.equals(_report, reportWrapper._report)) {
            return true;
        }

        return false;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return _report.getStagedModelType();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Report getWrappedReport() {
        return _report;
    }

    @Override
    public Report getWrappedModel() {
        return _report;
    }

    @Override
    public void resetOriginalValues() {
        _report.resetOriginalValues();
    }
}
