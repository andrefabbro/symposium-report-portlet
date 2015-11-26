package com.liferay.symposium.portlet.report.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ReportSoap implements Serializable {
    private String _uuid;
    private long _reportId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _reportName;
    private String _reportStatus;
    private Date _startTime;
    private Date _endTime;
    private boolean _sectionSummary;
    private String _sectionSummaryStatus;
    private boolean _sectionCosts;
    private String _sectionCostsStatus;
    private boolean _sectionROI;
    private String _sectionROIStatus;
    private boolean _sectionMetrics;
    private String _sectionMetricsStatus;
    private boolean _sectionRecommendations;
    private String _sectionRecommendationsStatus;

    public ReportSoap() {
    }

    public static ReportSoap toSoapModel(Report model) {
        ReportSoap soapModel = new ReportSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setReportId(model.getReportId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setReportName(model.getReportName());
        soapModel.setReportStatus(model.getReportStatus());
        soapModel.setStartTime(model.getStartTime());
        soapModel.setEndTime(model.getEndTime());
        soapModel.setSectionSummary(model.getSectionSummary());
        soapModel.setSectionSummaryStatus(model.getSectionSummaryStatus());
        soapModel.setSectionCosts(model.getSectionCosts());
        soapModel.setSectionCostsStatus(model.getSectionCostsStatus());
        soapModel.setSectionROI(model.getSectionROI());
        soapModel.setSectionROIStatus(model.getSectionROIStatus());
        soapModel.setSectionMetrics(model.getSectionMetrics());
        soapModel.setSectionMetricsStatus(model.getSectionMetricsStatus());
        soapModel.setSectionRecommendations(model.getSectionRecommendations());
        soapModel.setSectionRecommendationsStatus(model.getSectionRecommendationsStatus());

        return soapModel;
    }

    public static ReportSoap[] toSoapModels(Report[] models) {
        ReportSoap[] soapModels = new ReportSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static ReportSoap[][] toSoapModels(Report[][] models) {
        ReportSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new ReportSoap[models.length][models[0].length];
        } else {
            soapModels = new ReportSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static ReportSoap[] toSoapModels(List<Report> models) {
        List<ReportSoap> soapModels = new ArrayList<ReportSoap>(models.size());

        for (Report model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new ReportSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _reportId;
    }

    public void setPrimaryKey(long pk) {
        setReportId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getReportId() {
        return _reportId;
    }

    public void setReportId(long reportId) {
        _reportId = reportId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getReportName() {
        return _reportName;
    }

    public void setReportName(String reportName) {
        _reportName = reportName;
    }

    public String getReportStatus() {
        return _reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        _reportStatus = reportStatus;
    }

    public Date getStartTime() {
        return _startTime;
    }

    public void setStartTime(Date startTime) {
        _startTime = startTime;
    }

    public Date getEndTime() {
        return _endTime;
    }

    public void setEndTime(Date endTime) {
        _endTime = endTime;
    }

    public boolean getSectionSummary() {
        return _sectionSummary;
    }

    public boolean isSectionSummary() {
        return _sectionSummary;
    }

    public void setSectionSummary(boolean sectionSummary) {
        _sectionSummary = sectionSummary;
    }

    public String getSectionSummaryStatus() {
        return _sectionSummaryStatus;
    }

    public void setSectionSummaryStatus(String sectionSummaryStatus) {
        _sectionSummaryStatus = sectionSummaryStatus;
    }

    public boolean getSectionCosts() {
        return _sectionCosts;
    }

    public boolean isSectionCosts() {
        return _sectionCosts;
    }

    public void setSectionCosts(boolean sectionCosts) {
        _sectionCosts = sectionCosts;
    }

    public String getSectionCostsStatus() {
        return _sectionCostsStatus;
    }

    public void setSectionCostsStatus(String sectionCostsStatus) {
        _sectionCostsStatus = sectionCostsStatus;
    }

    public boolean getSectionROI() {
        return _sectionROI;
    }

    public boolean isSectionROI() {
        return _sectionROI;
    }

    public void setSectionROI(boolean sectionROI) {
        _sectionROI = sectionROI;
    }

    public String getSectionROIStatus() {
        return _sectionROIStatus;
    }

    public void setSectionROIStatus(String sectionROIStatus) {
        _sectionROIStatus = sectionROIStatus;
    }

    public boolean getSectionMetrics() {
        return _sectionMetrics;
    }

    public boolean isSectionMetrics() {
        return _sectionMetrics;
    }

    public void setSectionMetrics(boolean sectionMetrics) {
        _sectionMetrics = sectionMetrics;
    }

    public String getSectionMetricsStatus() {
        return _sectionMetricsStatus;
    }

    public void setSectionMetricsStatus(String sectionMetricsStatus) {
        _sectionMetricsStatus = sectionMetricsStatus;
    }

    public boolean getSectionRecommendations() {
        return _sectionRecommendations;
    }

    public boolean isSectionRecommendations() {
        return _sectionRecommendations;
    }

    public void setSectionRecommendations(boolean sectionRecommendations) {
        _sectionRecommendations = sectionRecommendations;
    }

    public String getSectionRecommendationsStatus() {
        return _sectionRecommendationsStatus;
    }

    public void setSectionRecommendationsStatus(
        String sectionRecommendationsStatus) {
        _sectionRecommendationsStatus = sectionRecommendationsStatus;
    }
}
