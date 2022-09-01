package com.vrmlstudio.person.service;

import java.util.List;
import com.vrmlstudio.person.domain.VrHisMember;

/**
 * HIS用户Service接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface IVrHisMemberService 
{
    /**
     * 查询HIS用户
     * 
     * @param uid HIS用户主键
     * @return HIS用户
     */
    public VrHisMember selectVrHisMemberByUid(Long uid);

    /**
     * 查询HIS用户列表
     * 
     * @param vrHisMember HIS用户
     * @return HIS用户集合
     */
    public List<VrHisMember> selectVrHisMemberList(VrHisMember vrHisMember);

    /**
     * 新增HIS用户
     * 
     * @param vrHisMember HIS用户
     * @return 结果
     */
    public int insertVrHisMember(VrHisMember vrHisMember);

    /**
     * 修改HIS用户
     * 
     * @param vrHisMember HIS用户
     * @return 结果
     */
    public int updateVrHisMember(VrHisMember vrHisMember);

    /**
     * 批量删除HIS用户
     * 
     * @param uids 需要删除的HIS用户主键集合
     * @return 结果
     */
    public int deleteVrHisMemberByUids(Long[] uids);

    /**
     * 删除HIS用户信息
     * 
     * @param uid HIS用户主键
     * @return 结果
     */
    public int deleteVrHisMemberByUid(Long uid);
}
