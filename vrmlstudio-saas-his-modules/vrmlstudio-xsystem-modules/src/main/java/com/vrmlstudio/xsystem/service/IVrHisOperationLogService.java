package com.vrmlstudio.xsystem.service;

import java.util.List;
import com.vrmlstudio.xsystem.domain.VrHisOperationLog;

/**
 * 诊所系统操作记录Service接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface IVrHisOperationLogService 
{
    /**
     * 查询诊所系统操作记录
     * 
     * @param oid 诊所系统操作记录主键
     * @return 诊所系统操作记录
     */
    public VrHisOperationLog selectVrHisOperationLogByOid(Long oid);

    /**
     * 查询诊所系统操作记录列表
     * 
     * @param vrHisOperationLog 诊所系统操作记录
     * @return 诊所系统操作记录集合
     */
    public List<VrHisOperationLog> selectVrHisOperationLogList(VrHisOperationLog vrHisOperationLog);

    /**
     * 新增诊所系统操作记录
     * 
     * @param vrHisOperationLog 诊所系统操作记录
     * @return 结果
     */
    public int insertVrHisOperationLog(VrHisOperationLog vrHisOperationLog);

    /**
     * 修改诊所系统操作记录
     * 
     * @param vrHisOperationLog 诊所系统操作记录
     * @return 结果
     */
    public int updateVrHisOperationLog(VrHisOperationLog vrHisOperationLog);

    /**
     * 批量删除诊所系统操作记录
     * 
     * @param oids 需要删除的诊所系统操作记录主键集合
     * @return 结果
     */
    public int deleteVrHisOperationLogByOids(Long[] oids);

    /**
     * 删除诊所系统操作记录信息
     * 
     * @param oid 诊所系统操作记录主键
     * @return 结果
     */
    public int deleteVrHisOperationLogByOid(Long oid);
}
