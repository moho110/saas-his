package com.vrmlstudio.sales.mapper;

import java.util.List;
import com.vrmlstudio.sales.domain.VrHisRegistration;

/**
 * 门诊挂号Mapper接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface VrHisRegistrationMapper 
{
    /**
     * 查询门诊挂号
     * 
     * @param registrationId 门诊挂号主键
     * @return 门诊挂号
     */
    public VrHisRegistration selectVrHisRegistrationByRegistrationId(Long registrationId);

    /**
     * 查询门诊挂号列表
     * 
     * @param vrHisRegistration 门诊挂号
     * @return 门诊挂号集合
     */
    public List<VrHisRegistration> selectVrHisRegistrationList(VrHisRegistration vrHisRegistration);

    /**
     * 新增门诊挂号
     * 
     * @param vrHisRegistration 门诊挂号
     * @return 结果
     */
    public int insertVrHisRegistration(VrHisRegistration vrHisRegistration);

    /**
     * 修改门诊挂号
     * 
     * @param vrHisRegistration 门诊挂号
     * @return 结果
     */
    public int updateVrHisRegistration(VrHisRegistration vrHisRegistration);

    /**
     * 删除门诊挂号
     * 
     * @param registrationId 门诊挂号主键
     * @return 结果
     */
    public int deleteVrHisRegistrationByRegistrationId(Long registrationId);

    /**
     * 批量删除门诊挂号
     * 
     * @param registrationIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrHisRegistrationByRegistrationIds(Long[] registrationIds);
}
