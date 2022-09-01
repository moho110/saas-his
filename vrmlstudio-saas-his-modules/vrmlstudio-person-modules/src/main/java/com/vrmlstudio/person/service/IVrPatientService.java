package com.vrmlstudio.person.service;

import java.util.List;
import com.vrmlstudio.person.domain.VrPatient;

/**
 * 患者用户Service接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface IVrPatientService 
{
    /**
     * 查询患者用户
     * 
     * @param patientId 患者用户主键
     * @return 患者用户
     */
    public VrPatient selectVrPatientByPatientId(Long patientId);

    /**
     * 查询患者用户列表
     * 
     * @param vrPatient 患者用户
     * @return 患者用户集合
     */
    public List<VrPatient> selectVrPatientList(VrPatient vrPatient);

    /**
     * 新增患者用户
     * 
     * @param vrPatient 患者用户
     * @return 结果
     */
    public int insertVrPatient(VrPatient vrPatient);

    /**
     * 修改患者用户
     * 
     * @param vrPatient 患者用户
     * @return 结果
     */
    public int updateVrPatient(VrPatient vrPatient);

    /**
     * 批量删除患者用户
     * 
     * @param patientIds 需要删除的患者用户主键集合
     * @return 结果
     */
    public int deleteVrPatientByPatientIds(Long[] patientIds);

    /**
     * 删除患者用户信息
     * 
     * @param patientId 患者用户主键
     * @return 结果
     */
    public int deleteVrPatientByPatientId(Long patientId);
}
