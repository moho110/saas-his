package com.vrmlstudio.xsystem.controller;

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
import com.vrmlstudio.xsystem.domain.VrHisPrescriptionExtracharges;
import com.vrmlstudio.xsystem.service.IVrHisPrescriptionExtrachargesService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 处方附加费用Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/xsystem/prescription_extracharges")
public class VrHisPrescriptionExtrachargesController extends BaseController
{
    @Autowired
    private IVrHisPrescriptionExtrachargesService vrHisPrescriptionExtrachargesService;

    /**
     * 查询处方附加费用列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:prescription_extracharges:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisPrescriptionExtracharges vrHisPrescriptionExtracharges)
    {
        startPage();
        List<VrHisPrescriptionExtracharges> list = vrHisPrescriptionExtrachargesService.selectVrHisPrescriptionExtrachargesList(vrHisPrescriptionExtracharges);
        return getDataTable(list);
    }

    /**
     * 导出处方附加费用列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:prescription_extracharges:export')")
    @Log(title = "处方附加费用", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisPrescriptionExtracharges vrHisPrescriptionExtracharges)
    {
        List<VrHisPrescriptionExtracharges> list = vrHisPrescriptionExtrachargesService.selectVrHisPrescriptionExtrachargesList(vrHisPrescriptionExtracharges);
        ExcelUtil<VrHisPrescriptionExtracharges> util = new ExcelUtil<VrHisPrescriptionExtracharges>(VrHisPrescriptionExtracharges.class);
        util.exportExcel(response, list, "处方附加费用数据");
    }

    /**
     * 获取处方附加费用详细信息
     */
    @PreAuthorize("@ss.hasPermi('xsystem:prescription_extracharges:query')")
    @GetMapping(value = "/{preId}")
    public AjaxResult getInfo(@PathVariable("preId") Long preId)
    {
        return AjaxResult.success(vrHisPrescriptionExtrachargesService.selectVrHisPrescriptionExtrachargesByPreId(preId));
    }

    /**
     * 新增处方附加费用
     */
    @PreAuthorize("@ss.hasPermi('xsystem:prescription_extracharges:add')")
    @Log(title = "处方附加费用", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisPrescriptionExtracharges vrHisPrescriptionExtracharges)
    {
        return toAjax(vrHisPrescriptionExtrachargesService.insertVrHisPrescriptionExtracharges(vrHisPrescriptionExtracharges));
    }

    /**
     * 修改处方附加费用
     */
    @PreAuthorize("@ss.hasPermi('xsystem:prescription_extracharges:edit')")
    @Log(title = "处方附加费用", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisPrescriptionExtracharges vrHisPrescriptionExtracharges)
    {
        return toAjax(vrHisPrescriptionExtrachargesService.updateVrHisPrescriptionExtracharges(vrHisPrescriptionExtracharges));
    }

    /**
     * 删除处方附加费用
     */
    @PreAuthorize("@ss.hasPermi('xsystem:prescription_extracharges:remove')")
    @Log(title = "处方附加费用", businessType = BusinessType.DELETE)
	@DeleteMapping("/{preIds}")
    public AjaxResult remove(@PathVariable Long[] preIds)
    {
        return toAjax(vrHisPrescriptionExtrachargesService.deleteVrHisPrescriptionExtrachargesByPreIds(preIds));
    }
}
