package com.vrmlstudio.department.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 短信发送记录对象 vr_his_sms_log
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisSmsLog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 表id */
    private Long id;

    /** 手机号 */
    @Excel(name = "手机号")
    private String mobile;

    /** 发送时间 */
    @Excel(name = "发送时间")
    private Long addTime;

    /** 验证码 */
    @Excel(name = "验证码")
    private String code;

    /** 1.发送成功2发送失败 */
    @Excel(name = "1.发送成功2发送失败")
    private Integer status;

    /** 1注册验证码，2，其他 */
    @Excel(name = "1注册验证码，2，其他")
    private Integer type;

    /** 发送失败的错误信息 */
    @Excel(name = "发送失败的错误信息")
    private String errorInfo;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setMobile(String mobile) 
    {
        this.mobile = mobile;
    }

    public String getMobile() 
    {
        return mobile;
    }
    public void setAddTime(Long addTime) 
    {
        this.addTime = addTime;
    }

    public Long getAddTime() 
    {
        return addTime;
    }
    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
    }
    public void setErrorInfo(String errorInfo) 
    {
        this.errorInfo = errorInfo;
    }

    public String getErrorInfo() 
    {
        return errorInfo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("mobile", getMobile())
            .append("addTime", getAddTime())
            .append("code", getCode())
            .append("status", getStatus())
            .append("type", getType())
            .append("errorInfo", getErrorInfo())
            .toString();
    }
}
