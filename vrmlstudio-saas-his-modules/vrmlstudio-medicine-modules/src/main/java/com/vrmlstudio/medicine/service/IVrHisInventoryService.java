package com.vrmlstudio.medicine.service;

import java.util.List;
import com.vrmlstudio.medicine.domain.VrHisInventory;

/**
 * 库存Service接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface IVrHisInventoryService 
{
    /**
     * 查询库存
     * 
     * @param inventoryId 库存主键
     * @return 库存
     */
    public VrHisInventory selectVrHisInventoryByInventoryId(Integer inventoryId);

    /**
     * 查询库存列表
     * 
     * @param vrHisInventory 库存
     * @return 库存集合
     */
    public List<VrHisInventory> selectVrHisInventoryList(VrHisInventory vrHisInventory);

    /**
     * 新增库存
     * 
     * @param vrHisInventory 库存
     * @return 结果
     */
    public int insertVrHisInventory(VrHisInventory vrHisInventory);

    /**
     * 修改库存
     * 
     * @param vrHisInventory 库存
     * @return 结果
     */
    public int updateVrHisInventory(VrHisInventory vrHisInventory);

    /**
     * 批量删除库存
     * 
     * @param inventoryIds 需要删除的库存主键集合
     * @return 结果
     */
    public int deleteVrHisInventoryByInventoryIds(Integer[] inventoryIds);

    /**
     * 删除库存信息
     * 
     * @param inventoryId 库存主键
     * @return 结果
     */
    public int deleteVrHisInventoryByInventoryId(Integer inventoryId);
}
