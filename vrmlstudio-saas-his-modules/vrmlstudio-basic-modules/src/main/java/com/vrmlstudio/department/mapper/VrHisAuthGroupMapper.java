package com.vrmlstudio.department.mapper;

import java.util.List;
import com.vrmlstudio.department.domain.VrHisAuthGroup;

/**
 * 用户组Mapper接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface VrHisAuthGroupMapper 
{
    /**
     * 查询用户组
     * 
     * @param id 用户组主键
     * @return 用户组
     */
    public VrHisAuthGroup selectVrHisAuthGroupById(Integer id);

    /**
     * 查询用户组列表
     * 
     * @param vrHisAuthGroup 用户组
     * @return 用户组集合
     */
    public List<VrHisAuthGroup> selectVrHisAuthGroupList(VrHisAuthGroup vrHisAuthGroup);

    /**
     * 新增用户组
     * 
     * @param vrHisAuthGroup 用户组
     * @return 结果
     */
    public int insertVrHisAuthGroup(VrHisAuthGroup vrHisAuthGroup);

    /**
     * 修改用户组
     * 
     * @param vrHisAuthGroup 用户组
     * @return 结果
     */
    public int updateVrHisAuthGroup(VrHisAuthGroup vrHisAuthGroup);

    /**
     * 删除用户组
     * 
     * @param id 用户组主键
     * @return 结果
     */
    public int deleteVrHisAuthGroupById(Integer id);

    /**
     * 批量删除用户组
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrHisAuthGroupByIds(Integer[] ids);
}
