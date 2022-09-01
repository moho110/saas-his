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
import com.vrmlstudio.xsystem.domain.VrHisPatientFile;
import com.vrmlstudio.xsystem.service.IVrHisPatientFileService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 患者用户档案Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/xsystem/vr_his_patient_file")
public class VrHisPatientFileController extends BaseController
{
    @Autowired
    private IVrHisPatientFileService vrHisPatientFileService;

    /**
     * 查询患者用户档案列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:vr_his_patient_file:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisPatientFile vrHisPatientFile)
    {
        startPage();
        List<VrHisPatientFile> list = vrHisPatientFileService.selectVrHisPatientFileList(vrHisPatientFile);
        return getDataTable(list);
    }

    /**
     * 导出患者用户档案列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:vr_his_patient_file:export')")
    @Log(title = "患者用户档案", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisPatientFile vrHisPatientFile)
    {
        List<VrHisPatientFile> list = vrHisPatientFileService.selectVrHisPatientFileList(vrHisPatientFile);
        ExcelUtil<VrHisPatientFile> util = new ExcelUtil<VrHisPatientFile>(VrHisPatientFile.class);
        util.exportExcel(response, list, "患者用户档案数据");
    }

    /**
     * 获取患者用户档案详细信息
     */
    @PreAuthorize("@ss.hasPermi('xsystem:vr_his_patient_file:query')")
    @GetMapping(value = "/{fileId}")
    public AjaxResult getInfo(@PathVariable("fileId") Long fileId)
    {
        return AjaxResult.success(vrHisPatientFileService.selectVrHisPatientFileByFileId(fileId));
    }

    /**
     * 新增患者用户档案
     */
    @PreAuthorize("@ss.hasPermi('xsystem:vr_his_patient_file:add')")
    @Log(title = "患者用户档案", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisPatientFile vrHisPatientFile)
    {
        return toAjax(vrHisPatientFileService.insertVrHisPatientFile(vrHisPatientFile));
    }

    /**
     * 修改患者用户档案
     */
    @PreAuthorize("@ss.hasPermi('xsystem:vr_his_patient_file:edit')")
    @Log(title = "患者用户档案", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisPatientFile vrHisPatientFile)
    {
        return toAjax(vrHisPatientFileService.updateVrHisPatientFile(vrHisPatientFile));
    }

    /**
     * 删除患者用户档案
     */
    @PreAuthorize("@ss.hasPermi('xsystem:vr_his_patient_file:remove')")
    @Log(title = "患者用户档案", businessType = BusinessType.DELETE)
	@DeleteMapping("/{fileIds}")
    public AjaxResult remove(@PathVariable Long[] fileIds)
    {
        return toAjax(vrHisPatientFileService.deleteVrHisPatientFileByFileIds(fileIds));
    }
}
