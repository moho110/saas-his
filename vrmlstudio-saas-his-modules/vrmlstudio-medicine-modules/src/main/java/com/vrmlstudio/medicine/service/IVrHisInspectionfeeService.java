package com.vrmlstudio.medicine.service;

import java.util.List;
import com.vrmlstudio.medicine.domain.VrHisInspectionfee;

/**
 * 检查项目费用Service接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface IVrHisInspectionfeeService 
{
    /**
     * 查询检查项目费用
     * 
     * @param insId 检查项目费用主键
     * @return 检查项目费用
     */
    public VrHisInspectionfee selectVrHisInspectionfeeByInsId(Long insId);

    /**
     * 查询检查项目费用列表
     * 
     * @param vrHisInspectionfee 检查项目费用
     * @return 检查项目费用集合
     */
    public List<VrHisInspectionfee> selectVrHisInspectionfeeList(VrHisInspectionfee vrHisInspectionfee);

    /**
     * 新增检查项目费用
     * 
     * @param vrHisInspectionfee 检查项目费用
     * @return 结果
     */
    public int insertVrHisInspectionfee(VrHisInspectionfee vrHisInspectionfee);

    /**
     * 修改检查项目费用
     * 
     * @param vrHisInspectionfee 检查项目费用
     * @return 结果
     */
    public int updateVrHisInspectionfee(VrHisInspectionfee vrHisInspectionfee);

    /**
     * 批量删除检查项目费用
     * 
     * @param insIds 需要删除的检查项目费用主键集合
     * @return 结果
     */
    public int deleteVrHisInspectionfeeByInsIds(Long[] insIds);

    /**
     * 删除检查项目费用信息
     * 
     * @param insId 检查项目费用主键
     * @return 结果
     */
    public int deleteVrHisInspectionfeeByInsId(Long insId);
}
