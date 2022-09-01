package com.vrmlstudio.department.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 用户权限对象 vr_his_auth_rule
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisAuthRule extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 图标 */
    @Excel(name = "图标")
    private String icon;

    /** 规则唯一标识Controller/action */
    @Excel(name = "规则唯一标识Controller/action")
    private String menuName;

    /** 菜单名称 */
    @Excel(name = "菜单名称")
    private String title;

    /** 菜单ID  */
    @Excel(name = "菜单ID ")
    private Integer pid;

    /** 1:是主菜单 2 否 */
    @Excel(name = "1:是主菜单 2 否")
    private Integer isMenu;

    /** 1:是 2:不是 */
    @Excel(name = "1:是 2:不是")
    private Integer isRaceMenu;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer type;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String condition;

    /** 排序字段 */
    @Excel(name = "排序字段")
    private Long orderList;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setIcon(String icon) 
    {
        this.icon = icon;
    }

    public String getIcon() 
    {
        return icon;
    }
    public void setMenuName(String menuName) 
    {
        this.menuName = menuName;
    }

    public String getMenuName() 
    {
        return menuName;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setPid(Integer pid) 
    {
        this.pid = pid;
    }

    public Integer getPid() 
    {
        return pid;
    }
    public void setIsMenu(Integer isMenu) 
    {
        this.isMenu = isMenu;
    }

    public Integer getIsMenu() 
    {
        return isMenu;
    }
    public void setIsRaceMenu(Integer isRaceMenu) 
    {
        this.isRaceMenu = isRaceMenu;
    }

    public Integer getIsRaceMenu() 
    {
        return isRaceMenu;
    }
    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setCondition(String condition) 
    {
        this.condition = condition;
    }

    public String getCondition() 
    {
        return condition;
    }
    public void setOrderList(Long orderList) 
    {
        this.orderList = orderList;
    }

    public Long getOrderList() 
    {
        return orderList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("icon", getIcon())
            .append("menuName", getMenuName())
            .append("title", getTitle())
            .append("pid", getPid())
            .append("isMenu", getIsMenu())
            .append("isRaceMenu", getIsRaceMenu())
            .append("type", getType())
            .append("status", getStatus())
            .append("condition", getCondition())
            .append("orderList", getOrderList())
            .toString();
    }
}
