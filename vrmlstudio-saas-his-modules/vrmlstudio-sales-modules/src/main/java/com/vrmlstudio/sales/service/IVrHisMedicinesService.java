package com.vrmlstudio.sales.service;

import java.util.List;
import com.vrmlstudio.sales.domain.VrHisMedicines;

/**
 * 药品信息Service接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface IVrHisMedicinesService 
{
    /**
     * 查询药品信息
     * 
     * @param medicinesId 药品信息主键
     * @return 药品信息
     */
    public VrHisMedicines selectVrHisMedicinesByMedicinesId(Integer medicinesId);

    /**
     * 查询药品信息列表
     * 
     * @param vrHisMedicines 药品信息
     * @return 药品信息集合
     */
    public List<VrHisMedicines> selectVrHisMedicinesList(VrHisMedicines vrHisMedicines);

    /**
     * 新增药品信息
     * 
     * @param vrHisMedicines 药品信息
     * @return 结果
     */
    public int insertVrHisMedicines(VrHisMedicines vrHisMedicines);

    /**
     * 修改药品信息
     * 
     * @param vrHisMedicines 药品信息
     * @return 结果
     */
    public int updateVrHisMedicines(VrHisMedicines vrHisMedicines);

    /**
     * 批量删除药品信息
     * 
     * @param medicinesIds 需要删除的药品信息主键集合
     * @return 结果
     */
    public int deleteVrHisMedicinesByMedicinesIds(Integer[] medicinesIds);

    /**
     * 删除药品信息信息
     * 
     * @param medicinesId 药品信息主键
     * @return 结果
     */
    public int deleteVrHisMedicinesByMedicinesId(Integer medicinesId);
}
