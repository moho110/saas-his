package com.vrmlstudio.sales.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 提现付款记录，微信企业付款记录对象 vr_his_mchpay
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisMchpay extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 所属医院id */
    @Excel(name = "所属医院id")
    private Integer hospitalId;

    /** 提现申请id */
    @Excel(name = "提现申请id")
    private Integer cashOutId;

    /** 操作ip */
    @Excel(name = "操作ip")
    private String ip;

    /** 商户订单号 */
    @Excel(name = "商户订单号")
    private String partnerTradeNo;

    /** 支付平台交易订单 */
    @Excel(name = "支付平台交易订单")
    private String paymentNo;

    /** 添加时间 */
    @Excel(name = "添加时间")
    private Integer addtime;

    /** 状态：0未处理，1成功，2失败，3异常 */
    @Excel(name = "状态：0未处理，1成功，2失败，3异常")
    private Integer status;

    /** 备注 */
    @Excel(name = "备注")
    private String memo;

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
    public void setCashOutId(Integer cashOutId) 
    {
        this.cashOutId = cashOutId;
    }

    public Integer getCashOutId() 
    {
        return cashOutId;
    }
    public void setIp(String ip) 
    {
        this.ip = ip;
    }

    public String getIp() 
    {
        return ip;
    }
    public void setPartnerTradeNo(String partnerTradeNo) 
    {
        this.partnerTradeNo = partnerTradeNo;
    }

    public String getPartnerTradeNo() 
    {
        return partnerTradeNo;
    }
    public void setPaymentNo(String paymentNo) 
    {
        this.paymentNo = paymentNo;
    }

    public String getPaymentNo() 
    {
        return paymentNo;
    }
    public void setAddtime(Integer addtime) 
    {
        this.addtime = addtime;
    }

    public Integer getAddtime() 
    {
        return addtime;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setMemo(String memo) 
    {
        this.memo = memo;
    }

    public String getMemo() 
    {
        return memo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("hospitalId", getHospitalId())
            .append("cashOutId", getCashOutId())
            .append("ip", getIp())
            .append("partnerTradeNo", getPartnerTradeNo())
            .append("paymentNo", getPaymentNo())
            .append("addtime", getAddtime())
            .append("status", getStatus())
            .append("memo", getMemo())
            .toString();
    }
}
