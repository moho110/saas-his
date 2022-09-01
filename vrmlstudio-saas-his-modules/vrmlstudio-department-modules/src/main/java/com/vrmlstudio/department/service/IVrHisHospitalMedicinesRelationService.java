package com.vrmlstudio.department.service;

import java.util.List;
import com.vrmlstudio.department.domain.VrHisHospitalMedicinesRelation;

/**
 * 医院药品关联Service接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface IVrHisHospitalMedicinesRelationService 
{
    /**
     * 查询医院药品关联
     * 
     * @param hmrId 医院药品关联主键
     * @return 医院药品关联
     */
    public VrHisHospitalMedicinesRelation selectVrHisHospitalMedicinesRelationByHmrId(Long hmrId);

    /**
     * 查询医院药品关联列表
     * 
     * @param vrHisHospitalMedicinesRelation 医院药品关联
     * @return 医院药品关联集合
     */
    public List<VrHisHospitalMedicinesRelation> selectVrHisHospitalMedicinesRelationList(VrHisHospitalMedicinesRelation vrHisHospitalMedicinesRelation);

    /**
     * 新增医院药品关联
     * 
     * @param vrHisHospitalMedicinesRelation 医院药品关联
     * @return 结果
     */
    public int insertVrHisHospitalMedicinesRelation(VrHisHospitalMedicinesRelation vrHisHospitalMedicinesRelation);

    /**
     * 修改医院药品关联
     * 
     * @param vrHisHospitalMedicinesRelation 医院药品关联
     * @return 结果
     */
    public int updateVrHisHospitalMedicinesRelation(VrHisHospitalMedicinesRelation vrHisHospitalMedicinesRelation);

    /**
     * 批量删除医院药品关联
     * 
     * @param hmrIds 需要删除的医院药品关联主键集合
     * @return 结果
     */
    public int deleteVrHisHospitalMedicinesRelationByHmrIds(Long[] hmrIds);

    /**
     * 删除医院药品关联信息
     * 
     * @param hmrId 医院药品关联主键
     * @return 结果
     */
    public int deleteVrHisHospitalMedicinesRelationByHmrId(Long hmrId);
}
