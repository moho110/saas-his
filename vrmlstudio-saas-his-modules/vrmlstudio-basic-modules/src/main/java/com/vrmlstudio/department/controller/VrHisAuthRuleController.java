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
import com.vrmlstudio.department.domain.VrHisAuthRule;
import com.vrmlstudio.department.service.IVrHisAuthRuleService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 用户权限Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/basic/auth_rule")
public class VrHisAuthRuleController extends BaseController
{
    @Autowired
    private IVrHisAuthRuleService vrHisAuthRuleService;

    /**
     * 查询用户权限列表
     */
    @PreAuthorize("@ss.hasPermi('basic:auth_rule:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisAuthRule vrHisAuthRule)
    {
        startPage();
        List<VrHisAuthRule> list = vrHisAuthRuleService.selectVrHisAuthRuleList(vrHisAuthRule);
        return getDataTable(list);
    }

    /**
     * 导出用户权限列表
     */
    @PreAuthorize("@ss.hasPermi('basic:auth_rule:export')")
    @Log(title = "用户权限", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisAuthRule vrHisAuthRule)
    {
        List<VrHisAuthRule> list = vrHisAuthRuleService.selectVrHisAuthRuleList(vrHisAuthRule);
        ExcelUtil<VrHisAuthRule> util = new ExcelUtil<VrHisAuthRule>(VrHisAuthRule.class);
        util.exportExcel(response, list, "用户权限数据");
    }

    /**
     * 获取用户权限详细信息
     */
    @PreAuthorize("@ss.hasPermi('basic:auth_rule:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(vrHisAuthRuleService.selectVrHisAuthRuleById(id));
    }

    /**
     * 新增用户权限
     */
    @PreAuthorize("@ss.hasPermi('basic:auth_rule:add')")
    @Log(title = "用户权限", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisAuthRule vrHisAuthRule)
    {
        return toAjax(vrHisAuthRuleService.insertVrHisAuthRule(vrHisAuthRule));
    }

    /**
     * 修改用户权限
     */
    @PreAuthorize("@ss.hasPermi('basic:auth_rule:edit')")
    @Log(title = "用户权限", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisAuthRule vrHisAuthRule)
    {
        return toAjax(vrHisAuthRuleService.updateVrHisAuthRule(vrHisAuthRule));
    }

    /**
     * 删除用户权限
     */
    @PreAuthorize("@ss.hasPermi('basic:auth_rule:remove')")
    @Log(title = "用户权限", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(vrHisAuthRuleService.deleteVrHisAuthRuleByIds(ids));
    }
}
