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
import com.vrmlstudio.department.domain.VrHisHospitalDoctorRelation;
import com.vrmlstudio.department.service.IVrHisHospitalDoctorRelationService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 医生与医院关联Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/department/hospital_doctor_relation")
public class VrHisHospitalDoctorRelationController extends BaseController
{
    @Autowired
    private IVrHisHospitalDoctorRelationService vrHisHospitalDoctorRelationService;

    /**
     * 查询医生与医院关联列表
     */
    @PreAuthorize("@ss.hasPermi('department:hospital_doctor_relation:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisHospitalDoctorRelation vrHisHospitalDoctorRelation)
    {
        startPage();
        List<VrHisHospitalDoctorRelation> list = vrHisHospitalDoctorRelationService.selectVrHisHospitalDoctorRelationList(vrHisHospitalDoctorRelation);
        return getDataTable(list);
    }

    /**
     * 导出医生与医院关联列表
     */
    @PreAuthorize("@ss.hasPermi('department:hospital_doctor_relation:export')")
    @Log(title = "医生与医院关联", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisHospitalDoctorRelation vrHisHospitalDoctorRelation)
    {
        List<VrHisHospitalDoctorRelation> list = vrHisHospitalDoctorRelationService.selectVrHisHospitalDoctorRelationList(vrHisHospitalDoctorRelation);
        ExcelUtil<VrHisHospitalDoctorRelation> util = new ExcelUtil<VrHisHospitalDoctorRelation>(VrHisHospitalDoctorRelation.class);
        util.exportExcel(response, list, "医生与医院关联数据");
    }

    /**
     * 获取医生与医院关联详细信息
     */
    @PreAuthorize("@ss.hasPermi('department:hospital_doctor_relation:query')")
    @GetMapping(value = "/{rid}")
    public AjaxResult getInfo(@PathVariable("rid") Long rid)
    {
        return AjaxResult.success(vrHisHospitalDoctorRelationService.selectVrHisHospitalDoctorRelationByRid(rid));
    }

    /**
     * 新增医生与医院关联
     */
    @PreAuthorize("@ss.hasPermi('department:hospital_doctor_relation:add')")
    @Log(title = "医生与医院关联", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisHospitalDoctorRelation vrHisHospitalDoctorRelation)
    {
        return toAjax(vrHisHospitalDoctorRelationService.insertVrHisHospitalDoctorRelation(vrHisHospitalDoctorRelation));
    }

    /**
     * 修改医生与医院关联
     */
    @PreAuthorize("@ss.hasPermi('department:hospital_doctor_relation:edit')")
    @Log(title = "医生与医院关联", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisHospitalDoctorRelation vrHisHospitalDoctorRelation)
    {
        return toAjax(vrHisHospitalDoctorRelationService.updateVrHisHospitalDoctorRelation(vrHisHospitalDoctorRelation));
    }

    /**
     * 删除医生与医院关联
     */
    @PreAuthorize("@ss.hasPermi('department:hospital_doctor_relation:remove')")
    @Log(title = "医生与医院关联", businessType = BusinessType.DELETE)
	@DeleteMapping("/{rids}")
    public AjaxResult remove(@PathVariable Long[] rids)
    {
        return toAjax(vrHisHospitalDoctorRelationService.deleteVrHisHospitalDoctorRelationByRids(rids));
    }
}
