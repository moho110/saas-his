package com.vrmlstudio.sales.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.sales.mapper.VrHisCareOrderMapper;
import com.vrmlstudio.sales.domain.VrHisCareOrder;
import com.vrmlstudio.sales.service.IVrHisCareOrderService;

/**
 * 处方列Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisCareOrderServiceImpl implements IVrHisCareOrderService 
{
    @Autowired
    private VrHisCareOrderMapper vrHisCareOrderMapper;

    /**
     * 查询处方列
     * 
     * @param id 处方列主键
     * @return 处方列
     */
    @Override
    public VrHisCareOrder selectVrHisCareOrderById(Integer id)
    {
        return vrHisCareOrderMapper.selectVrHisCareOrderById(id);
    }

    /**
     * 查询处方列列表
     * 
     * @param vrHisCareOrder 处方列
     * @return 处方列
     */
    @Override
    public List<VrHisCareOrder> selectVrHisCareOrderList(VrHisCareOrder vrHisCareOrder)
    {
        return vrHisCareOrderMapper.selectVrHisCareOrderList(vrHisCareOrder);
    }

    /**
     * 新增处方列
     * 
     * @param vrHisCareOrder 处方列
     * @return 结果
     */
    @Override
    public int insertVrHisCareOrder(VrHisCareOrder vrHisCareOrder)
    {
        return vrHisCareOrderMapper.insertVrHisCareOrder(vrHisCareOrder);
    }

    /**
     * 修改处方列
     * 
     * @param vrHisCareOrder 处方列
     * @return 结果
     */
    @Override
    public int updateVrHisCareOrder(VrHisCareOrder vrHisCareOrder)
    {
        return vrHisCareOrderMapper.updateVrHisCareOrder(vrHisCareOrder);
    }

    /**
     * 批量删除处方列
     * 
     * @param ids 需要删除的处方列主键
     * @return 结果
     */
    @Override
    public int deleteVrHisCareOrderByIds(Integer[] ids)
    {
        return vrHisCareOrderMapper.deleteVrHisCareOrderByIds(ids);
    }

    /**
     * 删除处方列信息
     * 
     * @param id 处方列主键
     * @return 结果
     */
    @Override
    public int deleteVrHisCareOrderById(Integer id)
    {
        return vrHisCareOrderMapper.deleteVrHisCareOrderById(id);
    }
}
