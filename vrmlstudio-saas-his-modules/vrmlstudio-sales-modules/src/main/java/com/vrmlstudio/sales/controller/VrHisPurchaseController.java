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
import com.vrmlstudio.sales.domain.VrHisPurchase;
import com.vrmlstudio.sales.service.IVrHisPurchaseService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 采购信息Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/sales/purchase")
public class VrHisPurchaseController extends BaseController
{
    @Autowired
    private IVrHisPurchaseService vrHisPurchaseService;

    /**
     * 查询采购信息列表
     */
    @PreAuthorize("@ss.hasPermi('sales:purchase:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisPurchase vrHisPurchase)
    {
        startPage();
        List<VrHisPurchase> list = vrHisPurchaseService.selectVrHisPurchaseList(vrHisPurchase);
        return getDataTable(list);
    }

    /**
     * 导出采购信息列表
     */
    @PreAuthorize("@ss.hasPermi('sales:purchase:export')")
    @Log(title = "采购信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisPurchase vrHisPurchase)
    {
        List<VrHisPurchase> list = vrHisPurchaseService.selectVrHisPurchaseList(vrHisPurchase);
        ExcelUtil<VrHisPurchase> util = new ExcelUtil<VrHisPurchase>(VrHisPurchase.class);
        util.exportExcel(response, list, "采购信息数据");
    }

    /**
     * 获取采购信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('sales:purchase:query')")
    @GetMapping(value = "/{purchaseId}")
    public AjaxResult getInfo(@PathVariable("purchaseId") Integer purchaseId)
    {
        return AjaxResult.success(vrHisPurchaseService.selectVrHisPurchaseByPurchaseId(purchaseId));
    }

    /**
     * 新增采购信息
     */
    @PreAuthorize("@ss.hasPermi('sales:purchase:add')")
    @Log(title = "采购信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisPurchase vrHisPurchase)
    {
        return toAjax(vrHisPurchaseService.insertVrHisPurchase(vrHisPurchase));
    }

    /**
     * 修改采购信息
     */
    @PreAuthorize("@ss.hasPermi('sales:purchase:edit')")
    @Log(title = "采购信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisPurchase vrHisPurchase)
    {
        return toAjax(vrHisPurchaseService.updateVrHisPurchase(vrHisPurchase));
    }

    /**
     * 删除采购信息
     */
    @PreAuthorize("@ss.hasPermi('sales:purchase:remove')")
    @Log(title = "采购信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{purchaseIds}")
    public AjaxResult remove(@PathVariable Integer[] purchaseIds)
    {
        return toAjax(vrHisPurchaseService.deleteVrHisPurchaseByPurchaseIds(purchaseIds));
    }
}
