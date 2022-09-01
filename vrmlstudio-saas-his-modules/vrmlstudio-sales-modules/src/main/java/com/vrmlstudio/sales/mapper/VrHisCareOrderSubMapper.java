package com.vrmlstudio.sales.mapper;

import java.util.List;
import com.vrmlstudio.sales.domain.VrHisCareOrderSub;

/**
 * 开诊用药明细Mapper接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface VrHisCareOrderSubMapper 
{
    /**
     * 查询开诊用药明细
     * 
     * @param id 开诊用药明细主键
     * @return 开诊用药明细
     */
    public VrHisCareOrderSub selectVrHisCareOrderSubById(Integer id);

    /**
     * 查询开诊用药明细列表
     * 
     * @param vrHisCareOrderSub 开诊用药明细
     * @return 开诊用药明细集合
     */
    public List<VrHisCareOrderSub> selectVrHisCareOrderSubList(VrHisCareOrderSub vrHisCareOrderSub);

    /**
     * 新增开诊用药明细
     * 
     * @param vrHisCareOrderSub 开诊用药明细
     * @return 结果
     */
    public int insertVrHisCareOrderSub(VrHisCareOrderSub vrHisCareOrderSub);

    /**
     * 修改开诊用药明细
     * 
     * @param vrHisCareOrderSub 开诊用药明细
     * @return 结果
     */
    public int updateVrHisCareOrderSub(VrHisCareOrderSub vrHisCareOrderSub);

    /**
     * 删除开诊用药明细
     * 
     * @param id 开诊用药明细主键
     * @return 结果
     */
    public int deleteVrHisCareOrderSubById(Integer id);

    /**
     * 批量删除开诊用药明细
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrHisCareOrderSubByIds(Integer[] ids);
}
