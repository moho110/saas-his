package com.vrmlstudio.xsystem.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 诊所系统操作记录对象 vr_his_operation_log
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisOperationLog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long oid;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long uid;

    /** 具体操作 */
    @Excel(name = "具体操作")
    private String operation;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String details;

    /** 操作时间 */
    @Excel(name = "操作时间")
    private Integer optime;

    public void setOid(Long oid) 
    {
        this.oid = oid;
    }

    public Long getOid() 
    {
        return oid;
    }
    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
    }
    public void setOperation(String operation) 
    {
        this.operation = operation;
    }

    public String getOperation() 
    {
        return operation;
    }
    public void setDetails(String details) 
    {
        this.details = details;
    }

    public String getDetails() 
    {
        return details;
    }
    public void setOptime(Integer optime) 
    {
        this.optime = optime;
    }

    public Integer getOptime() 
    {
        return optime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("oid", getOid())
            .append("uid", getUid())
            .append("operation", getOperation())
            .append("details", getDetails())
            .append("optime", getOptime())
            .toString();
    }
}
