package com.vrmlstudio.department.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 用户组对象 vr_his_auth_group
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisAuthGroup extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 组别名称 */
    @Excel(name = "组别名称")
    private String title;

    /** 是否显示：1为显示，2不显示 */
    @Excel(name = "是否显示：1为显示，2不显示")
    private Integer status;

    /** 1需要验证权限 2 不需要验证权限 */
    @Excel(name = "1需要验证权限 2 不需要验证权限")
    private Integer isManage;

    /** 用户组拥有的规则id， 多个规则 */
    @Excel(name = "用户组拥有的规则id， 多个规则")
    private String rules;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setIsManage(Integer isManage) 
    {
        this.isManage = isManage;
    }

    public Integer getIsManage() 
    {
        return isManage;
    }
    public void setRules(String rules) 
    {
        this.rules = rules;
    }

    public String getRules() 
    {
        return rules;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("title", getTitle())
            .append("status", getStatus())
            .append("isManage", getIsManage())
            .append("rules", getRules())
            .toString();
    }
}
