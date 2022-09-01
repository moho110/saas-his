package com.vrmlstudio.sales.service.impl;

import java.util.List;

import com.vrmlstudio.sales.service.IVrHisCareOrderSubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.sales.mapper.VrHisCareOrderSubMapper;
import com.vrmlstudio.sales.domain.VrHisCareOrderSub;

/**
 * 开诊用药明细Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisCareOrderSubServiceImpl implements IVrHisCareOrderSubService
{
    @Autowired
    private VrHisCareOrderSubMapper vrHisCareOrderSubMapper;

    /**
     * 查询开诊用药明细
     * 
     * @param id 开诊用药明细主键
     * @return 开诊用药明细
     */
    @Override
    public VrHisCareOrderSub selectVrHisCareOrderSubById(Integer id)
    {
        return vrHisCareOrderSubMapper.selectVrHisCareOrderSubById(id);
    }

    /**
     * 查询开诊用药明细列表
     * 
     * @param vrHisCareOrderSub 开诊用药明细
     * @return 开诊用药明细
     */
    @Override
    public List<VrHisCareOrderSub> selectVrHisCareOrderSubList(VrHisCareOrderSub vrHisCareOrderSub)
    {
        return vrHisCareOrderSubMapper.selectVrHisCareOrderSubList(vrHisCareOrderSub);
    }

    /**
     * 新增开诊用药明细
     * 
     * @param vrHisCareOrderSub 开诊用药明细
     * @return 结果
     */
    @Override
    public int insertVrHisCareOrderSub(VrHisCareOrderSub vrHisCareOrderSub)
    {
        return vrHisCareOrderSubMapper.insertVrHisCareOrderSub(vrHisCareOrderSub);
    }

    /**
     * 修改开诊用药明细
     * 
     * @param vrHisCareOrderSub 开诊用药明细
     * @return 结果
     */
    @Override
    public int updateVrHisCareOrderSub(VrHisCareOrderSub vrHisCareOrderSub)
    {
        return vrHisCareOrderSubMapper.updateVrHisCareOrderSub(vrHisCareOrderSub);
    }

    /**
     * 批量删除开诊用药明细
     * 
     * @param ids 需要删除的开诊用药明细主键
     * @return 结果
     */
    @Override
    public int deleteVrHisCareOrderSubByIds(Integer[] ids)
    {
        return vrHisCareOrderSubMapper.deleteVrHisCareOrderSubByIds(ids);
    }

    /**
     * 删除开诊用药明细信息
     * 
     * @param id 开诊用药明细主键
     * @return 结果
     */
    @Override
    public int deleteVrHisCareOrderSubById(Integer id)
    {
        return vrHisCareOrderSubMapper.deleteVrHisCareOrderSubById(id);
    }
}
