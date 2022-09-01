package com.vrmlstudio.xsystem.controller;

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
import com.vrmlstudio.xsystem.domain.VrHisOperationLog;
import com.vrmlstudio.xsystem.service.IVrHisOperationLogService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 诊所系统操作记录Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/xsystem/operation_log")
public class VrHisOperationLogController extends BaseController
{
    @Autowired
    private IVrHisOperationLogService vrHisOperationLogService;

    /**
     * 查询诊所系统操作记录列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:operation_log:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisOperationLog vrHisOperationLog)
    {
        startPage();
        List<VrHisOperationLog> list = vrHisOperationLogService.selectVrHisOperationLogList(vrHisOperationLog);
        return getDataTable(list);
    }

    /**
     * 导出诊所系统操作记录列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:operation_log:export')")
    @Log(title = "诊所系统操作记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisOperationLog vrHisOperationLog)
    {
        List<VrHisOperationLog> list = vrHisOperationLogService.selectVrHisOperationLogList(vrHisOperationLog);
        ExcelUtil<VrHisOperationLog> util = new ExcelUtil<VrHisOperationLog>(VrHisOperationLog.class);
        util.exportExcel(response, list, "诊所系统操作记录数据");
    }

    /**
     * 获取诊所系统操作记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('xsystem:operation_log:query')")
    @GetMapping(value = "/{oid}")
    public AjaxResult getInfo(@PathVariable("oid") Long oid)
    {
        return AjaxResult.success(vrHisOperationLogService.selectVrHisOperationLogByOid(oid));
    }

    /**
     * 新增诊所系统操作记录
     */
    @PreAuthorize("@ss.hasPermi('xsystem:operation_log:add')")
    @Log(title = "诊所系统操作记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisOperationLog vrHisOperationLog)
    {
        return toAjax(vrHisOperationLogService.insertVrHisOperationLog(vrHisOperationLog));
    }

    /**
     * 修改诊所系统操作记录
     */
    @PreAuthorize("@ss.hasPermi('xsystem:operation_log:edit')")
    @Log(title = "诊所系统操作记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisOperationLog vrHisOperationLog)
    {
        return toAjax(vrHisOperationLogService.updateVrHisOperationLog(vrHisOperationLog));
    }

    /**
     * 删除诊所系统操作记录
     */
    @PreAuthorize("@ss.hasPermi('xsystem:operation_log:remove')")
    @Log(title = "诊所系统操作记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{oids}")
    public AjaxResult remove(@PathVariable Long[] oids)
    {
        return toAjax(vrHisOperationLogService.deleteVrHisOperationLogByOids(oids));
    }
}
