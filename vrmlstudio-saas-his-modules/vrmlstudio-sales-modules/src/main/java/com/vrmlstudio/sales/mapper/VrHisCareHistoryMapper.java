package com.vrmlstudio.sales.mapper;

import java.util.List;
import com.vrmlstudio.sales.domain.VrHisCareHistory;

/**
 * 历史病历Mapper接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface VrHisCareHistoryMapper 
{
    /**
     * 查询历史病历
     * 
     * @param id 历史病历主键
     * @return 历史病历
     */
    public VrHisCareHistory selectVrHisCareHistoryById(Integer id);

    /**
     * 查询历史病历列表
     * 
     * @param vrHisCareHistory 历史病历
     * @return 历史病历集合
     */
    public List<VrHisCareHistory> selectVrHisCareHistoryList(VrHisCareHistory vrHisCareHistory);

    /**
     * 新增历史病历
     * 
     * @param vrHisCareHistory 历史病历
     * @return 结果
     */
    public int insertVrHisCareHistory(VrHisCareHistory vrHisCareHistory);

    /**
     * 修改历史病历
     * 
     * @param vrHisCareHistory 历史病历
     * @return 结果
     */
    public int updateVrHisCareHistory(VrHisCareHistory vrHisCareHistory);

    /**
     * 删除历史病历
     * 
     * @param id 历史病历主键
     * @return 结果
     */
    public int deleteVrHisCareHistoryById(Integer id);

    /**
     * 批量删除历史病历
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrHisCareHistoryByIds(Integer[] ids);
}
