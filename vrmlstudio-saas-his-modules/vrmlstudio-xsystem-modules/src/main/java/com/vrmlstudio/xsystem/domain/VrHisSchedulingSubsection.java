package com.vrmlstudio.xsystem.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 排班时段对象 vr_his_scheduling_subsection
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisSchedulingSubsection extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer schedulingSubsectionId;

    /** 每天的时段：上午：1；下午：2；晚上：3； */
    @Excel(name = "每天的时段：上午：1；下午：2；晚上：3；")
    private Integer subsectionType;

    /** 排班id */
    @Excel(name = "排班id")
    private Integer schedulingId;

    public void setSchedulingSubsectionId(Integer schedulingSubsectionId) 
    {
        this.schedulingSubsectionId = schedulingSubsectionId;
    }

    public Integer getSchedulingSubsectionId() 
    {
        return schedulingSubsectionId;
    }
    public void setSubsectionType(Integer subsectionType) 
    {
        this.subsectionType = subsectionType;
    }

    public Integer getSubsectionType() 
    {
        return subsectionType;
    }
    public void setSchedulingId(Integer schedulingId) 
    {
        this.schedulingId = schedulingId;
    }

    public Integer getSchedulingId() 
    {
        return schedulingId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("schedulingSubsectionId", getSchedulingSubsectionId())
            .append("subsectionType", getSubsectionType())
            .append("schedulingId", getSchedulingId())
            .toString();
    }
}
