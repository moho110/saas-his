package com.vrmlstudio.xsystem.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 我的排班对象 vr_his_scheduling
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisScheduling extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long schedulingId;

    /** 医生ID */
    @Excel(name = "医生ID")
    private Integer physicianid;

    /** 科室ID */
    @Excel(name = "科室ID")
    private Integer departmentId;

    /** 诊所ID */
    @Excel(name = "诊所ID")
    private Integer companyId;

    /** 本周开始时间 */
    @Excel(name = "本周开始时间")
    private String startTimeThisWeek;

    /** 本周结束时间 */
    @Excel(name = "本周结束时间")
    private String endTimeThisWeek;

    public void setSchedulingId(Long schedulingId) 
    {
        this.schedulingId = schedulingId;
    }

    public Long getSchedulingId() 
    {
        return schedulingId;
    }
    public void setPhysicianid(Integer physicianid) 
    {
        this.physicianid = physicianid;
    }

    public Integer getPhysicianid() 
    {
        return physicianid;
    }
    public void setDepartmentId(Integer departmentId) 
    {
        this.departmentId = departmentId;
    }

    public Integer getDepartmentId() 
    {
        return departmentId;
    }
    public void setCompanyId(Integer companyId) 
    {
        this.companyId = companyId;
    }

    public Integer getCompanyId() 
    {
        return companyId;
    }
    public void setStartTimeThisWeek(String startTimeThisWeek) 
    {
        this.startTimeThisWeek = startTimeThisWeek;
    }

    public String getStartTimeThisWeek() 
    {
        return startTimeThisWeek;
    }
    public void setEndTimeThisWeek(String endTimeThisWeek) 
    {
        this.endTimeThisWeek = endTimeThisWeek;
    }

    public String getEndTimeThisWeek() 
    {
        return endTimeThisWeek;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("schedulingId", getSchedulingId())
            .append("physicianid", getPhysicianid())
            .append("departmentId", getDepartmentId())
            .append("companyId", getCompanyId())
            .append("startTimeThisWeek", getStartTimeThisWeek())
            .append("endTimeThisWeek", getEndTimeThisWeek())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
