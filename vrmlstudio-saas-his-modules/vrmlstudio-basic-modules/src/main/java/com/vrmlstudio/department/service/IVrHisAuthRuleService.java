package com.vrmlstudio.department.service;

import java.util.List;
import com.vrmlstudio.department.domain.VrHisAuthRule;

/**
 * 用户权限Service接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface IVrHisAuthRuleService 
{
    /**
     * 查询用户权限
     * 
     * @param id 用户权限主键
     * @return 用户权限
     */
    public VrHisAuthRule selectVrHisAuthRuleById(Integer id);

    /**
     * 查询用户权限列表
     * 
     * @param vrHisAuthRule 用户权限
     * @return 用户权限集合
     */
    public List<VrHisAuthRule> selectVrHisAuthRuleList(VrHisAuthRule vrHisAuthRule);

    /**
     * 新增用户权限
     * 
     * @param vrHisAuthRule 用户权限
     * @return 结果
     */
    public int insertVrHisAuthRule(VrHisAuthRule vrHisAuthRule);

    /**
     * 修改用户权限
     * 
     * @param vrHisAuthRule 用户权限
     * @return 结果
     */
    public int updateVrHisAuthRule(VrHisAuthRule vrHisAuthRule);

    /**
     * 批量删除用户权限
     * 
     * @param ids 需要删除的用户权限主键集合
     * @return 结果
     */
    public int deleteVrHisAuthRuleByIds(Integer[] ids);

    /**
     * 删除用户权限信息
     * 
     * @param id 用户权限主键
     * @return 结果
     */
    public int deleteVrHisAuthRuleById(Integer id);
}
