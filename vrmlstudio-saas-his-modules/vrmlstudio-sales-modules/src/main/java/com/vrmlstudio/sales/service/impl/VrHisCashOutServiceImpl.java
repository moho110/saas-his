package com.vrmlstudio.sales.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.sales.mapper.VrHisCashOutMapper;
import com.vrmlstudio.sales.domain.VrHisCashOut;
import com.vrmlstudio.sales.service.IVrHisCashOutService;

/**
 * 用户提现申请Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisCashOutServiceImpl implements IVrHisCashOutService 
{
    @Autowired
    private VrHisCashOutMapper vrHisCashOutMapper;

    /**
     * 查询用户提现申请
     * 
     * @param id 用户提现申请主键
     * @return 用户提现申请
     */
    @Override
    public VrHisCashOut selectVrHisCashOutById(Integer id)
    {
        return vrHisCashOutMapper.selectVrHisCashOutById(id);
    }

    /**
     * 查询用户提现申请列表
     * 
     * @param vrHisCashOut 用户提现申请
     * @return 用户提现申请
     */
    @Override
    public List<VrHisCashOut> selectVrHisCashOutList(VrHisCashOut vrHisCashOut)
    {
        return vrHisCashOutMapper.selectVrHisCashOutList(vrHisCashOut);
    }

    /**
     * 新增用户提现申请
     * 
     * @param vrHisCashOut 用户提现申请
     * @return 结果
     */
    @Override
    public int insertVrHisCashOut(VrHisCashOut vrHisCashOut)
    {
        return vrHisCashOutMapper.insertVrHisCashOut(vrHisCashOut);
    }

    /**
     * 修改用户提现申请
     * 
     * @param vrHisCashOut 用户提现申请
     * @return 结果
     */
    @Override
    public int updateVrHisCashOut(VrHisCashOut vrHisCashOut)
    {
        return vrHisCashOutMapper.updateVrHisCashOut(vrHisCashOut);
    }

    /**
     * 批量删除用户提现申请
     * 
     * @param ids 需要删除的用户提现申请主键
     * @return 结果
     */
    @Override
    public int deleteVrHisCashOutByIds(Integer[] ids)
    {
        return vrHisCashOutMapper.deleteVrHisCashOutByIds(ids);
    }

    /**
     * 删除用户提现申请信息
     * 
     * @param id 用户提现申请主键
     * @return 结果
     */
    @Override
    public int deleteVrHisCashOutById(Integer id)
    {
        return vrHisCashOutMapper.deleteVrHisCashOutById(id);
    }
}
