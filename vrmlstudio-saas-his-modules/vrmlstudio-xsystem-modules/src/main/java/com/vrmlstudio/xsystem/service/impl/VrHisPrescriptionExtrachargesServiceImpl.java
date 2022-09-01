package com.vrmlstudio.xsystem.service.impl;

import java.util.List;
import com.vrmlstudio.common.utils.DateUtils;
import com.vrmlstudio.xsystem.service.IVrHisPrescriptionExtrachargesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.xsystem.mapper.VrHisPrescriptionExtrachargesMapper;
import com.vrmlstudio.xsystem.domain.VrHisPrescriptionExtracharges;

/**
 * 处方附加费用Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisPrescriptionExtrachargesServiceImpl implements IVrHisPrescriptionExtrachargesService
{
    @Autowired
    private VrHisPrescriptionExtrachargesMapper vrHisPrescriptionExtrachargesMapper;

    /**
     * 查询处方附加费用
     * 
     * @param preId 处方附加费用主键
     * @return 处方附加费用
     */
    @Override
    public VrHisPrescriptionExtracharges selectVrHisPrescriptionExtrachargesByPreId(Long preId)
    {
        return vrHisPrescriptionExtrachargesMapper.selectVrHisPrescriptionExtrachargesByPreId(preId);
    }

    /**
     * 查询处方附加费用列表
     * 
     * @param vrHisPrescriptionExtracharges 处方附加费用
     * @return 处方附加费用
     */
    @Override
    public List<VrHisPrescriptionExtracharges> selectVrHisPrescriptionExtrachargesList(VrHisPrescriptionExtracharges vrHisPrescriptionExtracharges)
    {
        return vrHisPrescriptionExtrachargesMapper.selectVrHisPrescriptionExtrachargesList(vrHisPrescriptionExtracharges);
    }

    /**
     * 新增处方附加费用
     * 
     * @param vrHisPrescriptionExtracharges 处方附加费用
     * @return 结果
     */
    @Override
    public int insertVrHisPrescriptionExtracharges(VrHisPrescriptionExtracharges vrHisPrescriptionExtracharges)
    {
        vrHisPrescriptionExtracharges.setCreateTime(DateUtils.getNowDate());
        return vrHisPrescriptionExtrachargesMapper.insertVrHisPrescriptionExtracharges(vrHisPrescriptionExtracharges);
    }

    /**
     * 修改处方附加费用
     * 
     * @param vrHisPrescriptionExtracharges 处方附加费用
     * @return 结果
     */
    @Override
    public int updateVrHisPrescriptionExtracharges(VrHisPrescriptionExtracharges vrHisPrescriptionExtracharges)
    {
        vrHisPrescriptionExtracharges.setUpdateTime(DateUtils.getNowDate());
        return vrHisPrescriptionExtrachargesMapper.updateVrHisPrescriptionExtracharges(vrHisPrescriptionExtracharges);
    }

    /**
     * 批量删除处方附加费用
     * 
     * @param preIds 需要删除的处方附加费用主键
     * @return 结果
     */
    @Override
    public int deleteVrHisPrescriptionExtrachargesByPreIds(Long[] preIds)
    {
        return vrHisPrescriptionExtrachargesMapper.deleteVrHisPrescriptionExtrachargesByPreIds(preIds);
    }

    /**
     * 删除处方附加费用信息
     * 
     * @param preId 处方附加费用主键
     * @return 结果
     */
    @Override
    public int deleteVrHisPrescriptionExtrachargesByPreId(Long preId)
    {
        return vrHisPrescriptionExtrachargesMapper.deleteVrHisPrescriptionExtrachargesByPreId(preId);
    }
}
