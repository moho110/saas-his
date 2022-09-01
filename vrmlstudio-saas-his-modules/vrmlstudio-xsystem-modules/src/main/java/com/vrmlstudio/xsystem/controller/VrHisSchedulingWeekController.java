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
import com.vrmlstudio.xsystem.domain.VrHisSchedulingWeek;
import com.vrmlstudio.xsystem.service.IVrHisSchedulingWeekService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 排班星期Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/xsystem/scheduling_week")
public class VrHisSchedulingWeekController extends BaseController
{
    @Autowired
    private IVrHisSchedulingWeekService vrHisSchedulingWeekService;

    /**
     * 查询排班星期列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:scheduling_week:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisSchedulingWeek vrHisSchedulingWeek)
    {
        startPage();
        List<VrHisSchedulingWeek> list = vrHisSchedulingWeekService.selectVrHisSchedulingWeekList(vrHisSchedulingWeek);
        return getDataTable(list);
    }

    /**
     * 导出排班星期列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:scheduling_week:export')")
    @Log(title = "排班星期", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisSchedulingWeek vrHisSchedulingWeek)
    {
        List<VrHisSchedulingWeek> list = vrHisSchedulingWeekService.selectVrHisSchedulingWeekList(vrHisSchedulingWeek);
        ExcelUtil<VrHisSchedulingWeek> util = new ExcelUtil<VrHisSchedulingWeek>(VrHisSchedulingWeek.class);
        util.exportExcel(response, list, "排班星期数据");
    }

    /**
     * 获取排班星期详细信息
     */
    @PreAuthorize("@ss.hasPermi('xsystem:scheduling_week:query')")
    @GetMapping(value = "/{schedulingWeekId}")
    public AjaxResult getInfo(@PathVariable("schedulingWeekId") Integer schedulingWeekId)
    {
        return AjaxResult.success(vrHisSchedulingWeekService.selectVrHisSchedulingWeekBySchedulingWeekId(schedulingWeekId));
    }

    /**
     * 新增排班星期
     */
    @PreAuthorize("@ss.hasPermi('xsystem:scheduling_week:add')")
    @Log(title = "排班星期", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisSchedulingWeek vrHisSchedulingWeek)
    {
        return toAjax(vrHisSchedulingWeekService.insertVrHisSchedulingWeek(vrHisSchedulingWeek));
    }

    /**
     * 修改排班星期
     */
    @PreAuthorize("@ss.hasPermi('xsystem:scheduling_week:edit')")
    @Log(title = "排班星期", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisSchedulingWeek vrHisSchedulingWeek)
    {
        return toAjax(vrHisSchedulingWeekService.updateVrHisSchedulingWeek(vrHisSchedulingWeek));
    }

    /**
     * 删除排班星期
     */
    @PreAuthorize("@ss.hasPermi('xsystem:scheduling_week:remove')")
    @Log(title = "排班星期", businessType = BusinessType.DELETE)
	@DeleteMapping("/{schedulingWeekIds}")
    public AjaxResult remove(@PathVariable Integer[] schedulingWeekIds)
    {
        return toAjax(vrHisSchedulingWeekService.deleteVrHisSchedulingWeekBySchedulingWeekIds(schedulingWeekIds));
    }
}
