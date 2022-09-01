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
import com.vrmlstudio.sales.domain.VrHisCareOrderSub;
import com.vrmlstudio.sales.service.IVrHisCareOrderSubService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 开诊用药明细Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/sales/care_order_sub")
public class VrHisCareOrderSubController extends BaseController
{
    @Autowired
    private IVrHisCareOrderSubService vrHisCareOrderSubService;

    /**
     * 查询开诊用药明细列表
     */
    @PreAuthorize("@ss.hasPermi('sales:care_order_sub:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisCareOrderSub vrHisCareOrderSub)
    {
        startPage();
        List<VrHisCareOrderSub> list = vrHisCareOrderSubService.selectVrHisCareOrderSubList(vrHisCareOrderSub);
        return getDataTable(list);
    }

    /**
     * 导出开诊用药明细列表
     */
    @PreAuthorize("@ss.hasPermi('sales:care_order_sub:export')")
    @Log(title = "开诊用药明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisCareOrderSub vrHisCareOrderSub)
    {
        List<VrHisCareOrderSub> list = vrHisCareOrderSubService.selectVrHisCareOrderSubList(vrHisCareOrderSub);
        ExcelUtil<VrHisCareOrderSub> util = new ExcelUtil<VrHisCareOrderSub>(VrHisCareOrderSub.class);
        util.exportExcel(response, list, "开诊用药明细数据");
    }

    /**
     * 获取开诊用药明细详细信息
     */
    @PreAuthorize("@ss.hasPermi('sales:care_order_sub:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(vrHisCareOrderSubService.selectVrHisCareOrderSubById(id));
    }

    /**
     * 新增开诊用药明细
     */
    @PreAuthorize("@ss.hasPermi('sales:care_order_sub:add')")
    @Log(title = "开诊用药明细", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisCareOrderSub vrHisCareOrderSub)
    {
        return toAjax(vrHisCareOrderSubService.insertVrHisCareOrderSub(vrHisCareOrderSub));
    }

    /**
     * 修改开诊用药明细
     */
    @PreAuthorize("@ss.hasPermi('sales:care_order_sub:edit')")
    @Log(title = "开诊用药明细", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisCareOrderSub vrHisCareOrderSub)
    {
        return toAjax(vrHisCareOrderSubService.updateVrHisCareOrderSub(vrHisCareOrderSub));
    }

    /**
     * 删除开诊用药明细
     */
    @PreAuthorize("@ss.hasPermi('sales:care_order_sub:remove')")
    @Log(title = "开诊用药明细", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(vrHisCareOrderSubService.deleteVrHisCareOrderSubByIds(ids));
    }
}
