package com.vrmlstudio.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.xsystem.mapper.VrHisWxqrloginMapper;
import com.vrmlstudio.xsystem.domain.VrHisWxqrlogin;
import com.vrmlstudio.xsystem.service.IVrHisWxqrloginService;

/**
 * 微信扫码登录Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisWxqrloginServiceImpl implements IVrHisWxqrloginService 
{
    @Autowired
    private VrHisWxqrloginMapper vrHisWxqrloginMapper;

    /**
     * 查询微信扫码登录
     * 
     * @param id 微信扫码登录主键
     * @return 微信扫码登录
     */
    @Override
    public VrHisWxqrlogin selectVrHisWxqrloginById(Long id)
    {
        return vrHisWxqrloginMapper.selectVrHisWxqrloginById(id);
    }

    /**
     * 查询微信扫码登录列表
     * 
     * @param vrHisWxqrlogin 微信扫码登录
     * @return 微信扫码登录
     */
    @Override
    public List<VrHisWxqrlogin> selectVrHisWxqrloginList(VrHisWxqrlogin vrHisWxqrlogin)
    {
        return vrHisWxqrloginMapper.selectVrHisWxqrloginList(vrHisWxqrlogin);
    }

    /**
     * 新增微信扫码登录
     * 
     * @param vrHisWxqrlogin 微信扫码登录
     * @return 结果
     */
    @Override
    public int insertVrHisWxqrlogin(VrHisWxqrlogin vrHisWxqrlogin)
    {
        return vrHisWxqrloginMapper.insertVrHisWxqrlogin(vrHisWxqrlogin);
    }

    /**
     * 修改微信扫码登录
     * 
     * @param vrHisWxqrlogin 微信扫码登录
     * @return 结果
     */
    @Override
    public int updateVrHisWxqrlogin(VrHisWxqrlogin vrHisWxqrlogin)
    {
        return vrHisWxqrloginMapper.updateVrHisWxqrlogin(vrHisWxqrlogin);
    }

    /**
     * 批量删除微信扫码登录
     * 
     * @param ids 需要删除的微信扫码登录主键
     * @return 结果
     */
    @Override
    public int deleteVrHisWxqrloginByIds(Long[] ids)
    {
        return vrHisWxqrloginMapper.deleteVrHisWxqrloginByIds(ids);
    }

    /**
     * 删除微信扫码登录信息
     * 
     * @param id 微信扫码登录主键
     * @return 结果
     */
    @Override
    public int deleteVrHisWxqrloginById(Long id)
    {
        return vrHisWxqrloginMapper.deleteVrHisWxqrloginById(id);
    }
}
