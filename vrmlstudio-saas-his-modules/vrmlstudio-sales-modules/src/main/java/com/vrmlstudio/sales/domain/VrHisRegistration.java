package com.vrmlstudio.sales.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 门诊挂号对象 vr_his_registration
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisRegistration extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long registrationId;

    /** 患者ID */
    @Excel(name = "患者ID")
    private Integer patientId;

    /** 医生ID */
    @Excel(name = "医生ID")
    private Integer physicianId;

    /** 操作员ID */
    @Excel(name = "操作员ID")
    private Integer operatorId;

    /** 诊所ID */
    @Excel(name = "诊所ID")
    private Integer companyId;

    /** 科室ID */
    @Excel(name = "科室ID")
    private Integer departmentId;

    /** 挂号费用ID */
    @Excel(name = "挂号费用ID")
    private Integer registeredfeeId;

    /** 挂号总金额 */
    @Excel(name = "挂号总金额")
    private BigDecimal registrationAmount;

    /** 挂号编号 */
    @Excel(name = "挂号编号")
    private Long registrationNumber;

    /** 挂号状态,1为待就诊，3为已退号，2为已就诊,4为作废，5,为未付款,6，为部分支付 */
    @Excel(name = "挂号状态,1为待就诊，3为已退号，2为已就诊,4为作废，5,为未付款,6，为部分支付")
    private Integer registrationStatus;

    /** 排班主表ID */
    @Excel(name = "排班主表ID")
    private Integer schedulingId;

    /** 排班时段表ID */
    @Excel(name = "排班时段表ID")
    private Integer schedulingSubsectionId;

    /** 排班星期表ID */
    @Excel(name = "排班星期表ID")
    private Integer schedulingWeekId;

    /** 收费总表care_pkg.id */
    @Excel(name = "收费总表care_pkg.id")
    private Integer pkgId;

    public void setRegistrationId(Long registrationId) 
    {
        this.registrationId = registrationId;
    }

    public Long getRegistrationId() 
    {
        return registrationId;
    }
    public void setPatientId(Integer patientId) 
    {
        this.patientId = patientId;
    }

    public Integer getPatientId() 
    {
        return patientId;
    }
    public void setPhysicianId(Integer physicianId) 
    {
        this.physicianId = physicianId;
    }

    public Integer getPhysicianId() 
    {
        return physicianId;
    }
    public void setOperatorId(Integer operatorId) 
    {
        this.operatorId = operatorId;
    }

    public Integer getOperatorId() 
    {
        return operatorId;
    }
    public void setCompanyId(Integer companyId) 
    {
        this.companyId = companyId;
    }

    public Integer getCompanyId() 
    {
        return companyId;
    }
    public void setDepartmentId(Integer departmentId) 
    {
        this.departmentId = departmentId;
    }

    public Integer getDepartmentId() 
    {
        return departmentId;
    }
    public void setRegisteredfeeId(Integer registeredfeeId) 
    {
        this.registeredfeeId = registeredfeeId;
    }

    public Integer getRegisteredfeeId() 
    {
        return registeredfeeId;
    }
    public void setRegistrationAmount(BigDecimal registrationAmount) 
    {
        this.registrationAmount = registrationAmount;
    }

    public BigDecimal getRegistrationAmount() 
    {
        return registrationAmount;
    }
    public void setRegistrationNumber(Long registrationNumber) 
    {
        this.registrationNumber = registrationNumber;
    }

    public Long getRegistrationNumber() 
    {
        return registrationNumber;
    }
    public void setRegistrationStatus(Integer registrationStatus) 
    {
        this.registrationStatus = registrationStatus;
    }

    public Integer getRegistrationStatus() 
    {
        return registrationStatus;
    }
    public void setSchedulingId(Integer schedulingId) 
    {
        this.schedulingId = schedulingId;
    }

    public Integer getSchedulingId() 
    {
        return schedulingId;
    }
    public void setSchedulingSubsectionId(Integer schedulingSubsectionId) 
    {
        this.schedulingSubsectionId = schedulingSubsectionId;
    }

    public Integer getSchedulingSubsectionId() 
    {
        return schedulingSubsectionId;
    }
    public void setSchedulingWeekId(Integer schedulingWeekId) 
    {
        this.schedulingWeekId = schedulingWeekId;
    }

    public Integer getSchedulingWeekId() 
    {
        return schedulingWeekId;
    }
    public void setPkgId(Integer pkgId) 
    {
        this.pkgId = pkgId;
    }

    public Integer getPkgId() 
    {
        return pkgId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("registrationId", getRegistrationId())
            .append("patientId", getPatientId())
            .append("physicianId", getPhysicianId())
            .append("operatorId", getOperatorId())
            .append("companyId", getCompanyId())
            .append("departmentId", getDepartmentId())
            .append("registeredfeeId", getRegisteredfeeId())
            .append("registrationAmount", getRegistrationAmount())
            .append("registrationNumber", getRegistrationNumber())
            .append("registrationStatus", getRegistrationStatus())
            .append("schedulingId", getSchedulingId())
            .append("schedulingSubsectionId", getSchedulingSubsectionId())
            .append("schedulingWeekId", getSchedulingWeekId())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("pkgId", getPkgId())
            .toString();
    }
}
