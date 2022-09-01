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
import com.vrmlstudio.sales.domain.VrHisCarePaylog;
import com.vrmlstudio.sales.service.IVrHisCarePaylogService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 支付收费记录Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/sales/care_paylog")
public class VrHisCarePaylogController extends BaseController
{
    @Autowired
    private IVrHisCarePaylogService vrHisCarePaylogService;

    /**
     * 查询支付收费记录列表
     */
    @PreAuthorize("@ss.hasPermi('sales:care_paylog:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisCarePaylog vrHisCarePaylog)
    {
        startPage();
        List<VrHisCarePaylog> list = vrHisCarePaylogService.selectVrHisCarePaylogList(vrHisCarePaylog);
        return getDataTable(list);
    }

    /**
     * 导出支付收费记录列表
     */
    @PreAuthorize("@ss.hasPermi('sales:care_paylog:export')")
    @Log(title = "支付收费记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisCarePaylog vrHisCarePaylog)
    {
        List<VrHisCarePaylog> list = vrHisCarePaylogService.selectVrHisCarePaylogList(vrHisCarePaylog);
        ExcelUtil<VrHisCarePaylog> util = new ExcelUtil<VrHisCarePaylog>(VrHisCarePaylog.class);
        util.exportExcel(response, list, "支付收费记录数据");
    }

    /**
     * 获取支付收费记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('sales:care_paylog:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(vrHisCarePaylogService.selectVrHisCarePaylogById(id));
    }

    /**
     * 新增支付收费记录
     */
    @PreAuthorize("@ss.hasPermi('sales:care_paylog:add')")
    @Log(title = "支付收费记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisCarePaylog vrHisCarePaylog)
    {
        return toAjax(vrHisCarePaylogService.insertVrHisCarePaylog(vrHisCarePaylog));
    }

    /**
     * 修改支付收费记录
     */
    @PreAuthorize("@ss.hasPermi('sales:care_paylog:edit')")
    @Log(title = "支付收费记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisCarePaylog vrHisCarePaylog)
    {
        return toAjax(vrHisCarePaylogService.updateVrHisCarePaylog(vrHisCarePaylog));
    }

    /**
     * 删除支付收费记录
     */
    @PreAuthorize("@ss.hasPermi('sales:care_paylog:remove')")
    @Log(title = "支付收费记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(vrHisCarePaylogService.deleteVrHisCarePaylogByIds(ids));
    }
}
