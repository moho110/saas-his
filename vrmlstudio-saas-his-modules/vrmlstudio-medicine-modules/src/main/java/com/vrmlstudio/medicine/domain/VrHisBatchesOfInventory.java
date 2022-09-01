package com.vrmlstudio.medicine.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 批次库存对象 vr_his_batches_of_inventory
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisBatchesOfInventory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 批次库存ID */
    private Integer batchesOfInventoryId;

    /** 诊所ID */
    @Excel(name = "诊所ID")
    private Integer companyId;

    /** 供应商ID */
    @Excel(name = "供应商ID")
    private Integer supplierId;

    /** 采购单编号 */
    @Excel(name = "采购单编号")
    private Long batchesOfInventoryNumber;

    /** 采购员ID */
    @Excel(name = "采购员ID")
    private Integer purchasingAgentId;

    /** 采购总金额 */
    @Excel(name = "采购总金额")
    private BigDecimal batchesOfInventoryTotalMoney;

    /** 制单日期 */
    @Excel(name = "制单日期")
    private String batchesOfInventoryDate;

    /** 审核标记；未审核：1，已审核：2 */
    @Excel(name = "审核标记；未审核：1，已审核：2")
    private Integer batchesOfInventoryStatus;

    /** 审核人员ID */
    @Excel(name = "审核人员ID")
    private Integer batchesOfInventoryVerifier;

    /** 审核日期 */
    @Excel(name = "审核日期")
    private String batchesOfInventoryVerifierDate;

    public void setBatchesOfInventoryId(Integer batchesOfInventoryId) 
    {
        this.batchesOfInventoryId = batchesOfInventoryId;
    }

    public Integer getBatchesOfInventoryId() 
    {
        return batchesOfInventoryId;
    }
    public void setCompanyId(Integer companyId) 
    {
        this.companyId = companyId;
    }

    public Integer getCompanyId() 
    {
        return companyId;
    }
    public void setSupplierId(Integer supplierId) 
    {
        this.supplierId = supplierId;
    }

    public Integer getSupplierId() 
    {
        return supplierId;
    }
    public void setBatchesOfInventoryNumber(Long batchesOfInventoryNumber) 
    {
        this.batchesOfInventoryNumber = batchesOfInventoryNumber;
    }

    public Long getBatchesOfInventoryNumber() 
    {
        return batchesOfInventoryNumber;
    }
    public void setPurchasingAgentId(Integer purchasingAgentId) 
    {
        this.purchasingAgentId = purchasingAgentId;
    }

    public Integer getPurchasingAgentId() 
    {
        return purchasingAgentId;
    }
    public void setBatchesOfInventoryTotalMoney(BigDecimal batchesOfInventoryTotalMoney) 
    {
        this.batchesOfInventoryTotalMoney = batchesOfInventoryTotalMoney;
    }

    public BigDecimal getBatchesOfInventoryTotalMoney() 
    {
        return batchesOfInventoryTotalMoney;
    }
    public void setBatchesOfInventoryDate(String batchesOfInventoryDate) 
    {
        this.batchesOfInventoryDate = batchesOfInventoryDate;
    }

    public String getBatchesOfInventoryDate() 
    {
        return batchesOfInventoryDate;
    }
    public void setBatchesOfInventoryStatus(Integer batchesOfInventoryStatus) 
    {
        this.batchesOfInventoryStatus = batchesOfInventoryStatus;
    }

    public Integer getBatchesOfInventoryStatus() 
    {
        return batchesOfInventoryStatus;
    }
    public void setBatchesOfInventoryVerifier(Integer batchesOfInventoryVerifier) 
    {
        this.batchesOfInventoryVerifier = batchesOfInventoryVerifier;
    }

    public Integer getBatchesOfInventoryVerifier() 
    {
        return batchesOfInventoryVerifier;
    }
    public void setBatchesOfInventoryVerifierDate(String batchesOfInventoryVerifierDate) 
    {
        this.batchesOfInventoryVerifierDate = batchesOfInventoryVerifierDate;
    }

    public String getBatchesOfInventoryVerifierDate() 
    {
        return batchesOfInventoryVerifierDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("batchesOfInventoryId", getBatchesOfInventoryId())
            .append("companyId", getCompanyId())
            .append("supplierId", getSupplierId())
            .append("batchesOfInventoryNumber", getBatchesOfInventoryNumber())
            .append("purchasingAgentId", getPurchasingAgentId())
            .append("batchesOfInventoryTotalMoney", getBatchesOfInventoryTotalMoney())
            .append("batchesOfInventoryDate", getBatchesOfInventoryDate())
            .append("batchesOfInventoryStatus", getBatchesOfInventoryStatus())
            .append("batchesOfInventoryVerifier", getBatchesOfInventoryVerifier())
            .append("batchesOfInventoryVerifierDate", getBatchesOfInventoryVerifierDate())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
