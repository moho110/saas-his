package com.vrmlstudio.department.controller;

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
import com.vrmlstudio.department.domain.VrHisWorkLog;
import com.vrmlstudio.department.service.IVrHisWorkLogService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 重要操作记录Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/basic/work_log")
public class VrHisWorkLogController extends BaseController
{
    @Autowired
    private IVrHisWorkLogService vrHisWorkLogService;

    /**
     * 查询重要操作记录列表
     */
    @PreAuthorize("@ss.hasPermi('basic:work_log:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisWorkLog vrHisWorkLog)
    {
        startPage();
        List<VrHisWorkLog> list = vrHisWorkLogService.selectVrHisWorkLogList(vrHisWorkLog);
        return getDataTable(list);
    }

    /**
     * 导出重要操作记录列表
     */
    @PreAuthorize("@ss.hasPermi('basic:work_log:export')")
    @Log(title = "重要操作记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisWorkLog vrHisWorkLog)
    {
        List<VrHisWorkLog> list = vrHisWorkLogService.selectVrHisWorkLogList(vrHisWorkLog);
        ExcelUtil<VrHisWorkLog> util = new ExcelUtil<VrHisWorkLog>(VrHisWorkLog.class);
        util.exportExcel(response, list, "重要操作记录数据");
    }

    /**
     * 获取重要操作记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('basic:work_log:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(vrHisWorkLogService.selectVrHisWorkLogById(id));
    }

    /**
     * 新增重要操作记录
     */
    @PreAuthorize("@ss.hasPermi('basic:work_log:add')")
    @Log(title = "重要操作记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisWorkLog vrHisWorkLog)
    {
        return toAjax(vrHisWorkLogService.insertVrHisWorkLog(vrHisWorkLog));
    }

    /**
     * 修改重要操作记录
     */
    @PreAuthorize("@ss.hasPermi('basic:work_log:edit')")
    @Log(title = "重要操作记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisWorkLog vrHisWorkLog)
    {
        return toAjax(vrHisWorkLogService.updateVrHisWorkLog(vrHisWorkLog));
    }

    /**
     * 删除重要操作记录
     */
    @PreAuthorize("@ss.hasPermi('basic:work_log:remove')")
    @Log(title = "重要操作记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(vrHisWorkLogService.deleteVrHisWorkLogByIds(ids));
    }
}
