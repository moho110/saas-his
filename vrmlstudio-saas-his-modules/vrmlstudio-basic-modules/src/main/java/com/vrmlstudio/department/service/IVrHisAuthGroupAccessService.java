package com.vrmlstudio.department.service;

import java.util.List;
import com.vrmlstudio.department.domain.VrHisAuthGroupAccess;

/**
 * 用户组与用户关联Service接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface IVrHisAuthGroupAccessService 
{
    /**
     * 查询用户组与用户关联
     * 
     * @param uid 用户组与用户关联主键
     * @return 用户组与用户关联
     */
    public VrHisAuthGroupAccess selectVrHisAuthGroupAccessByUid(Integer uid);

    /**
     * 查询用户组与用户关联列表
     * 
     * @param vrHisAuthGroupAccess 用户组与用户关联
     * @return 用户组与用户关联集合
     */
    public List<VrHisAuthGroupAccess> selectVrHisAuthGroupAccessList(VrHisAuthGroupAccess vrHisAuthGroupAccess);

    /**
     * 新增用户组与用户关联
     * 
     * @param vrHisAuthGroupAccess 用户组与用户关联
     * @return 结果
     */
    public int insertVrHisAuthGroupAccess(VrHisAuthGroupAccess vrHisAuthGroupAccess);

    /**
     * 修改用户组与用户关联
     * 
     * @param vrHisAuthGroupAccess 用户组与用户关联
     * @return 结果
     */
    public int updateVrHisAuthGroupAccess(VrHisAuthGroupAccess vrHisAuthGroupAccess);

    /**
     * 批量删除用户组与用户关联
     * 
     * @param uids 需要删除的用户组与用户关联主键集合
     * @return 结果
     */
    public int deleteVrHisAuthGroupAccessByUids(Integer[] uids);

    /**
     * 删除用户组与用户关联信息
     * 
     * @param uid 用户组与用户关联主键
     * @return 结果
     */
    public int deleteVrHisAuthGroupAccessByUid(Integer uid);
}
