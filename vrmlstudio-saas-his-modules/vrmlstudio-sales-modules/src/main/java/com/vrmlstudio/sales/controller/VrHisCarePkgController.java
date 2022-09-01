package com.vrmlstudio.sales.controller;

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
import com.vrmlstudio.sales.domain.VrHisCarePkg;
import com.vrmlstudio.sales.service.IVrHisCarePkgService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 收费总Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/sales/vr_his_care_pkg")
public class VrHisCarePkgController extends BaseController
{
    @Autowired
    private IVrHisCarePkgService vrHisCarePkgService;

    /**
     * 查询收费总列表
     */
    @PreAuthorize("@ss.hasPermi('sales:vr_his_care_pkg:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisCarePkg vrHisCarePkg)
    {
        startPage();
        List<VrHisCarePkg> list = vrHisCarePkgService.selectVrHisCarePkgList(vrHisCarePkg);
        return getDataTable(list);
    }

    /**
     * 导出收费总列表
     */
    @PreAuthorize("@ss.hasPermi('sales:vr_his_care_pkg:export')")
    @Log(title = "收费总", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisCarePkg vrHisCarePkg)
    {
        List<VrHisCarePkg> list = vrHisCarePkgService.selectVrHisCarePkgList(vrHisCarePkg);
        ExcelUtil<VrHisCarePkg> util = new ExcelUtil<VrHisCarePkg>(VrHisCarePkg.class);
        util.exportExcel(response, list, "收费总数据");
    }

    /**
     * 获取收费总详细信息
     */
    @PreAuthorize("@ss.hasPermi('sales:vr_his_care_pkg:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(vrHisCarePkgService.selectVrHisCarePkgById(id));
    }

    /**
     * 新增收费总
     */
    @PreAuthorize("@ss.hasPermi('sales:vr_his_care_pkg:add')")
    @Log(title = "收费总", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisCarePkg vrHisCarePkg)
    {
        return toAjax(vrHisCarePkgService.insertVrHisCarePkg(vrHisCarePkg));
    }

    /**
     * 修改收费总
     */
    @PreAuthorize("@ss.hasPermi('sales:vr_his_care_pkg:edit')")
    @Log(title = "收费总", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisCarePkg vrHisCarePkg)
    {
        return toAjax(vrHisCarePkgService.updateVrHisCarePkg(vrHisCarePkg));
    }

    /**
     * 删除收费总
     */
    @PreAuthorize("@ss.hasPermi('sales:vr_his_care_pkg:remove')")
    @Log(title = "收费总", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(vrHisCarePkgService.deleteVrHisCarePkgByIds(ids));
    }
}
