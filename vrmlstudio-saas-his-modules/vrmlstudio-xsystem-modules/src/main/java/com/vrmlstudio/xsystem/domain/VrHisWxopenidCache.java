package com.vrmlstudio.xsystem.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * openid跨域名获取对象 vr_his_wxopenid_cache
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisWxopenidCache extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 微信appid */
    @Excel(name = "微信appid")
    private String appid;

    /** 微信openid */
    @Excel(name = "微信openid")
    private String openid;

    /** openid获取成功后跳转的url */
    @Excel(name = "openid获取成功后跳转的url")
    private String url;

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
    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("appid", getAppid())
            .append("openid", getOpenid())
            .append("url", getUrl())
            .toString();
    }
}
