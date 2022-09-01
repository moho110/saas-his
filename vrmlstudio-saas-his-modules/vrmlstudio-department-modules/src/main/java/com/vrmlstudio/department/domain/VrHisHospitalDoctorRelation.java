package com.vrmlstudio.department.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 医生与医院关联对象 vr_his_hospital_doctor_relation
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisHospitalDoctorRelation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long rid;

    /** 医院id */
    @Excel(name = "医院id")
    private Integer hospitalId;

    /** 科室id */
    @Excel(name = "科室id")
    private Integer departmentId;

    /** 医生id */
    @Excel(name = "医生id")
    private Integer physicianid;

    /** 权限 */
    @Excel(name = "权限")
    private String rightList;

    /** 职称 */
    @Excel(name = "职称")
    private Integer titleLevel;

    public void setRid(Long rid) 
    {
        this.rid = rid;
    }

    public Long getRid() 
    {
        return rid;
    }
    public void setHospitalId(Integer hospitalId) 
    {
        this.hospitalId = hospitalId;
    }

    public Integer getHospitalId() 
    {
        return hospitalId;
    }
    public void setDepartmentId(Integer departmentId) 
    {
        this.departmentId = departmentId;
    }

    public Integer getDepartmentId() 
    {
        return departmentId;
    }
    public void setPhysicianid(Integer physicianid) 
    {
        this.physicianid = physicianid;
    }

    public Integer getPhysicianid() 
    {
        return physicianid;
    }
    public void setRightList(String rightList) 
    {
        this.rightList = rightList;
    }

    public String getRightList() 
    {
        return rightList;
    }
    public void setTitleLevel(Integer titleLevel) 
    {
        this.titleLevel = titleLevel;
    }

    public Integer getTitleLevel() 
    {
        return titleLevel;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("rid", getRid())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("hospitalId", getHospitalId())
            .append("departmentId", getDepartmentId())
            .append("physicianid", getPhysicianid())
            .append("rightList", getRightList())
            .append("titleLevel", getTitleLevel())
            .toString();
    }
}
