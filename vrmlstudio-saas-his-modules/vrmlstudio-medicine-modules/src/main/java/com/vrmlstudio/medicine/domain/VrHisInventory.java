package com.vrmlstudio.medicine.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 库存对象 vr_his_inventory
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisInventory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 库存ID */
    private Integer inventoryId;

    /** 药品ID */
    @Excel(name = "药品ID")
    private Integer hmrId;

    /** 诊所ID */
    @Excel(name = "诊所ID")
    private Integer companyId;

    /** 库存数量 */
    @Excel(name = "库存数量")
    private Long inventoryNum;

    /** 单位 */
    @Excel(name = "单位")
    private String inventoryUnit;

    /** 批发价 */
    @Excel(name = "批发价")
    private BigDecimal inventoryTradePrice;

    /** 处方价 */
    @Excel(name = "处方价")
    private BigDecimal inventoryPrescriptionPrice;

    /** 批发额 */
    @Excel(name = "批发额")
    private BigDecimal inventoryTradeTotalAmount;

    /** 处方额 */
    @Excel(name = "处方额")
    private BigDecimal inventoryPrescriptionTotalAmount;

    /** 库存预警 */
    @Excel(name = "库存预警")
    private String earlyWarning;

    public void setInventoryId(Integer inventoryId) 
    {
        this.inventoryId = inventoryId;
    }

    public Integer getInventoryId() 
    {
        return inventoryId;
    }
    public void setHmrId(Integer hmrId) 
    {
        this.hmrId = hmrId;
    }

    public Integer getHmrId() 
    {
        return hmrId;
    }
    public void setCompanyId(Integer companyId) 
    {
        this.companyId = companyId;
    }

    public Integer getCompanyId() 
    {
        return companyId;
    }
    public void setInventoryNum(Long inventoryNum) 
    {
        this.inventoryNum = inventoryNum;
    }

    public Long getInventoryNum() 
    {
        return inventoryNum;
    }
    public void setInventoryUnit(String inventoryUnit) 
    {
        this.inventoryUnit = inventoryUnit;
    }

    public String getInventoryUnit() 
    {
        return inventoryUnit;
    }
    public void setInventoryTradePrice(BigDecimal inventoryTradePrice) 
    {
        this.inventoryTradePrice = inventoryTradePrice;
    }

    public BigDecimal getInventoryTradePrice() 
    {
        return inventoryTradePrice;
    }
    public void setInventoryPrescriptionPrice(BigDecimal inventoryPrescriptionPrice) 
    {
        this.inventoryPrescriptionPrice = inventoryPrescriptionPrice;
    }

    public BigDecimal getInventoryPrescriptionPrice() 
    {
        return inventoryPrescriptionPrice;
    }
    public void setInventoryTradeTotalAmount(BigDecimal inventoryTradeTotalAmount) 
    {
        this.inventoryTradeTotalAmount = inventoryTradeTotalAmount;
    }

    public BigDecimal getInventoryTradeTotalAmount() 
    {
        return inventoryTradeTotalAmount;
    }
    public void setInventoryPrescriptionTotalAmount(BigDecimal inventoryPrescriptionTotalAmount) 
    {
        this.inventoryPrescriptionTotalAmount = inventoryPrescriptionTotalAmount;
    }

    public BigDecimal getInventoryPrescriptionTotalAmount() 
    {
        return inventoryPrescriptionTotalAmount;
    }
    public void setEarlyWarning(String earlyWarning) 
    {
        this.earlyWarning = earlyWarning;
    }

    public String getEarlyWarning() 
    {
        return earlyWarning;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("inventoryId", getInventoryId())
            .append("hmrId", getHmrId())
            .append("companyId", getCompanyId())
            .append("inventoryNum", getInventoryNum())
            .append("inventoryUnit", getInventoryUnit())
            .append("inventoryTradePrice", getInventoryTradePrice())
            .append("inventoryPrescriptionPrice", getInventoryPrescriptionPrice())
            .append("inventoryTradeTotalAmount", getInventoryTradeTotalAmount())
            .append("inventoryPrescriptionTotalAmount", getInventoryPrescriptionTotalAmount())
            .append("earlyWarning", getEarlyWarning())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
