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
import com.vrmlstudio.department.domain.VrHisAuthGroupAccess;
import com.vrmlstudio.department.service.IVrHisAuthGroupAccessService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 用户组与用户关联Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/basic/auth_group_access")
public class VrHisAuthGroupAccessController extends BaseController
{
    @Autowired
    private IVrHisAuthGroupAccessService vrHisAuthGroupAccessService;

    /**
     * 查询用户组与用户关联列表
     */
    @PreAuthorize("@ss.hasPermi('basic:auth_group_access:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisAuthGroupAccess vrHisAuthGroupAccess)
    {
        startPage();
        List<VrHisAuthGroupAccess> list = vrHisAuthGroupAccessService.selectVrHisAuthGroupAccessList(vrHisAuthGroupAccess);
        return getDataTable(list);
    }

    /**
     * 导出用户组与用户关联列表
     */
    @PreAuthorize("@ss.hasPermi('basic:auth_group_access:export')")
    @Log(title = "用户组与用户关联", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisAuthGroupAccess vrHisAuthGroupAccess)
    {
        List<VrHisAuthGroupAccess> list = vrHisAuthGroupAccessService.selectVrHisAuthGroupAccessList(vrHisAuthGroupAccess);
        ExcelUtil<VrHisAuthGroupAccess> util = new ExcelUtil<VrHisAuthGroupAccess>(VrHisAuthGroupAccess.class);
        util.exportExcel(response, list, "用户组与用户关联数据");
    }

    /**
     * 获取用户组与用户关联详细信息
     */
    @PreAuthorize("@ss.hasPermi('basic:auth_group_access:query')")
    @GetMapping(value = "/{uid}")
    public AjaxResult getInfo(@PathVariable("uid") Integer uid)
    {
        return AjaxResult.success(vrHisAuthGroupAccessService.selectVrHisAuthGroupAccessByUid(uid));
    }

    /**
     * 新增用户组与用户关联
     */
    @PreAuthorize("@ss.hasPermi('basic:auth_group_access:add')")
    @Log(title = "用户组与用户关联", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisAuthGroupAccess vrHisAuthGroupAccess)
    {
        return toAjax(vrHisAuthGroupAccessService.insertVrHisAuthGroupAccess(vrHisAuthGroupAccess));
    }

    /**
     * 修改用户组与用户关联
     */
    @PreAuthorize("@ss.hasPermi('basic:auth_group_access:edit')")
    @Log(title = "用户组与用户关联", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisAuthGroupAccess vrHisAuthGroupAccess)
    {
        return toAjax(vrHisAuthGroupAccessService.updateVrHisAuthGroupAccess(vrHisAuthGroupAccess));
    }

    /**
     * 删除用户组与用户关联
     */
    @PreAuthorize("@ss.hasPermi('basic:auth_group_access:remove')")
    @Log(title = "用户组与用户关联", businessType = BusinessType.DELETE)
	@DeleteMapping("/{uids}")
    public AjaxResult remove(@PathVariable Integer[] uids)
    {
        return toAjax(vrHisAuthGroupAccessService.deleteVrHisAuthGroupAccessByUids(uids));
    }
}
