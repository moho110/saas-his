package com.vrmlstudio.sales.mapper;

import java.util.List;
import com.vrmlstudio.sales.domain.VrHisMchpay;

/**
 * 提现付款记录，微信企业付款记录Mapper接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface VrHisMchpayMapper 
{
    /**
     * 查询提现付款记录，微信企业付款记录
     * 
     * @param id 提现付款记录，微信企业付款记录主键
     * @return 提现付款记录，微信企业付款记录
     */
    public VrHisMchpay selectVrHisMchpayById(Integer id);

    /**
     * 查询提现付款记录，微信企业付款记录列表
     * 
     * @param vrHisMchpay 提现付款记录，微信企业付款记录
     * @return 提现付款记录，微信企业付款记录集合
     */
    public List<VrHisMchpay> selectVrHisMchpayList(VrHisMchpay vrHisMchpay);

    /**
     * 新增提现付款记录，微信企业付款记录
     * 
     * @param vrHisMchpay 提现付款记录，微信企业付款记录
     * @return 结果
     */
    public int insertVrHisMchpay(VrHisMchpay vrHisMchpay);

    /**
     * 修改提现付款记录，微信企业付款记录
     * 
     * @param vrHisMchpay 提现付款记录，微信企业付款记录
     * @return 结果
     */
    public int updateVrHisMchpay(VrHisMchpay vrHisMchpay);

    /**
     * 删除提现付款记录，微信企业付款记录
     * 
     * @param id 提现付款记录，微信企业付款记录主键
     * @return 结果
     */
    public int deleteVrHisMchpayById(Integer id);

    /**
     * 批量删除提现付款记录，微信企业付款记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrHisMchpayByIds(Integer[] ids);
}
