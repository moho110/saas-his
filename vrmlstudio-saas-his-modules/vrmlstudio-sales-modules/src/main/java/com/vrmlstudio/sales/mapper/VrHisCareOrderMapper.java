package com.vrmlstudio.sales.mapper;

import java.util.List;
import com.vrmlstudio.sales.domain.VrHisCareOrder;

/**
 * 处方列Mapper接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface VrHisCareOrderMapper 
{
    /**
     * 查询处方列
     * 
     * @param id 处方列主键
     * @return 处方列
     */
    public VrHisCareOrder selectVrHisCareOrderById(Integer id);

    /**
     * 查询处方列列表
     * 
     * @param vrHisCareOrder 处方列
     * @return 处方列集合
     */
    public List<VrHisCareOrder> selectVrHisCareOrderList(VrHisCareOrder vrHisCareOrder);

    /**
     * 新增处方列
     * 
     * @param vrHisCareOrder 处方列
     * @return 结果
     */
    public int insertVrHisCareOrder(VrHisCareOrder vrHisCareOrder);

    /**
     * 修改处方列
     * 
     * @param vrHisCareOrder 处方列
     * @return 结果
     */
    public int updateVrHisCareOrder(VrHisCareOrder vrHisCareOrder);

    /**
     * 删除处方列
     * 
     * @param id 处方列主键
     * @return 结果
     */
    public int deleteVrHisCareOrderById(Integer id);

    /**
     * 批量删除处方列
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrHisCareOrderByIds(Integer[] ids);
}
