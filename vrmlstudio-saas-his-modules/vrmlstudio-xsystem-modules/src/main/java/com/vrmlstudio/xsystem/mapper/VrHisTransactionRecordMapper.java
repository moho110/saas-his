package com.vrmlstudio.xsystem.mapper;

import java.util.List;
import com.vrmlstudio.xsystem.domain.VrHisTransactionRecord;

/**
 * 用户收支记录Mapper接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface VrHisTransactionRecordMapper 
{
    /**
     * 查询用户收支记录
     * 
     * @param id 用户收支记录主键
     * @return 用户收支记录
     */
    public VrHisTransactionRecord selectVrHisTransactionRecordById(Integer id);

    /**
     * 查询用户收支记录列表
     * 
     * @param vrHisTransactionRecord 用户收支记录
     * @return 用户收支记录集合
     */
    public List<VrHisTransactionRecord> selectVrHisTransactionRecordList(VrHisTransactionRecord vrHisTransactionRecord);

    /**
     * 新增用户收支记录
     * 
     * @param vrHisTransactionRecord 用户收支记录
     * @return 结果
     */
    public int insertVrHisTransactionRecord(VrHisTransactionRecord vrHisTransactionRecord);

    /**
     * 修改用户收支记录
     * 
     * @param vrHisTransactionRecord 用户收支记录
     * @return 结果
     */
    public int updateVrHisTransactionRecord(VrHisTransactionRecord vrHisTransactionRecord);

    /**
     * 删除用户收支记录
     * 
     * @param id 用户收支记录主键
     * @return 结果
     */
    public int deleteVrHisTransactionRecordById(Integer id);

    /**
     * 批量删除用户收支记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrHisTransactionRecordByIds(Integer[] ids);
}
