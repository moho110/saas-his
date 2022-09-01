package com.vrmlstudio.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.xsystem.mapper.VrHisWxmpMapper;
import com.vrmlstudio.xsystem.domain.VrHisWxmp;
import com.vrmlstudio.xsystem.service.IVrHisWxmpService;

/**
 * 微信公众平台信息Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisWxmpServiceImpl implements IVrHisWxmpService 
{
    @Autowired
    private VrHisWxmpMapper vrHisWxmpMapper;

    /**
     * 查询微信公众平台信息
     * 
     * @param id 微信公众平台信息主键
     * @return 微信公众平台信息
     */
    @Override
    public VrHisWxmp selectVrHisWxmpById(Integer id)
    {
        return vrHisWxmpMapper.selectVrHisWxmpById(id);
    }

    /**
     * 查询微信公众平台信息列表
     * 
     * @param vrHisWxmp 微信公众平台信息
     * @return 微信公众平台信息
     */
    @Override
    public List<VrHisWxmp> selectVrHisWxmpList(VrHisWxmp vrHisWxmp)
    {
        return vrHisWxmpMapper.selectVrHisWxmpList(vrHisWxmp);
    }

    /**
     * 新增微信公众平台信息
     * 
     * @param vrHisWxmp 微信公众平台信息
     * @return 结果
     */
    @Override
    public int insertVrHisWxmp(VrHisWxmp vrHisWxmp)
    {
        return vrHisWxmpMapper.insertVrHisWxmp(vrHisWxmp);
    }

    /**
     * 修改微信公众平台信息
     * 
     * @param vrHisWxmp 微信公众平台信息
     * @return 结果
     */
    @Override
    public int updateVrHisWxmp(VrHisWxmp vrHisWxmp)
    {
        return vrHisWxmpMapper.updateVrHisWxmp(vrHisWxmp);
    }

    /**
     * 批量删除微信公众平台信息
     * 
     * @param ids 需要删除的微信公众平台信息主键
     * @return 结果
     */
    @Override
    public int deleteVrHisWxmpByIds(Integer[] ids)
    {
        return vrHisWxmpMapper.deleteVrHisWxmpByIds(ids);
    }

    /**
     * 删除微信公众平台信息信息
     * 
     * @param id 微信公众平台信息主键
     * @return 结果
     */
    @Override
    public int deleteVrHisWxmpById(Integer id)
    {
        return vrHisWxmpMapper.deleteVrHisWxmpById(id);
    }
}
