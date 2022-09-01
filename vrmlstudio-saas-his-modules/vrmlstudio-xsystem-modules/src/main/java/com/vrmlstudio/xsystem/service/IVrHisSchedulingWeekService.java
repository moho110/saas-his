package com.vrmlstudio.xsystem.service;

import java.util.List;
import com.vrmlstudio.xsystem.domain.VrHisSchedulingWeek;

/**
 * 排班星期Service接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface IVrHisSchedulingWeekService 
{
    /**
     * 查询排班星期
     * 
     * @param schedulingWeekId 排班星期主键
     * @return 排班星期
     */
    public VrHisSchedulingWeek selectVrHisSchedulingWeekBySchedulingWeekId(Integer schedulingWeekId);

    /**
     * 查询排班星期列表
     * 
     * @param vrHisSchedulingWeek 排班星期
     * @return 排班星期集合
     */
    public List<VrHisSchedulingWeek> selectVrHisSchedulingWeekList(VrHisSchedulingWeek vrHisSchedulingWeek);

    /**
     * 新增排班星期
     * 
     * @param vrHisSchedulingWeek 排班星期
     * @return 结果
     */
    public int insertVrHisSchedulingWeek(VrHisSchedulingWeek vrHisSchedulingWeek);

    /**
     * 修改排班星期
     * 
     * @param vrHisSchedulingWeek 排班星期
     * @return 结果
     */
    public int updateVrHisSchedulingWeek(VrHisSchedulingWeek vrHisSchedulingWeek);

    /**
     * 批量删除排班星期
     * 
     * @param schedulingWeekIds 需要删除的排班星期主键集合
     * @return 结果
     */
    public int deleteVrHisSchedulingWeekBySchedulingWeekIds(Integer[] schedulingWeekIds);

    /**
     * 删除排班星期信息
     * 
     * @param schedulingWeekId 排班星期主键
     * @return 结果
     */
    public int deleteVrHisSchedulingWeekBySchedulingWeekId(Integer schedulingWeekId);
}
