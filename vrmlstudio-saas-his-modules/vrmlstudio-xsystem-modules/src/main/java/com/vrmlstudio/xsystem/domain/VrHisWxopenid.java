package com.vrmlstudio.xsystem.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 绑定微信openid和用户id的关系对象 vr_his_wxopenid
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisWxopenid extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** appid预留分表用 */
    @Excel(name = "appid预留分表用")
    private String appid;

    /** 微信openid */
    @Excel(name = "微信openid")
    private String openid;

    /** 用户id */
    @Excel(name = "用户id")
    private Integer userid;

    /** 用户类型，0系统管理员，1诊所医院，2医生，3患者 */
    @Excel(name = "用户类型，0系统管理员，1诊所医院，2医生，3患者")
    private Integer usertype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date addtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setAppid(String appid) 
    {
        this.appid = appid;
    }

    public String getAppid() 
    {
        return appid;
    }
    public void setOpenid(String openid) 
    {
        this.openid = openid;
    }

    public String getOpenid() 
    {
        return openid;
    }
    public void setUserid(Integer userid) 
    {
        this.userid = userid;
    }

    public Integer getUserid() 
    {
        return userid;
    }
    public void setUsertype(Integer usertype) 
    {
        this.usertype = usertype;
    }

    public Integer getUsertype() 
    {
        return usertype;
    }
    public void setAddtime(Date addtime) 
    {
        this.addtime = addtime;
    }

    public Date getAddtime() 
    {
        return addtime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("appid", getAppid())
            .append("openid", getOpenid())
            .append("userid", getUserid())
            .append("usertype", getUsertype())
            .append("addtime", getAddtime())
            .toString();
    }
}
