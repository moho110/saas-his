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
import com.vrmlstudio.xsystem.domain.VrHisSchedulingSubsection;
import com.vrmlstudio.xsystem.service.IVrHisSchedulingSubsectionService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 排班时段Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/xsystem/scheduling_subsection")
public class VrHisSchedulingSubsectionController extends BaseController
{
    @Autowired
    private IVrHisSchedulingSubsectionService vrHisSchedulingSubsectionService;

    /**
     * 查询排班时段列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:scheduling_subsection:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisSchedulingSubsection vrHisSchedulingSubsection)
    {
        startPage();
        List<VrHisSchedulingSubsection> list = vrHisSchedulingSubsectionService.selectVrHisSchedulingSubsectionList(vrHisSchedulingSubsection);
        return getDataTable(list);
    }

    /**
     * 导出排班时段列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:scheduling_subsection:export')")
    @Log(title = "排班时段", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisSchedulingSubsection vrHisSchedulingSubsection)
    {
        List<VrHisSchedulingSubsection> list = vrHisSchedulingSubsectionService.selectVrHisSchedulingSubsectionList(vrHisSchedulingSubsection);
        ExcelUtil<VrHisSchedulingSubsection> util = new ExcelUtil<VrHisSchedulingSubsection>(VrHisSchedulingSubsection.class);
        util.exportExcel(response, list, "排班时段数据");
    }

    /**
     * 获取排班时段详细信息
     */
    @PreAuthorize("@ss.hasPermi('xsystem:scheduling_subsection:query')")
    @GetMapping(value = "/{schedulingSubsectionId}")
    public AjaxResult getInfo(@PathVariable("schedulingSubsectionId") Integer schedulingSubsectionId)
    {
        return AjaxResult.success(vrHisSchedulingSubsectionService.selectVrHisSchedulingSubsectionBySchedulingSubsectionId(schedulingSubsectionId));
    }

    /**
     * 新增排班时段
     */
    @PreAuthorize("@ss.hasPermi('xsystem:scheduling_subsection:add')")
    @Log(title = "排班时段", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisSchedulingSubsection vrHisSchedulingSubsection)
    {
        return toAjax(vrHisSchedulingSubsectionService.insertVrHisSchedulingSubsection(vrHisSchedulingSubsection));
    }

    /**
     * 修改排班时段
     */
    @PreAuthorize("@ss.hasPermi('xsystem:scheduling_subsection:edit')")
    @Log(title = "排班时段", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisSchedulingSubsection vrHisSchedulingSubsection)
    {
        return toAjax(vrHisSchedulingSubsectionService.updateVrHisSchedulingSubsection(vrHisSchedulingSubsection));
    }

    /**
     * 删除排班时段
     */
    @PreAuthorize("@ss.hasPermi('xsystem:scheduling_subsection:remove')")
    @Log(title = "排班时段", businessType = BusinessType.DELETE)
	@DeleteMapping("/{schedulingSubsectionIds}")
    public AjaxResult remove(@PathVariable Integer[] schedulingSubsectionIds)
    {
        return toAjax(vrHisSchedulingSubsectionService.deleteVrHisSchedulingSubsectionBySchedulingSubsectionIds(schedulingSubsectionIds));
    }
}
