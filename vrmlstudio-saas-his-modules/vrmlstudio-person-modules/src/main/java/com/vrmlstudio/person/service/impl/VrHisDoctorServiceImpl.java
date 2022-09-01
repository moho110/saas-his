package com.vrmlstudio.person.service.impl;

import java.util.List;
import com.vrmlstudio.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.person.mapper.VrHisDoctorMapper;
import com.vrmlstudio.person.domain.VrHisDoctor;
import com.vrmlstudio.person.service.IVrHisDoctorService;

/**
 * 医生基本信息Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisDoctorServiceImpl implements IVrHisDoctorService 
{
    @Autowired
    private VrHisDoctorMapper vrHisDoctorMapper;

    /**
     * 查询医生基本信息
     * 
     * @param id 医生基本信息主键
     * @return 医生基本信息
     */
    @Override
    public VrHisDoctor selectVrHisDoctorById(Long id)
    {
        return vrHisDoctorMapper.selectVrHisDoctorById(id);
    }

    /**
     * 查询医生基本信息列表
     * 
     * @param vrHisDoctor 医生基本信息
     * @return 医生基本信息
     */
    @Override
    public List<VrHisDoctor> selectVrHisDoctorList(VrHisDoctor vrHisDoctor)
    {
        return vrHisDoctorMapper.selectVrHisDoctorList(vrHisDoctor);
    }

    /**
     * 新增医生基本信息
     * 
     * @param vrHisDoctor 医生基本信息
     * @return 结果
     */
    @Override
    public int insertVrHisDoctor(VrHisDoctor vrHisDoctor)
    {
        vrHisDoctor.setCreateTime(DateUtils.getNowDate());
        return vrHisDoctorMapper.insertVrHisDoctor(vrHisDoctor);
    }

    /**
     * 修改医生基本信息
     * 
     * @param vrHisDoctor 医生基本信息
     * @return 结果
     */
    @Override
    public int updateVrHisDoctor(VrHisDoctor vrHisDoctor)
    {
        vrHisDoctor.setUpdateTime(DateUtils.getNowDate());
        return vrHisDoctorMapper.updateVrHisDoctor(vrHisDoctor);
    }

    /**
     * 批量删除医生基本信息
     * 
     * @param ids 需要删除的医生基本信息主键
     * @return 结果
     */
    @Override
    public int deleteVrHisDoctorByIds(Long[] ids)
    {
        return vrHisDoctorMapper.deleteVrHisDoctorByIds(ids);
    }

    /**
     * 删除医生基本信息信息
     * 
     * @param id 医生基本信息主键
     * @return 结果
     */
    @Override
    public int deleteVrHisDoctorById(Long id)
    {
        return vrHisDoctorMapper.deleteVrHisDoctorById(id);
    }
}
