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
import com.vrmlstudio.person.domain.VrHisMember;
import com.vrmlstudio.person.service.IVrHisMemberService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * HIS用户Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/person/member")
public class VrHisMemberController extends BaseController
{
    @Autowired
    private IVrHisMemberService vrHisMemberService;

    /**
     * 查询HIS用户列表
     */
    @PreAuthorize("@ss.hasPermi('person:member:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisMember vrHisMember)
    {
        startPage();
        List<VrHisMember> list = vrHisMemberService.selectVrHisMemberList(vrHisMember);
        return getDataTable(list);
    }

    /**
     * 导出HIS用户列表
     */
    @PreAuthorize("@ss.hasPermi('person:member:export')")
    @Log(title = "HIS用户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisMember vrHisMember)
    {
        List<VrHisMember> list = vrHisMemberService.selectVrHisMemberList(vrHisMember);
        ExcelUtil<VrHisMember> util = new ExcelUtil<VrHisMember>(VrHisMember.class);
        util.exportExcel(response, list, "HIS用户数据");
    }

    /**
     * 获取HIS用户详细信息
     */
    @PreAuthorize("@ss.hasPermi('person:member:query')")
    @GetMapping(value = "/{uid}")
    public AjaxResult getInfo(@PathVariable("uid") Long uid)
    {
        return AjaxResult.success(vrHisMemberService.selectVrHisMemberByUid(uid));
    }

    /**
     * 新增HIS用户
     */
    @PreAuthorize("@ss.hasPermi('person:member:add')")
    @Log(title = "HIS用户", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisMember vrHisMember)
    {
        return toAjax(vrHisMemberService.insertVrHisMember(vrHisMember));
    }

    /**
     * 修改HIS用户
     */
    @PreAuthorize("@ss.hasPermi('person:member:edit')")
    @Log(title = "HIS用户", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisMember vrHisMember)
    {
        return toAjax(vrHisMemberService.updateVrHisMember(vrHisMember));
    }

    /**
     * 删除HIS用户
     */
    @PreAuthorize("@ss.hasPermi('person:member:remove')")
    @Log(title = "HIS用户", businessType = BusinessType.DELETE)
	@DeleteMapping("/{uids}")
    public AjaxResult remove(@PathVariable Long[] uids)
    {
        return toAjax(vrHisMemberService.deleteVrHisMemberByUids(uids));
    }
}
