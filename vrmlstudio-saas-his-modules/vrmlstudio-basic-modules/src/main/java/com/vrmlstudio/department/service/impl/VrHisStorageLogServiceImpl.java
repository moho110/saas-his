package com.vrmlstudio.department.service.impl;

import java.util.List;
import com.vrmlstudio.common.utils.DateUtils;
import com.vrmlstudio.department.service.IVrHisStorageLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.department.mapper.VrHisStorageLogMapper;
import com.vrmlstudio.department.domain.VrHisStorageLog;

/**
 * 入库操作log日志Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisStorageLogServiceImpl implements IVrHisStorageLogService
{
    @Autowired
    private VrHisStorageLogMapper vrHisStorageLogMapper;

    /**
     * 查询入库操作log日志
     * 
     * @param logId 入库操作log日志主键
     * @return 入库操作log日志
     */
    @Override
    public VrHisStorageLog selectVrHisStorageLogByLogId(Integer logId)
    {
        return vrHisStorageLogMapper.selectVrHisStorageLogByLogId(logId);
    }

    /**
     * 查询入库操作log日志列表
     * 
     * @param vrHisStorageLog 入库操作log日志
     * @return 入库操作log日志
     */
    @Override
    public List<VrHisStorageLog> selectVrHisStorageLogList(VrHisStorageLog vrHisStorageLog)
    {
        return vrHisStorageLogMapper.selectVrHisStorageLogList(vrHisStorageLog);
    }

    /**
     * 新增入库操作log日志
     * 
     * @param vrHisStorageLog 入库操作log日志
     * @return 结果
     */
    @Override
    public int insertVrHisStorageLog(VrHisStorageLog vrHisStorageLog)
    {
        vrHisStorageLog.setCreateTime(DateUtils.getNowDate());
        return vrHisStorageLogMapper.insertVrHisStorageLog(vrHisStorageLog);
    }

    /**
     * 修改入库操作log日志
     * 
     * @param vrHisStorageLog 入库操作log日志
     * @return 结果
     */
    @Override
    public int updateVrHisStorageLog(VrHisStorageLog vrHisStorageLog)
    {
        return vrHisStorageLogMapper.updateVrHisStorageLog(vrHisStorageLog);
    }

    /**
     * 批量删除入库操作log日志
     * 
     * @param logIds 需要删除的入库操作log日志主键
     * @return 结果
     */
    @Override
    public int deleteVrHisStorageLogByLogIds(Integer[] logIds)
    {
        return vrHisStorageLogMapper.deleteVrHisStorageLogByLogIds(logIds);
    }

    /**
     * 删除入库操作log日志信息
     * 
     * @param logId 入库操作log日志主键
     * @return 结果
     */
    @Override
    public int deleteVrHisStorageLogByLogId(Integer logId)
    {
        return vrHisStorageLogMapper.deleteVrHisStorageLogByLogId(logId);
    }
}
