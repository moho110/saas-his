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
import com.vrmlstudio.xsystem.domain.VrHisWxqrlogin;
import com.vrmlstudio.xsystem.service.IVrHisWxqrloginService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 微信扫码登录Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/xsystem/wxqrlogin")
public class VrHisWxqrloginController extends BaseController
{
    @Autowired
    private IVrHisWxqrloginService vrHisWxqrloginService;

    /**
     * 查询微信扫码登录列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxqrlogin:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisWxqrlogin vrHisWxqrlogin)
    {
        startPage();
        List<VrHisWxqrlogin> list = vrHisWxqrloginService.selectVrHisWxqrloginList(vrHisWxqrlogin);
        return getDataTable(list);
    }

    /**
     * 导出微信扫码登录列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxqrlogin:export')")
    @Log(title = "微信扫码登录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisWxqrlogin vrHisWxqrlogin)
    {
        List<VrHisWxqrlogin> list = vrHisWxqrloginService.selectVrHisWxqrloginList(vrHisWxqrlogin);
        ExcelUtil<VrHisWxqrlogin> util = new ExcelUtil<VrHisWxqrlogin>(VrHisWxqrlogin.class);
        util.exportExcel(response, list, "微信扫码登录数据");
    }

    /**
     * 获取微信扫码登录详细信息
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxqrlogin:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(vrHisWxqrloginService.selectVrHisWxqrloginById(id));
    }

    /**
     * 新增微信扫码登录
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxqrlogin:add')")
    @Log(title = "微信扫码登录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisWxqrlogin vrHisWxqrlogin)
    {
        return toAjax(vrHisWxqrloginService.insertVrHisWxqrlogin(vrHisWxqrlogin));
    }

    /**
     * 修改微信扫码登录
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxqrlogin:edit')")
    @Log(title = "微信扫码登录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisWxqrlogin vrHisWxqrlogin)
    {
        return toAjax(vrHisWxqrloginService.updateVrHisWxqrlogin(vrHisWxqrlogin));
    }

    /**
     * 删除微信扫码登录
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxqrlogin:remove')")
    @Log(title = "微信扫码登录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(vrHisWxqrloginService.deleteVrHisWxqrloginByIds(ids));
    }
}
