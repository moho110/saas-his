package com.vrmlstudio.medicine.service.impl;

import java.util.List;
import com.vrmlstudio.common.utils.DateUtils;
import com.vrmlstudio.medicine.service.IVrHisInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.medicine.mapper.VrHisInventoryMapper;
import com.vrmlstudio.medicine.domain.VrHisInventory;

/**
 * 库存Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisInventoryServiceImpl implements IVrHisInventoryService
{
    @Autowired
    private VrHisInventoryMapper vrHisInventoryMapper;

    /**
     * 查询库存
     * 
     * @param inventoryId 库存主键
     * @return 库存
     */
    @Override
    public VrHisInventory selectVrHisInventoryByInventoryId(Integer inventoryId)
    {
        return vrHisInventoryMapper.selectVrHisInventoryByInventoryId(inventoryId);
    }

    /**
     * 查询库存列表
     * 
     * @param vrHisInventory 库存
     * @return 库存
     */
    @Override
    public List<VrHisInventory> selectVrHisInventoryList(VrHisInventory vrHisInventory)
    {
        return vrHisInventoryMapper.selectVrHisInventoryList(vrHisInventory);
    }

    /**
     * 新增库存
     * 
     * @param vrHisInventory 库存
     * @return 结果
     */
    @Override
    public int insertVrHisInventory(VrHisInventory vrHisInventory)
    {
        return vrHisInventoryMapper.insertVrHisInventory(vrHisInventory);
    }

    /**
     * 修改库存
     * 
     * @param vrHisInventory 库存
     * @return 结果
     */
    @Override
    public int updateVrHisInventory(VrHisInventory vrHisInventory)
    {
        vrHisInventory.setUpdateTime(DateUtils.getNowDate());
        return vrHisInventoryMapper.updateVrHisInventory(vrHisInventory);
    }

    /**
     * 批量删除库存
     * 
     * @param inventoryIds 需要删除的库存主键
     * @return 结果
     */
    @Override
    public int deleteVrHisInventoryByInventoryIds(Integer[] inventoryIds)
    {
        return vrHisInventoryMapper.deleteVrHisInventoryByInventoryIds(inventoryIds);
    }

    /**
     * 删除库存信息
     * 
     * @param inventoryId 库存主键
     * @return 结果
     */
    @Override
    public int deleteVrHisInventoryByInventoryId(Integer inventoryId)
    {
        return vrHisInventoryMapper.deleteVrHisInventoryByInventoryId(inventoryId);
    }
}
