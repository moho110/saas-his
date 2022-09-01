package com.vrmlstudio.xsystem.service.impl;

import java.util.List;

import com.vrmlstudio.xsystem.service.IVrHisTransactionRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.xsystem.mapper.VrHisTransactionRecordMapper;
import com.vrmlstudio.xsystem.domain.VrHisTransactionRecord;

/**
 * 用户收支记录Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisTransactionRecordServiceImpl implements IVrHisTransactionRecordService
{
    @Autowired
    private VrHisTransactionRecordMapper vrHisTransactionRecordMapper;

    /**
     * 查询用户收支记录
     * 
     * @param id 用户收支记录主键
     * @return 用户收支记录
     */
    @Override
    public VrHisTransactionRecord selectVrHisTransactionRecordById(Integer id)
    {
        return vrHisTransactionRecordMapper.selectVrHisTransactionRecordById(id);
    }

    /**
     * 查询用户收支记录列表
     * 
     * @param vrHisTransactionRecord 用户收支记录
     * @return 用户收支记录
     */
    @Override
    public List<VrHisTransactionRecord> selectVrHisTransactionRecordList(VrHisTransactionRecord vrHisTransactionRecord)
    {
        return vrHisTransactionRecordMapper.selectVrHisTransactionRecordList(vrHisTransactionRecord);
    }

    /**
     * 新增用户收支记录
     * 
     * @param vrHisTransactionRecord 用户收支记录
     * @return 结果
     */
    @Override
    public int insertVrHisTransactionRecord(VrHisTransactionRecord vrHisTransactionRecord)
    {
        return vrHisTransactionRecordMapper.insertVrHisTransactionRecord(vrHisTransactionRecord);
    }

    /**
     * 修改用户收支记录
     * 
     * @param vrHisTransactionRecord 用户收支记录
     * @return 结果
     */
    @Override
    public int updateVrHisTransactionRecord(VrHisTransactionRecord vrHisTransactionRecord)
    {
        return vrHisTransactionRecordMapper.updateVrHisTransactionRecord(vrHisTransactionRecord);
    }

    /**
     * 批量删除用户收支记录
     * 
     * @param ids 需要删除的用户收支记录主键
     * @return 结果
     */
    @Override
    public int deleteVrHisTransactionRecordByIds(Integer[] ids)
    {
        return vrHisTransactionRecordMapper.deleteVrHisTransactionRecordByIds(ids);
    }

    /**
     * 删除用户收支记录信息
     * 
     * @param id 用户收支记录主键
     * @return 结果
     */
    @Override
    public int deleteVrHisTransactionRecordById(Integer id)
    {
        return vrHisTransactionRecordMapper.deleteVrHisTransactionRecordById(id);
    }
}
