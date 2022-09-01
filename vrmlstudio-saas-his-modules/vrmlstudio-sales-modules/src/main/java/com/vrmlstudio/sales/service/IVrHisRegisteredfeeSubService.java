package com.vrmlstudio.sales.service;

import java.util.List;
import com.vrmlstudio.sales.domain.VrHisRegisteredfeeSub;

/**
 * 挂号费用子Service接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface IVrHisRegisteredfeeSubService 
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
     * 批量删除挂号费用子
     * 
     * @param regSubIds 需要删除的挂号费用子主键集合
     * @return 结果
     */
    public int deleteVrHisRegisteredfeeSubByRegSubIds(Integer[] regSubIds);

    /**
     * 删除挂号费用子信息
     * 
     * @param regSubId 挂号费用子主键
     * @return 结果
     */
    public int deleteVrHisRegisteredfeeSubByRegSubId(Integer regSubId);
}
