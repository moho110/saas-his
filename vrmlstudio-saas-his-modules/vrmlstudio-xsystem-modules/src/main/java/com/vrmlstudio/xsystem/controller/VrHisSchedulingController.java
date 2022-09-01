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
import com.vrmlstudio.xsystem.domain.VrHisScheduling;
import com.vrmlstudio.xsystem.service.IVrHisSchedulingService;
import com.vrmlstudio.common.utils.poi.ExcelUtil;
import com.vrmlstudio.common.core.page.TableDataInfo;

/**
 * 我的排班Controller
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@RestController
@RequestMapping("/xsystem/scheduling")
public class VrHisSchedulingController extends BaseController
{
    @Autowired
    private IVrHisSchedulingService vrHisSchedulingService;

    /**
     * 查询我的排班列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:scheduling:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrHisScheduling vrHisScheduling)
    {
        startPage();
        List<VrHisScheduling> list = vrHisSchedulingService.selectVrHisSchedulingList(vrHisScheduling);
        return getDataTable(list);
    }

    /**
     * 导出我的排班列表
     */
    @PreAuthorize("@ss.hasPermi('xsystem:scheduling:export')")
    @Log(title = "我的排班", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrHisScheduling vrHisScheduling)
    {
        List<VrHisScheduling> list = vrHisSchedulingService.selectVrHisSchedulingList(vrHisScheduling);
        ExcelUtil<VrHisScheduling> util = new ExcelUtil<VrHisScheduling>(VrHisScheduling.class);
        util.exportExcel(response, list, "我的排班数据");
    }

    /**
     * 获取我的排班详细信息
     */
    @PreAuthorize("@ss.hasPermi('xsystem:scheduling:query')")
    @GetMapping(value = "/{schedulingId}")
    public AjaxResult getInfo(@PathVariable("schedulingId") Long schedulingId)
    {
        return AjaxResult.success(vrHisSchedulingService.selectVrHisSchedulingBySchedulingId(schedulingId));
    }

    /**
     * 新增我的排班
     */
    @PreAuthorize("@ss.hasPermi('xsystem:scheduling:add')")
    @Log(title = "我的排班", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrHisScheduling vrHisScheduling)
    {
        return toAjax(vrHisSchedulingService.insertVrHisScheduling(vrHisScheduling));
    }

    /**
     * 修改我的排班
     */
    @PreAuthorize("@ss.hasPermi('xsystem:scheduling:edit')")
    @Log(title = "我的排班", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrHisScheduling vrHisScheduling)
    {
        return toAjax(vrHisSchedulingService.updateVrHisScheduling(vrHisScheduling));
    }

    /**
     * 删除我的排班
     */
    @PreAuthorize("@ss.hasPermi('xsystem:scheduling:remove')")
    @Log(title = "我的排班", businessType = BusinessType.DELETE)
	@DeleteMapping("/{schedulingIds}")
    public AjaxResult remove(@PathVariable Long[] schedulingIds)
    {
        return toAjax(vrHisSchedulingService.deleteVrHisSchedulingBySchedulingIds(schedulingIds));
    }
}
