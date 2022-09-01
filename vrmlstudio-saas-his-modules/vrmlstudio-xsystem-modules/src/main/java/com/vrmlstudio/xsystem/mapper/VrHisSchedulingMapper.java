package com.vrmlstudio.xsystem.mapper;

import java.util.List;
import com.vrmlstudio.xsystem.domain.VrHisScheduling;

/**
 * 我的排班Mapper接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface VrHisSchedulingMapper 
{
    /**
     * 查询我的排班
     * 
     * @param schedulingId 我的排班主键
     * @return 我的排班
     */
    public VrHisScheduling selectVrHisSchedulingBySchedulingId(Long schedulingId);

    /**
     * 查询我的排班列表
     * 
     * @param vrHisScheduling 我的排班
     * @return 我的排班集合
     */
    public List<VrHisScheduling> selectVrHisSchedulingList(VrHisScheduling vrHisScheduling);

    /**
     * 新增我的排班
     * 
     * @param vrHisScheduling 我的排班
     * @return 结果
     */
    public int insertVrHisScheduling(VrHisScheduling vrHisScheduling);

    /**
     * 修改我的排班
     * 
     * @param vrHisScheduling 我的排班
     * @return 结果
     */
    public int updateVrHisScheduling(VrHisScheduling vrHisScheduling);

    /**
     * 删除我的排班
     * 
     * @param schedulingId 我的排班主键
     * @return 结果
     */
    public int deleteVrHisSchedulingBySchedulingId(Long schedulingId);

    /**
     * 批量删除我的排班
     * 
     * @param schedulingIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrHisSchedulingBySchedulingIds(Long[] schedulingIds);
}
