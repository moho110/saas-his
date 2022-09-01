package com.vrmlstudio.sales.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 支付收费记录对象 vr_his_care_paylog
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisCarePaylog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** care_pkg.id */
    @Excel(name = "care_pkg.id")
    private Integer pkgId;

    /** 支付平台交易单号 */
    @Excel(name = "支付平台交易单号")
    private String platformCode;

    /** 支付方式：0现金，1微信，2支付宝，3，4，5.... */
    @Excel(name = "支付方式：0现金，1微信，2支付宝，3，4，5....")
    private Integer paymentPlatform;

    /** 支付金额 */
    @Excel(name = "支付金额")
    private BigDecimal payAmount;

    /** 状态，0未支付，1已支付 */
    @Excel(name = "状态，0未支付，1已支付")
    private Integer status;

    /** 添加时间 */
    @Excel(name = "添加时间")
    private Integer addtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setPkgId(Integer pkgId) 
    {
        this.pkgId = pkgId;
    }

    public Integer getPkgId() 
    {
        return pkgId;
    }
    public void setPlatformCode(String platformCode) 
    {
        this.platformCode = platformCode;
    }

    public String getPlatformCode() 
    {
        return platformCode;
    }
    public void setPaymentPlatform(Integer paymentPlatform) 
    {
        this.paymentPlatform = paymentPlatform;
    }

    public Integer getPaymentPlatform() 
    {
        return paymentPlatform;
    }
    public void setPayAmount(BigDecimal payAmount) 
    {
        this.payAmount = payAmount;
    }

    public BigDecimal getPayAmount() 
    {
        return payAmount;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setAddtime(Integer addtime) 
    {
        this.addtime = addtime;
    }

    public Integer getAddtime() 
    {
        return addtime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("pkgId", getPkgId())
            .append("platformCode", getPlatformCode())
            .append("paymentPlatform", getPaymentPlatform())
            .append("payAmount", getPayAmount())
            .append("status", getStatus())
            .append("addtime", getAddtime())
            .toString();
    }
}
