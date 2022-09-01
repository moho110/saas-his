package com.vrmlstudio.person.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 患者用户对象 vr_patient
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrPatient extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long patientId;

    /** 所属医院、诊所 */
    @Excel(name = "所属医院、诊所")
    private Integer hospitalId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** 微信openid */
    @Excel(name = "微信openid")
    private String openid;

    /** 患者电话 */
    @Excel(name = "患者电话")
    private String mobile;

    /**  登录密码 */
    @Excel(name = " 登录密码")
    private String password;

    /** 患者性别1男2女 */
    @Excel(name = "患者性别1男2女")
    private Integer sex;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String birthday;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String idCard;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String mobile1;

    /** 是否完善信息，0否1已完善 */
    @Excel(name = "是否完善信息，0否1已完善")
    private Integer isFinal;

    /** 最后登录ip */
    @Excel(name = "最后登录ip")
    private Integer lastLoginIp;

    /** 最后登录时间 */
    @Excel(name = "最后登录时间")
    private Integer lastLoginTime;

    /** 地址信息 */
    @Excel(name = "地址信息")
    private String address;

    /** 省区id */
    @Excel(name = "省区id")
    private Long provinceId;

    /** 市区id */
    @Excel(name = "市区id")
    private Long cityId;

    /** 县区id */
    @Excel(name = "县区id")
    private Long districtId;

    /** 过敏信息 */
    @Excel(name = "过敏信息")
    private String allergyInfo;

    /** 是否移除 0：正常 1：删除 */
    @Excel(name = "是否移除 0：正常 1：删除")
    private Integer isDel;

    public void setPatientId(Long patientId) 
    {
        this.patientId = patientId;
    }

    public Long getPatientId() 
    {
        return patientId;
    }
    public void setHospitalId(Integer hospitalId) 
    {
        this.hospitalId = hospitalId;
    }

    public Integer getHospitalId() 
    {
        return hospitalId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setOpenid(String openid) 
    {
        this.openid = openid;
    }

    public String getOpenid() 
    {
        return openid;
    }
    public void setMobile(String mobile) 
    {
        this.mobile = mobile;
    }

    public String getMobile() 
    {
        return mobile;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setSex(Integer sex) 
    {
        this.sex = sex;
    }

    public Integer getSex() 
    {
        return sex;
    }
    public void setBirthday(String birthday) 
    {
        this.birthday = birthday;
    }

    public String getBirthday() 
    {
        return birthday;
    }
    public void setIdCard(String idCard) 
    {
        this.idCard = idCard;
    }

    public String getIdCard() 
    {
        return idCard;
    }
    public void setMobile1(String mobile1) 
    {
        this.mobile1 = mobile1;
    }

    public String getMobile1() 
    {
        return mobile1;
    }
    public void setIsFinal(Integer isFinal) 
    {
        this.isFinal = isFinal;
    }

    public Integer getIsFinal() 
    {
        return isFinal;
    }
    public void setLastLoginIp(Integer lastLoginIp) 
    {
        this.lastLoginIp = lastLoginIp;
    }

    public Integer getLastLoginIp() 
    {
        return lastLoginIp;
    }
    public void setLastLoginTime(Integer lastLoginTime) 
    {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getLastLoginTime() 
    {
        return lastLoginTime;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setProvinceId(Long provinceId) 
    {
        this.provinceId = provinceId;
    }

    public Long getProvinceId() 
    {
        return provinceId;
    }
    public void setCityId(Long cityId) 
    {
        this.cityId = cityId;
    }

    public Long getCityId() 
    {
        return cityId;
    }
    public void setDistrictId(Long districtId) 
    {
        this.districtId = districtId;
    }

    public Long getDistrictId() 
    {
        return districtId;
    }
    public void setAllergyInfo(String allergyInfo) 
    {
        this.allergyInfo = allergyInfo;
    }

    public String getAllergyInfo() 
    {
        return allergyInfo;
    }
    public void setIsDel(Integer isDel) 
    {
        this.isDel = isDel;
    }

    public Integer getIsDel() 
    {
        return isDel;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("patientId", getPatientId())
            .append("hospitalId", getHospitalId())
            .append("name", getName())
            .append("openid", getOpenid())
            .append("mobile", getMobile())
            .append("updateTime", getUpdateTime())
            .append("password", getPassword())
            .append("sex", getSex())
            .append("birthday", getBirthday())
            .append("idCard", getIdCard())
            .append("mobile1", getMobile1())
            .append("isFinal", getIsFinal())
            .append("lastLoginIp", getLastLoginIp())
            .append("lastLoginTime", getLastLoginTime())
            .append("address", getAddress())
            .append("createTime", getCreateTime())
            .append("provinceId", getProvinceId())
            .append("cityId", getCityId())
            .append("districtId", getDistrictId())
            .append("allergyInfo", getAllergyInfo())
            .append("isDel", getIsDel())
            .toString();
    }
}
