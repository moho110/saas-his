package com.vrmlstudio.xsystem.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 处方附加费用对象 vr_his_prescription_extracharges
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisPrescriptionExtracharges extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long preId;

    /** 添加用户id */
    @Excel(name = "添加用户id")
    private Integer mid;

    /** 医院id */
    @Excel(name = "医院id")
    private Integer hid;

    /** 处方附加费名称 */
    @Excel(name = "处方附加费名称")
    private String extrachargesName;

    /** 金额 */
    @Excel(name = "金额")
    private BigDecimal fee;

    /** 处方类型  0:中药处方  1:西药处方 */
    @Excel(name = "处方类型  0:中药处方  1:西药处方")
    private Integer type;

    public void setPreId(Long preId) 
    {
        this.preId = preId;
    }

    public Long getPreId() 
    {
        return preId;
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
    public void setExtrachargesName(String extrachargesName) 
    {
        this.extrachargesName = extrachargesName;
    }

    public String getExtrachargesName() 
    {
        return extrachargesName;
    }
    public void setFee(BigDecimal fee) 
    {
        this.fee = fee;
    }

    public BigDecimal getFee() 
    {
        return fee;
    }
    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("preId", getPreId())
            .append("mid", getMid())
            .append("hid", getHid())
            .append("extrachargesName", getExtrachargesName())
            .append("fee", getFee())
            .append("type", getType())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
