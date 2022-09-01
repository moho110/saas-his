package com.vrmlstudio.department.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.department.mapper.VrHisSmsLogMapper;
import com.vrmlstudio.department.domain.VrHisSmsLog;
import com.vrmlstudio.department.service.IVrHisSmsLogService;

/**
 * 短信发送记录Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisSmsLogServiceImpl implements IVrHisSmsLogService 
{
    @Autowired
    private VrHisSmsLogMapper vrHisSmsLogMapper;

    /**
     * 查询短信发送记录
     * 
     * @param id 短信发送记录主键
     * @return 短信发送记录
     */
    @Override
    public VrHisSmsLog selectVrHisSmsLogById(Long id)
    {
        return vrHisSmsLogMapper.selectVrHisSmsLogById(id);
    }

    /**
     * 查询短信发送记录列表
     * 
     * @param vrHisSmsLog 短信发送记录
     * @return 短信发送记录
     */
    @Override
    public List<VrHisSmsLog> selectVrHisSmsLogList(VrHisSmsLog vrHisSmsLog)
    {
        return vrHisSmsLogMapper.selectVrHisSmsLogList(vrHisSmsLog);
    }

    /**
     * 新增短信发送记录
     * 
     * @param vrHisSmsLog 短信发送记录
     * @return 结果
     */
    @Override
    public int insertVrHisSmsLog(VrHisSmsLog vrHisSmsLog)
    {
        return vrHisSmsLogMapper.insertVrHisSmsLog(vrHisSmsLog);
    }

    /**
     * 修改短信发送记录
     * 
     * @param vrHisSmsLog 短信发送记录
     * @return 结果
     */
    @Override
    public int updateVrHisSmsLog(VrHisSmsLog vrHisSmsLog)
    {
        return vrHisSmsLogMapper.updateVrHisSmsLog(vrHisSmsLog);
    }

    /**
     * 批量删除短信发送记录
     * 
     * @param ids 需要删除的短信发送记录主键
     * @return 结果
     */
    @Override
    public int deleteVrHisSmsLogByIds(Long[] ids)
    {
        return vrHisSmsLogMapper.deleteVrHisSmsLogByIds(ids);
    }

    /**
     * 删除短信发送记录信息
     * 
     * @param id 短信发送记录主键
     * @return 结果
     */
    @Override
    public int deleteVrHisSmsLogById(Long id)
    {
        return vrHisSmsLogMapper.deleteVrHisSmsLogById(id);
    }
}
