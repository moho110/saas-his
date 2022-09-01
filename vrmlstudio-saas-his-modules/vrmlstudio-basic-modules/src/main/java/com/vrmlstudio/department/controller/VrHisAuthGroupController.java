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
import com.vrmlstudio.department.domain.VrHisAuthGroup;
import com.vrmlstudio.department.service.IVrHisAuthGroupService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 用户组Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/basic/auth_group")
public class VrHisAuthGroupController extends BaseController
{
    @Autowired
    private IVrHisAuthGroupService vrHisAuthGroupService;

    /**
     * 查询用户组列表
     */
    @PreAuthorize("@ss.hasPermi('basic:auth_group:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisAuthGroup vrHisAuthGroup)
    {
        startPage();
        List<VrHisAuthGroup> list = vrHisAuthGroupService.selectVrHisAuthGroupList(vrHisAuthGroup);
        return getDataTable(list);
    }

    /**
     * 导出用户组列表
     */
    @PreAuthorize("@ss.hasPermi('basic:auth_group:export')")
    @Log(title = "用户组", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisAuthGroup vrHisAuthGroup)
    {
        List<VrHisAuthGroup> list = vrHisAuthGroupService.selectVrHisAuthGroupList(vrHisAuthGroup);
        ExcelUtil<VrHisAuthGroup> util = new ExcelUtil<VrHisAuthGroup>(VrHisAuthGroup.class);
        util.exportExcel(response, list, "用户组数据");
    }

    /**
     * 获取用户组详细信息
     */
    @PreAuthorize("@ss.hasPermi('basic:auth_group:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(vrHisAuthGroupService.selectVrHisAuthGroupById(id));
    }

    /**
     * 新增用户组
     */
    @PreAuthorize("@ss.hasPermi('basic:auth_group:add')")
    @Log(title = "用户组", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisAuthGroup vrHisAuthGroup)
    {
        return toAjax(vrHisAuthGroupService.insertVrHisAuthGroup(vrHisAuthGroup));
    }

    /**
     * 修改用户组
     */
    @PreAuthorize("@ss.hasPermi('basic:auth_group:edit')")
    @Log(title = "用户组", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisAuthGroup vrHisAuthGroup)
    {
        return toAjax(vrHisAuthGroupService.updateVrHisAuthGroup(vrHisAuthGroup));
    }

    /**
     * 删除用户组
     */
    @PreAuthorize("@ss.hasPermi('basic:auth_group:remove')")
    @Log(title = "用户组", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(vrHisAuthGroupService.deleteVrHisAuthGroupByIds(ids));
    }
}
