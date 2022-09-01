package com.vrmlstudio.department.service.impl;

import java.util.List;
import com.vrmlstudio.common.utils.DateUtils;
import com.vrmlstudio.department.service.IVrHisHospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.department.mapper.VrHisHospitalMapper;
import com.vrmlstudio.department.domain.VrHisHospital;

/**
 * HIS医院基本信息Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisHospitalServiceImpl implements IVrHisHospitalService
{
    @Autowired
    private VrHisHospitalMapper vrHisHospitalMapper;

    /**
     * 查询HIS医院基本信息
     * 
     * @param id HIS医院基本信息主键
     * @return HIS医院基本信息
     */
    @Override
    public VrHisHospital selectVrHisHospitalById(Long id)
    {
        return vrHisHospitalMapper.selectVrHisHospitalById(id);
    }

    /**
     * 查询HIS医院基本信息列表
     * 
     * @param vrHisHospital HIS医院基本信息
     * @return HIS医院基本信息
     */
    @Override
    public List<VrHisHospital> selectVrHisHospitalList(VrHisHospital vrHisHospital)
    {
        return vrHisHospitalMapper.selectVrHisHospitalList(vrHisHospital);
    }

    /**
     * 新增HIS医院基本信息
     * 
     * @param vrHisHospital HIS医院基本信息
     * @return 结果
     */
    @Override
    public int insertVrHisHospital(VrHisHospital vrHisHospital)
    {
        vrHisHospital.setCreateTime(DateUtils.getNowDate());
        return vrHisHospitalMapper.insertVrHisHospital(vrHisHospital);
    }

    /**
     * 修改HIS医院基本信息
     * 
     * @param vrHisHospital HIS医院基本信息
     * @return 结果
     */
    @Override
    public int updateVrHisHospital(VrHisHospital vrHisHospital)
    {
        vrHisHospital.setUpdateTime(DateUtils.getNowDate());
        return vrHisHospitalMapper.updateVrHisHospital(vrHisHospital);
    }

    /**
     * 批量删除HIS医院基本信息
     * 
     * @param ids 需要删除的HIS医院基本信息主键
     * @return 结果
     */
    @Override
    public int deleteVrHisHospitalByIds(Long[] ids)
    {
        return vrHisHospitalMapper.deleteVrHisHospitalByIds(ids);
    }

    /**
     * 删除HIS医院基本信息信息
     * 
     * @param id HIS医院基本信息主键
     * @return 结果
     */
    @Override
    public int deleteVrHisHospitalById(Long id)
    {
        return vrHisHospitalMapper.deleteVrHisHospitalById(id);
    }
}
