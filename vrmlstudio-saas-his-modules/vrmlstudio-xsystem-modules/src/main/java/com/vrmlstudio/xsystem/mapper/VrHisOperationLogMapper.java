package com.vrmlstudio.xsystem.mapper;

import java.util.List;
import com.vrmlstudio.xsystem.domain.VrHisOperationLog;

/**
 * 诊所系统操作记录Mapper接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface VrHisOperationLogMapper 
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
     * 删除诊所系统操作记录
     * 
     * @param oid 诊所系统操作记录主键
     * @return 结果
     */
    public int deleteVrHisOperationLogByOid(Long oid);

    /**
     * 批量删除诊所系统操作记录
     * 
     * @param oids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrHisOperationLogByOids(Long[] oids);
}
