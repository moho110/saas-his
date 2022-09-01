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
import com.vrmlstudio.xsystem.domain.VrHisWxqr;
import com.vrmlstudio.xsystem.service.IVrHisWxqrService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 保存微信永久二维码及用户关系Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/xsystem/wxqr")
public class VrHisWxqrController extends BaseController
{
    @Autowired
    private IVrHisWxqrService vrHisWxqrService;

    /**
     * 查询保存微信永久二维码及用户关系列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxqr:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisWxqr vrHisWxqr)
    {
        startPage();
        List<VrHisWxqr> list = vrHisWxqrService.selectVrHisWxqrList(vrHisWxqr);
        return getDataTable(list);
    }

    /**
     * 导出保存微信永久二维码及用户关系列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxqr:export')")
    @Log(title = "保存微信永久二维码及用户关系", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisWxqr vrHisWxqr)
    {
        List<VrHisWxqr> list = vrHisWxqrService.selectVrHisWxqrList(vrHisWxqr);
        ExcelUtil<VrHisWxqr> util = new ExcelUtil<VrHisWxqr>(VrHisWxqr.class);
        util.exportExcel(response, list, "保存微信永久二维码及用户关系数据");
    }

    /**
     * 获取保存微信永久二维码及用户关系详细信息
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxqr:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(vrHisWxqrService.selectVrHisWxqrById(id));
    }

    /**
     * 新增保存微信永久二维码及用户关系
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxqr:add')")
    @Log(title = "保存微信永久二维码及用户关系", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisWxqr vrHisWxqr)
    {
        return toAjax(vrHisWxqrService.insertVrHisWxqr(vrHisWxqr));
    }

    /**
     * 修改保存微信永久二维码及用户关系
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxqr:edit')")
    @Log(title = "保存微信永久二维码及用户关系", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisWxqr vrHisWxqr)
    {
        return toAjax(vrHisWxqrService.updateVrHisWxqr(vrHisWxqr));
    }

    /**
     * 删除保存微信永久二维码及用户关系
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxqr:remove')")
    @Log(title = "保存微信永久二维码及用户关系", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(vrHisWxqrService.deleteVrHisWxqrByIds(ids));
    }
}
