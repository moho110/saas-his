package com.vrmlstudio.sales.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.sales.mapper.VrHisMchpayMapper;
import com.vrmlstudio.sales.domain.VrHisMchpay;
import com.vrmlstudio.sales.service.IVrHisMchpayService;

/**
 * 提现付款记录，微信企业付款记录Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisMchpayServiceImpl implements IVrHisMchpayService 
{
    @Autowired
    private VrHisMchpayMapper vrHisMchpayMapper;

    /**
     * 查询提现付款记录，微信企业付款记录
     * 
     * @param id 提现付款记录，微信企业付款记录主键
     * @return 提现付款记录，微信企业付款记录
     */
    @Override
    public VrHisMchpay selectVrHisMchpayById(Integer id)
    {
        return vrHisMchpayMapper.selectVrHisMchpayById(id);
    }

    /**
     * 查询提现付款记录，微信企业付款记录列表
     * 
     * @param vrHisMchpay 提现付款记录，微信企业付款记录
     * @return 提现付款记录，微信企业付款记录
     */
    @Override
    public List<VrHisMchpay> selectVrHisMchpayList(VrHisMchpay vrHisMchpay)
    {
        return vrHisMchpayMapper.selectVrHisMchpayList(vrHisMchpay);
    }

    /**
     * 新增提现付款记录，微信企业付款记录
     * 
     * @param vrHisMchpay 提现付款记录，微信企业付款记录
     * @return 结果
     */
    @Override
    public int insertVrHisMchpay(VrHisMchpay vrHisMchpay)
    {
        return vrHisMchpayMapper.insertVrHisMchpay(vrHisMchpay);
    }

    /**
     * 修改提现付款记录，微信企业付款记录
     * 
     * @param vrHisMchpay 提现付款记录，微信企业付款记录
     * @return 结果
     */
    @Override
    public int updateVrHisMchpay(VrHisMchpay vrHisMchpay)
    {
        return vrHisMchpayMapper.updateVrHisMchpay(vrHisMchpay);
    }

    /**
     * 批量删除提现付款记录，微信企业付款记录
     * 
     * @param ids 需要删除的提现付款记录，微信企业付款记录主键
     * @return 结果
     */
    @Override
    public int deleteVrHisMchpayByIds(Integer[] ids)
    {
        return vrHisMchpayMapper.deleteVrHisMchpayByIds(ids);
    }

    /**
     * 删除提现付款记录，微信企业付款记录信息
     * 
     * @param id 提现付款记录，微信企业付款记录主键
     * @return 结果
     */
    @Override
    public int deleteVrHisMchpayById(Integer id)
    {
        return vrHisMchpayMapper.deleteVrHisMchpayById(id);
    }
}
