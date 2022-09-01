package com.vrmlstudio.department.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 用户组与用户关联对象 vr_his_auth_group_access
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisAuthGroupAccess extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户表member-ID， */
    private Integer uid;

    /** 用户组ID */
    @Excel(name = "用户组ID")
    private Integer groupId;

    public void setUid(Integer uid) 
    {
        this.uid = uid;
    }

    public Integer getUid() 
    {
        return uid;
    }
    public void setGroupId(Integer groupId) 
    {
        this.groupId = groupId;
    }

    public Integer getGroupId() 
    {
        return groupId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("uid", getUid())
            .append("groupId", getGroupId())
            .toString();
    }
}
