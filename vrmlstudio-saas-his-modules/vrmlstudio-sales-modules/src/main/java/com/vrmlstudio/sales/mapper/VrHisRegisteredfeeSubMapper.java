package com.vrmlstudio.sales.mapper;

import java.util.List;
import com.vrmlstudio.sales.domain.VrHisRegisteredfeeSub;

/**
 * 挂号费用子Mapper接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface VrHisRegisteredfeeSubMapper 
{
    /**
     * 查询挂号费用子
     * 
     * @param regSubId 挂号费用子主键
     * @return 挂号费用子
     */
    public VrHisRegisteredfeeSub selectVrHisRegisteredfeeSubByRegSubId(Integer regSubId);

    /**
     * 查询挂号费用子列表
     * 
     * @param vrHisRegisteredfeeSub 挂号费用子
     * @return 挂号费用子集合
     */
    public List<VrHisRegisteredfeeSub> selectVrHisRegisteredfeeSubList(VrHisRegisteredfeeSub vrHisRegisteredfeeSub);

    /**
     * 新增挂号费用子
     * 
     * @param vrHisRegisteredfeeSub 挂号费用子
     * @return 结果
     */
    public int insertVrHisRegisteredfeeSub(VrHisRegisteredfeeSub vrHisRegisteredfeeSub);

    /**
     * 修改挂号费用子
     * 
     * @param vrHisRegisteredfeeSub 挂号费用子
     * @return 结果
     */
    public int updateVrHisRegisteredfeeSub(VrHisRegisteredfeeSub vrHisRegisteredfeeSub);

    /**
     * 删除挂号费用子
     * 
     * @param regSubId 挂号费用子主键
     * @return 结果
     */
    public int deleteVrHisRegisteredfeeSubByRegSubId(Integer regSubId);

    /**
     * 批量删除挂号费用子
     * 
     * @param regSubIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrHisRegisteredfeeSubByRegSubIds(Integer[] regSubIds);
}
