package com.vrmlstudio.xsystem.mapper;

import java.util.List;
import com.vrmlstudio.xsystem.domain.VrHisSchedulingSubsection;

/**
 * 排班时段Mapper接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface VrHisSchedulingSubsectionMapper 
{
    /**
     * 查询排班时段
     * 
     * @param schedulingSubsectionId 排班时段主键
     * @return 排班时段
     */
    public VrHisSchedulingSubsection selectVrHisSchedulingSubsectionBySchedulingSubsectionId(Integer schedulingSubsectionId);

    /**
     * 查询排班时段列表
     * 
     * @param vrHisSchedulingSubsection 排班时段
     * @return 排班时段集合
     */
    public List<VrHisSchedulingSubsection> selectVrHisSchedulingSubsectionList(VrHisSchedulingSubsection vrHisSchedulingSubsection);

    /**
     * 新增排班时段
     * 
     * @param vrHisSchedulingSubsection 排班时段
     * @return 结果
     */
    public int insertVrHisSchedulingSubsection(VrHisSchedulingSubsection vrHisSchedulingSubsection);

    /**
     * 修改排班时段
     * 
     * @param vrHisSchedulingSubsection 排班时段
     * @return 结果
     */
    public int updateVrHisSchedulingSubsection(VrHisSchedulingSubsection vrHisSchedulingSubsection);

    /**
     * 删除排班时段
     * 
     * @param schedulingSubsectionId 排班时段主键
     * @return 结果
     */
    public int deleteVrHisSchedulingSubsectionBySchedulingSubsectionId(Integer schedulingSubsectionId);

    /**
     * 批量删除排班时段
     * 
     * @param schedulingSubsectionIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrHisSchedulingSubsectionBySchedulingSubsectionIds(Integer[] schedulingSubsectionIds);
}
