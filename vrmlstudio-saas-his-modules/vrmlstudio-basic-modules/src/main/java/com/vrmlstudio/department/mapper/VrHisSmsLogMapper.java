package com.vrmlstudio.department.mapper;

import java.util.List;
import com.vrmlstudio.department.domain.VrHisSmsLog;

/**
 * 短信发送记录Mapper接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface VrHisSmsLogMapper 
{
    /**
     * 查询短信发送记录
     * 
     * @param id 短信发送记录主键
     * @return 短信发送记录
     */
    public VrHisSmsLog selectVrHisSmsLogById(Long id);

    /**
     * 查询短信发送记录列表
     * 
     * @param vrHisSmsLog 短信发送记录
     * @return 短信发送记录集合
     */
    public List<VrHisSmsLog> selectVrHisSmsLogList(VrHisSmsLog vrHisSmsLog);

    /**
     * 新增短信发送记录
     * 
     * @param vrHisSmsLog 短信发送记录
     * @return 结果
     */
    public int insertVrHisSmsLog(VrHisSmsLog vrHisSmsLog);

    /**
     * 修改短信发送记录
     * 
     * @param vrHisSmsLog 短信发送记录
     * @return 结果
     */
    public int updateVrHisSmsLog(VrHisSmsLog vrHisSmsLog);

    /**
     * 删除短信发送记录
     * 
     * @param id 短信发送记录主键
     * @return 结果
     */
    public int deleteVrHisSmsLogById(Long id);

    /**
     * 批量删除短信发送记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrHisSmsLogByIds(Long[] ids);
}
