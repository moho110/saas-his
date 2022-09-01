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
import com.vrmlstudio.department.domain.VrHisStorageLog;
import com.vrmlstudio.department.service.IVrHisStorageLogService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 入库操作log日志Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/basic/storage_log")
public class VrHisStorageLogController extends BaseController
{
    @Autowired
    private IVrHisStorageLogService vrHisStorageLogService;

    /**
     * 查询入库操作log日志列表
     */
    @PreAuthorize("@ss.hasPermi('basic:storage_log:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisStorageLog vrHisStorageLog)
    {
        startPage();
        List<VrHisStorageLog> list = vrHisStorageLogService.selectVrHisStorageLogList(vrHisStorageLog);
        return getDataTable(list);
    }

    /**
     * 导出入库操作log日志列表
     */
    @PreAuthorize("@ss.hasPermi('basic:storage_log:export')")
    @Log(title = "入库操作log日志", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisStorageLog vrHisStorageLog)
    {
        List<VrHisStorageLog> list = vrHisStorageLogService.selectVrHisStorageLogList(vrHisStorageLog);
        ExcelUtil<VrHisStorageLog> util = new ExcelUtil<VrHisStorageLog>(VrHisStorageLog.class);
        util.exportExcel(response, list, "入库操作log日志数据");
    }

    /**
     * 获取入库操作log日志详细信息
     */
    @PreAuthorize("@ss.hasPermi('basic:storage_log:query')")
    @GetMapping(value = "/{logId}")
    public AjaxResult getInfo(@PathVariable("logId") Integer logId)
    {
        return AjaxResult.success(vrHisStorageLogService.selectVrHisStorageLogByLogId(logId));
    }

    /**
     * 新增入库操作log日志
     */
    @PreAuthorize("@ss.hasPermi('basic:storage_log:add')")
    @Log(title = "入库操作log日志", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisStorageLog vrHisStorageLog)
    {
        return toAjax(vrHisStorageLogService.insertVrHisStorageLog(vrHisStorageLog));
    }

    /**
     * 修改入库操作log日志
     */
    @PreAuthorize("@ss.hasPermi('basic:storage_log:edit')")
    @Log(title = "入库操作log日志", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisStorageLog vrHisStorageLog)
    {
        return toAjax(vrHisStorageLogService.updateVrHisStorageLog(vrHisStorageLog));
    }

    /**
     * 删除入库操作log日志
     */
    @PreAuthorize("@ss.hasPermi('basic:storage_log:remove')")
    @Log(title = "入库操作log日志", businessType = BusinessType.DELETE)
	@DeleteMapping("/{logIds}")
    public AjaxResult remove(@PathVariable Integer[] logIds)
    {
        return toAjax(vrHisStorageLogService.deleteVrHisStorageLogByLogIds(logIds));
    }
}
