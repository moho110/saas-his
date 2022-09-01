package com.vrmlstudio.sales.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 用户免费提问额度对象 vr_his_patient_credit
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisPatientCredit extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 医院id */
    @Excel(name = "医院id")
    private Integer hospitalId;

    /** 患者id */
    @Excel(name = "患者id")
    private Integer patientId;

    /** 医生id,若为0，就是通用类型 */
    @Excel(name = "医生id,若为0，就是通用类型")
    private Integer doctorId;

    /** 来源id，用户提问id */
    @Excel(name = "来源id，用户提问id")
    private Integer qaId;

    /** 使用状态：0，未使用，1已使用 */
    @Excel(name = "使用状态：0，未使用，1已使用")
    private Integer status;

    /** 使用于哪个问题id */
    @Excel(name = "使用于哪个问题id")
    private Integer qaId2;

    /** 添加时间 */
    @Excel(name = "添加时间")
    private Integer addtime;

    /** 更新时间 */
    @Excel(name = "更新时间")
    private Integer uptime;

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
    public void setPatientId(Integer patientId) 
    {
        this.patientId = patientId;
    }

    public Integer getPatientId() 
    {
        return patientId;
    }
    public void setDoctorId(Integer doctorId) 
    {
        this.doctorId = doctorId;
    }

    public Integer getDoctorId() 
    {
        return doctorId;
    }
    public void setQaId(Integer qaId) 
    {
        this.qaId = qaId;
    }

    public Integer getQaId() 
    {
        return qaId;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setQaId2(Integer qaId2) 
    {
        this.qaId2 = qaId2;
    }

    public Integer getQaId2() 
    {
        return qaId2;
    }
    public void setAddtime(Integer addtime) 
    {
        this.addtime = addtime;
    }

    public Integer getAddtime() 
    {
        return addtime;
    }
    public void setUptime(Integer uptime) 
    {
        this.uptime = uptime;
    }

    public Integer getUptime() 
    {
        return uptime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("hospitalId", getHospitalId())
            .append("patientId", getPatientId())
            .append("doctorId", getDoctorId())
            .append("qaId", getQaId())
            .append("status", getStatus())
            .append("qaId2", getQaId2())
            .append("addtime", getAddtime())
            .append("uptime", getUptime())
            .toString();
    }
}
