package com.vrmlstudio.department.mapper;

import java.util.List;
import com.vrmlstudio.department.domain.VrHisStorageLog;

/**
 * 入库操作log日志Mapper接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface VrHisStorageLogMapper 
{
    /**
     * 查询入库操作log日志
     * 
     * @param logId 入库操作log日志主键
     * @return 入库操作log日志
     */
    public VrHisStorageLog selectVrHisStorageLogByLogId(Integer logId);

    /**
     * 查询入库操作log日志列表
     * 
     * @param vrHisStorageLog 入库操作log日志
     * @return 入库操作log日志集合
     */
    public List<VrHisStorageLog> selectVrHisStorageLogList(VrHisStorageLog vrHisStorageLog);

    /**
     * 新增入库操作log日志
     * 
     * @param vrHisStorageLog 入库操作log日志
     * @return 结果
     */
    public int insertVrHisStorageLog(VrHisStorageLog vrHisStorageLog);

    /**
     * 修改入库操作log日志
     * 
     * @param vrHisStorageLog 入库操作log日志
     * @return 结果
     */
    public int updateVrHisStorageLog(VrHisStorageLog vrHisStorageLog);

    /**
     * 删除入库操作log日志
     * 
     * @param logId 入库操作log日志主键
     * @return 结果
     */
    public int deleteVrHisStorageLogByLogId(Integer logId);

    /**
     * 批量删除入库操作log日志
     * 
     * @param logIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrHisStorageLogByLogIds(Integer[] logIds);
}
