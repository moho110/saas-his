package com.vrmlstudio.medicine.controller;

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
import com.vrmlstudio.medicine.domain.VrHisInspectionfee;
import com.vrmlstudio.medicine.service.IVrHisInspectionfeeService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 检查项目费用Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/medicine/inspectionfee")
public class VrHisInspectionfeeController extends BaseController
{
    @Autowired
    private IVrHisInspectionfeeService vrHisInspectionfeeService;

    /**
     * 查询检查项目费用列表
     */
    @PreAuthorize("@ss.hasPermi('medicine:inspectionfee:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisInspectionfee vrHisInspectionfee)
    {
        startPage();
        List<VrHisInspectionfee> list = vrHisInspectionfeeService.selectVrHisInspectionfeeList(vrHisInspectionfee);
        return getDataTable(list);
    }

    /**
     * 导出检查项目费用列表
     */
    @PreAuthorize("@ss.hasPermi('medicine:inspectionfee:export')")
    @Log(title = "检查项目费用", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisInspectionfee vrHisInspectionfee)
    {
        List<VrHisInspectionfee> list = vrHisInspectionfeeService.selectVrHisInspectionfeeList(vrHisInspectionfee);
        ExcelUtil<VrHisInspectionfee> util = new ExcelUtil<VrHisInspectionfee>(VrHisInspectionfee.class);
        util.exportExcel(response, list, "检查项目费用数据");
    }

    /**
     * 获取检查项目费用详细信息
     */
    @PreAuthorize("@ss.hasPermi('medicine:inspectionfee:query')")
    @GetMapping(value = "/{insId}")
    public AjaxResult getInfo(@PathVariable("insId") Long insId)
    {
        return AjaxResult.success(vrHisInspectionfeeService.selectVrHisInspectionfeeByInsId(insId));
    }

    /**
     * 新增检查项目费用
     */
    @PreAuthorize("@ss.hasPermi('medicine:inspectionfee:add')")
    @Log(title = "检查项目费用", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisInspectionfee vrHisInspectionfee)
    {
        return toAjax(vrHisInspectionfeeService.insertVrHisInspectionfee(vrHisInspectionfee));
    }

    /**
     * 修改检查项目费用
     */
    @PreAuthorize("@ss.hasPermi('medicine:inspectionfee:edit')")
    @Log(title = "检查项目费用", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisInspectionfee vrHisInspectionfee)
    {
        return toAjax(vrHisInspectionfeeService.updateVrHisInspectionfee(vrHisInspectionfee));
    }

    /**
     * 删除检查项目费用
     */
    @PreAuthorize("@ss.hasPermi('medicine:inspectionfee:remove')")
    @Log(title = "检查项目费用", businessType = BusinessType.DELETE)
	@DeleteMapping("/{insIds}")
    public AjaxResult remove(@PathVariable Long[] insIds)
    {
        return toAjax(vrHisInspectionfeeService.deleteVrHisInspectionfeeByInsIds(insIds));
    }
}
