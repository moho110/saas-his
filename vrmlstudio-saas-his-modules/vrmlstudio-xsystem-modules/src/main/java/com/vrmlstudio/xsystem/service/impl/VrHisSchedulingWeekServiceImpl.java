package com.vrmlstudio.xsystem.service.impl;

import java.util.List;

import com.vrmlstudio.xsystem.service.IVrHisSchedulingWeekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.xsystem.mapper.VrHisSchedulingWeekMapper;
import com.vrmlstudio.xsystem.domain.VrHisSchedulingWeek;

/**
 * 排班星期Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisSchedulingWeekServiceImpl implements IVrHisSchedulingWeekService
{
    @Autowired
    private VrHisSchedulingWeekMapper vrHisSchedulingWeekMapper;

    /**
     * 查询排班星期
     * 
     * @param schedulingWeekId 排班星期主键
     * @return 排班星期
     */
    @Override
    public VrHisSchedulingWeek selectVrHisSchedulingWeekBySchedulingWeekId(Integer schedulingWeekId)
    {
        return vrHisSchedulingWeekMapper.selectVrHisSchedulingWeekBySchedulingWeekId(schedulingWeekId);
    }

    /**
     * 查询排班星期列表
     * 
     * @param vrHisSchedulingWeek 排班星期
     * @return 排班星期
     */
    @Override
    public List<VrHisSchedulingWeek> selectVrHisSchedulingWeekList(VrHisSchedulingWeek vrHisSchedulingWeek)
    {
        return vrHisSchedulingWeekMapper.selectVrHisSchedulingWeekList(vrHisSchedulingWeek);
    }

    /**
     * 新增排班星期
     * 
     * @param vrHisSchedulingWeek 排班星期
     * @return 结果
     */
    @Override
    public int insertVrHisSchedulingWeek(VrHisSchedulingWeek vrHisSchedulingWeek)
    {
        return vrHisSchedulingWeekMapper.insertVrHisSchedulingWeek(vrHisSchedulingWeek);
    }

    /**
     * 修改排班星期
     * 
     * @param vrHisSchedulingWeek 排班星期
     * @return 结果
     */
    @Override
    public int updateVrHisSchedulingWeek(VrHisSchedulingWeek vrHisSchedulingWeek)
    {
        return vrHisSchedulingWeekMapper.updateVrHisSchedulingWeek(vrHisSchedulingWeek);
    }

    /**
     * 批量删除排班星期
     * 
     * @param schedulingWeekIds 需要删除的排班星期主键
     * @return 结果
     */
    @Override
    public int deleteVrHisSchedulingWeekBySchedulingWeekIds(Integer[] schedulingWeekIds)
    {
        return vrHisSchedulingWeekMapper.deleteVrHisSchedulingWeekBySchedulingWeekIds(schedulingWeekIds);
    }

    /**
     * 删除排班星期信息
     * 
     * @param schedulingWeekId 排班星期主键
     * @return 结果
     */
    @Override
    public int deleteVrHisSchedulingWeekBySchedulingWeekId(Integer schedulingWeekId)
    {
        return vrHisSchedulingWeekMapper.deleteVrHisSchedulingWeekBySchedulingWeekId(schedulingWeekId);
    }
}
