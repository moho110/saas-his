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
import com.vrmlstudio.sales.domain.VrHisCareOrder;
import com.vrmlstudio.sales.service.IVrHisCareOrderService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 处方列Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/sales/care_order")
public class VrHisCareOrderController extends BaseController
{
    @Autowired
    private IVrHisCareOrderService vrHisCareOrderService;

    /**
     * 查询处方列列表
     */
    @PreAuthorize("@ss.hasPermi('sales:care_order:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisCareOrder vrHisCareOrder)
    {
        startPage();
        List<VrHisCareOrder> list = vrHisCareOrderService.selectVrHisCareOrderList(vrHisCareOrder);
        return getDataTable(list);
    }

    /**
     * 导出处方列列表
     */
    @PreAuthorize("@ss.hasPermi('sales:care_order:export')")
    @Log(title = "处方列", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisCareOrder vrHisCareOrder)
    {
        List<VrHisCareOrder> list = vrHisCareOrderService.selectVrHisCareOrderList(vrHisCareOrder);
        ExcelUtil<VrHisCareOrder> util = new ExcelUtil<VrHisCareOrder>(VrHisCareOrder.class);
        util.exportExcel(response, list, "处方列数据");
    }

    /**
     * 获取处方列详细信息
     */
    @PreAuthorize("@ss.hasPermi('sales:care_order:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(vrHisCareOrderService.selectVrHisCareOrderById(id));
    }

    /**
     * 新增处方列
     */
    @PreAuthorize("@ss.hasPermi('sales:care_order:add')")
    @Log(title = "处方列", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisCareOrder vrHisCareOrder)
    {
        return toAjax(vrHisCareOrderService.insertVrHisCareOrder(vrHisCareOrder));
    }

    /**
     * 修改处方列
     */
    @PreAuthorize("@ss.hasPermi('sales:care_order:edit')")
    @Log(title = "处方列", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisCareOrder vrHisCareOrder)
    {
        return toAjax(vrHisCareOrderService.updateVrHisCareOrder(vrHisCareOrder));
    }

    /**
     * 删除处方列
     */
    @PreAuthorize("@ss.hasPermi('sales:care_order:remove')")
    @Log(title = "处方列", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(vrHisCareOrderService.deleteVrHisCareOrderByIds(ids));
    }
}
