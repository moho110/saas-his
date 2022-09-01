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
import com.vrmlstudio.xsystem.domain.VrHisWxopenid;
import com.vrmlstudio.xsystem.service.IVrHisWxopenidService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 绑定微信openid和用户id的关系Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/xsystem/wxopenid")
public class VrHisWxopenidController extends BaseController
{
    @Autowired
    private IVrHisWxopenidService vrHisWxopenidService;

    /**
     * 查询绑定微信openid和用户id的关系列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxopenid:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisWxopenid vrHisWxopenid)
    {
        startPage();
        List<VrHisWxopenid> list = vrHisWxopenidService.selectVrHisWxopenidList(vrHisWxopenid);
        return getDataTable(list);
    }

    /**
     * 导出绑定微信openid和用户id的关系列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxopenid:export')")
    @Log(title = "绑定微信openid和用户id的关系", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisWxopenid vrHisWxopenid)
    {
        List<VrHisWxopenid> list = vrHisWxopenidService.selectVrHisWxopenidList(vrHisWxopenid);
        ExcelUtil<VrHisWxopenid> util = new ExcelUtil<VrHisWxopenid>(VrHisWxopenid.class);
        util.exportExcel(response, list, "绑定微信openid和用户id的关系数据");
    }

    /**
     * 获取绑定微信openid和用户id的关系详细信息
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxopenid:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(vrHisWxopenidService.selectVrHisWxopenidById(id));
    }

    /**
     * 新增绑定微信openid和用户id的关系
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxopenid:add')")
    @Log(title = "绑定微信openid和用户id的关系", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisWxopenid vrHisWxopenid)
    {
        return toAjax(vrHisWxopenidService.insertVrHisWxopenid(vrHisWxopenid));
    }

    /**
     * 修改绑定微信openid和用户id的关系
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxopenid:edit')")
    @Log(title = "绑定微信openid和用户id的关系", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisWxopenid vrHisWxopenid)
    {
        return toAjax(vrHisWxopenidService.updateVrHisWxopenid(vrHisWxopenid));
    }

    /**
     * 删除绑定微信openid和用户id的关系
     */
    @PreAuthorize("@ss.hasPermi('xsystem:wxopenid:remove')")
    @Log(title = "绑定微信openid和用户id的关系", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(vrHisWxopenidService.deleteVrHisWxopenidByIds(ids));
    }
}
