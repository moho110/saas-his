package com.vrmlstudio.xsystem.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 用户收支记录对象 vr_his_transaction_record
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisTransactionRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long operatorId;

    /** 医院id */
    @Excel(name = "医院id")
    private Integer hospitalId;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Integer userId;

    /** 收支类型：0进，1出 */
    @Excel(name = "收支类型：0进，1出")
    private Integer typeId;

    /** 交易金额 */
    @Excel(name = "交易金额")
    private BigDecimal amount;

    /** 余额 */
    @Excel(name = "余额")
    private BigDecimal moneyBalance;

    /** 冻结中金额 */
    @Excel(name = "冻结中金额")
    private BigDecimal moneyLock;

    /** 交易时间 */
    @Excel(name = "交易时间")
    private Integer addtime;

    /** 交易IP */
    @Excel(name = "交易IP")
    private String ip;

    /** 事由 */
    @Excel(name = "事由")
    private String memo;

    /** 相关订单id */
    @Excel(name = "相关订单id")
    private Integer pkgId;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setOperatorId(Long operatorId) 
    {
        this.operatorId = operatorId;
    }

    public Long getOperatorId() 
    {
        return operatorId;
    }
    public void setHospitalId(Integer hospitalId) 
    {
        this.hospitalId = hospitalId;
    }

    public Integer getHospitalId() 
    {
        return hospitalId;
    }
    public void setUserId(Integer userId) 
    {
        this.userId = userId;
    }

    public Integer getUserId() 
    {
        return userId;
    }
    public void setTypeId(Integer typeId) 
    {
        this.typeId = typeId;
    }

    public Integer getTypeId() 
    {
        return typeId;
    }
    public void setAmount(BigDecimal amount) 
    {
        this.amount = amount;
    }

    public BigDecimal getAmount() 
    {
        return amount;
    }
    public void setMoneyBalance(BigDecimal moneyBalance) 
    {
        this.moneyBalance = moneyBalance;
    }

    public BigDecimal getMoneyBalance() 
    {
        return moneyBalance;
    }
    public void setMoneyLock(BigDecimal moneyLock) 
    {
        this.moneyLock = moneyLock;
    }

    public BigDecimal getMoneyLock() 
    {
        return moneyLock;
    }
    public void setAddtime(Integer addtime) 
    {
        this.addtime = addtime;
    }

    public Integer getAddtime() 
    {
        return addtime;
    }
    public void setIp(String ip) 
    {
        this.ip = ip;
    }

    public String getIp() 
    {
        return ip;
    }
    public void setMemo(String memo) 
    {
        this.memo = memo;
    }

    public String getMemo() 
    {
        return memo;
    }
    public void setPkgId(Integer pkgId) 
    {
        this.pkgId = pkgId;
    }

    public Integer getPkgId() 
    {
        return pkgId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("operatorId", getOperatorId())
            .append("hospitalId", getHospitalId())
            .append("userId", getUserId())
            .append("typeId", getTypeId())
            .append("amount", getAmount())
            .append("moneyBalance", getMoneyBalance())
            .append("moneyLock", getMoneyLock())
            .append("addtime", getAddtime())
            .append("ip", getIp())
            .append("memo", getMemo())
            .append("pkgId", getPkgId())
            .toString();
    }
}
