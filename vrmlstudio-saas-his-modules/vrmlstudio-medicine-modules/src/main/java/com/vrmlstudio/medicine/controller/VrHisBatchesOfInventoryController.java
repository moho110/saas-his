package com.vrmlstudio.medicine.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vrmlstudio.common.annotation.Log;
import com.vrmlstudio.common.core.controller.BaseController;
import com.vrmlstudio.common.core.domain.AjaxResult;
import com.vrmlstudio.common.enums.BusinessType;
import com.vrmlstudio.medicine.domain.VrHisBatchesOfInventory;
import com.vrmlstudio.medicine.service.IVrHisBatchesOfInventoryService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 批次库存Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/medicine/inventory")
public class VrHisBatchesOfInventoryController extends BaseController
{
    @Autowired
    private IVrHisBatchesOfInventoryService vrHisBatchesOfInventoryService;

    /**
     * 查询批次库存列表
     */
    @PreAuthorize("@ss.hasPermi('medicine:inventory:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisBatchesOfInventory vrHisBatchesOfInventory)
    {
        startPage();
        List<VrHisBatchesOfInventory> list = vrHisBatchesOfInventoryService.selectVrHisBatchesOfInventoryList(vrHisBatchesOfInventory);
        return getDataTable(list);
    }

    /**
     * 导出批次库存列表
     */
    @PreAuthorize("@ss.hasPermi('medicine:inventory:export')")
    @Log(title = "批次库存", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisBatchesOfInventory vrHisBatchesOfInventory)
    {
        List<VrHisBatchesOfInventory> list = vrHisBatchesOfInventoryService.selectVrHisBatchesOfInventoryList(vrHisBatchesOfInventory);
        ExcelUtil<VrHisBatchesOfInventory> util = new ExcelUtil<VrHisBatchesOfInventory>(VrHisBatchesOfInventory.class);
        util.exportExcel(response, list, "批次库存数据");
    }

    /**
     * 获取批次库存详细信息
     */
    @PreAuthorize("@ss.hasPermi('medicine:inventory:query')")
    @GetMapping(value = "/{batchesOfInventoryId}")
    public AjaxResult getInfo(@PathVariable("batchesOfInventoryId") Integer batchesOfInventoryId)
    {
        return AjaxResult.success(vrHisBatchesOfInventoryService.selectVrHisBatchesOfInventoryByBatchesOfInventoryId(batchesOfInventoryId));
    }

    /**
     * 新增批次库存
     */
    @PreAuthorize("@ss.hasPermi('medicine:inventory:add')")
    @Log(title = "批次库存", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisBatchesOfInventory vrHisBatchesOfInventory)
    {
        return toAjax(vrHisBatchesOfInventoryService.insertVrHisBatchesOfInventory(vrHisBatchesOfInventory));
    }

    /**
     * 修改批次库存
     */
    @PreAuthorize("@ss.hasPermi('medicine:inventory:edit')")
    @Log(title = "批次库存", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisBatchesOfInventory vrHisBatchesOfInventory)
    {
        return toAjax(vrHisBatchesOfInventoryService.updateVrHisBatchesOfInventory(vrHisBatchesOfInventory));
    }

    /**
     * 删除批次库存
     */
    @PreAuthorize("@ss.hasPermi('medicine:inventory:remove')")
    @Log(title = "批次库存", businessType = BusinessType.DELETE)
	@DeleteMapping("/{batchesOfInventoryIds}")
    public AjaxResult remove(@PathVariable Integer[] batchesOfInventoryIds)
    {
        return toAjax(vrHisBatchesOfInventoryService.deleteVrHisBatchesOfInventoryByBatchesOfInventoryIds(batchesOfInventoryIds));
    }
}
