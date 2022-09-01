package com.vrmlstudio.xsystem.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 保存微信永久二维码及用户关系对象 vr_his_wxqr
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisWxqr extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 医院id */
    @Excel(name = "医院id")
    private Integer hospitalId;

    /** 微信永久二维码标识1-100000，每个微信公众平台10万个 */
    @Excel(name = "微信永久二维码标识1-100000，每个微信公众平台10万个")
    private Integer qrId;

    /** 微信二维码内容 */
    @Excel(name = "微信二维码内容")
    private String url;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String appid;

    /** 绑定用户id */
    @Excel(name = "绑定用户id")
    private Integer userid;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setHospitalId(Integer hospitalId) 
    {
        this.hospitalId = hospitalId;
    }

    public Integer getHospitalId() 
    {
        return hospitalId;
    }
    public void setQrId(Integer qrId) 
    {
        this.qrId = qrId;
    }

    public Integer getQrId() 
    {
        return qrId;
    }
    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
    }
    public void setAppid(String appid) 
    {
        this.appid = appid;
    }

    public String getAppid() 
    {
        return appid;
    }
    public void setUserid(Integer userid) 
    {
        this.userid = userid;
    }

    public Integer getUserid() 
    {
        return userid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("hospitalId", getHospitalId())
            .append("qrId", getQrId())
            .append("url", getUrl())
            .append("appid", getAppid())
            .append("userid", getUserid())
            .toString();
    }
}
