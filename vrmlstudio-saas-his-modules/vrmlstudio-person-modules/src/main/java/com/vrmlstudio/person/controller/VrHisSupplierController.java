package com.vrmlstudio.person.controller;

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
import com.vrmlstudio.person.domain.VrHisSupplier;
import com.vrmlstudio.person.service.IVrHisSupplierService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 供应商Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/person/supplier")
public class VrHisSupplierController extends BaseController
{
    @Autowired
    private IVrHisSupplierService vrHisSupplierService;

    /**
     * 查询供应商列表
     */
    @PreAuthorize("@ss.hasPermi('person:supplier:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisSupplier vrHisSupplier)
    {
        startPage();
        List<VrHisSupplier> list = vrHisSupplierService.selectVrHisSupplierList(vrHisSupplier);
        return getDataTable(list);
    }

    /**
     * 导出供应商列表
     */
    @PreAuthorize("@ss.hasPermi('person:supplier:export')")
    @Log(title = "供应商", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisSupplier vrHisSupplier)
    {
        List<VrHisSupplier> list = vrHisSupplierService.selectVrHisSupplierList(vrHisSupplier);
        ExcelUtil<VrHisSupplier> util = new ExcelUtil<VrHisSupplier>(VrHisSupplier.class);
        util.exportExcel(response, list, "供应商数据");
    }

    /**
     * 获取供应商详细信息
     */
    @PreAuthorize("@ss.hasPermi('person:supplier:query')")
    @GetMapping(value = "/{sid}")
    public AjaxResult getInfo(@PathVariable("sid") Long sid)
    {
        return AjaxResult.success(vrHisSupplierService.selectVrHisSupplierBySid(sid));
    }

    /**
     * 新增供应商
     */
    @PreAuthorize("@ss.hasPermi('person:supplier:add')")
    @Log(title = "供应商", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisSupplier vrHisSupplier)
    {
        return toAjax(vrHisSupplierService.insertVrHisSupplier(vrHisSupplier));
    }

    /**
     * 修改供应商
     */
    @PreAuthorize("@ss.hasPermi('person:supplier:edit')")
    @Log(title = "供应商", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisSupplier vrHisSupplier)
    {
        return toAjax(vrHisSupplierService.updateVrHisSupplier(vrHisSupplier));
    }

    /**
     * 删除供应商
     */
    @PreAuthorize("@ss.hasPermi('person:supplier:remove')")
    @Log(title = "供应商", businessType = BusinessType.DELETE)
	@DeleteMapping("/{sids}")
    public AjaxResult remove(@PathVariable Long[] sids)
    {
        return toAjax(vrHisSupplierService.deleteVrHisSupplierBySids(sids));
    }
}
