package com.vrmlstudio.sales.service.impl;

import java.util.List;
import com.vrmlstudio.common.utils.DateUtils;
import com.vrmlstudio.sales.service.IVrHisRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.sales.mapper.VrHisRegistrationMapper;
import com.vrmlstudio.sales.domain.VrHisRegistration;

/**
 * 门诊挂号Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisRegistrationServiceImpl implements IVrHisRegistrationService
{
    @Autowired
    private VrHisRegistrationMapper vrHisRegistrationMapper;

    /**
     * 查询门诊挂号
     * 
     * @param registrationId 门诊挂号主键
     * @return 门诊挂号
     */
    @Override
    public VrHisRegistration selectVrHisRegistrationByRegistrationId(Long registrationId)
    {
        return vrHisRegistrationMapper.selectVrHisRegistrationByRegistrationId(registrationId);
    }

    /**
     * 查询门诊挂号列表
     * 
     * @param vrHisRegistration 门诊挂号
     * @return 门诊挂号
     */
    @Override
    public List<VrHisRegistration> selectVrHisRegistrationList(VrHisRegistration vrHisRegistration)
    {
        return vrHisRegistrationMapper.selectVrHisRegistrationList(vrHisRegistration);
    }

    /**
     * 新增门诊挂号
     * 
     * @param vrHisRegistration 门诊挂号
     * @return 结果
     */
    @Override
    public int insertVrHisRegistration(VrHisRegistration vrHisRegistration)
    {
        vrHisRegistration.setCreateTime(DateUtils.getNowDate());
        return vrHisRegistrationMapper.insertVrHisRegistration(vrHisRegistration);
    }

    /**
     * 修改门诊挂号
     * 
     * @param vrHisRegistration 门诊挂号
     * @return 结果
     */
    @Override
    public int updateVrHisRegistration(VrHisRegistration vrHisRegistration)
    {
        vrHisRegistration.setUpdateTime(DateUtils.getNowDate());
        return vrHisRegistrationMapper.updateVrHisRegistration(vrHisRegistration);
    }

    /**
     * 批量删除门诊挂号
     * 
     * @param registrationIds 需要删除的门诊挂号主键
     * @return 结果
     */
    @Override
    public int deleteVrHisRegistrationByRegistrationIds(Long[] registrationIds)
    {
        return vrHisRegistrationMapper.deleteVrHisRegistrationByRegistrationIds(registrationIds);
    }

    /**
     * 删除门诊挂号信息
     * 
     * @param registrationId 门诊挂号主键
     * @return 结果
     */
    @Override
    public int deleteVrHisRegistrationByRegistrationId(Long registrationId)
    {
        return vrHisRegistrationMapper.deleteVrHisRegistrationByRegistrationId(registrationId);
    }
}
