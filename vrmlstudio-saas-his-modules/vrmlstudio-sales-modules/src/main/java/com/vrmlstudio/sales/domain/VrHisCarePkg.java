package com.vrmlstudio.sales.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 收费总对象 vr_his_care_pkg
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisCarePkg extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer hospitalId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer doctorId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer patientId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer careHistoryId;

    /** 挂号ID */
    @Excel(name = "挂号ID")
    private Integer registrationId;

    /** 商户订单号 */
    @Excel(name = "商户订单号")
    private String orderCode;

    /** 应付金额 */
    @Excel(name = "应付金额")
    private BigDecimal amount;

    /** 在线支付部分 */
    @Excel(name = "在线支付部分")
    private BigDecimal olPayPart;

    /** 收费类型：0就诊处，1挂号处，2问答，3... */
    @Excel(name = "收费类型：0就诊处，1挂号处，2问答，3...")
    private Integer typeId;

    /** 状态:0未支付，1已支付，2确认收款，3申请退款，4已退款,5部分支付,6完成交易（如：已发药），7部分退款 */
    @Excel(name = "状态:0未支付，1已支付，2确认收款，3申请退款，4已退款,5部分支付,6完成交易", readConverterExp = "如=：已发药")
    private Integer status;

    /** 插入时间 */
    @Excel(name = "插入时间")
    private Integer addtime;

    /** 操作地点：1售药，2查检项目，3附加费用，4挂号，，，， */
    @Excel(name = "操作地点：1售药，2查检项目，3附加费用，4挂号，，，，")
    private Integer opPlace;

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
    public void setDoctorId(Integer doctorId) 
    {
        this.doctorId = doctorId;
    }

    public Integer getDoctorId() 
    {
        return doctorId;
    }
    public void setPatientId(Integer patientId) 
    {
        this.patientId = patientId;
    }

    public Integer getPatientId() 
    {
        return patientId;
    }
    public void setCareHistoryId(Integer careHistoryId) 
    {
        this.careHistoryId = careHistoryId;
    }

    public Integer getCareHistoryId() 
    {
        return careHistoryId;
    }
    public void setRegistrationId(Integer registrationId) 
    {
        this.registrationId = registrationId;
    }

    public Integer getRegistrationId() 
    {
        return registrationId;
    }
    public void setOrderCode(String orderCode) 
    {
        this.orderCode = orderCode;
    }

    public String getOrderCode() 
    {
        return orderCode;
    }
    public void setAmount(BigDecimal amount) 
    {
        this.amount = amount;
    }

    public BigDecimal getAmount() 
    {
        return amount;
    }
    public void setOlPayPart(BigDecimal olPayPart) 
    {
        this.olPayPart = olPayPart;
    }

    public BigDecimal getOlPayPart() 
    {
        return olPayPart;
    }
    public void setTypeId(Integer typeId) 
    {
        this.typeId = typeId;
    }

    public Integer getTypeId() 
    {
        return typeId;
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
    public void setOpPlace(Integer opPlace) 
    {
        this.opPlace = opPlace;
    }

    public Integer getOpPlace() 
    {
        return opPlace;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("hospitalId", getHospitalId())
            .append("doctorId", getDoctorId())
            .append("patientId", getPatientId())
            .append("careHistoryId", getCareHistoryId())
            .append("registrationId", getRegistrationId())
            .append("orderCode", getOrderCode())
            .append("amount", getAmount())
            .append("olPayPart", getOlPayPart())
            .append("typeId", getTypeId())
            .append("status", getStatus())
            .append("addtime", getAddtime())
            .append("opPlace", getOpPlace())
            .toString();
    }
}
