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
import com.vrmlstudio.sales.domain.VrHisRegisteredfeeSub;
import com.vrmlstudio.sales.service.IVrHisRegisteredfeeSubService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 挂号费用子Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/sales/registeredfee_sub")
public class VrHisRegisteredfeeSubController extends BaseController
{
    @Autowired
    private IVrHisRegisteredfeeSubService vrHisRegisteredfeeSubService;

    /**
     * 查询挂号费用子列表
     */
    @PreAuthorize("@ss.hasPermi('sales:registeredfee_sub:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisRegisteredfeeSub vrHisRegisteredfeeSub)
    {
        startPage();
        List<VrHisRegisteredfeeSub> list = vrHisRegisteredfeeSubService.selectVrHisRegisteredfeeSubList(vrHisRegisteredfeeSub);
        return getDataTable(list);
    }

    /**
     * 导出挂号费用子列表
     */
    @PreAuthorize("@ss.hasPermi('sales:registeredfee_sub:export')")
    @Log(title = "挂号费用子", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisRegisteredfeeSub vrHisRegisteredfeeSub)
    {
        List<VrHisRegisteredfeeSub> list = vrHisRegisteredfeeSubService.selectVrHisRegisteredfeeSubList(vrHisRegisteredfeeSub);
        ExcelUtil<VrHisRegisteredfeeSub> util = new ExcelUtil<VrHisRegisteredfeeSub>(VrHisRegisteredfeeSub.class);
        util.exportExcel(response, list, "挂号费用子数据");
    }

    /**
     * 获取挂号费用子详细信息
     */
    @PreAuthorize("@ss.hasPermi('sales:registeredfee_sub:query')")
    @GetMapping(value = "/{regSubId}")
    public AjaxResult getInfo(@PathVariable("regSubId") Integer regSubId)
    {
        return AjaxResult.success(vrHisRegisteredfeeSubService.selectVrHisRegisteredfeeSubByRegSubId(regSubId));
    }

    /**
     * 新增挂号费用子
     */
    @PreAuthorize("@ss.hasPermi('sales:registeredfee_sub:add')")
    @Log(title = "挂号费用子", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisRegisteredfeeSub vrHisRegisteredfeeSub)
    {
        return toAjax(vrHisRegisteredfeeSubService.insertVrHisRegisteredfeeSub(vrHisRegisteredfeeSub));
    }

    /**
     * 修改挂号费用子
     */
    @PreAuthorize("@ss.hasPermi('sales:registeredfee_sub:edit')")
    @Log(title = "挂号费用子", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisRegisteredfeeSub vrHisRegisteredfeeSub)
    {
        return toAjax(vrHisRegisteredfeeSubService.updateVrHisRegisteredfeeSub(vrHisRegisteredfeeSub));
    }

    /**
     * 删除挂号费用子
     */
    @PreAuthorize("@ss.hasPermi('sales:registeredfee_sub:remove')")
    @Log(title = "挂号费用子", businessType = BusinessType.DELETE)
	@DeleteMapping("/{regSubIds}")
    public AjaxResult remove(@PathVariable Integer[] regSubIds)
    {
        return toAjax(vrHisRegisteredfeeSubService.deleteVrHisRegisteredfeeSubByRegSubIds(regSubIds));
    }
}
