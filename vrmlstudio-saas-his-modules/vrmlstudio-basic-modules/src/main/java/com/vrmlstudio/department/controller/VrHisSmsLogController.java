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
import com.vrmlstudio.department.domain.VrHisSmsLog;
import com.vrmlstudio.department.service.IVrHisSmsLogService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 短信发送记录Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/basic/sms_log")
public class VrHisSmsLogController extends BaseController
{
    @Autowired
    private IVrHisSmsLogService vrHisSmsLogService;

    /**
     * 查询短信发送记录列表
     */
    @PreAuthorize("@ss.hasPermi('basic:sms_log:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisSmsLog vrHisSmsLog)
    {
        startPage();
        List<VrHisSmsLog> list = vrHisSmsLogService.selectVrHisSmsLogList(vrHisSmsLog);
        return getDataTable(list);
    }

    /**
     * 导出短信发送记录列表
     */
    @PreAuthorize("@ss.hasPermi('basic:sms_log:export')")
    @Log(title = "短信发送记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisSmsLog vrHisSmsLog)
    {
        List<VrHisSmsLog> list = vrHisSmsLogService.selectVrHisSmsLogList(vrHisSmsLog);
        ExcelUtil<VrHisSmsLog> util = new ExcelUtil<VrHisSmsLog>(VrHisSmsLog.class);
        util.exportExcel(response, list, "短信发送记录数据");
    }

    /**
     * 获取短信发送记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('basic:sms_log:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(vrHisSmsLogService.selectVrHisSmsLogById(id));
    }

    /**
     * 新增短信发送记录
     */
    @PreAuthorize("@ss.hasPermi('basic:sms_log:add')")
    @Log(title = "短信发送记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisSmsLog vrHisSmsLog)
    {
        return toAjax(vrHisSmsLogService.insertVrHisSmsLog(vrHisSmsLog));
    }

    /**
     * 修改短信发送记录
     */
    @PreAuthorize("@ss.hasPermi('basic:sms_log:edit')")
    @Log(title = "短信发送记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisSmsLog vrHisSmsLog)
    {
        return toAjax(vrHisSmsLogService.updateVrHisSmsLog(vrHisSmsLog));
    }

    /**
     * 删除短信发送记录
     */
    @PreAuthorize("@ss.hasPermi('basic:sms_log:remove')")
    @Log(title = "短信发送记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(vrHisSmsLogService.deleteVrHisSmsLogByIds(ids));
    }
}
