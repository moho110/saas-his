package com.vrmlstudio.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.xsystem.mapper.VrHisWxqrMapper;
import com.vrmlstudio.xsystem.domain.VrHisWxqr;
import com.vrmlstudio.xsystem.service.IVrHisWxqrService;

/**
 * 保存微信永久二维码及用户关系Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisWxqrServiceImpl implements IVrHisWxqrService 
{
    @Autowired
    private VrHisWxqrMapper vrHisWxqrMapper;

    /**
     * 查询保存微信永久二维码及用户关系
     * 
     * @param id 保存微信永久二维码及用户关系主键
     * @return 保存微信永久二维码及用户关系
     */
    @Override
    public VrHisWxqr selectVrHisWxqrById(Integer id)
    {
        return vrHisWxqrMapper.selectVrHisWxqrById(id);
    }

    /**
     * 查询保存微信永久二维码及用户关系列表
     * 
     * @param vrHisWxqr 保存微信永久二维码及用户关系
     * @return 保存微信永久二维码及用户关系
     */
    @Override
    public List<VrHisWxqr> selectVrHisWxqrList(VrHisWxqr vrHisWxqr)
    {
        return vrHisWxqrMapper.selectVrHisWxqrList(vrHisWxqr);
    }

    /**
     * 新增保存微信永久二维码及用户关系
     * 
     * @param vrHisWxqr 保存微信永久二维码及用户关系
     * @return 结果
     */
    @Override
    public int insertVrHisWxqr(VrHisWxqr vrHisWxqr)
    {
        return vrHisWxqrMapper.insertVrHisWxqr(vrHisWxqr);
    }

    /**
     * 修改保存微信永久二维码及用户关系
     * 
     * @param vrHisWxqr 保存微信永久二维码及用户关系
     * @return 结果
     */
    @Override
    public int updateVrHisWxqr(VrHisWxqr vrHisWxqr)
    {
        return vrHisWxqrMapper.updateVrHisWxqr(vrHisWxqr);
    }

    /**
     * 批量删除保存微信永久二维码及用户关系
     * 
     * @param ids 需要删除的保存微信永久二维码及用户关系主键
     * @return 结果
     */
    @Override
    public int deleteVrHisWxqrByIds(Integer[] ids)
    {
        return vrHisWxqrMapper.deleteVrHisWxqrByIds(ids);
    }

    /**
     * 删除保存微信永久二维码及用户关系信息
     * 
     * @param id 保存微信永久二维码及用户关系主键
     * @return 结果
     */
    @Override
    public int deleteVrHisWxqrById(Integer id)
    {
        return vrHisWxqrMapper.deleteVrHisWxqrById(id);
    }
}
