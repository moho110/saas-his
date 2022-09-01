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
import com.vrmlstudio.xsystem.domain.VrHisDepartment;
import com.vrmlstudio.xsystem.service.IVrHisDepartmentService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 科室Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/xsystem/department")
public class VrHisDepartmentController extends BaseController
{
    @Autowired
    private IVrHisDepartmentService vrHisDepartmentService;

    /**
     * 查询科室列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:department:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisDepartment vrHisDepartment)
    {
        startPage();
        List<VrHisDepartment> list = vrHisDepartmentService.selectVrHisDepartmentList(vrHisDepartment);
        return getDataTable(list);
    }

    /**
     * 导出科室列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:department:export')")
    @Log(title = "科室", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisDepartment vrHisDepartment)
    {
        List<VrHisDepartment> list = vrHisDepartmentService.selectVrHisDepartmentList(vrHisDepartment);
        ExcelUtil<VrHisDepartment> util = new ExcelUtil<VrHisDepartment>(VrHisDepartment.class);
        util.exportExcel(response, list, "科室数据");
    }

    /**
     * 获取科室详细信息
     */
    @PreAuthorize("@ss.hasPermi('xsystem:department:query')")
    @GetMapping(value = "/{did}")
    public AjaxResult getInfo(@PathVariable("did") Long did)
    {
        return AjaxResult.success(vrHisDepartmentService.selectVrHisDepartmentByDid(did));
    }

    /**
     * 新增科室
     */
    @PreAuthorize("@ss.hasPermi('xsystem:department:add')")
    @Log(title = "科室", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisDepartment vrHisDepartment)
    {
        return toAjax(vrHisDepartmentService.insertVrHisDepartment(vrHisDepartment));
    }

    /**
     * 修改科室
     */
    @PreAuthorize("@ss.hasPermi('xsystem:department:edit')")
    @Log(title = "科室", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisDepartment vrHisDepartment)
    {
        return toAjax(vrHisDepartmentService.updateVrHisDepartment(vrHisDepartment));
    }

    /**
     * 删除科室
     */
    @PreAuthorize("@ss.hasPermi('xsystem:department:remove')")
    @Log(title = "科室", businessType = BusinessType.DELETE)
	@DeleteMapping("/{dids}")
    public AjaxResult remove(@PathVariable Long[] dids)
    {
        return toAjax(vrHisDepartmentService.deleteVrHisDepartmentByDids(dids));
    }
}
