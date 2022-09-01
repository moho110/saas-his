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
import com.vrmlstudio.person.domain.VrHisDemoPatient;
import com.vrmlstudio.person.service.IVrHisDemoPatientService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 公众数据--患者Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/person/patient")
public class VrHisDemoPatientController extends BaseController
{
    @Autowired
    private IVrHisDemoPatientService vrHisDemoPatientService;

    /**
     * 查询公众数据--患者列表
     */
    @PreAuthorize("@ss.hasPermi('person:patient:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisDemoPatient vrHisDemoPatient)
    {
        startPage();
        List<VrHisDemoPatient> list = vrHisDemoPatientService.selectVrHisDemoPatientList(vrHisDemoPatient);
        return getDataTable(list);
    }

    /**
     * 导出公众数据--患者列表
     */
    @PreAuthorize("@ss.hasPermi('person:patient:export')")
    @Log(title = "公众数据--患者", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisDemoPatient vrHisDemoPatient)
    {
        List<VrHisDemoPatient> list = vrHisDemoPatientService.selectVrHisDemoPatientList(vrHisDemoPatient);
        ExcelUtil<VrHisDemoPatient> util = new ExcelUtil<VrHisDemoPatient>(VrHisDemoPatient.class);
        util.exportExcel(response, list, "公众数据--患者数据");
    }

    /**
     * 获取公众数据--患者详细信息
     */
    @PreAuthorize("@ss.hasPermi('person:patient:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(vrHisDemoPatientService.selectVrHisDemoPatientById(id));
    }

    /**
     * 新增公众数据--患者
     */
    @PreAuthorize("@ss.hasPermi('person:patient:add')")
    @Log(title = "公众数据--患者", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisDemoPatient vrHisDemoPatient)
    {
        return toAjax(vrHisDemoPatientService.insertVrHisDemoPatient(vrHisDemoPatient));
    }

    /**
     * 修改公众数据--患者
     */
    @PreAuthorize("@ss.hasPermi('person:patient:edit')")
    @Log(title = "公众数据--患者", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisDemoPatient vrHisDemoPatient)
    {
        return toAjax(vrHisDemoPatientService.updateVrHisDemoPatient(vrHisDemoPatient));
    }

    /**
     * 删除公众数据--患者
     */
    @PreAuthorize("@ss.hasPermi('person:patient:remove')")
    @Log(title = "公众数据--患者", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(vrHisDemoPatientService.deleteVrHisDemoPatientByIds(ids));
    }
}
