package com.vrmlstudio.xsystem.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 微信扫码登录对象 vr_his_wxqrlogin
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisWxqrlogin extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 创建时间 */
    @Excel(name = "创建时间")
    private Integer addtime;

    /** 加密的用户id */
    @Excel(name = "加密的用户id")
    private String enuid;

    /** 状态，0等待，1已扫，2完成 */
    @Excel(name = "状态，0等待，1已扫，2完成")
    private Integer status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date createdate;

    /** 微信openid */
    @Excel(name = "微信openid")
    private String openid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setAddtime(Integer addtime) 
    {
        this.addtime = addtime;
    }

    public Integer getAddtime() 
    {
        return addtime;
    }
    public void setEnuid(String enuid) 
    {
        this.enuid = enuid;
    }

    public String getEnuid() 
    {
        return enuid;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setCreatedate(Date createdate) 
    {
        this.createdate = createdate;
    }

    public Date getCreatedate() 
    {
        return createdate;
    }
    public void setOpenid(String openid) 
    {
        this.openid = openid;
    }

    public String getOpenid() 
    {
        return openid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("addtime", getAddtime())
            .append("enuid", getEnuid())
            .append("status", getStatus())
            .append("createdate", getCreatedate())
            .append("openid", getOpenid())
            .toString();
    }
}
