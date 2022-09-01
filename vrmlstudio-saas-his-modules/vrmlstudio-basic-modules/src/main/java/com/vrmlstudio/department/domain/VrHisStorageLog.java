package com.vrmlstudio.department.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 入库操作log日志对象 vr_his_storage_log
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisStorageLog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 更改价格表 */
    private Integer logId;

    /** 诊所ID */
    @Excel(name = "诊所ID")
    private Integer companyId;

    /** 采购信息ID */
    @Excel(name = "采购信息ID")
    private Integer purchaseId;

    /** 批次库存编号 */
    @Excel(name = "批次库存编号")
    private Long batchesOfInventoryNumber;

    /** 药品ID */
    @Excel(name = "药品ID")
    private Integer medicinesId;

    /** 修改人ID */
    @Excel(name = "修改人ID")
    private Integer modifierId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer newQuantity;

    /** 新批发价 */
    @Excel(name = "新批发价")
    private BigDecimal newTradePrice;

    /** 新处方价 */
    @Excel(name = "新处方价")
    private BigDecimal newPrescriptionPrice;

    /** 原数量 */
    @Excel(name = "原数量")
    private Integer oldQuantity;

    /** 原批发价 */
    @Excel(name = "原批发价")
    private BigDecimal oldTradePrice;

    /** 原处方价 */
    @Excel(name = "原处方价")
    private BigDecimal oldPrescriptionPrice;

    /** 操作模块；采购：1，审核：2 */
    @Excel(name = "操作模块；采购：1，审核：2")
    private Integer operationModule;

    public void setLogId(Integer logId) 
    {
        this.logId = logId;
    }

    public Integer getLogId() 
    {
        return logId;
    }
    public void setCompanyId(Integer companyId) 
    {
        this.companyId = companyId;
    }

    public Integer getCompanyId() 
    {
        return companyId;
    }
    public void setPurchaseId(Integer purchaseId) 
    {
        this.purchaseId = purchaseId;
    }

    public Integer getPurchaseId() 
    {
        return purchaseId;
    }
    public void setBatchesOfInventoryNumber(Long batchesOfInventoryNumber) 
    {
        this.batchesOfInventoryNumber = batchesOfInventoryNumber;
    }

    public Long getBatchesOfInventoryNumber() 
    {
        return batchesOfInventoryNumber;
    }
    public void setMedicinesId(Integer medicinesId) 
    {
        this.medicinesId = medicinesId;
    }

    public Integer getMedicinesId() 
    {
        return medicinesId;
    }
    public void setModifierId(Integer modifierId) 
    {
        this.modifierId = modifierId;
    }

    public Integer getModifierId() 
    {
        return modifierId;
    }
    public void setNewQuantity(Integer newQuantity) 
    {
        this.newQuantity = newQuantity;
    }

    public Integer getNewQuantity() 
    {
        return newQuantity;
    }
    public void setNewTradePrice(BigDecimal newTradePrice) 
    {
        this.newTradePrice = newTradePrice;
    }

    public BigDecimal getNewTradePrice() 
    {
        return newTradePrice;
    }
    public void setNewPrescriptionPrice(BigDecimal newPrescriptionPrice) 
    {
        this.newPrescriptionPrice = newPrescriptionPrice;
    }

    public BigDecimal getNewPrescriptionPrice() 
    {
        return newPrescriptionPrice;
    }
    public void setOldQuantity(Integer oldQuantity) 
    {
        this.oldQuantity = oldQuantity;
    }

    public Integer getOldQuantity() 
    {
        return oldQuantity;
    }
    public void setOldTradePrice(BigDecimal oldTradePrice) 
    {
        this.oldTradePrice = oldTradePrice;
    }

    public BigDecimal getOldTradePrice() 
    {
        return oldTradePrice;
    }
    public void setOldPrescriptionPrice(BigDecimal oldPrescriptionPrice) 
    {
        this.oldPrescriptionPrice = oldPrescriptionPrice;
    }

    public BigDecimal getOldPrescriptionPrice() 
    {
        return oldPrescriptionPrice;
    }
    public void setOperationModule(Integer operationModule) 
    {
        this.operationModule = operationModule;
    }

    public Integer getOperationModule() 
    {
        return operationModule;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("logId", getLogId())
            .append("companyId", getCompanyId())
            .append("purchaseId", getPurchaseId())
            .append("batchesOfInventoryNumber", getBatchesOfInventoryNumber())
            .append("medicinesId", getMedicinesId())
            .append("modifierId", getModifierId())
            .append("newQuantity", getNewQuantity())
            .append("newTradePrice", getNewTradePrice())
            .append("newPrescriptionPrice", getNewPrescriptionPrice())
            .append("oldQuantity", getOldQuantity())
            .append("oldTradePrice", getOldTradePrice())
            .append("oldPrescriptionPrice", getOldPrescriptionPrice())
            .append("operationModule", getOperationModule())
            .append("createTime", getCreateTime())
            .toString();
    }
}
