package com.vrmlstudio.department.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 医院药品关联对象 vr_his_hospital_medicines_relation
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisHospitalMedicinesRelation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long hmrId;

    /** 药品id */
    @Excel(name = "药品id")
    private Integer medicinesId;

    /** 医院id */
    @Excel(name = "医院id")
    private Integer hospitalId;

    public void setHmrId(Long hmrId) 
    {
        this.hmrId = hmrId;
    }

    public Long getHmrId() 
    {
        return hmrId;
    }
    public void setMedicinesId(Integer medicinesId) 
    {
        this.medicinesId = medicinesId;
    }

    public Integer getMedicinesId() 
    {
        return medicinesId;
    }
    public void setHospitalId(Integer hospitalId) 
    {
        this.hospitalId = hospitalId;
    }

    public Integer getHospitalId() 
    {
        return hospitalId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("hmrId", getHmrId())
            .append("medicinesId", getMedicinesId())
            .append("hospitalId", getHospitalId())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
