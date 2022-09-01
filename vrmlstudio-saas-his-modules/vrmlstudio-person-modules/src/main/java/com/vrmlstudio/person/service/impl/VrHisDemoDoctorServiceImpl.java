package com.vrmlstudio.person.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.person.mapper.VrHisDemoDoctorMapper;
import com.vrmlstudio.person.domain.VrHisDemoDoctor;
import com.vrmlstudio.person.service.IVrHisDemoDoctorService;

/**
 * 公示信息--医生Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisDemoDoctorServiceImpl implements IVrHisDemoDoctorService 
{
    @Autowired
    private VrHisDemoDoctorMapper vrHisDemoDoctorMapper;

    /**
     * 查询公示信息--医生
     * 
     * @param id 公示信息--医生主键
     * @return 公示信息--医生
     */
    @Override
    public VrHisDemoDoctor selectVrHisDemoDoctorById(Long id)
    {
        return vrHisDemoDoctorMapper.selectVrHisDemoDoctorById(id);
    }

    /**
     * 查询公示信息--医生列表
     * 
     * @param vrHisDemoDoctor 公示信息--医生
     * @return 公示信息--医生
     */
    @Override
    public List<VrHisDemoDoctor> selectVrHisDemoDoctorList(VrHisDemoDoctor vrHisDemoDoctor)
    {
        return vrHisDemoDoctorMapper.selectVrHisDemoDoctorList(vrHisDemoDoctor);
    }

    /**
     * 新增公示信息--医生
     * 
     * @param vrHisDemoDoctor 公示信息--医生
     * @return 结果
     */
    @Override
    public int insertVrHisDemoDoctor(VrHisDemoDoctor vrHisDemoDoctor)
    {
        return vrHisDemoDoctorMapper.insertVrHisDemoDoctor(vrHisDemoDoctor);
    }

    /**
     * 修改公示信息--医生
     * 
     * @param vrHisDemoDoctor 公示信息--医生
     * @return 结果
     */
    @Override
    public int updateVrHisDemoDoctor(VrHisDemoDoctor vrHisDemoDoctor)
    {
        return vrHisDemoDoctorMapper.updateVrHisDemoDoctor(vrHisDemoDoctor);
    }

    /**
     * 批量删除公示信息--医生
     * 
     * @param ids 需要删除的公示信息--医生主键
     * @return 结果
     */
    @Override
    public int deleteVrHisDemoDoctorByIds(Long[] ids)
    {
        return vrHisDemoDoctorMapper.deleteVrHisDemoDoctorByIds(ids);
    }

    /**
     * 删除公示信息--医生信息
     * 
     * @param id 公示信息--医生主键
     * @return 结果
     */
    @Override
    public int deleteVrHisDemoDoctorById(Long id)
    {
        return vrHisDemoDoctorMapper.deleteVrHisDemoDoctorById(id);
    }
}
