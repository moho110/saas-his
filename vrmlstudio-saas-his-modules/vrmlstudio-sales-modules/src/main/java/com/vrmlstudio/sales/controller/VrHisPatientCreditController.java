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
import com.vrmlstudio.sales.domain.VrHisPatientCredit;
import com.vrmlstudio.sales.service.IVrHisPatientCreditService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 用户免费提问额度Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/sales/patient_credit")
public class VrHisPatientCreditController extends BaseController
{
    @Autowired
    private IVrHisPatientCreditService vrHisPatientCreditService;

    /**
     * 查询用户免费提问额度列表
     */
    @PreAuthorize("@ss.hasPermi('sales:patient_credit:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisPatientCredit vrHisPatientCredit)
    {
        startPage();
        List<VrHisPatientCredit> list = vrHisPatientCreditService.selectVrHisPatientCreditList(vrHisPatientCredit);
        return getDataTable(list);
    }

    /**
     * 导出用户免费提问额度列表
     */
    @PreAuthorize("@ss.hasPermi('sales:patient_credit:export')")
    @Log(title = "用户免费提问额度", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisPatientCredit vrHisPatientCredit)
    {
        List<VrHisPatientCredit> list = vrHisPatientCreditService.selectVrHisPatientCreditList(vrHisPatientCredit);
        ExcelUtil<VrHisPatientCredit> util = new ExcelUtil<VrHisPatientCredit>(VrHisPatientCredit.class);
        util.exportExcel(response, list, "用户免费提问额度数据");
    }

    /**
     * 获取用户免费提问额度详细信息
     */
    @PreAuthorize("@ss.hasPermi('sales:patient_credit:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(vrHisPatientCreditService.selectVrHisPatientCreditById(id));
    }

    /**
     * 新增用户免费提问额度
     */
    @PreAuthorize("@ss.hasPermi('sales:patient_credit:add')")
    @Log(title = "用户免费提问额度", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisPatientCredit vrHisPatientCredit)
    {
        return toAjax(vrHisPatientCreditService.insertVrHisPatientCredit(vrHisPatientCredit));
    }

    /**
     * 修改用户免费提问额度
     */
    @PreAuthorize("@ss.hasPermi('sales:patient_credit:edit')")
    @Log(title = "用户免费提问额度", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisPatientCredit vrHisPatientCredit)
    {
        return toAjax(vrHisPatientCreditService.updateVrHisPatientCredit(vrHisPatientCredit));
    }

    /**
     * 删除用户免费提问额度
     */
    @PreAuthorize("@ss.hasPermi('sales:patient_credit:remove')")
    @Log(title = "用户免费提问额度", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(vrHisPatientCreditService.deleteVrHisPatientCreditByIds(ids));
    }
}
