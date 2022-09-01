package com.vrmlstudio.xsystem.service.impl;

import java.util.List;

import com.vrmlstudio.xsystem.service.IVrHisSchedulingSubsectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.xsystem.mapper.VrHisSchedulingSubsectionMapper;
import com.vrmlstudio.xsystem.domain.VrHisSchedulingSubsection;

/**
 * 排班时段Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisSchedulingSubsectionServiceImpl implements IVrHisSchedulingSubsectionService
{
    @Autowired
    private VrHisSchedulingSubsectionMapper vrHisSchedulingSubsectionMapper;

    /**
     * 查询排班时段
     * 
     * @param schedulingSubsectionId 排班时段主键
     * @return 排班时段
     */
    @Override
    public VrHisSchedulingSubsection selectVrHisSchedulingSubsectionBySchedulingSubsectionId(Integer schedulingSubsectionId)
    {
        return vrHisSchedulingSubsectionMapper.selectVrHisSchedulingSubsectionBySchedulingSubsectionId(schedulingSubsectionId);
    }

    /**
     * 查询排班时段列表
     * 
     * @param vrHisSchedulingSubsection 排班时段
     * @return 排班时段
     */
    @Override
    public List<VrHisSchedulingSubsection> selectVrHisSchedulingSubsectionList(VrHisSchedulingSubsection vrHisSchedulingSubsection)
    {
        return vrHisSchedulingSubsectionMapper.selectVrHisSchedulingSubsectionList(vrHisSchedulingSubsection);
    }

    /**
     * 新增排班时段
     * 
     * @param vrHisSchedulingSubsection 排班时段
     * @return 结果
     */
    @Override
    public int insertVrHisSchedulingSubsection(VrHisSchedulingSubsection vrHisSchedulingSubsection)
    {
        return vrHisSchedulingSubsectionMapper.insertVrHisSchedulingSubsection(vrHisSchedulingSubsection);
    }

    /**
     * 修改排班时段
     * 
     * @param vrHisSchedulingSubsection 排班时段
     * @return 结果
     */
    @Override
    public int updateVrHisSchedulingSubsection(VrHisSchedulingSubsection vrHisSchedulingSubsection)
    {
        return vrHisSchedulingSubsectionMapper.updateVrHisSchedulingSubsection(vrHisSchedulingSubsection);
    }

    /**
     * 批量删除排班时段
     * 
     * @param schedulingSubsectionIds 需要删除的排班时段主键
     * @return 结果
     */
    @Override
    public int deleteVrHisSchedulingSubsectionBySchedulingSubsectionIds(Integer[] schedulingSubsectionIds)
    {
        return vrHisSchedulingSubsectionMapper.deleteVrHisSchedulingSubsectionBySchedulingSubsectionIds(schedulingSubsectionIds);
    }

    /**
     * 删除排班时段信息
     * 
     * @param schedulingSubsectionId 排班时段主键
     * @return 结果
     */
    @Override
    public int deleteVrHisSchedulingSubsectionBySchedulingSubsectionId(Integer schedulingSubsectionId)
    {
        return vrHisSchedulingSubsectionMapper.deleteVrHisSchedulingSubsectionBySchedulingSubsectionId(schedulingSubsectionId);
    }
}
