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
import com.vrmlstudio.sales.domain.VrHisMchpay;
import com.vrmlstudio.sales.service.IVrHisMchpayService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 提现付款记录，微信企业付款记录Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/sales/mchpay")
public class VrHisMchpayController extends BaseController
{
    @Autowired
    private IVrHisMchpayService vrHisMchpayService;

    /**
     * 查询提现付款记录，微信企业付款记录列表
     */
    @PreAuthorize("@ss.hasPermi('sales:mchpay:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisMchpay vrHisMchpay)
    {
        startPage();
        List<VrHisMchpay> list = vrHisMchpayService.selectVrHisMchpayList(vrHisMchpay);
        return getDataTable(list);
    }

    /**
     * 导出提现付款记录，微信企业付款记录列表
     */
    @PreAuthorize("@ss.hasPermi('sales:mchpay:export')")
    @Log(title = "提现付款记录，微信企业付款记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisMchpay vrHisMchpay)
    {
        List<VrHisMchpay> list = vrHisMchpayService.selectVrHisMchpayList(vrHisMchpay);
        ExcelUtil<VrHisMchpay> util = new ExcelUtil<VrHisMchpay>(VrHisMchpay.class);
        util.exportExcel(response, list, "提现付款记录，微信企业付款记录数据");
    }

    /**
     * 获取提现付款记录，微信企业付款记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('sales:mchpay:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(vrHisMchpayService.selectVrHisMchpayById(id));
    }

    /**
     * 新增提现付款记录，微信企业付款记录
     */
    @PreAuthorize("@ss.hasPermi('sales:mchpay:add')")
    @Log(title = "提现付款记录，微信企业付款记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisMchpay vrHisMchpay)
    {
        return toAjax(vrHisMchpayService.insertVrHisMchpay(vrHisMchpay));
    }

    /**
     * 修改提现付款记录，微信企业付款记录
     */
    @PreAuthorize("@ss.hasPermi('sales:mchpay:edit')")
    @Log(title = "提现付款记录，微信企业付款记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisMchpay vrHisMchpay)
    {
        return toAjax(vrHisMchpayService.updateVrHisMchpay(vrHisMchpay));
    }

    /**
     * 删除提现付款记录，微信企业付款记录
     */
    @PreAuthorize("@ss.hasPermi('sales:mchpay:remove')")
    @Log(title = "提现付款记录，微信企业付款记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(vrHisMchpayService.deleteVrHisMchpayByIds(ids));
    }
}
