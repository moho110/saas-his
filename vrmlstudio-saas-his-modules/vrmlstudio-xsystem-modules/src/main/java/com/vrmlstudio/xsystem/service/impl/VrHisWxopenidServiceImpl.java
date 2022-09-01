package com.vrmlstudio.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.xsystem.mapper.VrHisWxopenidMapper;
import com.vrmlstudio.xsystem.domain.VrHisWxopenid;
import com.vrmlstudio.xsystem.service.IVrHisWxopenidService;

/**
 * 绑定微信openid和用户id的关系Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisWxopenidServiceImpl implements IVrHisWxopenidService 
{
    @Autowired
    private VrHisWxopenidMapper vrHisWxopenidMapper;

    /**
     * 查询绑定微信openid和用户id的关系
     * 
     * @param id 绑定微信openid和用户id的关系主键
     * @return 绑定微信openid和用户id的关系
     */
    @Override
    public VrHisWxopenid selectVrHisWxopenidById(Integer id)
    {
        return vrHisWxopenidMapper.selectVrHisWxopenidById(id);
    }

    /**
     * 查询绑定微信openid和用户id的关系列表
     * 
     * @param vrHisWxopenid 绑定微信openid和用户id的关系
     * @return 绑定微信openid和用户id的关系
     */
    @Override
    public List<VrHisWxopenid> selectVrHisWxopenidList(VrHisWxopenid vrHisWxopenid)
    {
        return vrHisWxopenidMapper.selectVrHisWxopenidList(vrHisWxopenid);
    }

    /**
     * 新增绑定微信openid和用户id的关系
     * 
     * @param vrHisWxopenid 绑定微信openid和用户id的关系
     * @return 结果
     */
    @Override
    public int insertVrHisWxopenid(VrHisWxopenid vrHisWxopenid)
    {
        return vrHisWxopenidMapper.insertVrHisWxopenid(vrHisWxopenid);
    }

    /**
     * 修改绑定微信openid和用户id的关系
     * 
     * @param vrHisWxopenid 绑定微信openid和用户id的关系
     * @return 结果
     */
    @Override
    public int updateVrHisWxopenid(VrHisWxopenid vrHisWxopenid)
    {
        return vrHisWxopenidMapper.updateVrHisWxopenid(vrHisWxopenid);
    }

    /**
     * 批量删除绑定微信openid和用户id的关系
     * 
     * @param ids 需要删除的绑定微信openid和用户id的关系主键
     * @return 结果
     */
    @Override
    public int deleteVrHisWxopenidByIds(Integer[] ids)
    {
        return vrHisWxopenidMapper.deleteVrHisWxopenidByIds(ids);
    }

    /**
     * 删除绑定微信openid和用户id的关系信息
     * 
     * @param id 绑定微信openid和用户id的关系主键
     * @return 结果
     */
    @Override
    public int deleteVrHisWxopenidById(Integer id)
    {
        return vrHisWxopenidMapper.deleteVrHisWxopenidById(id);
    }
}
