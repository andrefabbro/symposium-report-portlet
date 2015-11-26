package com.liferay.symposium.portlet.report.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.liferay.symposium.portlet.report.service.ClpSerializer;
import com.liferay.symposium.portlet.report.service.ReportLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class ReportClp extends BaseModelImpl<Report> implements Report {
    private String _uuid;
    private long _reportId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
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
    private BaseModel<?> _reportRemoteModel;
    private Class<?> _clpSerializerClass = com.liferay.symposium.portlet.report.service.ClpSerializer.class;

    public ReportClp() {
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
    public long getPrimaryKey() {
        return _reportId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setReportId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _reportId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public String getUuid() {
        return _uuid;
    }

    @Override
    public void setUuid(String uuid) {
        _uuid = uuid;

        if (_reportRemoteModel != null) {
            try {
                Class<?> clazz = _reportRemoteModel.getClass();

                Method method = clazz.getMethod("setUuid", String.class);

                method.invoke(_reportRemoteModel, uuid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getReportId() {
        return _reportId;
    }

    @Override
    public void setReportId(long reportId) {
        _reportId = reportId;

        if (_reportRemoteModel != null) {
            try {
                Class<?> clazz = _reportRemoteModel.getClass();

                Method method = clazz.getMethod("setReportId", long.class);

                method.invoke(_reportRemoteModel, reportId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_reportRemoteModel != null) {
            try {
                Class<?> clazz = _reportRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_reportRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_reportRemoteModel != null) {
            try {
                Class<?> clazz = _reportRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_reportRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_reportRemoteModel != null) {
            try {
                Class<?> clazz = _reportRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_reportRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public String getUserName() {
        return _userName;
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;

        if (_reportRemoteModel != null) {
            try {
                Class<?> clazz = _reportRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_reportRemoteModel, userName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_reportRemoteModel != null) {
            try {
                Class<?> clazz = _reportRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_reportRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_reportRemoteModel != null) {
            try {
                Class<?> clazz = _reportRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_reportRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getReportName() {
        return _reportName;
    }

    @Override
    public void setReportName(String reportName) {
        _reportName = reportName;

        if (_reportRemoteModel != null) {
            try {
                Class<?> clazz = _reportRemoteModel.getClass();

                Method method = clazz.getMethod("setReportName", String.class);

                method.invoke(_reportRemoteModel, reportName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getReportStatus() {
        return _reportStatus;
    }

    @Override
    public void setReportStatus(String reportStatus) {
        _reportStatus = reportStatus;

        if (_reportRemoteModel != null) {
            try {
                Class<?> clazz = _reportRemoteModel.getClass();

                Method method = clazz.getMethod("setReportStatus", String.class);

                method.invoke(_reportRemoteModel, reportStatus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getStartTime() {
        return _startTime;
    }

    @Override
    public void setStartTime(Date startTime) {
        _startTime = startTime;

        if (_reportRemoteModel != null) {
            try {
                Class<?> clazz = _reportRemoteModel.getClass();

                Method method = clazz.getMethod("setStartTime", Date.class);

                method.invoke(_reportRemoteModel, startTime);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getEndTime() {
        return _endTime;
    }

    @Override
    public void setEndTime(Date endTime) {
        _endTime = endTime;

        if (_reportRemoteModel != null) {
            try {
                Class<?> clazz = _reportRemoteModel.getClass();

                Method method = clazz.getMethod("setEndTime", Date.class);

                method.invoke(_reportRemoteModel, endTime);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getSectionSummary() {
        return _sectionSummary;
    }

    @Override
    public boolean isSectionSummary() {
        return _sectionSummary;
    }

    @Override
    public void setSectionSummary(boolean sectionSummary) {
        _sectionSummary = sectionSummary;

        if (_reportRemoteModel != null) {
            try {
                Class<?> clazz = _reportRemoteModel.getClass();

                Method method = clazz.getMethod("setSectionSummary",
                        boolean.class);

                method.invoke(_reportRemoteModel, sectionSummary);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSectionSummaryStatus() {
        return _sectionSummaryStatus;
    }

    @Override
    public void setSectionSummaryStatus(String sectionSummaryStatus) {
        _sectionSummaryStatus = sectionSummaryStatus;

        if (_reportRemoteModel != null) {
            try {
                Class<?> clazz = _reportRemoteModel.getClass();

                Method method = clazz.getMethod("setSectionSummaryStatus",
                        String.class);

                method.invoke(_reportRemoteModel, sectionSummaryStatus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getSectionCosts() {
        return _sectionCosts;
    }

    @Override
    public boolean isSectionCosts() {
        return _sectionCosts;
    }

    @Override
    public void setSectionCosts(boolean sectionCosts) {
        _sectionCosts = sectionCosts;

        if (_reportRemoteModel != null) {
            try {
                Class<?> clazz = _reportRemoteModel.getClass();

                Method method = clazz.getMethod("setSectionCosts", boolean.class);

                method.invoke(_reportRemoteModel, sectionCosts);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSectionCostsStatus() {
        return _sectionCostsStatus;
    }

    @Override
    public void setSectionCostsStatus(String sectionCostsStatus) {
        _sectionCostsStatus = sectionCostsStatus;

        if (_reportRemoteModel != null) {
            try {
                Class<?> clazz = _reportRemoteModel.getClass();

                Method method = clazz.getMethod("setSectionCostsStatus",
                        String.class);

                method.invoke(_reportRemoteModel, sectionCostsStatus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getSectionROI() {
        return _sectionROI;
    }

    @Override
    public boolean isSectionROI() {
        return _sectionROI;
    }

    @Override
    public void setSectionROI(boolean sectionROI) {
        _sectionROI = sectionROI;

        if (_reportRemoteModel != null) {
            try {
                Class<?> clazz = _reportRemoteModel.getClass();

                Method method = clazz.getMethod("setSectionROI", boolean.class);

                method.invoke(_reportRemoteModel, sectionROI);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSectionROIStatus() {
        return _sectionROIStatus;
    }

    @Override
    public void setSectionROIStatus(String sectionROIStatus) {
        _sectionROIStatus = sectionROIStatus;

        if (_reportRemoteModel != null) {
            try {
                Class<?> clazz = _reportRemoteModel.getClass();

                Method method = clazz.getMethod("setSectionROIStatus",
                        String.class);

                method.invoke(_reportRemoteModel, sectionROIStatus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getSectionMetrics() {
        return _sectionMetrics;
    }

    @Override
    public boolean isSectionMetrics() {
        return _sectionMetrics;
    }

    @Override
    public void setSectionMetrics(boolean sectionMetrics) {
        _sectionMetrics = sectionMetrics;

        if (_reportRemoteModel != null) {
            try {
                Class<?> clazz = _reportRemoteModel.getClass();

                Method method = clazz.getMethod("setSectionMetrics",
                        boolean.class);

                method.invoke(_reportRemoteModel, sectionMetrics);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSectionMetricsStatus() {
        return _sectionMetricsStatus;
    }

    @Override
    public void setSectionMetricsStatus(String sectionMetricsStatus) {
        _sectionMetricsStatus = sectionMetricsStatus;

        if (_reportRemoteModel != null) {
            try {
                Class<?> clazz = _reportRemoteModel.getClass();

                Method method = clazz.getMethod("setSectionMetricsStatus",
                        String.class);

                method.invoke(_reportRemoteModel, sectionMetricsStatus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getSectionRecommendations() {
        return _sectionRecommendations;
    }

    @Override
    public boolean isSectionRecommendations() {
        return _sectionRecommendations;
    }

    @Override
    public void setSectionRecommendations(boolean sectionRecommendations) {
        _sectionRecommendations = sectionRecommendations;

        if (_reportRemoteModel != null) {
            try {
                Class<?> clazz = _reportRemoteModel.getClass();

                Method method = clazz.getMethod("setSectionRecommendations",
                        boolean.class);

                method.invoke(_reportRemoteModel, sectionRecommendations);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSectionRecommendationsStatus() {
        return _sectionRecommendationsStatus;
    }

    @Override
    public void setSectionRecommendationsStatus(
        String sectionRecommendationsStatus) {
        _sectionRecommendationsStatus = sectionRecommendationsStatus;

        if (_reportRemoteModel != null) {
            try {
                Class<?> clazz = _reportRemoteModel.getClass();

                Method method = clazz.getMethod("setSectionRecommendationsStatus",
                        String.class);

                method.invoke(_reportRemoteModel, sectionRecommendationsStatus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                Report.class.getName()));
    }

    public BaseModel<?> getReportRemoteModel() {
        return _reportRemoteModel;
    }

    public void setReportRemoteModel(BaseModel<?> reportRemoteModel) {
        _reportRemoteModel = reportRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _reportRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_reportRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            ReportLocalServiceUtil.addReport(this);
        } else {
            ReportLocalServiceUtil.updateReport(this);
        }
    }

    @Override
    public Report toEscapedModel() {
        return (Report) ProxyUtil.newProxyInstance(Report.class.getClassLoader(),
            new Class[] { Report.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        ReportClp clone = new ReportClp();

        clone.setUuid(getUuid());
        clone.setReportId(getReportId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setReportName(getReportName());
        clone.setReportStatus(getReportStatus());
        clone.setStartTime(getStartTime());
        clone.setEndTime(getEndTime());
        clone.setSectionSummary(getSectionSummary());
        clone.setSectionSummaryStatus(getSectionSummaryStatus());
        clone.setSectionCosts(getSectionCosts());
        clone.setSectionCostsStatus(getSectionCostsStatus());
        clone.setSectionROI(getSectionROI());
        clone.setSectionROIStatus(getSectionROIStatus());
        clone.setSectionMetrics(getSectionMetrics());
        clone.setSectionMetricsStatus(getSectionMetricsStatus());
        clone.setSectionRecommendations(getSectionRecommendations());
        clone.setSectionRecommendationsStatus(getSectionRecommendationsStatus());

        return clone;
    }

    @Override
    public int compareTo(Report report) {
        int value = 0;

        if (getReportId() < report.getReportId()) {
            value = -1;
        } else if (getReportId() > report.getReportId()) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ReportClp)) {
            return false;
        }

        ReportClp report = (ReportClp) obj;

        long primaryKey = report.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(45);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", reportId=");
        sb.append(getReportId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", reportName=");
        sb.append(getReportName());
        sb.append(", reportStatus=");
        sb.append(getReportStatus());
        sb.append(", startTime=");
        sb.append(getStartTime());
        sb.append(", endTime=");
        sb.append(getEndTime());
        sb.append(", sectionSummary=");
        sb.append(getSectionSummary());
        sb.append(", sectionSummaryStatus=");
        sb.append(getSectionSummaryStatus());
        sb.append(", sectionCosts=");
        sb.append(getSectionCosts());
        sb.append(", sectionCostsStatus=");
        sb.append(getSectionCostsStatus());
        sb.append(", sectionROI=");
        sb.append(getSectionROI());
        sb.append(", sectionROIStatus=");
        sb.append(getSectionROIStatus());
        sb.append(", sectionMetrics=");
        sb.append(getSectionMetrics());
        sb.append(", sectionMetricsStatus=");
        sb.append(getSectionMetricsStatus());
        sb.append(", sectionRecommendations=");
        sb.append(getSectionRecommendations());
        sb.append(", sectionRecommendationsStatus=");
        sb.append(getSectionRecommendationsStatus());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(70);

        sb.append("<model><model-name>");
        sb.append("com.liferay.symposium.portlet.report.model.Report");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>reportId</column-name><column-value><![CDATA[");
        sb.append(getReportId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>reportName</column-name><column-value><![CDATA[");
        sb.append(getReportName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>reportStatus</column-name><column-value><![CDATA[");
        sb.append(getReportStatus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>startTime</column-name><column-value><![CDATA[");
        sb.append(getStartTime());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>endTime</column-name><column-value><![CDATA[");
        sb.append(getEndTime());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sectionSummary</column-name><column-value><![CDATA[");
        sb.append(getSectionSummary());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sectionSummaryStatus</column-name><column-value><![CDATA[");
        sb.append(getSectionSummaryStatus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sectionCosts</column-name><column-value><![CDATA[");
        sb.append(getSectionCosts());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sectionCostsStatus</column-name><column-value><![CDATA[");
        sb.append(getSectionCostsStatus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sectionROI</column-name><column-value><![CDATA[");
        sb.append(getSectionROI());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sectionROIStatus</column-name><column-value><![CDATA[");
        sb.append(getSectionROIStatus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sectionMetrics</column-name><column-value><![CDATA[");
        sb.append(getSectionMetrics());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sectionMetricsStatus</column-name><column-value><![CDATA[");
        sb.append(getSectionMetricsStatus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sectionRecommendations</column-name><column-value><![CDATA[");
        sb.append(getSectionRecommendations());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sectionRecommendationsStatus</column-name><column-value><![CDATA[");
        sb.append(getSectionRecommendationsStatus());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
