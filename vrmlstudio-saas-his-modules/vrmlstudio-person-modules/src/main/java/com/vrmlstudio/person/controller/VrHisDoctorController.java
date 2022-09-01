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
import com.vrmlstudio.person.domain.VrHisDoctor;
import com.vrmlstudio.person.service.IVrHisDoctorService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 医生基本信息Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/person/doctor")
public class VrHisDoctorController extends BaseController
{
    @Autowired
    private IVrHisDoctorService vrHisDoctorService;

    /**
     * 查询医生基本信息列表
     */
    @PreAuthorize("@ss.hasPermi('person:doctor:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisDoctor vrHisDoctor)
    {
        startPage();
        List<VrHisDoctor> list = vrHisDoctorService.selectVrHisDoctorList(vrHisDoctor);
        return getDataTable(list);
    }

    /**
     * 导出医生基本信息列表
     */
    @PreAuthorize("@ss.hasPermi('person:doctor:export')")
    @Log(title = "医生基本信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisDoctor vrHisDoctor)
    {
        List<VrHisDoctor> list = vrHisDoctorService.selectVrHisDoctorList(vrHisDoctor);
        ExcelUtil<VrHisDoctor> util = new ExcelUtil<VrHisDoctor>(VrHisDoctor.class);
        util.exportExcel(response, list, "医生基本信息数据");
    }

    /**
     * 获取医生基本信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('person:doctor:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(vrHisDoctorService.selectVrHisDoctorById(id));
    }

    /**
     * 新增医生基本信息
     */
    @PreAuthorize("@ss.hasPermi('person:doctor:add')")
    @Log(title = "医生基本信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisDoctor vrHisDoctor)
    {
        return toAjax(vrHisDoctorService.insertVrHisDoctor(vrHisDoctor));
    }

    /**
     * 修改医生基本信息
     */
    @PreAuthorize("@ss.hasPermi('person:doctor:edit')")
    @Log(title = "医生基本信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisDoctor vrHisDoctor)
    {
        return toAjax(vrHisDoctorService.updateVrHisDoctor(vrHisDoctor));
    }

    /**
     * 删除医生基本信息
     */
    @PreAuthorize("@ss.hasPermi('person:doctor:remove')")
    @Log(title = "医生基本信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(vrHisDoctorService.deleteVrHisDoctorByIds(ids));
    }
}
