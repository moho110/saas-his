package com.vrmlstudio.xsystem.mapper;

import java.util.List;
import com.vrmlstudio.xsystem.domain.VrHisPrescriptionExtracharges;

/**
 * 处方附加费用Mapper接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface VrHisPrescriptionExtrachargesMapper 
{
    /**
     * 查询处方附加费用
     * 
     * @param preId 处方附加费用主键
     * @return 处方附加费用
     */
    public VrHisPrescriptionExtracharges selectVrHisPrescriptionExtrachargesByPreId(Long preId);

    /**
     * 查询处方附加费用列表
     * 
     * @param vrHisPrescriptionExtracharges 处方附加费用
     * @return 处方附加费用集合
     */
    public List<VrHisPrescriptionExtracharges> selectVrHisPrescriptionExtrachargesList(VrHisPrescriptionExtracharges vrHisPrescriptionExtracharges);

    /**
     * 新增处方附加费用
     * 
     * @param vrHisPrescriptionExtracharges 处方附加费用
     * @return 结果
     */
    public int insertVrHisPrescriptionExtracharges(VrHisPrescriptionExtracharges vrHisPrescriptionExtracharges);

    /**
     * 修改处方附加费用
     * 
     * @param vrHisPrescriptionExtracharges 处方附加费用
     * @return 结果
     */
    public int updateVrHisPrescriptionExtracharges(VrHisPrescriptionExtracharges vrHisPrescriptionExtracharges);

    /**
     * 删除处方附加费用
     * 
     * @param preId 处方附加费用主键
     * @return 结果
     */
    public int deleteVrHisPrescriptionExtrachargesByPreId(Long preId);

    /**
     * 批量删除处方附加费用
     * 
     * @param preIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrHisPrescriptionExtrachargesByPreIds(Long[] preIds);
}
