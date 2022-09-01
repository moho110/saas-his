package com.vrmlstudio.department.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * HIS医院基本信息对象 vr_his_hospital
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisHospital extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户id */
    private Long id;

    /** 医院名称 */
    @Excel(name = "医院名称")
    private String hospitalName;

    /** 头像 */
    @Excel(name = "头像")
    private String picture;

    /** 医院编号 */
    @Excel(name = "医院编号")
    private String hospitalNumber;

    /** 用户表userid */
    @Excel(name = "用户表userid")
    private Long hid;

    /** 医院地址 */
    @Excel(name = "医院地址")
    private String address;

    /** 所有者姓名 */
    @Excel(name = "所有者姓名")
    private String ownerName;

    /** 所有者手机号 */
    @Excel(name = "所有者手机号")
    private String ownerMobile;

    /** 所属者职务 */
    @Excel(name = "所属者职务")
    private String ownerPost;

    /** 专业方向 */
    @Excel(name = "专业方向")
    private String majorField;

    /** 诊所简介 */
    @Excel(name = "诊所简介")
    private String introduction;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setHospitalName(String hospitalName) 
    {
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() 
    {
        return hospitalName;
    }
    public void setPicture(String picture) 
    {
        this.picture = picture;
    }

    public String getPicture() 
    {
        return picture;
    }
    public void setHospitalNumber(String hospitalNumber) 
    {
        this.hospitalNumber = hospitalNumber;
    }

    public String getHospitalNumber() 
    {
        return hospitalNumber;
    }
    public void setHid(Long hid) 
    {
        this.hid = hid;
    }

    public Long getHid() 
    {
        return hid;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setOwnerName(String ownerName) 
    {
        this.ownerName = ownerName;
    }

    public String getOwnerName() 
    {
        return ownerName;
    }
    public void setOwnerMobile(String ownerMobile) 
    {
        this.ownerMobile = ownerMobile;
    }

    public String getOwnerMobile() 
    {
        return ownerMobile;
    }
    public void setOwnerPost(String ownerPost) 
    {
        this.ownerPost = ownerPost;
    }

    public String getOwnerPost() 
    {
        return ownerPost;
    }
    public void setMajorField(String majorField) 
    {
        this.majorField = majorField;
    }

    public String getMajorField() 
    {
        return majorField;
    }
    public void setIntroduction(String introduction) 
    {
        this.introduction = introduction;
    }

    public String getIntroduction() 
    {
        return introduction;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("hospitalName", getHospitalName())
            .append("picture", getPicture())
            .append("createTime", getCreateTime())
            .append("hospitalNumber", getHospitalNumber())
            .append("updateTime", getUpdateTime())
            .append("hid", getHid())
            .append("address", getAddress())
            .append("ownerName", getOwnerName())
            .append("ownerMobile", getOwnerMobile())
            .append("ownerPost", getOwnerPost())
            .append("majorField", getMajorField())
            .append("introduction", getIntroduction())
            .toString();
    }
}
