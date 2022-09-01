package com.vrmlstudio.person.controller;

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
import com.vrmlstudio.person.domain.VrPatient;
import com.vrmlstudio.person.service.IVrPatientService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 患者用户Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/person/patient")
public class VrPatientController extends BaseController
{
    @Autowired
    private IVrPatientService vrPatientService;

    /**
     * 查询患者用户列表
     */
    @PreAuthorize("@ss.hasPermi('person:patient:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrPatient vrPatient)
    {
        startPage();
        List<VrPatient> list = vrPatientService.selectVrPatientList(vrPatient);
        return getDataTable(list);
    }

    /**
     * 导出患者用户列表
     */
    @PreAuthorize("@ss.hasPermi('person:patient:export')")
    @Log(title = "患者用户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrPatient vrPatient)
    {
        List<VrPatient> list = vrPatientService.selectVrPatientList(vrPatient);
        ExcelUtil<VrPatient> util = new ExcelUtil<VrPatient>(VrPatient.class);
        util.exportExcel(response, list, "患者用户数据");
    }

    /**
     * 获取患者用户详细信息
     */
    @PreAuthorize("@ss.hasPermi('person:patient:query')")
    @GetMapping(value = "/{patientId}")
    public AjaxResult getInfo(@PathVariable("patientId") Long patientId)
    {
        return AjaxResult.success(vrPatientService.selectVrPatientByPatientId(patientId));
    }

    /**
     * 新增患者用户
     */
    @PreAuthorize("@ss.hasPermi('person:patient:add')")
    @Log(title = "患者用户", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrPatient vrPatient)
    {
        return toAjax(vrPatientService.insertVrPatient(vrPatient));
    }

    /**
     * 修改患者用户
     */
    @PreAuthorize("@ss.hasPermi('person:patient:edit')")
    @Log(title = "患者用户", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrPatient vrPatient)
    {
        return toAjax(vrPatientService.updateVrPatient(vrPatient));
    }

    /**
     * 删除患者用户
     */
    @PreAuthorize("@ss.hasPermi('person:patient:remove')")
    @Log(title = "患者用户", businessType = BusinessType.DELETE)
	@DeleteMapping("/{patientIds}")
    public AjaxResult remove(@PathVariable Long[] patientIds)
    {
        return toAjax(vrPatientService.deleteVrPatientByPatientIds(patientIds));
    }
}
