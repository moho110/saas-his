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
import com.vrmlstudio.person.domain.VrHisDemoDoctor;
import com.vrmlstudio.person.service.IVrHisDemoDoctorService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 公示信息--医生Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/person/demo_doctor")
public class VrHisDemoDoctorController extends BaseController
{
    @Autowired
    private IVrHisDemoDoctorService vrHisDemoDoctorService;

    /**
     * 查询公示信息--医生列表
     */
    @PreAuthorize("@ss.hasPermi('person:demo_doctor:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisDemoDoctor vrHisDemoDoctor)
    {
        startPage();
        List<VrHisDemoDoctor> list = vrHisDemoDoctorService.selectVrHisDemoDoctorList(vrHisDemoDoctor);
        return getDataTable(list);
    }

    /**
     * 导出公示信息--医生列表
     */
    @PreAuthorize("@ss.hasPermi('person:demo_doctor:export')")
    @Log(title = "公示信息--医生", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisDemoDoctor vrHisDemoDoctor)
    {
        List<VrHisDemoDoctor> list = vrHisDemoDoctorService.selectVrHisDemoDoctorList(vrHisDemoDoctor);
        ExcelUtil<VrHisDemoDoctor> util = new ExcelUtil<VrHisDemoDoctor>(VrHisDemoDoctor.class);
        util.exportExcel(response, list, "公示信息--医生数据");
    }

    /**
     * 获取公示信息--医生详细信息
     */
    @PreAuthorize("@ss.hasPermi('person:demo_doctor:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(vrHisDemoDoctorService.selectVrHisDemoDoctorById(id));
    }

    /**
     * 新增公示信息--医生
     */
    @PreAuthorize("@ss.hasPermi('person:demo_doctor:add')")
    @Log(title = "公示信息--医生", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisDemoDoctor vrHisDemoDoctor)
    {
        return toAjax(vrHisDemoDoctorService.insertVrHisDemoDoctor(vrHisDemoDoctor));
    }

    /**
     * 修改公示信息--医生
     */
    @PreAuthorize("@ss.hasPermi('person:demo_doctor:edit')")
    @Log(title = "公示信息--医生", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisDemoDoctor vrHisDemoDoctor)
    {
        return toAjax(vrHisDemoDoctorService.updateVrHisDemoDoctor(vrHisDemoDoctor));
    }

    /**
     * 删除公示信息--医生
     */
    @PreAuthorize("@ss.hasPermi('person:demo_doctor:remove')")
    @Log(title = "公示信息--医生", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(vrHisDemoDoctorService.deleteVrHisDemoDoctorByIds(ids));
    }
}
