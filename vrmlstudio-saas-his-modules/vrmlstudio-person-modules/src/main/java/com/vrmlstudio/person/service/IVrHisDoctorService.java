package com.vrmlstudio.person.service;

import java.util.List;
import com.vrmlstudio.person.domain.VrHisDoctor;

/**
 * 医生基本信息Service接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface IVrHisDoctorService 
{
    /**
     * 查询医生基本信息
     * 
     * @param id 医生基本信息主键
     * @return 医生基本信息
     */
    public VrHisDoctor selectVrHisDoctorById(Long id);

    /**
     * 查询医生基本信息列表
     * 
     * @param vrHisDoctor 医生基本信息
     * @return 医生基本信息集合
     */
    public List<VrHisDoctor> selectVrHisDoctorList(VrHisDoctor vrHisDoctor);

    /**
     * 新增医生基本信息
     * 
     * @param vrHisDoctor 医生基本信息
     * @return 结果
     */
    public int insertVrHisDoctor(VrHisDoctor vrHisDoctor);

    /**
     * 修改医生基本信息
     * 
     * @param vrHisDoctor 医生基本信息
     * @return 结果
     */
    public int updateVrHisDoctor(VrHisDoctor vrHisDoctor);

    /**
     * 批量删除医生基本信息
     * 
     * @param ids 需要删除的医生基本信息主键集合
     * @return 结果
     */
    public int deleteVrHisDoctorByIds(Long[] ids);

    /**
     * 删除医生基本信息信息
     * 
     * @param id 医生基本信息主键
     * @return 结果
     */
    public int deleteVrHisDoctorById(Long id);
}
