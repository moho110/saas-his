package com.vrmlstudio.department.service.impl;

import java.util.List;

import com.vrmlstudio.department.service.IVrHisAuthGroupAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.department.mapper.VrHisAuthGroupAccessMapper;
import com.vrmlstudio.department.domain.VrHisAuthGroupAccess;

/**
 * 用户组与用户关联Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisAuthGroupAccessServiceImpl implements IVrHisAuthGroupAccessService
{
    @Autowired
    private VrHisAuthGroupAccessMapper vrHisAuthGroupAccessMapper;

    /**
     * 查询用户组与用户关联
     * 
     * @param uid 用户组与用户关联主键
     * @return 用户组与用户关联
     */
    @Override
    public VrHisAuthGroupAccess selectVrHisAuthGroupAccessByUid(Integer uid)
    {
        return vrHisAuthGroupAccessMapper.selectVrHisAuthGroupAccessByUid(uid);
    }

    /**
     * 查询用户组与用户关联列表
     * 
     * @param vrHisAuthGroupAccess 用户组与用户关联
     * @return 用户组与用户关联
     */
    @Override
    public List<VrHisAuthGroupAccess> selectVrHisAuthGroupAccessList(VrHisAuthGroupAccess vrHisAuthGroupAccess)
    {
        return vrHisAuthGroupAccessMapper.selectVrHisAuthGroupAccessList(vrHisAuthGroupAccess);
    }

    /**
     * 新增用户组与用户关联
     * 
     * @param vrHisAuthGroupAccess 用户组与用户关联
     * @return 结果
     */
    @Override
    public int insertVrHisAuthGroupAccess(VrHisAuthGroupAccess vrHisAuthGroupAccess)
    {
        return vrHisAuthGroupAccessMapper.insertVrHisAuthGroupAccess(vrHisAuthGroupAccess);
    }

    /**
     * 修改用户组与用户关联
     * 
     * @param vrHisAuthGroupAccess 用户组与用户关联
     * @return 结果
     */
    @Override
    public int updateVrHisAuthGroupAccess(VrHisAuthGroupAccess vrHisAuthGroupAccess)
    {
        return vrHisAuthGroupAccessMapper.updateVrHisAuthGroupAccess(vrHisAuthGroupAccess);
    }

    /**
     * 批量删除用户组与用户关联
     * 
     * @param uids 需要删除的用户组与用户关联主键
     * @return 结果
     */
    @Override
    public int deleteVrHisAuthGroupAccessByUids(Integer[] uids)
    {
        return vrHisAuthGroupAccessMapper.deleteVrHisAuthGroupAccessByUids(uids);
    }

    /**
     * 删除用户组与用户关联信息
     * 
     * @param uid 用户组与用户关联主键
     * @return 结果
     */
    @Override
    public int deleteVrHisAuthGroupAccessByUid(Integer uid)
    {
        return vrHisAuthGroupAccessMapper.deleteVrHisAuthGroupAccessByUid(uid);
    }
}
