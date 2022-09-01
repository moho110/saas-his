package com.vrmlstudio.sales.controller;

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
import com.vrmlstudio.sales.domain.VrHisRegistration;
import com.vrmlstudio.sales.service.IVrHisRegistrationService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 门诊挂号Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/sales/registration")
public class VrHisRegistrationController extends BaseController
{
    @Autowired
    private IVrHisRegistrationService vrHisRegistrationService;

    /**
     * 查询门诊挂号列表
     */
    @PreAuthorize("@ss.hasPermi('sales:registration:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisRegistration vrHisRegistration)
    {
        startPage();
        List<VrHisRegistration> list = vrHisRegistrationService.selectVrHisRegistrationList(vrHisRegistration);
        return getDataTable(list);
    }

    /**
     * 导出门诊挂号列表
     */
    @PreAuthorize("@ss.hasPermi('sales:registration:export')")
    @Log(title = "门诊挂号", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisRegistration vrHisRegistration)
    {
        List<VrHisRegistration> list = vrHisRegistrationService.selectVrHisRegistrationList(vrHisRegistration);
        ExcelUtil<VrHisRegistration> util = new ExcelUtil<VrHisRegistration>(VrHisRegistration.class);
        util.exportExcel(response, list, "门诊挂号数据");
    }

    /**
     * 获取门诊挂号详细信息
     */
    @PreAuthorize("@ss.hasPermi('sales:registration:query')")
    @GetMapping(value = "/{registrationId}")
    public AjaxResult getInfo(@PathVariable("registrationId") Long registrationId)
    {
        return AjaxResult.success(vrHisRegistrationService.selectVrHisRegistrationByRegistrationId(registrationId));
    }

    /**
     * 新增门诊挂号
     */
    @PreAuthorize("@ss.hasPermi('sales:registration:add')")
    @Log(title = "门诊挂号", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisRegistration vrHisRegistration)
    {
        return toAjax(vrHisRegistrationService.insertVrHisRegistration(vrHisRegistration));
    }

    /**
     * 修改门诊挂号
     */
    @PreAuthorize("@ss.hasPermi('sales:registration:edit')")
    @Log(title = "门诊挂号", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisRegistration vrHisRegistration)
    {
        return toAjax(vrHisRegistrationService.updateVrHisRegistration(vrHisRegistration));
    }

    /**
     * 删除门诊挂号
     */
    @PreAuthorize("@ss.hasPermi('sales:registration:remove')")
    @Log(title = "门诊挂号", businessType = BusinessType.DELETE)
	@DeleteMapping("/{registrationIds}")
    public AjaxResult remove(@PathVariable Long[] registrationIds)
    {
        return toAjax(vrHisRegistrationService.deleteVrHisRegistrationByRegistrationIds(registrationIds));
    }
}
