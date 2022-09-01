package com.vrmlstudio.sales.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.sales.mapper.VrHisCareHistoryMapper;
import com.vrmlstudio.sales.domain.VrHisCareHistory;
import com.vrmlstudio.sales.service.IVrHisCareHistoryService;

/**
 * 历史病历Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisCareHistoryServiceImpl implements IVrHisCareHistoryService 
{
    @Autowired
    private VrHisCareHistoryMapper vrHisCareHistoryMapper;

    /**
     * 查询历史病历
     * 
     * @param id 历史病历主键
     * @return 历史病历
     */
    @Override
    public VrHisCareHistory selectVrHisCareHistoryById(Integer id)
    {
        return vrHisCareHistoryMapper.selectVrHisCareHistoryById(id);
    }

    /**
     * 查询历史病历列表
     * 
     * @param vrHisCareHistory 历史病历
     * @return 历史病历
     */
    @Override
    public List<VrHisCareHistory> selectVrHisCareHistoryList(VrHisCareHistory vrHisCareHistory)
    {
        return vrHisCareHistoryMapper.selectVrHisCareHistoryList(vrHisCareHistory);
    }

    /**
     * 新增历史病历
     * 
     * @param vrHisCareHistory 历史病历
     * @return 结果
     */
    @Override
    public int insertVrHisCareHistory(VrHisCareHistory vrHisCareHistory)
    {
        return vrHisCareHistoryMapper.insertVrHisCareHistory(vrHisCareHistory);
    }

    /**
     * 修改历史病历
     * 
     * @param vrHisCareHistory 历史病历
     * @return 结果
     */
    @Override
    public int updateVrHisCareHistory(VrHisCareHistory vrHisCareHistory)
    {
        return vrHisCareHistoryMapper.updateVrHisCareHistory(vrHisCareHistory);
    }

    /**
     * 批量删除历史病历
     * 
     * @param ids 需要删除的历史病历主键
     * @return 结果
     */
    @Override
    public int deleteVrHisCareHistoryByIds(Integer[] ids)
    {
        return vrHisCareHistoryMapper.deleteVrHisCareHistoryByIds(ids);
    }

    /**
     * 删除历史病历信息
     * 
     * @param id 历史病历主键
     * @return 结果
     */
    @Override
    public int deleteVrHisCareHistoryById(Integer id)
    {
        return vrHisCareHistoryMapper.deleteVrHisCareHistoryById(id);
    }
}
