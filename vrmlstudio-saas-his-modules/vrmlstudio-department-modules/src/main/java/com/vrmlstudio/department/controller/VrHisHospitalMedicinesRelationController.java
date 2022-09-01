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
import com.vrmlstudio.department.domain.VrHisHospitalMedicinesRelation;
import com.vrmlstudio.department.service.IVrHisHospitalMedicinesRelationService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 医院药品关联Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/department/hospital_medicines_relation")
public class VrHisHospitalMedicinesRelationController extends BaseController
{
    @Autowired
    private IVrHisHospitalMedicinesRelationService vrHisHospitalMedicinesRelationService;

    /**
     * 查询医院药品关联列表
     */
    @PreAuthorize("@ss.hasPermi('department:hospital_medicines_relation:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisHospitalMedicinesRelation vrHisHospitalMedicinesRelation)
    {
        startPage();
        List<VrHisHospitalMedicinesRelation> list = vrHisHospitalMedicinesRelationService.selectVrHisHospitalMedicinesRelationList(vrHisHospitalMedicinesRelation);
        return getDataTable(list);
    }

    /**
     * 导出医院药品关联列表
     */
    @PreAuthorize("@ss.hasPermi('department:hospital_medicines_relation:export')")
    @Log(title = "医院药品关联", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisHospitalMedicinesRelation vrHisHospitalMedicinesRelation)
    {
        List<VrHisHospitalMedicinesRelation> list = vrHisHospitalMedicinesRelationService.selectVrHisHospitalMedicinesRelationList(vrHisHospitalMedicinesRelation);
        ExcelUtil<VrHisHospitalMedicinesRelation> util = new ExcelUtil<VrHisHospitalMedicinesRelation>(VrHisHospitalMedicinesRelation.class);
        util.exportExcel(response, list, "医院药品关联数据");
    }

    /**
     * 获取医院药品关联详细信息
     */
    @PreAuthorize("@ss.hasPermi('department:hospital_medicines_relation:query')")
    @GetMapping(value = "/{hmrId}")
    public AjaxResult getInfo(@PathVariable("hmrId") Long hmrId)
    {
        return AjaxResult.success(vrHisHospitalMedicinesRelationService.selectVrHisHospitalMedicinesRelationByHmrId(hmrId));
    }

    /**
     * 新增医院药品关联
     */
    @PreAuthorize("@ss.hasPermi('department:hospital_medicines_relation:add')")
    @Log(title = "医院药品关联", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisHospitalMedicinesRelation vrHisHospitalMedicinesRelation)
    {
        return toAjax(vrHisHospitalMedicinesRelationService.insertVrHisHospitalMedicinesRelation(vrHisHospitalMedicinesRelation));
    }

    /**
     * 修改医院药品关联
     */
    @PreAuthorize("@ss.hasPermi('department:hospital_medicines_relation:edit')")
    @Log(title = "医院药品关联", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisHospitalMedicinesRelation vrHisHospitalMedicinesRelation)
    {
        return toAjax(vrHisHospitalMedicinesRelationService.updateVrHisHospitalMedicinesRelation(vrHisHospitalMedicinesRelation));
    }

    /**
     * 删除医院药品关联
     */
    @PreAuthorize("@ss.hasPermi('department:hospital_medicines_relation:remove')")
    @Log(title = "医院药品关联", businessType = BusinessType.DELETE)
	@DeleteMapping("/{hmrIds}")
    public AjaxResult remove(@PathVariable Long[] hmrIds)
    {
        return toAjax(vrHisHospitalMedicinesRelationService.deleteVrHisHospitalMedicinesRelationByHmrIds(hmrIds));
    }
}
