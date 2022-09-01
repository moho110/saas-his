package com.vrmlstudio.person.service.impl;

import java.util.List;
import com.vrmlstudio.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.person.mapper.VrHisMemberMapper;
import com.vrmlstudio.person.domain.VrHisMember;
import com.vrmlstudio.person.service.IVrHisMemberService;

/**
 * HIS用户Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisMemberServiceImpl implements IVrHisMemberService 
{
    @Autowired
    private VrHisMemberMapper vrHisMemberMapper;

    /**
     * 查询HIS用户
     * 
     * @param uid HIS用户主键
     * @return HIS用户
     */
    @Override
    public VrHisMember selectVrHisMemberByUid(Long uid)
    {
        return vrHisMemberMapper.selectVrHisMemberByUid(uid);
    }

    /**
     * 查询HIS用户列表
     * 
     * @param vrHisMember HIS用户
     * @return HIS用户
     */
    @Override
    public List<VrHisMember> selectVrHisMemberList(VrHisMember vrHisMember)
    {
        return vrHisMemberMapper.selectVrHisMemberList(vrHisMember);
    }

    /**
     * 新增HIS用户
     * 
     * @param vrHisMember HIS用户
     * @return 结果
     */
    @Override
    public int insertVrHisMember(VrHisMember vrHisMember)
    {
        vrHisMember.setCreateTime(DateUtils.getNowDate());
        return vrHisMemberMapper.insertVrHisMember(vrHisMember);
    }

    /**
     * 修改HIS用户
     * 
     * @param vrHisMember HIS用户
     * @return 结果
     */
    @Override
    public int updateVrHisMember(VrHisMember vrHisMember)
    {
        vrHisMember.setUpdateTime(DateUtils.getNowDate());
        return vrHisMemberMapper.updateVrHisMember(vrHisMember);
    }

    /**
     * 批量删除HIS用户
     * 
     * @param uids 需要删除的HIS用户主键
     * @return 结果
     */
    @Override
    public int deleteVrHisMemberByUids(Long[] uids)
    {
        return vrHisMemberMapper.deleteVrHisMemberByUids(uids);
    }

    /**
     * 删除HIS用户信息
     * 
     * @param uid HIS用户主键
     * @return 结果
     */
    @Override
    public int deleteVrHisMemberByUid(Long uid)
    {
        return vrHisMemberMapper.deleteVrHisMemberByUid(uid);
    }
}
