package com.vrmlstudio.sales.mapper;

import java.util.List;
import com.vrmlstudio.sales.domain.VrHisRegisteredfee;

/**
 * 挂号费用Mapper接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface VrHisRegisteredfeeMapper 
{
    /**
     * 查询挂号费用
     * 
     * @param regId 挂号费用主键
     * @return 挂号费用
     */
    public VrHisRegisteredfee selectVrHisRegisteredfeeByRegId(Long regId);

    /**
     * 查询挂号费用列表
     * 
     * @param vrHisRegisteredfee 挂号费用
     * @return 挂号费用集合
     */
    public List<VrHisRegisteredfee> selectVrHisRegisteredfeeList(VrHisRegisteredfee vrHisRegisteredfee);

    /**
     * 新增挂号费用
     * 
     * @param vrHisRegisteredfee 挂号费用
     * @return 结果
     */
    public int insertVrHisRegisteredfee(VrHisRegisteredfee vrHisRegisteredfee);

    /**
     * 修改挂号费用
     * 
     * @param vrHisRegisteredfee 挂号费用
     * @return 结果
     */
    public int updateVrHisRegisteredfee(VrHisRegisteredfee vrHisRegisteredfee);

    /**
     * 删除挂号费用
     * 
     * @param regId 挂号费用主键
     * @return 结果
     */
    public int deleteVrHisRegisteredfeeByRegId(Long regId);

    /**
     * 批量删除挂号费用
     * 
     * @param regIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrHisRegisteredfeeByRegIds(Long[] regIds);
}
