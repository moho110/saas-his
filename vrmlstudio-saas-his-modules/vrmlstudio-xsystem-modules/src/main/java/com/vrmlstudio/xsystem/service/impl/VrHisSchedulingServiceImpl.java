package com.vrmlstudio.xsystem.service.impl;

import java.util.List;
import com.vrmlstudio.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.xsystem.mapper.VrHisSchedulingMapper;
import com.vrmlstudio.xsystem.domain.VrHisScheduling;
import com.vrmlstudio.xsystem.service.IVrHisSchedulingService;

/**
 * 我的排班Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisSchedulingServiceImpl implements IVrHisSchedulingService 
{
    @Autowired
    private VrHisSchedulingMapper vrHisSchedulingMapper;

    /**
     * 查询我的排班
     * 
     * @param schedulingId 我的排班主键
     * @return 我的排班
     */
    @Override
    public VrHisScheduling selectVrHisSchedulingBySchedulingId(Long schedulingId)
    {
        return vrHisSchedulingMapper.selectVrHisSchedulingBySchedulingId(schedulingId);
    }

    /**
     * 查询我的排班列表
     * 
     * @param vrHisScheduling 我的排班
     * @return 我的排班
     */
    @Override
    public List<VrHisScheduling> selectVrHisSchedulingList(VrHisScheduling vrHisScheduling)
    {
        return vrHisSchedulingMapper.selectVrHisSchedulingList(vrHisScheduling);
    }

    /**
     * 新增我的排班
     * 
     * @param vrHisScheduling 我的排班
     * @return 结果
     */
    @Override
    public int insertVrHisScheduling(VrHisScheduling vrHisScheduling)
    {
        vrHisScheduling.setCreateTime(DateUtils.getNowDate());
        return vrHisSchedulingMapper.insertVrHisScheduling(vrHisScheduling);
    }

    /**
     * 修改我的排班
     * 
     * @param vrHisScheduling 我的排班
     * @return 结果
     */
    @Override
    public int updateVrHisScheduling(VrHisScheduling vrHisScheduling)
    {
        vrHisScheduling.setUpdateTime(DateUtils.getNowDate());
        return vrHisSchedulingMapper.updateVrHisScheduling(vrHisScheduling);
    }

    /**
     * 批量删除我的排班
     * 
     * @param schedulingIds 需要删除的我的排班主键
     * @return 结果
     */
    @Override
    public int deleteVrHisSchedulingBySchedulingIds(Long[] schedulingIds)
    {
        return vrHisSchedulingMapper.deleteVrHisSchedulingBySchedulingIds(schedulingIds);
    }

    /**
     * 删除我的排班信息
     * 
     * @param schedulingId 我的排班主键
     * @return 结果
     */
    @Override
    public int deleteVrHisSchedulingBySchedulingId(Long schedulingId)
    {
        return vrHisSchedulingMapper.deleteVrHisSchedulingBySchedulingId(schedulingId);
    }
}
