package com.vrmlstudio.person.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 供应商对象 vr_his_supplier
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisSupplier extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long sid;

    /** 供应商名称 */
    @Excel(name = "供应商名称")
    private String supplierName;

    /** 联系人名称 */
    @Excel(name = "联系人名称")
    private String contactName;

    /** 联系人手机 */
    @Excel(name = "联系人手机")
    private String contactMobile;

    /** 联系人电话 */
    @Excel(name = "联系人电话")
    private String contactTelephone;

    /** 银行账号 */
    @Excel(name = "银行账号")
    private String bankAccount;

    /** 供应商地址 */
    @Excel(name = "供应商地址")
    private String address;

    /** 医院id */
    @Excel(name = "医院id")
    private Integer hospitalId;

    public void setSid(Long sid) 
    {
        this.sid = sid;
    }

    public Long getSid() 
    {
        return sid;
    }
    public void setSupplierName(String supplierName) 
    {
        this.supplierName = supplierName;
    }

    public String getSupplierName() 
    {
        return supplierName;
    }
    public void setContactName(String contactName) 
    {
        this.contactName = contactName;
    }

    public String getContactName() 
    {
        return contactName;
    }
    public void setContactMobile(String contactMobile) 
    {
        this.contactMobile = contactMobile;
    }

    public String getContactMobile() 
    {
        return contactMobile;
    }
    public void setContactTelephone(String contactTelephone) 
    {
        this.contactTelephone = contactTelephone;
    }

    public String getContactTelephone() 
    {
        return contactTelephone;
    }
    public void setBankAccount(String bankAccount) 
    {
        this.bankAccount = bankAccount;
    }

    public String getBankAccount() 
    {
        return bankAccount;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
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
            .append("sid", getSid())
            .append("supplierName", getSupplierName())
            .append("contactName", getContactName())
            .append("contactMobile", getContactMobile())
            .append("contactTelephone", getContactTelephone())
            .append("bankAccount", getBankAccount())
            .append("address", getAddress())
            .append("hospitalId", getHospitalId())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
