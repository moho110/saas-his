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
import com.vrmlstudio.department.domain.VrHisDictionary;
import com.vrmlstudio.department.service.IVrHisDictionaryService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 字典Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/basic/dictionary")
public class VrHisDictionaryController extends BaseController
{
    @Autowired
    private IVrHisDictionaryService vrHisDictionaryService;

    /**
     * 查询字典列表
     */
    @PreAuthorize("@ss.hasPermi('basic:dictionary:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisDictionary vrHisDictionary)
    {
        startPage();
        List<VrHisDictionary> list = vrHisDictionaryService.selectVrHisDictionaryList(vrHisDictionary);
        return getDataTable(list);
    }

    /**
     * 导出字典列表
     */
    @PreAuthorize("@ss.hasPermi('basic:dictionary:export')")
    @Log(title = "字典", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisDictionary vrHisDictionary)
    {
        List<VrHisDictionary> list = vrHisDictionaryService.selectVrHisDictionaryList(vrHisDictionary);
        ExcelUtil<VrHisDictionary> util = new ExcelUtil<VrHisDictionary>(VrHisDictionary.class);
        util.exportExcel(response, list, "字典数据");
    }

    /**
     * 获取字典详细信息
     */
    @PreAuthorize("@ss.hasPermi('basic:dictionary:query')")
    @GetMapping(value = "/{did}")
    public AjaxResult getInfo(@PathVariable("did") Long did)
    {
        return AjaxResult.success(vrHisDictionaryService.selectVrHisDictionaryByDid(did));
    }

    /**
     * 新增字典
     */
    @PreAuthorize("@ss.hasPermi('basic:dictionary:add')")
    @Log(title = "字典", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisDictionary vrHisDictionary)
    {
        return toAjax(vrHisDictionaryService.insertVrHisDictionary(vrHisDictionary));
    }

    /**
     * 修改字典
     */
    @PreAuthorize("@ss.hasPermi('basic:dictionary:edit')")
    @Log(title = "字典", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisDictionary vrHisDictionary)
    {
        return toAjax(vrHisDictionaryService.updateVrHisDictionary(vrHisDictionary));
    }

    /**
     * 删除字典
     */
    @PreAuthorize("@ss.hasPermi('basic:dictionary:remove')")
    @Log(title = "字典", businessType = BusinessType.DELETE)
	@DeleteMapping("/{dids}")
    public AjaxResult remove(@PathVariable Long[] dids)
    {
        return toAjax(vrHisDictionaryService.deleteVrHisDictionaryByDids(dids));
    }
}
