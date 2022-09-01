package com.vrmlstudio.xsystem.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 科室对象 vr_his_department
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisDepartment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 科室id */
    private Long did;

    /** 科室名称 */
    @Excel(name = "科室名称")
    private String departmentName;

    /** 科室编号 */
    @Excel(name = "科室编号")
    private String departmentNumber;

    /** 医院id */
    @Excel(name = "医院id")
    private Integer hid;

    public void setDid(Long did) 
    {
        this.did = did;
    }

    public Long getDid() 
    {
        return did;
    }
    public void setDepartmentName(String departmentName) 
    {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() 
    {
        return departmentName;
    }
    public void setDepartmentNumber(String departmentNumber) 
    {
        this.departmentNumber = departmentNumber;
    }

    public String getDepartmentNumber() 
    {
        return departmentNumber;
    }
    public void setHid(Integer hid) 
    {
        this.hid = hid;
    }

    public Integer getHid() 
    {
        return hid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("did", getDid())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("departmentName", getDepartmentName())
            .append("departmentNumber", getDepartmentNumber())
            .append("hid", getHid())
            .toString();
    }
}
