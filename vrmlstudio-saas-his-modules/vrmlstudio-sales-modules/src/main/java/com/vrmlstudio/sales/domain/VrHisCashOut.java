package com.vrmlstudio.sales.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 用户提现申请对象 vr_his_cash_out
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisCashOut extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 所属医院id */
    @Excel(name = "所属医院id")
    private Integer hospitalId;

    /** 微信appid */
    @Excel(name = "微信appid")
    private String appid;

    /** 申请人id */
    @Excel(name = "申请人id")
    private Integer userId;

    /** 提现人openid */
    @Excel(name = "提现人openid")
    private String openid;

    /** 提现金额 */
    @Excel(name = "提现金额")
    private BigDecimal amount;

    /** 申请时间 */
    @Excel(name = "申请时间")
    private Integer addtime;

    /** 申请状态：0待审核，1已通过，2已驳回 */
    @Excel(name = "申请状态：0待审核，1已通过，2已驳回")
    private Integer status;

    /** 申请ip */
    @Excel(name = "申请ip")
    private String ip;

    /** 提现接收方式：0微信，1支付宝，2银行，3现金 */
    @Excel(name = "提现接收方式：0微信，1支付宝，2银行，3现金")
    private Integer typeId;

    /** 如果不是微信，则填写自己的收款方式 */
    @Excel(name = "如果不是微信，则填写自己的收款方式")
    private String typeFix;

    /** 处理人id */
    @Excel(name = "处理人id")
    private Integer admUid;

    /** 处理人ip */
    @Excel(name = "处理人ip")
    private String admIp;

    /** 处理人意见 */
    @Excel(name = "处理人意见")
    private String admMemo;

    /** 处理时间 */
    @Excel(name = "处理时间")
    private Integer admTime;

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
    public void setAppid(String appid) 
    {
        this.appid = appid;
    }

    public String getAppid() 
    {
        return appid;
    }
    public void setUserId(Integer userId) 
    {
        this.userId = userId;
    }

    public Integer getUserId() 
    {
        return userId;
    }
    public void setOpenid(String openid) 
    {
        this.openid = openid;
    }

    public String getOpenid() 
    {
        return openid;
    }
    public void setAmount(BigDecimal amount) 
    {
        this.amount = amount;
    }

    public BigDecimal getAmount() 
    {
        return amount;
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
    public void setIp(String ip) 
    {
        this.ip = ip;
    }

    public String getIp() 
    {
        return ip;
    }
    public void setTypeId(Integer typeId) 
    {
        this.typeId = typeId;
    }

    public Integer getTypeId() 
    {
        return typeId;
    }
    public void setTypeFix(String typeFix) 
    {
        this.typeFix = typeFix;
    }

    public String getTypeFix() 
    {
        return typeFix;
    }
    public void setAdmUid(Integer admUid) 
    {
        this.admUid = admUid;
    }

    public Integer getAdmUid() 
    {
        return admUid;
    }
    public void setAdmIp(String admIp) 
    {
        this.admIp = admIp;
    }

    public String getAdmIp() 
    {
        return admIp;
    }
    public void setAdmMemo(String admMemo) 
    {
        this.admMemo = admMemo;
    }

    public String getAdmMemo() 
    {
        return admMemo;
    }
    public void setAdmTime(Integer admTime) 
    {
        this.admTime = admTime;
    }

    public Integer getAdmTime() 
    {
        return admTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("hospitalId", getHospitalId())
            .append("appid", getAppid())
            .append("userId", getUserId())
            .append("openid", getOpenid())
            .append("amount", getAmount())
            .append("addtime", getAddtime())
            .append("status", getStatus())
            .append("ip", getIp())
            .append("typeId", getTypeId())
            .append("typeFix", getTypeFix())
            .append("admUid", getAdmUid())
            .append("admIp", getAdmIp())
            .append("admMemo", getAdmMemo())
            .append("admTime", getAdmTime())
            .toString();
    }
}
