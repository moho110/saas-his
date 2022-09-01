package com.vrmlstudio.xsystem.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.TreeEntity;

/**
 * 保存微信公众平台菜单对象 vr_his_wx_menu
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisWxMenu extends TreeEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 医院id */
    @Excel(name = "医院id")
    private Integer hospitalId;

    /** 主菜单ID */
    @Excel(name = "主菜单ID")
    private Integer pid;

    /** 菜单的响应动作类型 */
    @Excel(name = "菜单的响应动作类型")
    private String type;

    /** 菜单标题，不超过16个字节，子菜单不超过60个字节 */
    @Excel(name = "菜单标题，不超过16个字节，子菜单不超过60个字节")
    private String name;

    /** 菜单KEY值，用于消息接口推送，不超过128字节 */
    @Excel(name = "菜单KEY值，用于消息接口推送，不超过128字节")
    private String key;

    /** 网页链接，用户点击菜单可打开链接，不超过1024字节。 */
    @Excel(name = "网页链接，用户点击菜单可打开链接，不超过1024字节。")
    private String url;

    /** 调用新增永久素材接口返回的合法media_id */
    @Excel(name = "调用新增永久素材接口返回的合法media_id")
    private String mediaId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String appid;

    /** 小程序的页面路径 */
    @Excel(name = "小程序的页面路径")
    private String pagepath;

    /** 排序 ASC */
    @Excel(name = "排序 ASC")
    private Integer listorder;

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
    public void setPid(Integer pid) 
    {
        this.pid = pid;
    }

    public Integer getPid() 
    {
        return pid;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setKey(String key) 
    {
        this.key = key;
    }

    public String getKey() 
    {
        return key;
    }
    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
    }
    public void setMediaId(String mediaId) 
    {
        this.mediaId = mediaId;
    }

    public String getMediaId() 
    {
        return mediaId;
    }
    public void setAppid(String appid) 
    {
        this.appid = appid;
    }

    public String getAppid() 
    {
        return appid;
    }
    public void setPagepath(String pagepath) 
    {
        this.pagepath = pagepath;
    }

    public String getPagepath() 
    {
        return pagepath;
    }
    public void setListorder(Integer listorder) 
    {
        this.listorder = listorder;
    }

    public Integer getListorder() 
    {
        return listorder;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("hospitalId", getHospitalId())
            .append("pid", getPid())
            .append("type", getType())
            .append("name", getName())
            .append("key", getKey())
            .append("url", getUrl())
            .append("mediaId", getMediaId())
            .append("appid", getAppid())
            .append("pagepath", getPagepath())
            .append("listorder", getListorder())
            .toString();
    }
}
