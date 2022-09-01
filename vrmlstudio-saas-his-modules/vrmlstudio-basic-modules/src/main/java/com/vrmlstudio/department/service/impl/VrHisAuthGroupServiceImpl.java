package com.vrmlstudio.department.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.department.mapper.VrHisAuthGroupMapper;
import com.vrmlstudio.department.domain.VrHisAuthGroup;
import com.vrmlstudio.department.service.IVrHisAuthGroupService;

/**
 * 用户组Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisAuthGroupServiceImpl implements IVrHisAuthGroupService 
{
    @Autowired
    private VrHisAuthGroupMapper vrHisAuthGroupMapper;

    /**
     * 查询用户组
     * 
     * @param id 用户组主键
     * @return 用户组
     */
    @Override
    public VrHisAuthGroup selectVrHisAuthGroupById(Integer id)
    {
        return vrHisAuthGroupMapper.selectVrHisAuthGroupById(id);
    }

    /**
     * 查询用户组列表
     * 
     * @param vrHisAuthGroup 用户组
     * @return 用户组
     */
    @Override
    public List<VrHisAuthGroup> selectVrHisAuthGroupList(VrHisAuthGroup vrHisAuthGroup)
    {
        return vrHisAuthGroupMapper.selectVrHisAuthGroupList(vrHisAuthGroup);
    }

    /**
     * 新增用户组
     * 
     * @param vrHisAuthGroup 用户组
     * @return 结果
     */
    @Override
    public int insertVrHisAuthGroup(VrHisAuthGroup vrHisAuthGroup)
    {
        return vrHisAuthGroupMapper.insertVrHisAuthGroup(vrHisAuthGroup);
    }

    /**
     * 修改用户组
     * 
     * @param vrHisAuthGroup 用户组
     * @return 结果
     */
    @Override
    public int updateVrHisAuthGroup(VrHisAuthGroup vrHisAuthGroup)
    {
        return vrHisAuthGroupMapper.updateVrHisAuthGroup(vrHisAuthGroup);
    }

    /**
     * 批量删除用户组
     * 
     * @param ids 需要删除的用户组主键
     * @return 结果
     */
    @Override
    public int deleteVrHisAuthGroupByIds(Integer[] ids)
    {
        return vrHisAuthGroupMapper.deleteVrHisAuthGroupByIds(ids);
    }

    /**
     * 删除用户组信息
     * 
     * @param id 用户组主键
     * @return 结果
     */
    @Override
    public int deleteVrHisAuthGroupById(Integer id)
    {
        return vrHisAuthGroupMapper.deleteVrHisAuthGroupById(id);
    }
}
