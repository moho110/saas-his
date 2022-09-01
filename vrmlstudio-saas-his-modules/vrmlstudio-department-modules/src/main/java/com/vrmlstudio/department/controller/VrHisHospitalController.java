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
import com.vrmlstudio.department.domain.VrHisHospital;
import com.vrmlstudio.department.service.IVrHisHospitalService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * HIS医院基本信息Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/department/vr_his_hospital")
public class VrHisHospitalController extends BaseController
{
    @Autowired
    private IVrHisHospitalService vrHisHospitalService;

    /**
     * 查询HIS医院基本信息列表
     */
    @PreAuthorize("@ss.hasPermi('department:vr_his_hospital:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisHospital vrHisHospital)
    {
        startPage();
        List<VrHisHospital> list = vrHisHospitalService.selectVrHisHospitalList(vrHisHospital);
        return getDataTable(list);
    }

    /**
     * 导出HIS医院基本信息列表
     */
    @PreAuthorize("@ss.hasPermi('department:vr_his_hospital:export')")
    @Log(title = "HIS医院基本信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisHospital vrHisHospital)
    {
        List<VrHisHospital> list = vrHisHospitalService.selectVrHisHospitalList(vrHisHospital);
        ExcelUtil<VrHisHospital> util = new ExcelUtil<VrHisHospital>(VrHisHospital.class);
        util.exportExcel(response, list, "HIS医院基本信息数据");
    }

    /**
     * 获取HIS医院基本信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('department:vr_his_hospital:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(vrHisHospitalService.selectVrHisHospitalById(id));
    }

    /**
     * 新增HIS医院基本信息
     */
    @PreAuthorize("@ss.hasPermi('department:vr_his_hospital:add')")
    @Log(title = "HIS医院基本信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisHospital vrHisHospital)
    {
        return toAjax(vrHisHospitalService.insertVrHisHospital(vrHisHospital));
    }

    /**
     * 修改HIS医院基本信息
     */
    @PreAuthorize("@ss.hasPermi('department:vr_his_hospital:edit')")
    @Log(title = "HIS医院基本信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisHospital vrHisHospital)
    {
        return toAjax(vrHisHospitalService.updateVrHisHospital(vrHisHospital));
    }

    /**
     * 删除HIS医院基本信息
     */
    @PreAuthorize("@ss.hasPermi('department:vr_his_hospital:remove')")
    @Log(title = "HIS医院基本信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(vrHisHospitalService.deleteVrHisHospitalByIds(ids));
    }
}
