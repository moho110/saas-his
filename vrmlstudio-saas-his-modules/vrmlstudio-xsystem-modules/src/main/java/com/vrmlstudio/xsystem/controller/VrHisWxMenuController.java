package com.vrmlstudio.xsystem.controller;

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
import com.vrmlstudio.xsystem.domain.VrHisWxMenu;
import com.vrmlstudio.xsystem.service.IVrHisWxMenuService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;

/**
 * 保存微信公众平台菜单Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/xsystem/wx_menu")
public class VrHisWxMenuController extends BaseController
{
    @Autowired
    private IVrHisWxMenuService vrHisWxMenuService;

    /**
     * 查询保存微信公众平台菜单列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wx_menu:list')")
    @GetMapping("/list")
    public AjaxResult list(VrHisWxMenu vrHisWxMenu)
    {
        List<VrHisWxMenu> list = vrHisWxMenuService.selectVrHisWxMenuList(vrHisWxMenu);
        return AjaxResult.success(list);
    }

    /**
     * 导出保存微信公众平台菜单列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wx_menu:export')")
    @Log(title = "保存微信公众平台菜单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisWxMenu vrHisWxMenu)
    {
        List<VrHisWxMenu> list = vrHisWxMenuService.selectVrHisWxMenuList(vrHisWxMenu);
        ExcelUtil<VrHisWxMenu> util = new ExcelUtil<VrHisWxMenu>(VrHisWxMenu.class);
        util.exportExcel(response, list, "保存微信公众平台菜单数据");
    }

    /**
     * 获取保存微信公众平台菜单详细信息
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wx_menu:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(vrHisWxMenuService.selectVrHisWxMenuById(id));
    }

    /**
     * 新增保存微信公众平台菜单
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wx_menu:add')")
    @Log(title = "保存微信公众平台菜单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisWxMenu vrHisWxMenu)
    {
        return toAjax(vrHisWxMenuService.insertVrHisWxMenu(vrHisWxMenu));
    }

    /**
     * 修改保存微信公众平台菜单
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wx_menu:edit')")
    @Log(title = "保存微信公众平台菜单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisWxMenu vrHisWxMenu)
    {
        return toAjax(vrHisWxMenuService.updateVrHisWxMenu(vrHisWxMenu));
    }

    /**
     * 删除保存微信公众平台菜单
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wx_menu:remove')")
    @Log(title = "保存微信公众平台菜单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(vrHisWxMenuService.deleteVrHisWxMenuByIds(ids));
    }
}
