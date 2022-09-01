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
import com.vrmlstudio.xsystem.domain.VrHisWxopenidCache;
import com.vrmlstudio.xsystem.service.IVrHisWxopenidCacheService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * openid跨域名获取Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/xsystem/wxopenid_cache")
public class VrHisWxopenidCacheController extends BaseController
{
    @Autowired
    private IVrHisWxopenidCacheService vrHisWxopenidCacheService;

    /**
     * 查询openid跨域名获取列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxopenid_cache:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisWxopenidCache vrHisWxopenidCache)
    {
        startPage();
        List<VrHisWxopenidCache> list = vrHisWxopenidCacheService.selectVrHisWxopenidCacheList(vrHisWxopenidCache);
        return getDataTable(list);
    }

    /**
     * 导出openid跨域名获取列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxopenid_cache:export')")
    @Log(title = "openid跨域名获取", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisWxopenidCache vrHisWxopenidCache)
    {
        List<VrHisWxopenidCache> list = vrHisWxopenidCacheService.selectVrHisWxopenidCacheList(vrHisWxopenidCache);
        ExcelUtil<VrHisWxopenidCache> util = new ExcelUtil<VrHisWxopenidCache>(VrHisWxopenidCache.class);
        util.exportExcel(response, list, "openid跨域名获取数据");
    }

    /**
     * 获取openid跨域名获取详细信息
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxopenid_cache:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(vrHisWxopenidCacheService.selectVrHisWxopenidCacheById(id));
    }

    /**
     * 新增openid跨域名获取
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxopenid_cache:add')")
    @Log(title = "openid跨域名获取", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisWxopenidCache vrHisWxopenidCache)
    {
        return toAjax(vrHisWxopenidCacheService.insertVrHisWxopenidCache(vrHisWxopenidCache));
    }

    /**
     * 修改openid跨域名获取
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxopenid_cache:edit')")
    @Log(title = "openid跨域名获取", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisWxopenidCache vrHisWxopenidCache)
    {
        return toAjax(vrHisWxopenidCacheService.updateVrHisWxopenidCache(vrHisWxopenidCache));
    }

    /**
     * 删除openid跨域名获取
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxopenid_cache:remove')")
    @Log(title = "openid跨域名获取", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(vrHisWxopenidCacheService.deleteVrHisWxopenidCacheByIds(ids));
    }
}
