package com.vrmlstudio.sales.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.sales.mapper.VrHisCarePaylogMapper;
import com.vrmlstudio.sales.domain.VrHisCarePaylog;
import com.vrmlstudio.sales.service.IVrHisCarePaylogService;

/**
 * 支付收费记录Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisCarePaylogServiceImpl implements IVrHisCarePaylogService 
{
    @Autowired
    private VrHisCarePaylogMapper vrHisCarePaylogMapper;

    /**
     * 查询支付收费记录
     * 
     * @param id 支付收费记录主键
     * @return 支付收费记录
     */
    @Override
    public VrHisCarePaylog selectVrHisCarePaylogById(Integer id)
    {
        return vrHisCarePaylogMapper.selectVrHisCarePaylogById(id);
    }

    /**
     * 查询支付收费记录列表
     * 
     * @param vrHisCarePaylog 支付收费记录
     * @return 支付收费记录
     */
    @Override
    public List<VrHisCarePaylog> selectVrHisCarePaylogList(VrHisCarePaylog vrHisCarePaylog)
    {
        return vrHisCarePaylogMapper.selectVrHisCarePaylogList(vrHisCarePaylog);
    }

    /**
     * 新增支付收费记录
     * 
     * @param vrHisCarePaylog 支付收费记录
     * @return 结果
     */
    @Override
    public int insertVrHisCarePaylog(VrHisCarePaylog vrHisCarePaylog)
    {
        return vrHisCarePaylogMapper.insertVrHisCarePaylog(vrHisCarePaylog);
    }

    /**
     * 修改支付收费记录
     * 
     * @param vrHisCarePaylog 支付收费记录
     * @return 结果
     */
    @Override
    public int updateVrHisCarePaylog(VrHisCarePaylog vrHisCarePaylog)
    {
        return vrHisCarePaylogMapper.updateVrHisCarePaylog(vrHisCarePaylog);
    }

    /**
     * 批量删除支付收费记录
     * 
     * @param ids 需要删除的支付收费记录主键
     * @return 结果
     */
    @Override
    public int deleteVrHisCarePaylogByIds(Integer[] ids)
    {
        return vrHisCarePaylogMapper.deleteVrHisCarePaylogByIds(ids);
    }

    /**
     * 删除支付收费记录信息
     * 
     * @param id 支付收费记录主键
     * @return 结果
     */
    @Override
    public int deleteVrHisCarePaylogById(Integer id)
    {
        return vrHisCarePaylogMapper.deleteVrHisCarePaylogById(id);
    }
}
