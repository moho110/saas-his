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
import com.vrmlstudio.xsystem.domain.VrHisWxmp;
import com.vrmlstudio.xsystem.service.IVrHisWxmpService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 微信公众平台信息Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/xsystem/wxmp")
public class VrHisWxmpController extends BaseController
{
    @Autowired
    private IVrHisWxmpService vrHisWxmpService;

    /**
     * 查询微信公众平台信息列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxmp:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisWxmp vrHisWxmp)
    {
        startPage();
        List<VrHisWxmp> list = vrHisWxmpService.selectVrHisWxmpList(vrHisWxmp);
        return getDataTable(list);
    }

    /**
     * 导出微信公众平台信息列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxmp:export')")
    @Log(title = "微信公众平台信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisWxmp vrHisWxmp)
    {
        List<VrHisWxmp> list = vrHisWxmpService.selectVrHisWxmpList(vrHisWxmp);
        ExcelUtil<VrHisWxmp> util = new ExcelUtil<VrHisWxmp>(VrHisWxmp.class);
        util.exportExcel(response, list, "微信公众平台信息数据");
    }

    /**
     * 获取微信公众平台信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxmp:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(vrHisWxmpService.selectVrHisWxmpById(id));
    }

    /**
     * 新增微信公众平台信息
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxmp:add')")
    @Log(title = "微信公众平台信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisWxmp vrHisWxmp)
    {
        return toAjax(vrHisWxmpService.insertVrHisWxmp(vrHisWxmp));
    }

    /**
     * 修改微信公众平台信息
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxmp:edit')")
    @Log(title = "微信公众平台信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisWxmp vrHisWxmp)
    {
        return toAjax(vrHisWxmpService.updateVrHisWxmp(vrHisWxmp));
    }

    /**
     * 删除微信公众平台信息
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxmp:remove')")
    @Log(title = "微信公众平台信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(vrHisWxmpService.deleteVrHisWxmpByIds(ids));
    }
}
