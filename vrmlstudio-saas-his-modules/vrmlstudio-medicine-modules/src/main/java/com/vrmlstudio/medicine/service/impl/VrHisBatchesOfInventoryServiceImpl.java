package com.vrmlstudio.medicine.service.impl;

import java.util.List;
import com.vrmlstudio.common.utils.DateUtils;
import com.vrmlstudio.medicine.service.IVrHisBatchesOfInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.medicine.mapper.VrHisBatchesOfInventoryMapper;
import com.vrmlstudio.medicine.domain.VrHisBatchesOfInventory;

/**
 * 批次库存Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisBatchesOfInventoryServiceImpl implements IVrHisBatchesOfInventoryService
{
    @Autowired
    private VrHisBatchesOfInventoryMapper vrHisBatchesOfInventoryMapper;

    /**
     * 查询批次库存
     * 
     * @param batchesOfInventoryId 批次库存主键
     * @return 批次库存
     */
    @Override
    public VrHisBatchesOfInventory selectVrHisBatchesOfInventoryByBatchesOfInventoryId(Integer batchesOfInventoryId)
    {
        return vrHisBatchesOfInventoryMapper.selectVrHisBatchesOfInventoryByBatchesOfInventoryId(batchesOfInventoryId);
    }

    /**
     * 查询批次库存列表
     * 
     * @param vrHisBatchesOfInventory 批次库存
     * @return 批次库存
     */
    @Override
    public List<VrHisBatchesOfInventory> selectVrHisBatchesOfInventoryList(VrHisBatchesOfInventory vrHisBatchesOfInventory)
    {
        return vrHisBatchesOfInventoryMapper.selectVrHisBatchesOfInventoryList(vrHisBatchesOfInventory);
    }

    /**
     * 新增批次库存
     * 
     * @param vrHisBatchesOfInventory 批次库存
     * @return 结果
     */
    @Override
    public int insertVrHisBatchesOfInventory(VrHisBatchesOfInventory vrHisBatchesOfInventory)
    {
        vrHisBatchesOfInventory.setCreateTime(DateUtils.getNowDate());
        return vrHisBatchesOfInventoryMapper.insertVrHisBatchesOfInventory(vrHisBatchesOfInventory);
    }

    /**
     * 修改批次库存
     * 
     * @param vrHisBatchesOfInventory 批次库存
     * @return 结果
     */
    @Override
    public int updateVrHisBatchesOfInventory(VrHisBatchesOfInventory vrHisBatchesOfInventory)
    {
        vrHisBatchesOfInventory.setUpdateTime(DateUtils.getNowDate());
        return vrHisBatchesOfInventoryMapper.updateVrHisBatchesOfInventory(vrHisBatchesOfInventory);
    }

    /**
     * 批量删除批次库存
     * 
     * @param batchesOfInventoryIds 需要删除的批次库存主键
     * @return 结果
     */
    @Override
    public int deleteVrHisBatchesOfInventoryByBatchesOfInventoryIds(Integer[] batchesOfInventoryIds)
    {
        return vrHisBatchesOfInventoryMapper.deleteVrHisBatchesOfInventoryByBatchesOfInventoryIds(batchesOfInventoryIds);
    }

    /**
     * 删除批次库存信息
     * 
     * @param batchesOfInventoryId 批次库存主键
     * @return 结果
     */
    @Override
    public int deleteVrHisBatchesOfInventoryByBatchesOfInventoryId(Integer batchesOfInventoryId)
    {
        return vrHisBatchesOfInventoryMapper.deleteVrHisBatchesOfInventoryByBatchesOfInventoryId(batchesOfInventoryId);
    }
}
