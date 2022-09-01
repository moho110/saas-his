package com.vrmlstudio.person.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 公示信息--医生对象 vr_his_demo_doctor
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisDemoDoctor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 医生姓名 */
    @Excel(name = "医生姓名")
    private String truename;

    /** 医生职称 */
    @Excel(name = "医生职称")
    private String dtitle;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String address;

    /** 医院姓名 */
    @Excel(name = "医院姓名")
    private String hospitalName;

    /** 面诊费用价格 */
    @Excel(name = "面诊费用价格")
    private String pricea;

    /** 电话问诊费用价格 */
    @Excel(name = "电话问诊费用价格")
    private String priceb;

    /** 擅长 */
    @Excel(name = "擅长")
    private String hasfix;

    /** 关于 */
    @Excel(name = "关于")
    private String about;

    /** 简介 */
    @Excel(name = "简介")
    private String casese;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTruename(String truename) 
    {
        this.truename = truename;
    }

    public String getTruename() 
    {
        return truename;
    }
    public void setDtitle(String dtitle) 
    {
        this.dtitle = dtitle;
    }

    public String getDtitle() 
    {
        return dtitle;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setHospitalName(String hospitalName) 
    {
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() 
    {
        return hospitalName;
    }
    public void setPricea(String pricea) 
    {
        this.pricea = pricea;
    }

    public String getPricea() 
    {
        return pricea;
    }
    public void setPriceb(String priceb) 
    {
        this.priceb = priceb;
    }

    public String getPriceb() 
    {
        return priceb;
    }
    public void setHasfix(String hasfix) 
    {
        this.hasfix = hasfix;
    }

    public String getHasfix() 
    {
        return hasfix;
    }
    public void setAbout(String about) 
    {
        this.about = about;
    }

    public String getAbout() 
    {
        return about;
    }
    public void setCasese(String casese)
    {
        this.casese = casese;
    }

    public String getCasese()
    {
        return casese;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("truename", getTruename())
            .append("dtitle", getDtitle())
            .append("sex", getSex())
            .append("address", getAddress())
            .append("hospitalName", getHospitalName())
            .append("pricea", getPricea())
            .append("priceb", getPriceb())
            .append("hasfix", getHasfix())
            .append("about", getAbout())
            .append("casese", getCasese())
            .toString();
    }
}
