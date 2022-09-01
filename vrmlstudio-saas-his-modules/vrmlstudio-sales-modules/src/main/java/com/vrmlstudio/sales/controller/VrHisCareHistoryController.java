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
import com.vrmlstudio.sales.domain.VrHisCareHistory;
import com.vrmlstudio.sales.service.IVrHisCareHistoryService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 历史病历Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/sales/care_history")
public class VrHisCareHistoryController extends BaseController
{
    @Autowired
    private IVrHisCareHistoryService vrHisCareHistoryService;

    /**
     * 查询历史病历列表
     */
    @PreAuthorize("@ss.hasPermi('sales:care_history:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisCareHistory vrHisCareHistory)
    {
        startPage();
        List<VrHisCareHistory> list = vrHisCareHistoryService.selectVrHisCareHistoryList(vrHisCareHistory);
        return getDataTable(list);
    }

    /**
     * 导出历史病历列表
     */
    @PreAuthorize("@ss.hasPermi('sales:care_history:export')")
    @Log(title = "历史病历", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisCareHistory vrHisCareHistory)
    {
        List<VrHisCareHistory> list = vrHisCareHistoryService.selectVrHisCareHistoryList(vrHisCareHistory);
        ExcelUtil<VrHisCareHistory> util = new ExcelUtil<VrHisCareHistory>(VrHisCareHistory.class);
        util.exportExcel(response, list, "历史病历数据");
    }

    /**
     * 获取历史病历详细信息
     */
    @PreAuthorize("@ss.hasPermi('sales:care_history:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(vrHisCareHistoryService.selectVrHisCareHistoryById(id));
    }

    /**
     * 新增历史病历
     */
    @PreAuthorize("@ss.hasPermi('sales:care_history:add')")
    @Log(title = "历史病历", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisCareHistory vrHisCareHistory)
    {
        return toAjax(vrHisCareHistoryService.insertVrHisCareHistory(vrHisCareHistory));
    }

    /**
     * 修改历史病历
     */
    @PreAuthorize("@ss.hasPermi('sales:care_history:edit')")
    @Log(title = "历史病历", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisCareHistory vrHisCareHistory)
    {
        return toAjax(vrHisCareHistoryService.updateVrHisCareHistory(vrHisCareHistory));
    }

    /**
     * 删除历史病历
     */
    @PreAuthorize("@ss.hasPermi('sales:care_history:remove')")
    @Log(title = "历史病历", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(vrHisCareHistoryService.deleteVrHisCareHistoryByIds(ids));
    }
}
