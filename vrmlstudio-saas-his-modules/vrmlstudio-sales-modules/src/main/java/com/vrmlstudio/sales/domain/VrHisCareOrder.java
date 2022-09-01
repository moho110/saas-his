package com.vrmlstudio.sales.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 处方列对象 vr_his_care_order
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisCareOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 医院id */
    @Excel(name = "医院id")
    private Integer hospitalId;

    /** 医生id */
    @Excel(name = "医生id")
    private Integer doctorId;

    /** 患者id */
    @Excel(name = "患者id")
    private Integer patientId;

    /** 关联病历id */
    @Excel(name = "关联病历id")
    private Integer careHistoryId;

    /** 收费总表care_pkg.id */
    @Excel(name = "收费总表care_pkg.id")
    private Integer pkgId;

    /** 状态，0未支付，1已支付，2确认收款，3申请退款，4已退款 */
    @Excel(name = "状态，0未支付，1已支付，2确认收款，3申请退款，4已退款")
    private Integer status;

    /** 处方名 */
    @Excel(name = "处方名")
    private String label;

    /** 每set_num_a天,set_num_b剂，服用set_num_c天，共set_num_d剂 */
    @Excel(name = "每set_num_a天,set_num_b剂，服用set_num_c天，共set_num_d剂")
    private Integer numA;

    /** 每set_num_a天,set_num_b剂，服用set_num_c天，共set_num_d剂 */
    @Excel(name = "每set_num_a天,set_num_b剂，服用set_num_c天，共set_num_d剂")
    private Integer numB;

    /** 每set_num_a天,set_num_b剂，服用set_num_c天，共set_num_d剂 */
    @Excel(name = "每set_num_a天,set_num_b剂，服用set_num_c天，共set_num_d剂")
    private Integer numC;

    /** 每num_a天,num_b剂，服用num_c天，共num_d剂 */
    @Excel(name = "每num_a天,num_b剂，服用num_c天，共num_d剂")
    private Integer numD;

    /** 单处方金额 */
    @Excel(name = "单处方金额")
    private BigDecimal amount;

    /** 处方全额 */
    @Excel(name = "处方全额")
    private BigDecimal allAmount;

    /** 插入时间，php时间戳 */
    @Excel(name = "插入时间，php时间戳")
    private Integer addtime;

    /** 诊断编号 */
    @Excel(name = "诊断编号")
    private String caseCode;

    /** 服药要求 */
    @Excel(name = "服药要求")
    private String useTips;

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
    public void setPkgId(Integer pkgId) 
    {
        this.pkgId = pkgId;
    }

    public Integer getPkgId() 
    {
        return pkgId;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setLabel(String label) 
    {
        this.label = label;
    }

    public String getLabel() 
    {
        return label;
    }
    public void setNumA(Integer numA) 
    {
        this.numA = numA;
    }

    public Integer getNumA() 
    {
        return numA;
    }
    public void setNumB(Integer numB) 
    {
        this.numB = numB;
    }

    public Integer getNumB() 
    {
        return numB;
    }
    public void setNumC(Integer numC) 
    {
        this.numC = numC;
    }

    public Integer getNumC() 
    {
        return numC;
    }
    public void setNumD(Integer numD) 
    {
        this.numD = numD;
    }

    public Integer getNumD() 
    {
        return numD;
    }
    public void setAmount(BigDecimal amount) 
    {
        this.amount = amount;
    }

    public BigDecimal getAmount() 
    {
        return amount;
    }
    public void setAllAmount(BigDecimal allAmount) 
    {
        this.allAmount = allAmount;
    }

    public BigDecimal getAllAmount() 
    {
        return allAmount;
    }
    public void setAddtime(Integer addtime) 
    {
        this.addtime = addtime;
    }

    public Integer getAddtime() 
    {
        return addtime;
    }
    public void setCaseCode(String caseCode) 
    {
        this.caseCode = caseCode;
    }

    public String getCaseCode() 
    {
        return caseCode;
    }
    public void setUseTips(String useTips) 
    {
        this.useTips = useTips;
    }

    public String getUseTips() 
    {
        return useTips;
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
            .append("doctorId", getDoctorId())
            .append("patientId", getPatientId())
            .append("careHistoryId", getCareHistoryId())
            .append("pkgId", getPkgId())
            .append("status", getStatus())
            .append("label", getLabel())
            .append("numA", getNumA())
            .append("numB", getNumB())
            .append("numC", getNumC())
            .append("numD", getNumD())
            .append("amount", getAmount())
            .append("allAmount", getAllAmount())
            .append("addtime", getAddtime())
            .append("caseCode", getCaseCode())
            .append("useTips", getUseTips())
            .append("memo", getMemo())
            .toString();
    }
}
