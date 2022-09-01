package com.vrmlstudio.sales.service.impl;

import java.util.List;
import com.vrmlstudio.common.utils.DateUtils;
import com.vrmlstudio.sales.service.IVrHisRegisteredfeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.sales.mapper.VrHisRegisteredfeeMapper;
import com.vrmlstudio.sales.domain.VrHisRegisteredfee;

/**
 * 挂号费用Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisRegisteredfeeServiceImpl implements IVrHisRegisteredfeeService
{
    @Autowired
    private VrHisRegisteredfeeMapper vrHisRegisteredfeeMapper;

    /**
     * 查询挂号费用
     * 
     * @param regId 挂号费用主键
     * @return 挂号费用
     */
    @Override
    public VrHisRegisteredfee selectVrHisRegisteredfeeByRegId(Long regId)
    {
        return vrHisRegisteredfeeMapper.selectVrHisRegisteredfeeByRegId(regId);
    }

    /**
     * 查询挂号费用列表
     * 
     * @param vrHisRegisteredfee 挂号费用
     * @return 挂号费用
     */
    @Override
    public List<VrHisRegisteredfee> selectVrHisRegisteredfeeList(VrHisRegisteredfee vrHisRegisteredfee)
    {
        return vrHisRegisteredfeeMapper.selectVrHisRegisteredfeeList(vrHisRegisteredfee);
    }

    /**
     * 新增挂号费用
     * 
     * @param vrHisRegisteredfee 挂号费用
     * @return 结果
     */
    @Override
    public int insertVrHisRegisteredfee(VrHisRegisteredfee vrHisRegisteredfee)
    {
        vrHisRegisteredfee.setCreateTime(DateUtils.getNowDate());
        return vrHisRegisteredfeeMapper.insertVrHisRegisteredfee(vrHisRegisteredfee);
    }

    /**
     * 修改挂号费用
     * 
     * @param vrHisRegisteredfee 挂号费用
     * @return 结果
     */
    @Override
    public int updateVrHisRegisteredfee(VrHisRegisteredfee vrHisRegisteredfee)
    {
        return vrHisRegisteredfeeMapper.updateVrHisRegisteredfee(vrHisRegisteredfee);
    }

    /**
     * 批量删除挂号费用
     * 
     * @param regIds 需要删除的挂号费用主键
     * @return 结果
     */
    @Override
    public int deleteVrHisRegisteredfeeByRegIds(Long[] regIds)
    {
        return vrHisRegisteredfeeMapper.deleteVrHisRegisteredfeeByRegIds(regIds);
    }

    /**
     * 删除挂号费用信息
     * 
     * @param regId 挂号费用主键
     * @return 结果
     */
    @Override
    public int deleteVrHisRegisteredfeeByRegId(Long regId)
    {
        return vrHisRegisteredfeeMapper.deleteVrHisRegisteredfeeByRegId(regId);
    }
}
