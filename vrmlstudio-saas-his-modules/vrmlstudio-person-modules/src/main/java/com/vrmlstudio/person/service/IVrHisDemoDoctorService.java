package com.vrmlstudio.person.service;

import java.util.List;
import com.vrmlstudio.person.domain.VrHisDemoDoctor;

/**
 * 公示信息--医生Service接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface IVrHisDemoDoctorService 
{
    /**
     * 查询公示信息--医生
     * 
     * @param id 公示信息--医生主键
     * @return 公示信息--医生
     */
    public VrHisDemoDoctor selectVrHisDemoDoctorById(Long id);

    /**
     * 查询公示信息--医生列表
     * 
     * @param vrHisDemoDoctor 公示信息--医生
     * @return 公示信息--医生集合
     */
    public List<VrHisDemoDoctor> selectVrHisDemoDoctorList(VrHisDemoDoctor vrHisDemoDoctor);

    /**
     * 新增公示信息--医生
     * 
     * @param vrHisDemoDoctor 公示信息--医生
     * @return 结果
     */
    public int insertVrHisDemoDoctor(VrHisDemoDoctor vrHisDemoDoctor);

    /**
     * 修改公示信息--医生
     * 
     * @param vrHisDemoDoctor 公示信息--医生
     * @return 结果
     */
    public int updateVrHisDemoDoctor(VrHisDemoDoctor vrHisDemoDoctor);

    /**
     * 批量删除公示信息--医生
     * 
     * @param ids 需要删除的公示信息--医生主键集合
     * @return 结果
     */
    public int deleteVrHisDemoDoctorByIds(Long[] ids);

    /**
     * 删除公示信息--医生信息
     * 
     * @param id 公示信息--医生主键
     * @return 结果
     */
    public int deleteVrHisDemoDoctorById(Long id);
}
