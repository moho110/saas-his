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
import com.vrmlstudio.sales.domain.VrHisCashOut;
import com.vrmlstudio.sales.service.IVrHisCashOutService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 用户提现申请Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/sales/cash_out")
public class VrHisCashOutController extends BaseController
{
    @Autowired
    private IVrHisCashOutService vrHisCashOutService;

    /**
     * 查询用户提现申请列表
     */
    @PreAuthorize("@ss.hasPermi('sales:cash_out:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisCashOut vrHisCashOut)
    {
        startPage();
        List<VrHisCashOut> list = vrHisCashOutService.selectVrHisCashOutList(vrHisCashOut);
        return getDataTable(list);
    }

    /**
     * 导出用户提现申请列表
     */
    @PreAuthorize("@ss.hasPermi('sales:cash_out:export')")
    @Log(title = "用户提现申请", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisCashOut vrHisCashOut)
    {
        List<VrHisCashOut> list = vrHisCashOutService.selectVrHisCashOutList(vrHisCashOut);
        ExcelUtil<VrHisCashOut> util = new ExcelUtil<VrHisCashOut>(VrHisCashOut.class);
        util.exportExcel(response, list, "用户提现申请数据");
    }

    /**
     * 获取用户提现申请详细信息
     */
    @PreAuthorize("@ss.hasPermi('sales:cash_out:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(vrHisCashOutService.selectVrHisCashOutById(id));
    }

    /**
     * 新增用户提现申请
     */
    @PreAuthorize("@ss.hasPermi('sales:cash_out:add')")
    @Log(title = "用户提现申请", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisCashOut vrHisCashOut)
    {
        return toAjax(vrHisCashOutService.insertVrHisCashOut(vrHisCashOut));
    }

    /**
     * 修改用户提现申请
     */
    @PreAuthorize("@ss.hasPermi('sales:cash_out:edit')")
    @Log(title = "用户提现申请", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisCashOut vrHisCashOut)
    {
        return toAjax(vrHisCashOutService.updateVrHisCashOut(vrHisCashOut));
    }

    /**
     * 删除用户提现申请
     */
    @PreAuthorize("@ss.hasPermi('sales:cash_out:remove')")
    @Log(title = "用户提现申请", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(vrHisCashOutService.deleteVrHisCashOutByIds(ids));
    }
}
