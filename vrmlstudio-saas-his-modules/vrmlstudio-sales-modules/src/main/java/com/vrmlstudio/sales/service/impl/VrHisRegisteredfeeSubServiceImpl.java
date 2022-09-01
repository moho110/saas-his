package com.vrmlstudio.sales.service.impl;

import java.util.List;

import com.vrmlstudio.sales.service.IVrHisRegisteredfeeSubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.sales.mapper.VrHisRegisteredfeeSubMapper;
import com.vrmlstudio.sales.domain.VrHisRegisteredfeeSub;

/**
 * 挂号费用子Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisRegisteredfeeSubServiceImpl implements IVrHisRegisteredfeeSubService
{
    @Autowired
    private VrHisRegisteredfeeSubMapper vrHisRegisteredfeeSubMapper;

    /**
     * 查询挂号费用子
     * 
     * @param regSubId 挂号费用子主键
     * @return 挂号费用子
     */
    @Override
    public VrHisRegisteredfeeSub selectVrHisRegisteredfeeSubByRegSubId(Integer regSubId)
    {
        return vrHisRegisteredfeeSubMapper.selectVrHisRegisteredfeeSubByRegSubId(regSubId);
    }

    /**
     * 查询挂号费用子列表
     * 
     * @param vrHisRegisteredfeeSub 挂号费用子
     * @return 挂号费用子
     */
    @Override
    public List<VrHisRegisteredfeeSub> selectVrHisRegisteredfeeSubList(VrHisRegisteredfeeSub vrHisRegisteredfeeSub)
    {
        return vrHisRegisteredfeeSubMapper.selectVrHisRegisteredfeeSubList(vrHisRegisteredfeeSub);
    }

    /**
     * 新增挂号费用子
     * 
     * @param vrHisRegisteredfeeSub 挂号费用子
     * @return 结果
     */
    @Override
    public int insertVrHisRegisteredfeeSub(VrHisRegisteredfeeSub vrHisRegisteredfeeSub)
    {
        return vrHisRegisteredfeeSubMapper.insertVrHisRegisteredfeeSub(vrHisRegisteredfeeSub);
    }

    /**
     * 修改挂号费用子
     * 
     * @param vrHisRegisteredfeeSub 挂号费用子
     * @return 结果
     */
    @Override
    public int updateVrHisRegisteredfeeSub(VrHisRegisteredfeeSub vrHisRegisteredfeeSub)
    {
        return vrHisRegisteredfeeSubMapper.updateVrHisRegisteredfeeSub(vrHisRegisteredfeeSub);
    }

    /**
     * 批量删除挂号费用子
     * 
     * @param regSubIds 需要删除的挂号费用子主键
     * @return 结果
     */
    @Override
    public int deleteVrHisRegisteredfeeSubByRegSubIds(Integer[] regSubIds)
    {
        return vrHisRegisteredfeeSubMapper.deleteVrHisRegisteredfeeSubByRegSubIds(regSubIds);
    }

    /**
     * 删除挂号费用子信息
     * 
     * @param regSubId 挂号费用子主键
     * @return 结果
     */
    @Override
    public int deleteVrHisRegisteredfeeSubByRegSubId(Integer regSubId)
    {
        return vrHisRegisteredfeeSubMapper.deleteVrHisRegisteredfeeSubByRegSubId(regSubId);
    }
}
