package com.vrmlstudio.department.service.impl;

import java.util.List;
import com.vrmlstudio.common.utils.DateUtils;
import com.vrmlstudio.department.service.IVrHisHospitalDoctorRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.department.mapper.VrHisHospitalDoctorRelationMapper;
import com.vrmlstudio.department.domain.VrHisHospitalDoctorRelation;

/**
 * 医生与医院关联Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisHospitalDoctorRelationServiceImpl implements IVrHisHospitalDoctorRelationService
{
    @Autowired
    private VrHisHospitalDoctorRelationMapper vrHisHospitalDoctorRelationMapper;

    /**
     * 查询医生与医院关联
     * 
     * @param rid 医生与医院关联主键
     * @return 医生与医院关联
     */
    @Override
    public VrHisHospitalDoctorRelation selectVrHisHospitalDoctorRelationByRid(Long rid)
    {
        return vrHisHospitalDoctorRelationMapper.selectVrHisHospitalDoctorRelationByRid(rid);
    }

    /**
     * 查询医生与医院关联列表
     * 
     * @param vrHisHospitalDoctorRelation 医生与医院关联
     * @return 医生与医院关联
     */
    @Override
    public List<VrHisHospitalDoctorRelation> selectVrHisHospitalDoctorRelationList(VrHisHospitalDoctorRelation vrHisHospitalDoctorRelation)
    {
        return vrHisHospitalDoctorRelationMapper.selectVrHisHospitalDoctorRelationList(vrHisHospitalDoctorRelation);
    }

    /**
     * 新增医生与医院关联
     * 
     * @param vrHisHospitalDoctorRelation 医生与医院关联
     * @return 结果
     */
    @Override
    public int insertVrHisHospitalDoctorRelation(VrHisHospitalDoctorRelation vrHisHospitalDoctorRelation)
    {
        vrHisHospitalDoctorRelation.setCreateTime(DateUtils.getNowDate());
        return vrHisHospitalDoctorRelationMapper.insertVrHisHospitalDoctorRelation(vrHisHospitalDoctorRelation);
    }

    /**
     * 修改医生与医院关联
     * 
     * @param vrHisHospitalDoctorRelation 医生与医院关联
     * @return 结果
     */
    @Override
    public int updateVrHisHospitalDoctorRelation(VrHisHospitalDoctorRelation vrHisHospitalDoctorRelation)
    {
        vrHisHospitalDoctorRelation.setUpdateTime(DateUtils.getNowDate());
        return vrHisHospitalDoctorRelationMapper.updateVrHisHospitalDoctorRelation(vrHisHospitalDoctorRelation);
    }

    /**
     * 批量删除医生与医院关联
     * 
     * @param rids 需要删除的医生与医院关联主键
     * @return 结果
     */
    @Override
    public int deleteVrHisHospitalDoctorRelationByRids(Long[] rids)
    {
        return vrHisHospitalDoctorRelationMapper.deleteVrHisHospitalDoctorRelationByRids(rids);
    }

    /**
     * 删除医生与医院关联信息
     * 
     * @param rid 医生与医院关联主键
     * @return 结果
     */
    @Override
    public int deleteVrHisHospitalDoctorRelationByRid(Long rid)
    {
        return vrHisHospitalDoctorRelationMapper.deleteVrHisHospitalDoctorRelationByRid(rid);
    }
}
