package com.liferay.symposium.portlet.report.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.liferay.symposium.portlet.report.model.Report;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Report in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Report
 * @generated
 */
public class ReportCacheModel implements CacheModel<Report>, Externalizable {
    public String uuid;
    public long reportId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String reportName;
    public String reportStatus;
    public long startTime;
    public long endTime;
    public boolean sectionSummary;
    public String sectionSummaryStatus;
    public boolean sectionCosts;
    public String sectionCostsStatus;
    public boolean sectionROI;
    public String sectionROIStatus;
    public boolean sectionMetrics;
    public String sectionMetricsStatus;
    public boolean sectionRecommendations;
    public String sectionRecommendationsStatus;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(45);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", reportId=");
        sb.append(reportId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", reportName=");
        sb.append(reportName);
        sb.append(", reportStatus=");
        sb.append(reportStatus);
        sb.append(", startTime=");
        sb.append(startTime);
        sb.append(", endTime=");
        sb.append(endTime);
        sb.append(", sectionSummary=");
        sb.append(sectionSummary);
        sb.append(", sectionSummaryStatus=");
        sb.append(sectionSummaryStatus);
        sb.append(", sectionCosts=");
        sb.append(sectionCosts);
        sb.append(", sectionCostsStatus=");
        sb.append(sectionCostsStatus);
        sb.append(", sectionROI=");
        sb.append(sectionROI);
        sb.append(", sectionROIStatus=");
        sb.append(sectionROIStatus);
        sb.append(", sectionMetrics=");
        sb.append(sectionMetrics);
        sb.append(", sectionMetricsStatus=");
        sb.append(sectionMetricsStatus);
        sb.append(", sectionRecommendations=");
        sb.append(sectionRecommendations);
        sb.append(", sectionRecommendationsStatus=");
        sb.append(sectionRecommendationsStatus);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Report toEntityModel() {
        ReportImpl reportImpl = new ReportImpl();

        if (uuid == null) {
            reportImpl.setUuid(StringPool.BLANK);
        } else {
            reportImpl.setUuid(uuid);
        }

        reportImpl.setReportId(reportId);
        reportImpl.setGroupId(groupId);
        reportImpl.setCompanyId(companyId);
        reportImpl.setUserId(userId);

        if (userName == null) {
            reportImpl.setUserName(StringPool.BLANK);
        } else {
            reportImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            reportImpl.setCreateDate(null);
        } else {
            reportImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            reportImpl.setModifiedDate(null);
        } else {
            reportImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (reportName == null) {
            reportImpl.setReportName(StringPool.BLANK);
        } else {
            reportImpl.setReportName(reportName);
        }

        if (reportStatus == null) {
            reportImpl.setReportStatus(StringPool.BLANK);
        } else {
            reportImpl.setReportStatus(reportStatus);
        }

        if (startTime == Long.MIN_VALUE) {
            reportImpl.setStartTime(null);
        } else {
            reportImpl.setStartTime(new Date(startTime));
        }

        if (endTime == Long.MIN_VALUE) {
            reportImpl.setEndTime(null);
        } else {
            reportImpl.setEndTime(new Date(endTime));
        }

        reportImpl.setSectionSummary(sectionSummary);

        if (sectionSummaryStatus == null) {
            reportImpl.setSectionSummaryStatus(StringPool.BLANK);
        } else {
            reportImpl.setSectionSummaryStatus(sectionSummaryStatus);
        }

        reportImpl.setSectionCosts(sectionCosts);

        if (sectionCostsStatus == null) {
            reportImpl.setSectionCostsStatus(StringPool.BLANK);
        } else {
            reportImpl.setSectionCostsStatus(sectionCostsStatus);
        }

        reportImpl.setSectionROI(sectionROI);

        if (sectionROIStatus == null) {
            reportImpl.setSectionROIStatus(StringPool.BLANK);
        } else {
            reportImpl.setSectionROIStatus(sectionROIStatus);
        }

        reportImpl.setSectionMetrics(sectionMetrics);

        if (sectionMetricsStatus == null) {
            reportImpl.setSectionMetricsStatus(StringPool.BLANK);
        } else {
            reportImpl.setSectionMetricsStatus(sectionMetricsStatus);
        }

        reportImpl.setSectionRecommendations(sectionRecommendations);

        if (sectionRecommendationsStatus == null) {
            reportImpl.setSectionRecommendationsStatus(StringPool.BLANK);
        } else {
            reportImpl.setSectionRecommendationsStatus(sectionRecommendationsStatus);
        }

        reportImpl.resetOriginalValues();

        return reportImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        reportId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        reportName = objectInput.readUTF();
        reportStatus = objectInput.readUTF();
        startTime = objectInput.readLong();
        endTime = objectInput.readLong();
        sectionSummary = objectInput.readBoolean();
        sectionSummaryStatus = objectInput.readUTF();
        sectionCosts = objectInput.readBoolean();
        sectionCostsStatus = objectInput.readUTF();
        sectionROI = objectInput.readBoolean();
        sectionROIStatus = objectInput.readUTF();
        sectionMetrics = objectInput.readBoolean();
        sectionMetricsStatus = objectInput.readUTF();
        sectionRecommendations = objectInput.readBoolean();
        sectionRecommendationsStatus = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(reportId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (reportName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(reportName);
        }

        if (reportStatus == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(reportStatus);
        }

        objectOutput.writeLong(startTime);
        objectOutput.writeLong(endTime);
        objectOutput.writeBoolean(sectionSummary);

        if (sectionSummaryStatus == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(sectionSummaryStatus);
        }

        objectOutput.writeBoolean(sectionCosts);

        if (sectionCostsStatus == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(sectionCostsStatus);
        }

        objectOutput.writeBoolean(sectionROI);

        if (sectionROIStatus == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(sectionROIStatus);
        }

        objectOutput.writeBoolean(sectionMetrics);

        if (sectionMetricsStatus == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(sectionMetricsStatus);
        }

        objectOutput.writeBoolean(sectionRecommendations);

        if (sectionRecommendationsStatus == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(sectionRecommendationsStatus);
        }
    }
}
