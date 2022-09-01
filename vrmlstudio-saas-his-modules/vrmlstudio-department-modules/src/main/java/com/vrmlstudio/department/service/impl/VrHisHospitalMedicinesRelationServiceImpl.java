package com.vrmlstudio.department.service.impl;

import java.util.List;
import com.vrmlstudio.common.utils.DateUtils;
import com.vrmlstudio.department.service.IVrHisHospitalMedicinesRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.department.mapper.VrHisHospitalMedicinesRelationMapper;
import com.vrmlstudio.department.domain.VrHisHospitalMedicinesRelation;

/**
 * 医院药品关联Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisHospitalMedicinesRelationServiceImpl implements IVrHisHospitalMedicinesRelationService
{
    @Autowired
    private VrHisHospitalMedicinesRelationMapper vrHisHospitalMedicinesRelationMapper;

    /**
     * 查询医院药品关联
     * 
     * @param hmrId 医院药品关联主键
     * @return 医院药品关联
     */
    @Override
    public VrHisHospitalMedicinesRelation selectVrHisHospitalMedicinesRelationByHmrId(Long hmrId)
    {
        return vrHisHospitalMedicinesRelationMapper.selectVrHisHospitalMedicinesRelationByHmrId(hmrId);
    }

    /**
     * 查询医院药品关联列表
     * 
     * @param vrHisHospitalMedicinesRelation 医院药品关联
     * @return 医院药品关联
     */
    @Override
    public List<VrHisHospitalMedicinesRelation> selectVrHisHospitalMedicinesRelationList(VrHisHospitalMedicinesRelation vrHisHospitalMedicinesRelation)
    {
        return vrHisHospitalMedicinesRelationMapper.selectVrHisHospitalMedicinesRelationList(vrHisHospitalMedicinesRelation);
    }

    /**
     * 新增医院药品关联
     * 
     * @param vrHisHospitalMedicinesRelation 医院药品关联
     * @return 结果
     */
    @Override
    public int insertVrHisHospitalMedicinesRelation(VrHisHospitalMedicinesRelation vrHisHospitalMedicinesRelation)
    {
        vrHisHospitalMedicinesRelation.setCreateTime(DateUtils.getNowDate());
        return vrHisHospitalMedicinesRelationMapper.insertVrHisHospitalMedicinesRelation(vrHisHospitalMedicinesRelation);
    }

    /**
     * 修改医院药品关联
     * 
     * @param vrHisHospitalMedicinesRelation 医院药品关联
     * @return 结果
     */
    @Override
    public int updateVrHisHospitalMedicinesRelation(VrHisHospitalMedicinesRelation vrHisHospitalMedicinesRelation)
    {
        vrHisHospitalMedicinesRelation.setUpdateTime(DateUtils.getNowDate());
        return vrHisHospitalMedicinesRelationMapper.updateVrHisHospitalMedicinesRelation(vrHisHospitalMedicinesRelation);
    }

    /**
     * 批量删除医院药品关联
     * 
     * @param hmrIds 需要删除的医院药品关联主键
     * @return 结果
     */
    @Override
    public int deleteVrHisHospitalMedicinesRelationByHmrIds(Long[] hmrIds)
    {
        return vrHisHospitalMedicinesRelationMapper.deleteVrHisHospitalMedicinesRelationByHmrIds(hmrIds);
    }

    /**
     * 删除医院药品关联信息
     * 
     * @param hmrId 医院药品关联主键
     * @return 结果
     */
    @Override
    public int deleteVrHisHospitalMedicinesRelationByHmrId(Long hmrId)
    {
        return vrHisHospitalMedicinesRelationMapper.deleteVrHisHospitalMedicinesRelationByHmrId(hmrId);
    }
}
