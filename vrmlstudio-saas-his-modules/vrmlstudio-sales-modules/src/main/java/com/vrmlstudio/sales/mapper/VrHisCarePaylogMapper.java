package com.vrmlstudio.sales.mapper;

import java.util.List;
import com.vrmlstudio.sales.domain.VrHisCarePaylog;

/**
 * 支付收费记录Mapper接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface VrHisCarePaylogMapper 
{
    /**
     * 查询支付收费记录
     * 
     * @param id 支付收费记录主键
     * @return 支付收费记录
     */
    public VrHisCarePaylog selectVrHisCarePaylogById(Integer id);

    /**
     * 查询支付收费记录列表
     * 
     * @param vrHisCarePaylog 支付收费记录
     * @return 支付收费记录集合
     */
    public List<VrHisCarePaylog> selectVrHisCarePaylogList(VrHisCarePaylog vrHisCarePaylog);

    /**
     * 新增支付收费记录
     * 
     * @param vrHisCarePaylog 支付收费记录
     * @return 结果
     */
    public int insertVrHisCarePaylog(VrHisCarePaylog vrHisCarePaylog);

    /**
     * 修改支付收费记录
     * 
     * @param vrHisCarePaylog 支付收费记录
     * @return 结果
     */
    public int updateVrHisCarePaylog(VrHisCarePaylog vrHisCarePaylog);

    /**
     * 删除支付收费记录
     * 
     * @param id 支付收费记录主键
     * @return 结果
     */
    public int deleteVrHisCarePaylogById(Integer id);

    /**
     * 批量删除支付收费记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrHisCarePaylogByIds(Integer[] ids);
}
