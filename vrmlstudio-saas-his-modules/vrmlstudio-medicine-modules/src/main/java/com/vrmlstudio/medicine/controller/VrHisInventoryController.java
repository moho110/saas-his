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
import com.vrmlstudio.medicine.domain.VrHisInventory;
import com.vrmlstudio.medicine.service.IVrHisInventoryService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 库存Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/medicine/inventory")
public class VrHisInventoryController extends BaseController
{
    @Autowired
    private IVrHisInventoryService vrHisInventoryService;

    /**
     * 查询库存列表
     */
    @PreAuthorize("@ss.hasPermi('medicine:inventory:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisInventory vrHisInventory)
    {
        startPage();
        List<VrHisInventory> list = vrHisInventoryService.selectVrHisInventoryList(vrHisInventory);
        return getDataTable(list);
    }

    /**
     * 导出库存列表
     */
    @PreAuthorize("@ss.hasPermi('medicine:inventory:export')")
    @Log(title = "库存", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisInventory vrHisInventory)
    {
        List<VrHisInventory> list = vrHisInventoryService.selectVrHisInventoryList(vrHisInventory);
        ExcelUtil<VrHisInventory> util = new ExcelUtil<VrHisInventory>(VrHisInventory.class);
        util.exportExcel(response, list, "库存数据");
    }

    /**
     * 获取库存详细信息
     */
    @PreAuthorize("@ss.hasPermi('medicine:inventory:query')")
    @GetMapping(value = "/{inventoryId}")
    public AjaxResult getInfo(@PathVariable("inventoryId") Integer inventoryId)
    {
        return AjaxResult.success(vrHisInventoryService.selectVrHisInventoryByInventoryId(inventoryId));
    }

    /**
     * 新增库存
     */
    @PreAuthorize("@ss.hasPermi('medicine:inventory:add')")
    @Log(title = "库存", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisInventory vrHisInventory)
    {
        return toAjax(vrHisInventoryService.insertVrHisInventory(vrHisInventory));
    }

    /**
     * 修改库存
     */
    @PreAuthorize("@ss.hasPermi('medicine:inventory:edit')")
    @Log(title = "库存", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisInventory vrHisInventory)
    {
        return toAjax(vrHisInventoryService.updateVrHisInventory(vrHisInventory));
    }

    /**
     * 删除库存
     */
    @PreAuthorize("@ss.hasPermi('medicine:inventory:remove')")
    @Log(title = "库存", businessType = BusinessType.DELETE)
	@DeleteMapping("/{inventoryIds}")
    public AjaxResult remove(@PathVariable Integer[] inventoryIds)
    {
        return toAjax(vrHisInventoryService.deleteVrHisInventoryByInventoryIds(inventoryIds));
    }
}
