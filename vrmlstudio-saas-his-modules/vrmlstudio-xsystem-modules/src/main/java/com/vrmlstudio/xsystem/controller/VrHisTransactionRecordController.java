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
import com.vrmlstudio.xsystem.domain.VrHisTransactionRecord;
import com.vrmlstudio.xsystem.service.IVrHisTransactionRecordService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 用户收支记录Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/xsystem/transaction_record")
public class VrHisTransactionRecordController extends BaseController
{
    @Autowired
    private IVrHisTransactionRecordService vrHisTransactionRecordService;

    /**
     * 查询用户收支记录列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:transaction_record:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisTransactionRecord vrHisTransactionRecord)
    {
        startPage();
        List<VrHisTransactionRecord> list = vrHisTransactionRecordService.selectVrHisTransactionRecordList(vrHisTransactionRecord);
        return getDataTable(list);
    }

    /**
     * 导出用户收支记录列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:transaction_record:export')")
    @Log(title = "用户收支记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisTransactionRecord vrHisTransactionRecord)
    {
        List<VrHisTransactionRecord> list = vrHisTransactionRecordService.selectVrHisTransactionRecordList(vrHisTransactionRecord);
        ExcelUtil<VrHisTransactionRecord> util = new ExcelUtil<VrHisTransactionRecord>(VrHisTransactionRecord.class);
        util.exportExcel(response, list, "用户收支记录数据");
    }

    /**
     * 获取用户收支记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('xsystem:transaction_record:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(vrHisTransactionRecordService.selectVrHisTransactionRecordById(id));
    }

    /**
     * 新增用户收支记录
     */
    @PreAuthorize("@ss.hasPermi('xsystem:transaction_record:add')")
    @Log(title = "用户收支记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisTransactionRecord vrHisTransactionRecord)
    {
        return toAjax(vrHisTransactionRecordService.insertVrHisTransactionRecord(vrHisTransactionRecord));
    }

    /**
     * 修改用户收支记录
     */
    @PreAuthorize("@ss.hasPermi('xsystem:transaction_record:edit')")
    @Log(title = "用户收支记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisTransactionRecord vrHisTransactionRecord)
    {
        return toAjax(vrHisTransactionRecordService.updateVrHisTransactionRecord(vrHisTransactionRecord));
    }

    /**
     * 删除用户收支记录
     */
    @PreAuthorize("@ss.hasPermi('xsystem:transaction_record:remove')")
    @Log(title = "用户收支记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(vrHisTransactionRecordService.deleteVrHisTransactionRecordByIds(ids));
    }
}
