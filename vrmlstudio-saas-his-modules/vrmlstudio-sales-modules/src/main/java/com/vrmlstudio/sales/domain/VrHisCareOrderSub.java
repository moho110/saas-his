package com.vrmlstudio.sales.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 开诊用药明细对象 vr_his_care_order_sub
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisCareOrderSub extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer pkgId;

    /** 所属开诊id */
    @Excel(name = "所属开诊id")
    private Integer fid;

    /** 分类：0药，1附加费，2检查项目 */
    @Excel(name = "分类：0药，1附加费，2检查项目")
    private Integer typeId;

    /** 商品id，药品id */
    @Excel(name = "商品id，药品id")
    private Integer goodsId;

    /** 药品名 */
    @Excel(name = "药品名")
    private String goodsName;

    /** 单剂量 */
    @Excel(name = "单剂量")
    private BigDecimal single;

    /** 单位 */
    @Excel(name = "单位")
    private String unit;

    /** 单价 */
    @Excel(name = "单价")
    private BigDecimal price;

    /** 用量 */
    @Excel(name = "用量")
    private BigDecimal num;

    /** 金额 */
    @Excel(name = "金额")
    private BigDecimal amount;

    /** 特殊要求，备注 */
    @Excel(name = "特殊要求，备注")
    private String tips;

    /** 排序 */
    @Excel(name = "排序")
    private Integer listorder;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setPkgId(Integer pkgId) 
    {
        this.pkgId = pkgId;
    }

    public Integer getPkgId() 
    {
        return pkgId;
    }
    public void setFid(Integer fid) 
    {
        this.fid = fid;
    }

    public Integer getFid() 
    {
        return fid;
    }
    public void setTypeId(Integer typeId) 
    {
        this.typeId = typeId;
    }

    public Integer getTypeId() 
    {
        return typeId;
    }
    public void setGoodsId(Integer goodsId) 
    {
        this.goodsId = goodsId;
    }

    public Integer getGoodsId() 
    {
        return goodsId;
    }
    public void setGoodsName(String goodsName) 
    {
        this.goodsName = goodsName;
    }

    public String getGoodsName() 
    {
        return goodsName;
    }
    public void setSingle(BigDecimal single) 
    {
        this.single = single;
    }

    public BigDecimal getSingle() 
    {
        return single;
    }
    public void setUnit(String unit) 
    {
        this.unit = unit;
    }

    public String getUnit() 
    {
        return unit;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }
    public void setNum(BigDecimal num) 
    {
        this.num = num;
    }

    public BigDecimal getNum() 
    {
        return num;
    }
    public void setAmount(BigDecimal amount) 
    {
        this.amount = amount;
    }

    public BigDecimal getAmount() 
    {
        return amount;
    }
    public void setTips(String tips) 
    {
        this.tips = tips;
    }

    public String getTips() 
    {
        return tips;
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
            .append("pkgId", getPkgId())
            .append("fid", getFid())
            .append("typeId", getTypeId())
            .append("goodsId", getGoodsId())
            .append("goodsName", getGoodsName())
            .append("single", getSingle())
            .append("unit", getUnit())
            .append("price", getPrice())
            .append("num", getNum())
            .append("amount", getAmount())
            .append("tips", getTips())
            .append("listorder", getListorder())
            .toString();
    }
}
