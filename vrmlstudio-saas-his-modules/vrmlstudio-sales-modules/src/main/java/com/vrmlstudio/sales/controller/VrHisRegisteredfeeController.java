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
import com.vrmlstudio.sales.domain.VrHisRegisteredfee;
import com.vrmlstudio.sales.service.IVrHisRegisteredfeeService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 挂号费用Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/sales/registeredfee")
public class VrHisRegisteredfeeController extends BaseController
{
    @Autowired
    private IVrHisRegisteredfeeService vrHisRegisteredfeeService;

    /**
     * 查询挂号费用列表
     */
    @PreAuthorize("@ss.hasPermi('sales:registeredfee:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisRegisteredfee vrHisRegisteredfee)
    {
        startPage();
        List<VrHisRegisteredfee> list = vrHisRegisteredfeeService.selectVrHisRegisteredfeeList(vrHisRegisteredfee);
        return getDataTable(list);
    }

    /**
     * 导出挂号费用列表
     */
    @PreAuthorize("@ss.hasPermi('sales:registeredfee:export')")
    @Log(title = "挂号费用", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisRegisteredfee vrHisRegisteredfee)
    {
        List<VrHisRegisteredfee> list = vrHisRegisteredfeeService.selectVrHisRegisteredfeeList(vrHisRegisteredfee);
        ExcelUtil<VrHisRegisteredfee> util = new ExcelUtil<VrHisRegisteredfee>(VrHisRegisteredfee.class);
        util.exportExcel(response, list, "挂号费用数据");
    }

    /**
     * 获取挂号费用详细信息
     */
    @PreAuthorize("@ss.hasPermi('sales:registeredfee:query')")
    @GetMapping(value = "/{regId}")
    public AjaxResult getInfo(@PathVariable("regId") Long regId)
    {
        return AjaxResult.success(vrHisRegisteredfeeService.selectVrHisRegisteredfeeByRegId(regId));
    }

    /**
     * 新增挂号费用
     */
    @PreAuthorize("@ss.hasPermi('sales:registeredfee:add')")
    @Log(title = "挂号费用", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisRegisteredfee vrHisRegisteredfee)
    {
        return toAjax(vrHisRegisteredfeeService.insertVrHisRegisteredfee(vrHisRegisteredfee));
    }

    /**
     * 修改挂号费用
     */
    @PreAuthorize("@ss.hasPermi('sales:registeredfee:edit')")
    @Log(title = "挂号费用", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisRegisteredfee vrHisRegisteredfee)
    {
        return toAjax(vrHisRegisteredfeeService.updateVrHisRegisteredfee(vrHisRegisteredfee));
    }

    /**
     * 删除挂号费用
     */
    @PreAuthorize("@ss.hasPermi('sales:registeredfee:remove')")
    @Log(title = "挂号费用", businessType = BusinessType.DELETE)
	@DeleteMapping("/{regIds}")
    public AjaxResult remove(@PathVariable Long[] regIds)
    {
        return toAjax(vrHisRegisteredfeeService.deleteVrHisRegisteredfeeByRegIds(regIds));
    }
}
