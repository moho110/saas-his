package com.vrmlstudio.sales.service.impl;

import java.util.List;
import com.vrmlstudio.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.sales.mapper.VrHisMedicinesMapper;
import com.vrmlstudio.sales.domain.VrHisMedicines;
import com.vrmlstudio.sales.service.IVrHisMedicinesService;

/**
 * 药品信息Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisMedicinesServiceImpl implements IVrHisMedicinesService 
{
    @Autowired
    private VrHisMedicinesMapper vrHisMedicinesMapper;

    /**
     * 查询药品信息
     * 
     * @param medicinesId 药品信息主键
     * @return 药品信息
     */
    @Override
    public VrHisMedicines selectVrHisMedicinesByMedicinesId(Integer medicinesId)
    {
        return vrHisMedicinesMapper.selectVrHisMedicinesByMedicinesId(medicinesId);
    }

    /**
     * 查询药品信息列表
     * 
     * @param vrHisMedicines 药品信息
     * @return 药品信息
     */
    @Override
    public List<VrHisMedicines> selectVrHisMedicinesList(VrHisMedicines vrHisMedicines)
    {
        return vrHisMedicinesMapper.selectVrHisMedicinesList(vrHisMedicines);
    }

    /**
     * 新增药品信息
     * 
     * @param vrHisMedicines 药品信息
     * @return 结果
     */
    @Override
    public int insertVrHisMedicines(VrHisMedicines vrHisMedicines)
    {
        vrHisMedicines.setCreateTime(DateUtils.getNowDate());
        return vrHisMedicinesMapper.insertVrHisMedicines(vrHisMedicines);
    }

    /**
     * 修改药品信息
     * 
     * @param vrHisMedicines 药品信息
     * @return 结果
     */
    @Override
    public int updateVrHisMedicines(VrHisMedicines vrHisMedicines)
    {
        vrHisMedicines.setUpdateTime(DateUtils.getNowDate());
        return vrHisMedicinesMapper.updateVrHisMedicines(vrHisMedicines);
    }

    /**
     * 批量删除药品信息
     * 
     * @param medicinesIds 需要删除的药品信息主键
     * @return 结果
     */
    @Override
    public int deleteVrHisMedicinesByMedicinesIds(Integer[] medicinesIds)
    {
        return vrHisMedicinesMapper.deleteVrHisMedicinesByMedicinesIds(medicinesIds);
    }

    /**
     * 删除药品信息信息
     * 
     * @param medicinesId 药品信息主键
     * @return 结果
     */
    @Override
    public int deleteVrHisMedicinesByMedicinesId(Integer medicinesId)
    {
        return vrHisMedicinesMapper.deleteVrHisMedicinesByMedicinesId(medicinesId);
    }
}
