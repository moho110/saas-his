package com.vrmlstudio.xsystem.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 患者用户档案对象 vr_his_patient_file
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisPatientFile extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long fileId;

    /** 患者id */
    @Excel(name = "患者id")
    private Integer patientId;

    /** 紧急联系人 */
    @Excel(name = "紧急联系人")
    private String emergencyContactName;

    /** 紧急联系人电话 */
    @Excel(name = "紧急联系人电话")
    private String emergencyContactMobile;

    /** 紧急联系人关系 1：爸爸  2：妈妈  3：儿子  4：女儿  5：亲戚  6：朋友 */
    @Excel(name = "紧急联系人关系 1：爸爸  2：妈妈  3：儿子  4：女儿  5：亲戚  6：朋友")
    private Integer emergencyContactRelation;

    /** 左耳听力 1：正常  2：耳聋 */
    @Excel(name = "左耳听力 1：正常  2：耳聋")
    private Integer leftEarHearing;

    /** 右耳听力 1：正常  2：耳聋 */
    @Excel(name = "右耳听力 1：正常  2：耳聋")
    private Integer rightEarHearing;

    /** 左眼视力 */
    @Excel(name = "左眼视力")
    private BigDecimal leftVision;

    /** 右眼视力 */
    @Excel(name = "右眼视力")
    private BigDecimal rightVision;

    /** 身高 */
    @Excel(name = "身高")
    private BigDecimal height;

    /** 体重 */
    @Excel(name = "体重")
    private BigDecimal weight;

    /** 血型 1:A 2:B 3:AB 4:O    Rh血型 1:阴性 2:阳性 */
    @Excel(name = "血型 1:A 2:B 3:AB 4:O    Rh血型 1:阴性 2:阳性")
    private String bloodType;

    /** 个人史 */
    @Excel(name = "个人史")
    private String personalInfo;

    /** 家族史 */
    @Excel(name = "家族史")
    private String familyInfo;

    public void setFileId(Long fileId) 
    {
        this.fileId = fileId;
    }

    public Long getFileId() 
    {
        return fileId;
    }
    public void setPatientId(Integer patientId) 
    {
        this.patientId = patientId;
    }

    public Integer getPatientId() 
    {
        return patientId;
    }
    public void setEmergencyContactName(String emergencyContactName) 
    {
        this.emergencyContactName = emergencyContactName;
    }

    public String getEmergencyContactName() 
    {
        return emergencyContactName;
    }
    public void setEmergencyContactMobile(String emergencyContactMobile) 
    {
        this.emergencyContactMobile = emergencyContactMobile;
    }

    public String getEmergencyContactMobile() 
    {
        return emergencyContactMobile;
    }
    public void setEmergencyContactRelation(Integer emergencyContactRelation) 
    {
        this.emergencyContactRelation = emergencyContactRelation;
    }

    public Integer getEmergencyContactRelation() 
    {
        return emergencyContactRelation;
    }
    public void setLeftEarHearing(Integer leftEarHearing) 
    {
        this.leftEarHearing = leftEarHearing;
    }

    public Integer getLeftEarHearing() 
    {
        return leftEarHearing;
    }
    public void setRightEarHearing(Integer rightEarHearing) 
    {
        this.rightEarHearing = rightEarHearing;
    }

    public Integer getRightEarHearing() 
    {
        return rightEarHearing;
    }
    public void setLeftVision(BigDecimal leftVision) 
    {
        this.leftVision = leftVision;
    }

    public BigDecimal getLeftVision() 
    {
        return leftVision;
    }
    public void setRightVision(BigDecimal rightVision) 
    {
        this.rightVision = rightVision;
    }

    public BigDecimal getRightVision() 
    {
        return rightVision;
    }
    public void setHeight(BigDecimal height) 
    {
        this.height = height;
    }

    public BigDecimal getHeight() 
    {
        return height;
    }
    public void setWeight(BigDecimal weight) 
    {
        this.weight = weight;
    }

    public BigDecimal getWeight() 
    {
        return weight;
    }
    public void setBloodType(String bloodType) 
    {
        this.bloodType = bloodType;
    }

    public String getBloodType() 
    {
        return bloodType;
    }
    public void setPersonalInfo(String personalInfo) 
    {
        this.personalInfo = personalInfo;
    }

    public String getPersonalInfo() 
    {
        return personalInfo;
    }
    public void setFamilyInfo(String familyInfo) 
    {
        this.familyInfo = familyInfo;
    }

    public String getFamilyInfo() 
    {
        return familyInfo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("fileId", getFileId())
            .append("patientId", getPatientId())
            .append("emergencyContactName", getEmergencyContactName())
            .append("emergencyContactMobile", getEmergencyContactMobile())
            .append("emergencyContactRelation", getEmergencyContactRelation())
            .append("leftEarHearing", getLeftEarHearing())
            .append("rightEarHearing", getRightEarHearing())
            .append("leftVision", getLeftVision())
            .append("updateTime", getUpdateTime())
            .append("rightVision", getRightVision())
            .append("height", getHeight())
            .append("weight", getWeight())
            .append("bloodType", getBloodType())
            .append("createTime", getCreateTime())
            .append("personalInfo", getPersonalInfo())
            .append("familyInfo", getFamilyInfo())
            .toString();
    }
}
