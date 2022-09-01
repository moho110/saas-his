package com.vrmlstudio.xsystem.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 排班星期对象 vr_his_scheduling_week
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisSchedulingWeek extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer schedulingWeekId;

    /** 时间 */
    @Excel(name = "时间")
    private String date;

    /** 星期一：1；星期二：2；星期三：3；星期四：4；星期五：5；星期六：6；星期日：0 */
    @Excel(name = "星期一：1；星期二：2；星期三：3；星期四：4；星期五：5；星期六：6；星期日：0")
    private Integer week;

    /** 挂号费用ID */
    @Excel(name = "挂号费用ID")
    private Integer registeredfeeId;

    /** 排班分段ID */
    @Excel(name = "排班分段ID")
    private Integer schedulingSubsectionId;

    public void setSchedulingWeekId(Integer schedulingWeekId) 
    {
        this.schedulingWeekId = schedulingWeekId;
    }

    public Integer getSchedulingWeekId() 
    {
        return schedulingWeekId;
    }
    public void setDate(String date) 
    {
        this.date = date;
    }

    public String getDate() 
    {
        return date;
    }
    public void setWeek(Integer week) 
    {
        this.week = week;
    }

    public Integer getWeek() 
    {
        return week;
    }
    public void setRegisteredfeeId(Integer registeredfeeId) 
    {
        this.registeredfeeId = registeredfeeId;
    }

    public Integer getRegisteredfeeId() 
    {
        return registeredfeeId;
    }
    public void setSchedulingSubsectionId(Integer schedulingSubsectionId) 
    {
        this.schedulingSubsectionId = schedulingSubsectionId;
    }

    public Integer getSchedulingSubsectionId() 
    {
        return schedulingSubsectionId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("schedulingWeekId", getSchedulingWeekId())
            .append("date", getDate())
            .append("week", getWeek())
            .append("registeredfeeId", getRegisteredfeeId())
            .append("schedulingSubsectionId", getSchedulingSubsectionId())
            .toString();
    }
}
