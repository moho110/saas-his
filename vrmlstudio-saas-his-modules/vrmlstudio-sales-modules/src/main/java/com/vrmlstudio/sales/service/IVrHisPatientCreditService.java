package com.vrmlstudio.sales.service;

import java.util.List;
import com.vrmlstudio.sales.domain.VrHisPatientCredit;

/**
 * 用户免费提问额度Service接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface IVrHisPatientCreditService 
{
    /**
     * 查询用户免费提问额度
     * 
     * @param id 用户免费提问额度主键
     * @return 用户免费提问额度
     */
    public VrHisPatientCredit selectVrHisPatientCreditById(Integer id);

    /**
     * 查询用户免费提问额度列表
     * 
     * @param vrHisPatientCredit 用户免费提问额度
     * @return 用户免费提问额度集合
     */
    public List<VrHisPatientCredit> selectVrHisPatientCreditList(VrHisPatientCredit vrHisPatientCredit);

    /**
     * 新增用户免费提问额度
     * 
     * @param vrHisPatientCredit 用户免费提问额度
     * @return 结果
     */
    public int insertVrHisPatientCredit(VrHisPatientCredit vrHisPatientCredit);

    /**
     * 修改用户免费提问额度
     * 
     * @param vrHisPatientCredit 用户免费提问额度
     * @return 结果
     */
    public int updateVrHisPatientCredit(VrHisPatientCredit vrHisPatientCredit);

    /**
     * 批量删除用户免费提问额度
     * 
     * @param ids 需要删除的用户免费提问额度主键集合
     * @return 结果
     */
    public int deleteVrHisPatientCreditByIds(Integer[] ids);

    /**
     * 删除用户免费提问额度信息
     * 
     * @param id 用户免费提问额度主键
     * @return 结果
     */
    public int deleteVrHisPatientCreditById(Integer id);
}
