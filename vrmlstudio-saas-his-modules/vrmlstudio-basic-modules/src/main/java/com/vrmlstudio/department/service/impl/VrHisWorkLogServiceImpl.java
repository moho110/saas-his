package com.vrmlstudio.department.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.department.mapper.VrHisWorkLogMapper;
import com.vrmlstudio.department.domain.VrHisWorkLog;
import com.vrmlstudio.department.service.IVrHisWorkLogService;

/**
 * 重要操作记录Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisWorkLogServiceImpl implements IVrHisWorkLogService 
{
    @Autowired
    private VrHisWorkLogMapper vrHisWorkLogMapper;

    /**
     * 查询重要操作记录
     * 
     * @param id 重要操作记录主键
     * @return 重要操作记录
     */
    @Override
    public VrHisWorkLog selectVrHisWorkLogById(Integer id)
    {
        return vrHisWorkLogMapper.selectVrHisWorkLogById(id);
    }

    /**
     * 查询重要操作记录列表
     * 
     * @param vrHisWorkLog 重要操作记录
     * @return 重要操作记录
     */
    @Override
    public List<VrHisWorkLog> selectVrHisWorkLogList(VrHisWorkLog vrHisWorkLog)
    {
        return vrHisWorkLogMapper.selectVrHisWorkLogList(vrHisWorkLog);
    }

    /**
     * 新增重要操作记录
     * 
     * @param vrHisWorkLog 重要操作记录
     * @return 结果
     */
    @Override
    public int insertVrHisWorkLog(VrHisWorkLog vrHisWorkLog)
    {
        return vrHisWorkLogMapper.insertVrHisWorkLog(vrHisWorkLog);
    }

    /**
     * 修改重要操作记录
     * 
     * @param vrHisWorkLog 重要操作记录
     * @return 结果
     */
    @Override
    public int updateVrHisWorkLog(VrHisWorkLog vrHisWorkLog)
    {
        return vrHisWorkLogMapper.updateVrHisWorkLog(vrHisWorkLog);
    }

    /**
     * 批量删除重要操作记录
     * 
     * @param ids 需要删除的重要操作记录主键
     * @return 结果
     */
    @Override
    public int deleteVrHisWorkLogByIds(Integer[] ids)
    {
        return vrHisWorkLogMapper.deleteVrHisWorkLogByIds(ids);
    }

    /**
     * 删除重要操作记录信息
     * 
     * @param id 重要操作记录主键
     * @return 结果
     */
    @Override
    public int deleteVrHisWorkLogById(Integer id)
    {
        return vrHisWorkLogMapper.deleteVrHisWorkLogById(id);
    }
}
