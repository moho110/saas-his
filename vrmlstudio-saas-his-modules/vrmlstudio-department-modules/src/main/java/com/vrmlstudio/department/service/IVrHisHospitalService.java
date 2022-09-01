package com.vrmlstudio.department.service;

import java.util.List;
import com.vrmlstudio.department.domain.VrHisHospital;

/**
 * HIS医院基本信息Service接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface IVrHisHospitalService 
{
    /**
     * 查询HIS医院基本信息
     * 
     * @param id HIS医院基本信息主键
     * @return HIS医院基本信息
     */
    public VrHisHospital selectVrHisHospitalById(Long id);

    /**
     * 查询HIS医院基本信息列表
     * 
     * @param vrHisHospital HIS医院基本信息
     * @return HIS医院基本信息集合
     */
    public List<VrHisHospital> selectVrHisHospitalList(VrHisHospital vrHisHospital);

    /**
     * 新增HIS医院基本信息
     * 
     * @param vrHisHospital HIS医院基本信息
     * @return 结果
     */
    public int insertVrHisHospital(VrHisHospital vrHisHospital);

    /**
     * 修改HIS医院基本信息
     * 
     * @param vrHisHospital HIS医院基本信息
     * @return 结果
     */
    public int updateVrHisHospital(VrHisHospital vrHisHospital);

    /**
     * 批量删除HIS医院基本信息
     * 
     * @param ids 需要删除的HIS医院基本信息主键集合
     * @return 结果
     */
    public int deleteVrHisHospitalByIds(Long[] ids);

    /**
     * 删除HIS医院基本信息信息
     * 
     * @param id HIS医院基本信息主键
     * @return 结果
     */
    public int deleteVrHisHospitalById(Long id);
}
