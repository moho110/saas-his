package com.vrmlstudio.sales.service.impl;

import java.util.List;
import com.vrmlstudio.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.sales.mapper.VrHisPurchaseMapper;
import com.vrmlstudio.sales.domain.VrHisPurchase;
import com.vrmlstudio.sales.service.IVrHisPurchaseService;

/**
 * 采购信息Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisPurchaseServiceImpl implements IVrHisPurchaseService 
{
    @Autowired
    private VrHisPurchaseMapper vrHisPurchaseMapper;

    /**
     * 查询采购信息
     * 
     * @param purchaseId 采购信息主键
     * @return 采购信息
     */
    @Override
    public VrHisPurchase selectVrHisPurchaseByPurchaseId(Integer purchaseId)
    {
        return vrHisPurchaseMapper.selectVrHisPurchaseByPurchaseId(purchaseId);
    }

    /**
     * 查询采购信息列表
     * 
     * @param vrHisPurchase 采购信息
     * @return 采购信息
     */
    @Override
    public List<VrHisPurchase> selectVrHisPurchaseList(VrHisPurchase vrHisPurchase)
    {
        return vrHisPurchaseMapper.selectVrHisPurchaseList(vrHisPurchase);
    }

    /**
     * 新增采购信息
     * 
     * @param vrHisPurchase 采购信息
     * @return 结果
     */
    @Override
    public int insertVrHisPurchase(VrHisPurchase vrHisPurchase)
    {
        vrHisPurchase.setCreateTime(DateUtils.getNowDate());
        return vrHisPurchaseMapper.insertVrHisPurchase(vrHisPurchase);
    }

    /**
     * 修改采购信息
     * 
     * @param vrHisPurchase 采购信息
     * @return 结果
     */
    @Override
    public int updateVrHisPurchase(VrHisPurchase vrHisPurchase)
    {
        return vrHisPurchaseMapper.updateVrHisPurchase(vrHisPurchase);
    }

    /**
     * 批量删除采购信息
     * 
     * @param purchaseIds 需要删除的采购信息主键
     * @return 结果
     */
    @Override
    public int deleteVrHisPurchaseByPurchaseIds(Integer[] purchaseIds)
    {
        return vrHisPurchaseMapper.deleteVrHisPurchaseByPurchaseIds(purchaseIds);
    }

    /**
     * 删除采购信息信息
     * 
     * @param purchaseId 采购信息主键
     * @return 结果
     */
    @Override
    public int deleteVrHisPurchaseByPurchaseId(Integer purchaseId)
    {
        return vrHisPurchaseMapper.deleteVrHisPurchaseByPurchaseId(purchaseId);
    }
}
