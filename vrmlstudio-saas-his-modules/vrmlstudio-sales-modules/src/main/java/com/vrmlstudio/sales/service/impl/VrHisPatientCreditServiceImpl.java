package com.vrmlstudio.sales.service.impl;

import java.util.List;

import com.vrmlstudio.sales.service.IVrHisPatientCreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.sales.mapper.VrHisPatientCreditMapper;
import com.vrmlstudio.sales.domain.VrHisPatientCredit;

/**
 * 用户免费提问额度Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisPatientCreditServiceImpl implements IVrHisPatientCreditService
{
    @Autowired
    private VrHisPatientCreditMapper vrHisPatientCreditMapper;

    /**
     * 查询用户免费提问额度
     * 
     * @param id 用户免费提问额度主键
     * @return 用户免费提问额度
     */
    @Override
    public VrHisPatientCredit selectVrHisPatientCreditById(Integer id)
    {
        return vrHisPatientCreditMapper.selectVrHisPatientCreditById(id);
    }

    /**
     * 查询用户免费提问额度列表
     * 
     * @param vrHisPatientCredit 用户免费提问额度
     * @return 用户免费提问额度
     */
    @Override
    public List<VrHisPatientCredit> selectVrHisPatientCreditList(VrHisPatientCredit vrHisPatientCredit)
    {
        return vrHisPatientCreditMapper.selectVrHisPatientCreditList(vrHisPatientCredit);
    }

    /**
     * 新增用户免费提问额度
     * 
     * @param vrHisPatientCredit 用户免费提问额度
     * @return 结果
     */
    @Override
    public int insertVrHisPatientCredit(VrHisPatientCredit vrHisPatientCredit)
    {
        return vrHisPatientCreditMapper.insertVrHisPatientCredit(vrHisPatientCredit);
    }

    /**
     * 修改用户免费提问额度
     * 
     * @param vrHisPatientCredit 用户免费提问额度
     * @return 结果
     */
    @Override
    public int updateVrHisPatientCredit(VrHisPatientCredit vrHisPatientCredit)
    {
        return vrHisPatientCreditMapper.updateVrHisPatientCredit(vrHisPatientCredit);
    }

    /**
     * 批量删除用户免费提问额度
     * 
     * @param ids 需要删除的用户免费提问额度主键
     * @return 结果
     */
    @Override
    public int deleteVrHisPatientCreditByIds(Integer[] ids)
    {
        return vrHisPatientCreditMapper.deleteVrHisPatientCreditByIds(ids);
    }

    /**
     * 删除用户免费提问额度信息
     * 
     * @param id 用户免费提问额度主键
     * @return 结果
     */
    @Override
    public int deleteVrHisPatientCreditById(Integer id)
    {
        return vrHisPatientCreditMapper.deleteVrHisPatientCreditById(id);
    }
}
