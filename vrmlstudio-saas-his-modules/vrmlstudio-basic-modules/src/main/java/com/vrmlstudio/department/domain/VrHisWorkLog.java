package com.vrmlstudio.department.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 重要操作记录对象 vr_his_work_log
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisWorkLog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 关联表名 */
    @Excel(name = "关联表名")
    private String tabName;

    /** 操作相关id */
    @Excel(name = "操作相关id")
    private Integer relId;

    /** 操作说明 */
    @Excel(name = "操作说明")
    private String title;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date addtime;

    /** 操作者session */
    @Excel(name = "操作者session")
    private String session;

    /** 操作者cookie */
    @Excel(name = "操作者cookie")
    private String cookie;

    /** 操作IP */
    @Excel(name = "操作IP")
    private String ip;

    /** 开发信息 */
    @Excel(name = "开发信息")
    private String devInfo;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setTabName(String tabName) 
    {
        this.tabName = tabName;
    }

    public String getTabName() 
    {
        return tabName;
    }
    public void setRelId(Integer relId) 
    {
        this.relId = relId;
    }

    public Integer getRelId() 
    {
        return relId;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setAddtime(Date addtime) 
    {
        this.addtime = addtime;
    }

    public Date getAddtime() 
    {
        return addtime;
    }
    public void setSession(String session) 
    {
        this.session = session;
    }

    public String getSession() 
    {
        return session;
    }
    public void setCookie(String cookie) 
    {
        this.cookie = cookie;
    }

    public String getCookie() 
    {
        return cookie;
    }
    public void setIp(String ip) 
    {
        this.ip = ip;
    }

    public String getIp() 
    {
        return ip;
    }
    public void setDevInfo(String devInfo) 
    {
        this.devInfo = devInfo;
    }

    public String getDevInfo() 
    {
        return devInfo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("tabName", getTabName())
            .append("relId", getRelId())
            .append("title", getTitle())
            .append("addtime", getAddtime())
            .append("session", getSession())
            .append("cookie", getCookie())
            .append("ip", getIp())
            .append("devInfo", getDevInfo())
            .toString();
    }
}
