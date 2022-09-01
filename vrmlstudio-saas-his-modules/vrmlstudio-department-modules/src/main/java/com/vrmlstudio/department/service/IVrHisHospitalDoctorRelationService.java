package com.vrmlstudio.department.service;

import java.util.List;
import com.vrmlstudio.department.domain.VrHisHospitalDoctorRelation;

/**
 * 医生与医院关联Service接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface IVrHisHospitalDoctorRelationService 
{
    /**
     * 查询医生与医院关联
     * 
     * @param rid 医生与医院关联主键
     * @return 医生与医院关联
     */
    public VrHisHospitalDoctorRelation selectVrHisHospitalDoctorRelationByRid(Long rid);

    /**
     * 查询医生与医院关联列表
     * 
     * @param vrHisHospitalDoctorRelation 医生与医院关联
     * @return 医生与医院关联集合
     */
    public List<VrHisHospitalDoctorRelation> selectVrHisHospitalDoctorRelationList(VrHisHospitalDoctorRelation vrHisHospitalDoctorRelation);

    /**
     * 新增医生与医院关联
     * 
     * @param vrHisHospitalDoctorRelation 医生与医院关联
     * @return 结果
     */
    public int insertVrHisHospitalDoctorRelation(VrHisHospitalDoctorRelation vrHisHospitalDoctorRelation);

    /**
     * 修改医生与医院关联
     * 
     * @param vrHisHospitalDoctorRelation 医生与医院关联
     * @return 结果
     */
    public int updateVrHisHospitalDoctorRelation(VrHisHospitalDoctorRelation vrHisHospitalDoctorRelation);

    /**
     * 批量删除医生与医院关联
     * 
     * @param rids 需要删除的医生与医院关联主键集合
     * @return 结果
     */
    public int deleteVrHisHospitalDoctorRelationByRids(Long[] rids);

    /**
     * 删除医生与医院关联信息
     * 
     * @param rid 医生与医院关联主键
     * @return 结果
     */
    public int deleteVrHisHospitalDoctorRelationByRid(Long rid);
}
