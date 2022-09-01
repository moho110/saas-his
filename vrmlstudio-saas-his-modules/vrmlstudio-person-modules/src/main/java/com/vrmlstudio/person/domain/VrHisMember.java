package com.vrmlstudio.person.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * HIS用户对象 vr_his_member
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisMember extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户id */
    private Long uid;

    /** 登录名 */
    @Excel(name = "登录名")
    private String userName;

    /** 登录密码 */
    @Excel(name = "登录密码")
    private String password;

    /** 最后一次登录时间 */
    @Excel(name = "最后一次登录时间")
    private Long lastLoginTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer lastLoginIp;

    /** 是否允许用户登录( 1 是  2否) 3 删除 */
    @Excel(name = "是否允许用户登录( 1 是  2否) 3 删除")
    private Integer status;

    /** 医院id，用于区分用户类型及其医生所属诊所 */
    @Excel(name = "医院id，用于区分用户类型及其医生所属诊所")
    private Long pId;

    /** 1,管理员，2，医生，3.护士，4，挂号员，5，收费员6，发药员，7，财务8，其他人员 */
    @Excel(name = "1,管理员，2，医生，3.护士，4，挂号员，5，收费员6，发药员，7，财务8，其他人员")
    private Integer type;

    /** 科室id */
    @Excel(name = "科室id")
    private Long departmentId;

    /** 医生级别 0:其他  1:主治医师  2:副主任医师  3:主任医师  4:医士  5:医师  6:助理医师  7:实习医师  8:主管护师  9:护师  10:护士  11:医师助理  12:研究生  13:随访员  */
    @Excel(name = "医生级别 0:其他  1:主治医师  2:副主任医师  3:主任医师  4:医士  5:医师  6:助理医师  7:实习医师  8:主管护师  9:护师  10:护士  11:医师助理  12:研究生  13:随访员 ")
    private Integer rank;

    /** 二维码标识 */
    @Excel(name = "二维码标识")
    private Integer qrid;

    /** 用户授权登录openid */
    @Excel(name = "用户授权登录openid")
    private String openid;

    /** 用户余额 */
    @Excel(name = "用户余额")
    private BigDecimal moneyBalance;

    /** 冻结中余额 */
    @Excel(name = "冻结中余额")
    private BigDecimal moneyLock;

    /** 邀请码 */
    @Excel(name = "邀请码")
    private String recommentCode;

    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setLastLoginTime(Long lastLoginTime) 
    {
        this.lastLoginTime = lastLoginTime;
    }

    public Long getLastLoginTime() 
    {
        return lastLoginTime;
    }
    public void setLastLoginIp(Integer lastLoginIp) 
    {
        this.lastLoginIp = lastLoginIp;
    }

    public Integer getLastLoginIp() 
    {
        return lastLoginIp;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setpId(Long pId) 
    {
        this.pId = pId;
    }

    public Long getpId() 
    {
        return pId;
    }
    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
    }
    public void setDepartmentId(Long departmentId) 
    {
        this.departmentId = departmentId;
    }

    public Long getDepartmentId() 
    {
        return departmentId;
    }
    public void setRank(Integer rank) 
    {
        this.rank = rank;
    }

    public Integer getRank() 
    {
        return rank;
    }
    public void setQrid(Integer qrid) 
    {
        this.qrid = qrid;
    }

    public Integer getQrid() 
    {
        return qrid;
    }
    public void setOpenid(String openid) 
    {
        this.openid = openid;
    }

    public String getOpenid() 
    {
        return openid;
    }
    public void setMoneyBalance(BigDecimal moneyBalance) 
    {
        this.moneyBalance = moneyBalance;
    }

    public BigDecimal getMoneyBalance() 
    {
        return moneyBalance;
    }
    public void setMoneyLock(BigDecimal moneyLock) 
    {
        this.moneyLock = moneyLock;
    }

    public BigDecimal getMoneyLock() 
    {
        return moneyLock;
    }
    public void setRecommentCode(String recommentCode) 
    {
        this.recommentCode = recommentCode;
    }

    public String getRecommentCode() 
    {
        return recommentCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("uid", getUid())
            .append("userName", getUserName())
            .append("password", getPassword())
            .append("lastLoginTime", getLastLoginTime())
            .append("lastLoginIp", getLastLoginIp())
            .append("createTime", getCreateTime())
            .append("status", getStatus())
            .append("pId", getpId())
            .append("type", getType())
            .append("departmentId", getDepartmentId())
            .append("rank", getRank())
            .append("qrid", getQrid())
            .append("openid", getOpenid())
            .append("moneyBalance", getMoneyBalance())
            .append("moneyLock", getMoneyLock())
            .append("recommentCode", getRecommentCode())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
