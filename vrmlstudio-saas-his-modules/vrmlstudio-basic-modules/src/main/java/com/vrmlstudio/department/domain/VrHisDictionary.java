package com.vrmlstudio.department.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 字典对象 vr_his_dictionary
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisDictionary extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 字典字段id */
    private Long did;

    /** 字典名称 */
    @Excel(name = "字典名称")
    private String dictionaryName;

    /** 父级id */
    @Excel(name = "父级id")
    private Integer parentId;

    /** 医院id */
    @Excel(name = "医院id")
    private Integer hid;

    /** 类型  0：系统  1：自建 */
    @Excel(name = "类型  0：系统  1：自建")
    private Integer type;

    /** 诊断编号 */
    @Excel(name = "诊断编号")
    private String number;

    /** 是否删除 */
    @Excel(name = "是否删除")
    private Integer isDel;

    public void setDid(Long did) 
    {
        this.did = did;
    }

    public Long getDid() 
    {
        return did;
    }
    public void setDictionaryName(String dictionaryName) 
    {
        this.dictionaryName = dictionaryName;
    }

    public String getDictionaryName() 
    {
        return dictionaryName;
    }
    public void setParentId(Integer parentId) 
    {
        this.parentId = parentId;
    }

    public Integer getParentId() 
    {
        return parentId;
    }
    public void setHid(Integer hid) 
    {
        this.hid = hid;
    }

    public Integer getHid() 
    {
        return hid;
    }
    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
    }
    public void setNumber(String number) 
    {
        this.number = number;
    }

    public String getNumber() 
    {
        return number;
    }
    public void setIsDel(Integer isDel) 
    {
        this.isDel = isDel;
    }

    public Integer getIsDel() 
    {
        return isDel;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("did", getDid())
            .append("dictionaryName", getDictionaryName())
            .append("parentId", getParentId())
            .append("hid", getHid())
            .append("type", getType())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("number", getNumber())
            .append("isDel", getIsDel())
            .toString();
    }
}
