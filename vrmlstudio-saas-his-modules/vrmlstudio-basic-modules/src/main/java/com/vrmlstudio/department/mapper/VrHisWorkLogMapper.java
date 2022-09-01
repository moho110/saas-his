package com.vrmlstudio.department.mapper;

import java.util.List;
import com.vrmlstudio.department.domain.VrHisWorkLog;

/**
 * 重要操作记录Mapper接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface VrHisWorkLogMapper 
{
    /**
     * 查询重要操作记录
     * 
     * @param id 重要操作记录主键
     * @return 重要操作记录
     */
    public VrHisWorkLog selectVrHisWorkLogById(Integer id);

    /**
     * 查询重要操作记录列表
     * 
     * @param vrHisWorkLog 重要操作记录
     * @return 重要操作记录集合
     */
    public List<VrHisWorkLog> selectVrHisWorkLogList(VrHisWorkLog vrHisWorkLog);

    /**
     * 新增重要操作记录
     * 
     * @param vrHisWorkLog 重要操作记录
     * @return 结果
     */
    public int insertVrHisWorkLog(VrHisWorkLog vrHisWorkLog);

    /**
     * 修改重要操作记录
     * 
     * @param vrHisWorkLog 重要操作记录
     * @return 结果
     */
    public int updateVrHisWorkLog(VrHisWorkLog vrHisWorkLog);

    /**
     * 删除重要操作记录
     * 
     * @param id 重要操作记录主键
     * @return 结果
     */
    public int deleteVrHisWorkLogById(Integer id);

    /**
     * 批量删除重要操作记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrHisWorkLogByIds(Integer[] ids);
}
