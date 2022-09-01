package com.vrmlstudio.sales.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 历史病历对象 vr_his_care_history
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisCareHistory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 医院id */
    @Excel(name = "医院id")
    private Integer hospitalId;

    /** 医生id */
    @Excel(name = "医生id")
    private Integer doctorId;

    /** 患者id */
    @Excel(name = "患者id")
    private Integer patientId;

    /** 科室id */
    @Excel(name = "科室id")
    private Integer departmentId;

    /** 接诊类型：0初诊，1复诊，2急诊 */
    @Excel(name = "接诊类型：0初诊，1复诊，2急诊")
    private Integer typeId;

    /** 是否传染，0否，1是 */
    @Excel(name = "是否传染，0否，1是")
    private Integer isContagious;

    /** 发病日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发病日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date caseDate;

    /** 插入时间，php时间戳 */
    @Excel(name = "插入时间，php时间戳")
    private Integer addtime;

    /** 诊断编号 */
    @Excel(name = "诊断编号")
    private String caseCode;

    /** 主诉 */
    @Excel(name = "主诉")
    private String caseTitle;

    /** 诊断信息 */
    @Excel(name = "诊断信息")
    private String caseResult;

    /** 医生建议 */
    @Excel(name = "医生建议")
    private String doctorTips;

    /** 备注 */
    @Excel(name = "备注")
    private String memo;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setHospitalId(Integer hospitalId) 
    {
        this.hospitalId = hospitalId;
    }

    public Integer getHospitalId() 
    {
        return hospitalId;
    }
    public void setDoctorId(Integer doctorId) 
    {
        this.doctorId = doctorId;
    }

    public Integer getDoctorId() 
    {
        return doctorId;
    }
    public void setPatientId(Integer patientId) 
    {
        this.patientId = patientId;
    }

    public Integer getPatientId() 
    {
        return patientId;
    }
    public void setDepartmentId(Integer departmentId) 
    {
        this.departmentId = departmentId;
    }

    public Integer getDepartmentId() 
    {
        return departmentId;
    }
    public void setTypeId(Integer typeId) 
    {
        this.typeId = typeId;
    }

    public Integer getTypeId() 
    {
        return typeId;
    }
    public void setIsContagious(Integer isContagious) 
    {
        this.isContagious = isContagious;
    }

    public Integer getIsContagious() 
    {
        return isContagious;
    }
    public void setCaseDate(Date caseDate) 
    {
        this.caseDate = caseDate;
    }

    public Date getCaseDate() 
    {
        return caseDate;
    }
    public void setAddtime(Integer addtime) 
    {
        this.addtime = addtime;
    }

    public Integer getAddtime() 
    {
        return addtime;
    }
    public void setCaseCode(String caseCode) 
    {
        this.caseCode = caseCode;
    }

    public String getCaseCode() 
    {
        return caseCode;
    }
    public void setCaseTitle(String caseTitle) 
    {
        this.caseTitle = caseTitle;
    }

    public String getCaseTitle() 
    {
        return caseTitle;
    }
    public void setCaseResult(String caseResult) 
    {
        this.caseResult = caseResult;
    }

    public String getCaseResult() 
    {
        return caseResult;
    }
    public void setDoctorTips(String doctorTips) 
    {
        this.doctorTips = doctorTips;
    }

    public String getDoctorTips() 
    {
        return doctorTips;
    }
    public void setMemo(String memo) 
    {
        this.memo = memo;
    }

    public String getMemo() 
    {
        return memo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("hospitalId", getHospitalId())
            .append("doctorId", getDoctorId())
            .append("patientId", getPatientId())
            .append("departmentId", getDepartmentId())
            .append("typeId", getTypeId())
            .append("isContagious", getIsContagious())
            .append("caseDate", getCaseDate())
            .append("addtime", getAddtime())
            .append("caseCode", getCaseCode())
            .append("caseTitle", getCaseTitle())
            .append("caseResult", getCaseResult())
            .append("doctorTips", getDoctorTips())
            .append("memo", getMemo())
            .toString();
    }
}
