package com.vrmlstudio.medicine.service;

import java.util.List;
import com.vrmlstudio.medicine.domain.VrHisBatchesOfInventory;

/**
 * 批次库存Service接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface IVrHisBatchesOfInventoryService 
{
    /**
     * 查询批次库存
     * 
     * @param batchesOfInventoryId 批次库存主键
     * @return 批次库存
     */
    public VrHisBatchesOfInventory selectVrHisBatchesOfInventoryByBatchesOfInventoryId(Integer batchesOfInventoryId);

    /**
     * 查询批次库存列表
     * 
     * @param vrHisBatchesOfInventory 批次库存
     * @return 批次库存集合
     */
    public List<VrHisBatchesOfInventory> selectVrHisBatchesOfInventoryList(VrHisBatchesOfInventory vrHisBatchesOfInventory);

    /**
     * 新增批次库存
     * 
     * @param vrHisBatchesOfInventory 批次库存
     * @return 结果
     */
    public int insertVrHisBatchesOfInventory(VrHisBatchesOfInventory vrHisBatchesOfInventory);

    /**
     * 修改批次库存
     * 
     * @param vrHisBatchesOfInventory 批次库存
     * @return 结果
     */
    public int updateVrHisBatchesOfInventory(VrHisBatchesOfInventory vrHisBatchesOfInventory);

    /**
     * 批量删除批次库存
     * 
     * @param batchesOfInventoryIds 需要删除的批次库存主键集合
     * @return 结果
     */
    public int deleteVrHisBatchesOfInventoryByBatchesOfInventoryIds(Integer[] batchesOfInventoryIds);

    /**
     * 删除批次库存信息
     * 
     * @param batchesOfInventoryId 批次库存主键
     * @return 结果
     */
    public int deleteVrHisBatchesOfInventoryByBatchesOfInventoryId(Integer batchesOfInventoryId);
}
