package com.vrmlstudio.medicine.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 检查项目费用对象 vr_his_inspectionfee
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisInspectionfee extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long insId;

    /** 添加用户id */
    @Excel(name = "添加用户id")
    private Integer mid;

    /** 医院id */
    @Excel(name = "医院id")
    private Integer hid;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String inspectionName;

    /** 项目类别 */
    @Excel(name = "项目类别")
    private String classes;

    /** 项目单价 */
    @Excel(name = "项目单价")
    private BigDecimal unitPrice;

    /** 项目成本 */
    @Excel(name = "项目成本")
    private BigDecimal cost;

    /** 单位 */
    @Excel(name = "单位")
    private String unit;

    /** 类别id */
    @Excel(name = "类别id")
    private Integer classId;

    public void setInsId(Long insId) 
    {
        this.insId = insId;
    }

    public Long getInsId() 
    {
        return insId;
    }
    public void setMid(Integer mid) 
    {
        this.mid = mid;
    }

    public Integer getMid() 
    {
        return mid;
    }
    public void setHid(Integer hid) 
    {
        this.hid = hid;
    }

    public Integer getHid() 
    {
        return hid;
    }
    public void setInspectionName(String inspectionName) 
    {
        this.inspectionName = inspectionName;
    }

    public String getInspectionName() 
    {
        return inspectionName;
    }
    public void setClasses(String classes)
    {
        this.classes = classes;
    }

    public String getClasses()
    {
        return classes;
    }
    public void setUnitPrice(BigDecimal unitPrice) 
    {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getUnitPrice() 
    {
        return unitPrice;
    }
    public void setCost(BigDecimal cost) 
    {
        this.cost = cost;
    }

    public BigDecimal getCost() 
    {
        return cost;
    }
    public void setUnit(String unit) 
    {
        this.unit = unit;
    }

    public String getUnit() 
    {
        return unit;
    }
    public void setClassId(Integer classId) 
    {
        this.classId = classId;
    }

    public Integer getClassId() 
    {
        return classId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("insId", getInsId())
            .append("mid", getMid())
            .append("hid", getHid())
            .append("inspectionName", getInspectionName())
            .append("classes", getClasses())
            .append("unitPrice", getUnitPrice())
            .append("cost", getCost())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("unit", getUnit())
            .append("classId", getClassId())
            .toString();
    }
}
