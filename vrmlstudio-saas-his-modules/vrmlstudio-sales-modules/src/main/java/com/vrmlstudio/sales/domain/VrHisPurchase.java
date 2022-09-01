package com.vrmlstudio.sales.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 采购信息对象 vr_his_purchase
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisPurchase extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 采购信息ID */
    private Integer purchaseId;

    /** 医院药品关联表：hmr_id */
    @Excel(name = "医院药品关联表：hmr_id")
    private Integer medicinesId;

    /** 批次库存ID */
    @Excel(name = "批次库存ID")
    private Integer batchesOfInventoryId;

    /** 采购数量 */
    @Excel(name = "采购数量")
    private Integer purchaseNum;

    /** 采购单位 */
    @Excel(name = "采购单位")
    private String purchaseUnit;

    /** 批发价 */
    @Excel(name = "批发价")
    private BigDecimal purchaseTradePrice;

    /** 处方价 */
    @Excel(name = "处方价")
    private BigDecimal purchasePrescriptionPrice;

    /** 采购批发总额 */
    @Excel(name = "采购批发总额")
    private BigDecimal purchaseTradeTotalAmount;

    /** 采购处方总额 */
    @Excel(name = "采购处方总额")
    private BigDecimal purchasePrescriptionTotalAmount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer hmrId;

    public void setPurchaseId(Integer purchaseId) 
    {
        this.purchaseId = purchaseId;
    }

    public Integer getPurchaseId() 
    {
        return purchaseId;
    }
    public void setMedicinesId(Integer medicinesId) 
    {
        this.medicinesId = medicinesId;
    }

    public Integer getMedicinesId() 
    {
        return medicinesId;
    }
    public void setBatchesOfInventoryId(Integer batchesOfInventoryId) 
    {
        this.batchesOfInventoryId = batchesOfInventoryId;
    }

    public Integer getBatchesOfInventoryId() 
    {
        return batchesOfInventoryId;
    }
    public void setPurchaseNum(Integer purchaseNum) 
    {
        this.purchaseNum = purchaseNum;
    }

    public Integer getPurchaseNum() 
    {
        return purchaseNum;
    }
    public void setPurchaseUnit(String purchaseUnit) 
    {
        this.purchaseUnit = purchaseUnit;
    }

    public String getPurchaseUnit() 
    {
        return purchaseUnit;
    }
    public void setPurchaseTradePrice(BigDecimal purchaseTradePrice) 
    {
        this.purchaseTradePrice = purchaseTradePrice;
    }

    public BigDecimal getPurchaseTradePrice() 
    {
        return purchaseTradePrice;
    }
    public void setPurchasePrescriptionPrice(BigDecimal purchasePrescriptionPrice) 
    {
        this.purchasePrescriptionPrice = purchasePrescriptionPrice;
    }

    public BigDecimal getPurchasePrescriptionPrice() 
    {
        return purchasePrescriptionPrice;
    }
    public void setPurchaseTradeTotalAmount(BigDecimal purchaseTradeTotalAmount) 
    {
        this.purchaseTradeTotalAmount = purchaseTradeTotalAmount;
    }

    public BigDecimal getPurchaseTradeTotalAmount() 
    {
        return purchaseTradeTotalAmount;
    }
    public void setPurchasePrescriptionTotalAmount(BigDecimal purchasePrescriptionTotalAmount) 
    {
        this.purchasePrescriptionTotalAmount = purchasePrescriptionTotalAmount;
    }

    public BigDecimal getPurchasePrescriptionTotalAmount() 
    {
        return purchasePrescriptionTotalAmount;
    }
    public void setHmrId(Integer hmrId) 
    {
        this.hmrId = hmrId;
    }

    public Integer getHmrId() 
    {
        return hmrId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("purchaseId", getPurchaseId())
            .append("medicinesId", getMedicinesId())
            .append("batchesOfInventoryId", getBatchesOfInventoryId())
            .append("purchaseNum", getPurchaseNum())
            .append("purchaseUnit", getPurchaseUnit())
            .append("purchaseTradePrice", getPurchaseTradePrice())
            .append("purchasePrescriptionPrice", getPurchasePrescriptionPrice())
            .append("purchaseTradeTotalAmount", getPurchaseTradeTotalAmount())
            .append("purchasePrescriptionTotalAmount", getPurchasePrescriptionTotalAmount())
            .append("createTime", getCreateTime())
            .append("hmrId", getHmrId())
            .toString();
    }
}
