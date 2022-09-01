package com.vrmlstudio.department.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.department.mapper.VrHisAuthRuleMapper;
import com.vrmlstudio.department.domain.VrHisAuthRule;
import com.vrmlstudio.department.service.IVrHisAuthRuleService;

/**
 * 用户权限Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisAuthRuleServiceImpl implements IVrHisAuthRuleService 
{
    @Autowired
    private VrHisAuthRuleMapper vrHisAuthRuleMapper;

    /**
     * 查询用户权限
     * 
     * @param id 用户权限主键
     * @return 用户权限
     */
    @Override
    public VrHisAuthRule selectVrHisAuthRuleById(Integer id)
    {
        return vrHisAuthRuleMapper.selectVrHisAuthRuleById(id);
    }

    /**
     * 查询用户权限列表
     * 
     * @param vrHisAuthRule 用户权限
     * @return 用户权限
     */
    @Override
    public List<VrHisAuthRule> selectVrHisAuthRuleList(VrHisAuthRule vrHisAuthRule)
    {
        return vrHisAuthRuleMapper.selectVrHisAuthRuleList(vrHisAuthRule);
    }

    /**
     * 新增用户权限
     * 
     * @param vrHisAuthRule 用户权限
     * @return 结果
     */
    @Override
    public int insertVrHisAuthRule(VrHisAuthRule vrHisAuthRule)
    {
        return vrHisAuthRuleMapper.insertVrHisAuthRule(vrHisAuthRule);
    }

    /**
     * 修改用户权限
     * 
     * @param vrHisAuthRule 用户权限
     * @return 结果
     */
    @Override
    public int updateVrHisAuthRule(VrHisAuthRule vrHisAuthRule)
    {
        return vrHisAuthRuleMapper.updateVrHisAuthRule(vrHisAuthRule);
    }

    /**
     * 批量删除用户权限
     * 
     * @param ids 需要删除的用户权限主键
     * @return 结果
     */
    @Override
    public int deleteVrHisAuthRuleByIds(Integer[] ids)
    {
        return vrHisAuthRuleMapper.deleteVrHisAuthRuleByIds(ids);
    }

    /**
     * 删除用户权限信息
     * 
     * @param id 用户权限主键
     * @return 结果
     */
    @Override
    public int deleteVrHisAuthRuleById(Integer id)
    {
        return vrHisAuthRuleMapper.deleteVrHisAuthRuleById(id);
    }
}
