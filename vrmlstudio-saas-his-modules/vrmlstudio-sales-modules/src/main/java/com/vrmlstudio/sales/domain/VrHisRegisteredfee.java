package com.vrmlstudio.sales.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 挂号费用对象 vr_his_registeredfee
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisRegisteredfee extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long regId;

    /** 用户id */
    @Excel(name = "用户id")
    private Long mid;

    /** 公司ID */
    @Excel(name = "公司ID")
    private Long companyId;

    /** 挂号费用名称 */
    @Excel(name = "挂号费用名称")
    private String registeredfeeName;

    /** 金额 */
    @Excel(name = "金额")
    private BigDecimal registeredfeeFee;

    /** 子费用总数 */
    @Excel(name = "子费用总数")
    private BigDecimal registeredfeeSubFee;

    /** 挂号费用总金额 */
    @Excel(name = "挂号费用总金额")
    private BigDecimal registeredfeeAggregateAmount;

    /** 子费用数量 */
    @Excel(name = "子费用数量")
    private Integer numberofsub;

    public void setRegId(Long regId) 
    {
        this.regId = regId;
    }

    public Long getRegId() 
    {
        return regId;
    }
    public void setMid(Long mid) 
    {
        this.mid = mid;
    }

    public Long getMid() 
    {
        return mid;
    }
    public void setCompanyId(Long companyId) 
    {
        this.companyId = companyId;
    }

    public Long getCompanyId() 
    {
        return companyId;
    }
    public void setRegisteredfeeName(String registeredfeeName) 
    {
        this.registeredfeeName = registeredfeeName;
    }

    public String getRegisteredfeeName() 
    {
        return registeredfeeName;
    }
    public void setRegisteredfeeFee(BigDecimal registeredfeeFee) 
    {
        this.registeredfeeFee = registeredfeeFee;
    }

    public BigDecimal getRegisteredfeeFee() 
    {
        return registeredfeeFee;
    }
    public void setRegisteredfeeSubFee(BigDecimal registeredfeeSubFee) 
    {
        this.registeredfeeSubFee = registeredfeeSubFee;
    }

    public BigDecimal getRegisteredfeeSubFee() 
    {
        return registeredfeeSubFee;
    }
    public void setRegisteredfeeAggregateAmount(BigDecimal registeredfeeAggregateAmount) 
    {
        this.registeredfeeAggregateAmount = registeredfeeAggregateAmount;
    }

    public BigDecimal getRegisteredfeeAggregateAmount() 
    {
        return registeredfeeAggregateAmount;
    }
    public void setNumberofsub(Integer numberofsub) 
    {
        this.numberofsub = numberofsub;
    }

    public Integer getNumberofsub() 
    {
        return numberofsub;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("regId", getRegId())
            .append("mid", getMid())
            .append("companyId", getCompanyId())
            .append("registeredfeeName", getRegisteredfeeName())
            .append("registeredfeeFee", getRegisteredfeeFee())
            .append("registeredfeeSubFee", getRegisteredfeeSubFee())
            .append("registeredfeeAggregateAmount", getRegisteredfeeAggregateAmount())
            .append("numberofsub", getNumberofsub())
            .append("createTime", getCreateTime())
            .toString();
    }
}
