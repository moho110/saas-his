package com.vrmlstudio.sales.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 挂号费用子对象 vr_his_registeredfee_sub
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisRegisteredfeeSub extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer regSubId;

    /** 挂号费用ID */
    @Excel(name = "挂号费用ID")
    private Integer regId;

    /** 挂号费用子名称 */
    @Excel(name = "挂号费用子名称")
    private String subRegisteredfeeName;

    /** 子费用  */
    @Excel(name = "子费用 ")
    private BigDecimal subRegisteredfeeFee;

    public void setRegSubId(Integer regSubId) 
    {
        this.regSubId = regSubId;
    }

    public Integer getRegSubId() 
    {
        return regSubId;
    }
    public void setRegId(Integer regId) 
    {
        this.regId = regId;
    }

    public Integer getRegId() 
    {
        return regId;
    }
    public void setSubRegisteredfeeName(String subRegisteredfeeName) 
    {
        this.subRegisteredfeeName = subRegisteredfeeName;
    }

    public String getSubRegisteredfeeName() 
    {
        return subRegisteredfeeName;
    }
    public void setSubRegisteredfeeFee(BigDecimal subRegisteredfeeFee) 
    {
        this.subRegisteredfeeFee = subRegisteredfeeFee;
    }

    public BigDecimal getSubRegisteredfeeFee() 
    {
        return subRegisteredfeeFee;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("regSubId", getRegSubId())
            .append("regId", getRegId())
            .append("subRegisteredfeeName", getSubRegisteredfeeName())
            .append("subRegisteredfeeFee", getSubRegisteredfeeFee())
            .toString();
    }
}
