package com.vrmlstudio.sales.controller;

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
import com.vrmlstudio.sales.domain.VrHisMedicines;
import com.vrmlstudio.sales.service.IVrHisMedicinesService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 药品信息Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/sales/medicines")
public class VrHisMedicinesController extends BaseController
{
    @Autowired
    private IVrHisMedicinesService vrHisMedicinesService;

    /**
     * 查询药品信息列表
     */
    @PreAuthorize("@ss.hasPermi('sales:medicines:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisMedicines vrHisMedicines)
    {
        startPage();
        List<VrHisMedicines> list = vrHisMedicinesService.selectVrHisMedicinesList(vrHisMedicines);
        return getDataTable(list);
    }

    /**
     * 导出药品信息列表
     */
    @PreAuthorize("@ss.hasPermi('sales:medicines:export')")
    @Log(title = "药品信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisMedicines vrHisMedicines)
    {
        List<VrHisMedicines> list = vrHisMedicinesService.selectVrHisMedicinesList(vrHisMedicines);
        ExcelUtil<VrHisMedicines> util = new ExcelUtil<VrHisMedicines>(VrHisMedicines.class);
        util.exportExcel(response, list, "药品信息数据");
    }

    /**
     * 获取药品信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('sales:medicines:query')")
    @GetMapping(value = "/{medicinesId}")
    public AjaxResult getInfo(@PathVariable("medicinesId") Integer medicinesId)
    {
        return AjaxResult.success(vrHisMedicinesService.selectVrHisMedicinesByMedicinesId(medicinesId));
    }

    /**
     * 新增药品信息
     */
    @PreAuthorize("@ss.hasPermi('sales:medicines:add')")
    @Log(title = "药品信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisMedicines vrHisMedicines)
    {
        return toAjax(vrHisMedicinesService.insertVrHisMedicines(vrHisMedicines));
    }

    /**
     * 修改药品信息
     */
    @PreAuthorize("@ss.hasPermi('sales:medicines:edit')")
    @Log(title = "药品信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisMedicines vrHisMedicines)
    {
        return toAjax(vrHisMedicinesService.updateVrHisMedicines(vrHisMedicines));
    }

    /**
     * 删除药品信息
     */
    @PreAuthorize("@ss.hasPermi('sales:medicines:remove')")
    @Log(title = "药品信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{medicinesIds}")
    public AjaxResult remove(@PathVariable Integer[] medicinesIds)
    {
        return toAjax(vrHisMedicinesService.deleteVrHisMedicinesByMedicinesIds(medicinesIds));
    }
}
