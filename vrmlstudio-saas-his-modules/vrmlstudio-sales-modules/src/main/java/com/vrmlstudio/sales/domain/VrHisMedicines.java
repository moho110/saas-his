package com.vrmlstudio.sales.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 药品信息对象 vr_his_medicines
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisMedicines extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer medicinesId;

    /** 药品编号 */
    @Excel(name = "药品编号")
    private String medicinesNumber;

    /** 药品名称 */
    @Excel(name = "药品名称")
    private String medicinesName;

    /** 药品分类  */
    @Excel(name = "药品分类 ")
    private String medicinesClass;

    /** 处方类型 */
    @Excel(name = "处方类型")
    private String prescriptionType;

    /** 单位（g/条） */
    @Excel(name = "单位", readConverterExp = "g=/条")
    private String unit;

    /** 换算量 */
    @Excel(name = "换算量")
    private Integer conversion;

    /** 关键字 */
    @Excel(name = "关键字")
    private String keywords;

    /** 生产厂家 */
    @Excel(name = "生产厂家")
    private String producter;

    public void setMedicinesId(Integer medicinesId) 
    {
        this.medicinesId = medicinesId;
    }

    public Integer getMedicinesId() 
    {
        return medicinesId;
    }
    public void setMedicinesNumber(String medicinesNumber) 
    {
        this.medicinesNumber = medicinesNumber;
    }

    public String getMedicinesNumber() 
    {
        return medicinesNumber;
    }
    public void setMedicinesName(String medicinesName) 
    {
        this.medicinesName = medicinesName;
    }

    public String getMedicinesName() 
    {
        return medicinesName;
    }
    public void setMedicinesClass(String medicinesClass) 
    {
        this.medicinesClass = medicinesClass;
    }

    public String getMedicinesClass() 
    {
        return medicinesClass;
    }
    public void setPrescriptionType(String prescriptionType) 
    {
        this.prescriptionType = prescriptionType;
    }

    public String getPrescriptionType() 
    {
        return prescriptionType;
    }
    public void setUnit(String unit) 
    {
        this.unit = unit;
    }

    public String getUnit() 
    {
        return unit;
    }
    public void setConversion(Integer conversion) 
    {
        this.conversion = conversion;
    }

    public Integer getConversion() 
    {
        return conversion;
    }
    public void setKeywords(String keywords) 
    {
        this.keywords = keywords;
    }

    public String getKeywords() 
    {
        return keywords;
    }
    public void setProducter(String producter) 
    {
        this.producter = producter;
    }

    public String getProducter() 
    {
        return producter;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("medicinesId", getMedicinesId())
            .append("medicinesNumber", getMedicinesNumber())
            .append("medicinesName", getMedicinesName())
            .append("medicinesClass", getMedicinesClass())
            .append("prescriptionType", getPrescriptionType())
            .append("unit", getUnit())
            .append("conversion", getConversion())
            .append("keywords", getKeywords())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("producter", getProducter())
            .toString();
    }
}
