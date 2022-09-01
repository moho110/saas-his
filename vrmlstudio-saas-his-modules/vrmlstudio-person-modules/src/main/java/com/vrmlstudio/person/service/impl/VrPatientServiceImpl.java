package com.vrmlstudio.person.service.impl;

import java.util.List;
import com.vrmlstudio.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.person.mapper.VrPatientMapper;
import com.vrmlstudio.person.domain.VrPatient;
import com.vrmlstudio.person.service.IVrPatientService;

/**
 * 患者用户Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrPatientServiceImpl implements IVrPatientService 
{
    @Autowired
    private VrPatientMapper vrPatientMapper;

    /**
     * 查询患者用户
     * 
     * @param patientId 患者用户主键
     * @return 患者用户
     */
    @Override
    public VrPatient selectVrPatientByPatientId(Long patientId)
    {
        return vrPatientMapper.selectVrPatientByPatientId(patientId);
    }

    /**
     * 查询患者用户列表
     * 
     * @param vrPatient 患者用户
     * @return 患者用户
     */
    @Override
    public List<VrPatient> selectVrPatientList(VrPatient vrPatient)
    {
        return vrPatientMapper.selectVrPatientList(vrPatient);
    }

    /**
     * 新增患者用户
     * 
     * @param vrPatient 患者用户
     * @return 结果
     */
    @Override
    public int insertVrPatient(VrPatient vrPatient)
    {
        vrPatient.setCreateTime(DateUtils.getNowDate());
        return vrPatientMapper.insertVrPatient(vrPatient);
    }

    /**
     * 修改患者用户
     * 
     * @param vrPatient 患者用户
     * @return 结果
     */
    @Override
    public int updateVrPatient(VrPatient vrPatient)
    {
        vrPatient.setUpdateTime(DateUtils.getNowDate());
        return vrPatientMapper.updateVrPatient(vrPatient);
    }

    /**
     * 批量删除患者用户
     * 
     * @param patientIds 需要删除的患者用户主键
     * @return 结果
     */
    @Override
    public int deleteVrPatientByPatientIds(Long[] patientIds)
    {
        return vrPatientMapper.deleteVrPatientByPatientIds(patientIds);
    }

    /**
     * 删除患者用户信息
     * 
     * @param patientId 患者用户主键
     * @return 结果
     */
    @Override
    public int deleteVrPatientByPatientId(Long patientId)
    {
        return vrPatientMapper.deleteVrPatientByPatientId(patientId);
    }
}
