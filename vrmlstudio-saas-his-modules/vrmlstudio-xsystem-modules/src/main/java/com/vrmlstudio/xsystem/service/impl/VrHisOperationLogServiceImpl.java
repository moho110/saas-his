package com.vrmlstudio.xsystem.service.impl;

import java.util.List;

import com.vrmlstudio.xsystem.service.IVrHisOperationLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.xsystem.mapper.VrHisOperationLogMapper;
import com.vrmlstudio.xsystem.domain.VrHisOperationLog;

/**
 * 诊所系统操作记录Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisOperationLogServiceImpl implements IVrHisOperationLogService
{
    @Autowired
    private VrHisOperationLogMapper vrHisOperationLogMapper;

    /**
     * 查询诊所系统操作记录
     * 
     * @param oid 诊所系统操作记录主键
     * @return 诊所系统操作记录
     */
    @Override
    public VrHisOperationLog selectVrHisOperationLogByOid(Long oid)
    {
        return vrHisOperationLogMapper.selectVrHisOperationLogByOid(oid);
    }

    /**
     * 查询诊所系统操作记录列表
     * 
     * @param vrHisOperationLog 诊所系统操作记录
     * @return 诊所系统操作记录
     */
    @Override
    public List<VrHisOperationLog> selectVrHisOperationLogList(VrHisOperationLog vrHisOperationLog)
    {
        return vrHisOperationLogMapper.selectVrHisOperationLogList(vrHisOperationLog);
    }

    /**
     * 新增诊所系统操作记录
     * 
     * @param vrHisOperationLog 诊所系统操作记录
     * @return 结果
     */
    @Override
    public int insertVrHisOperationLog(VrHisOperationLog vrHisOperationLog)
    {
        return vrHisOperationLogMapper.insertVrHisOperationLog(vrHisOperationLog);
    }

    /**
     * 修改诊所系统操作记录
     * 
     * @param vrHisOperationLog 诊所系统操作记录
     * @return 结果
     */
    @Override
    public int updateVrHisOperationLog(VrHisOperationLog vrHisOperationLog)
    {
        return vrHisOperationLogMapper.updateVrHisOperationLog(vrHisOperationLog);
    }

    /**
     * 批量删除诊所系统操作记录
     * 
     * @param oids 需要删除的诊所系统操作记录主键
     * @return 结果
     */
    @Override
    public int deleteVrHisOperationLogByOids(Long[] oids)
    {
        return vrHisOperationLogMapper.deleteVrHisOperationLogByOids(oids);
    }

    /**
     * 删除诊所系统操作记录信息
     * 
     * @param oid 诊所系统操作记录主键
     * @return 结果
     */
    @Override
    public int deleteVrHisOperationLogByOid(Long oid)
    {
        return vrHisOperationLogMapper.deleteVrHisOperationLogByOid(oid);
    }
}
