package com.vrmlstudio.sales.mapper;

import java.util.List;
import com.vrmlstudio.sales.domain.VrHisPurchase;

/**
 * 采购信息Mapper接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface VrHisPurchaseMapper 
{
    /**
     * 查询采购信息
     * 
     * @param purchaseId 采购信息主键
     * @return 采购信息
     */
    public VrHisPurchase selectVrHisPurchaseByPurchaseId(Integer purchaseId);

    /**
     * 查询采购信息列表
     * 
     * @param vrHisPurchase 采购信息
     * @return 采购信息集合
     */
    public List<VrHisPurchase> selectVrHisPurchaseList(VrHisPurchase vrHisPurchase);

    /**
     * 新增采购信息
     * 
     * @param vrHisPurchase 采购信息
     * @return 结果
     */
    public int insertVrHisPurchase(VrHisPurchase vrHisPurchase);

    /**
     * 修改采购信息
     * 
     * @param vrHisPurchase 采购信息
     * @return 结果
     */
    public int updateVrHisPurchase(VrHisPurchase vrHisPurchase);

    /**
     * 删除采购信息
     * 
     * @param purchaseId 采购信息主键
     * @return 结果
     */
    public int deleteVrHisPurchaseByPurchaseId(Integer purchaseId);

    /**
     * 批量删除采购信息
     * 
     * @param purchaseIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrHisPurchaseByPurchaseIds(Integer[] purchaseIds);
}
