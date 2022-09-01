package com.vrmlstudio.person.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 医生基本信息对象 vr_his_doctor
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisDoctor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户id */
    private Long id;

    /** 用户个人资料真实姓名 */
    @Excel(name = "用户个人资料真实姓名")
    private String trueName;

    /** 年龄 */
    @Excel(name = "年龄")
    private Integer age;

    /** 头像 */
    @Excel(name = "头像")
    private String picture;

    /** 性别 0,空1:男  2:女 */
    @Excel(name = "性别 0,空1:男  2:女")
    private Integer sex;

    /** 学历 1：专科  2：本科  3：研究生  4：博士  5：博士后 */
    @Excel(name = "学历 1：专科  2：本科  3：研究生  4：博士  5：博士后")
    private Integer background;

    /** 手机号 */
    @Excel(name = "手机号")
    private String phone;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String mailbox;

    /** 擅长 */
    @Excel(name = "擅长")
    private String strong;

    /** 荣誉 */
    @Excel(name = "荣誉")
    private String honor;

    /** 简介 */
    @Excel(name = "简介")
    private String introduction;

    /** 用户表userid */
    @Excel(name = "用户表userid")
    private Long uid;

    /** 咨询价格 */
    @Excel(name = "咨询价格")
    private BigDecimal askPrice;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTrueName(String trueName) 
    {
        this.trueName = trueName;
    }

    public String getTrueName() 
    {
        return trueName;
    }
    public void setAge(Integer age) 
    {
        this.age = age;
    }

    public Integer getAge() 
    {
        return age;
    }
    public void setPicture(String picture) 
    {
        this.picture = picture;
    }

    public String getPicture() 
    {
        return picture;
    }
    public void setSex(Integer sex) 
    {
        this.sex = sex;
    }

    public Integer getSex() 
    {
        return sex;
    }
    public void setBackground(Integer background) 
    {
        this.background = background;
    }

    public Integer getBackground() 
    {
        return background;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setMailbox(String mailbox) 
    {
        this.mailbox = mailbox;
    }

    public String getMailbox() 
    {
        return mailbox;
    }
    public void setStrong(String strong) 
    {
        this.strong = strong;
    }

    public String getStrong() 
    {
        return strong;
    }
    public void setHonor(String honor) 
    {
        this.honor = honor;
    }

    public String getHonor() 
    {
        return honor;
    }
    public void setIntroduction(String introduction) 
    {
        this.introduction = introduction;
    }

    public String getIntroduction() 
    {
        return introduction;
    }
    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
    }
    public void setAskPrice(BigDecimal askPrice) 
    {
        this.askPrice = askPrice;
    }

    public BigDecimal getAskPrice() 
    {
        return askPrice;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("trueName", getTrueName())
            .append("age", getAge())
            .append("picture", getPicture())
            .append("sex", getSex())
            .append("background", getBackground())
            .append("phone", getPhone())
            .append("mailbox", getMailbox())
            .append("strong", getStrong())
            .append("honor", getHonor())
            .append("introduction", getIntroduction())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("uid", getUid())
            .append("askPrice", getAskPrice())
            .toString();
    }
}
