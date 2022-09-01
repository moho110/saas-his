package com.vrmlstudio.medicine.service.impl;

import java.util.List;
import com.vrmlstudio.common.utils.DateUtils;
import com.vrmlstudio.medicine.service.IVrHisInspectionfeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.medicine.mapper.VrHisInspectionfeeMapper;
import com.vrmlstudio.medicine.domain.VrHisInspectionfee;

/**
 * 检查项目费用Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisInspectionfeeServiceImpl implements IVrHisInspectionfeeService
{
    @Autowired
    private VrHisInspectionfeeMapper vrHisInspectionfeeMapper;

    /**
     * 查询检查项目费用
     * 
     * @param insId 检查项目费用主键
     * @return 检查项目费用
     */
    @Override
    public VrHisInspectionfee selectVrHisInspectionfeeByInsId(Long insId)
    {
        return vrHisInspectionfeeMapper.selectVrHisInspectionfeeByInsId(insId);
    }

    /**
     * 查询检查项目费用列表
     * 
     * @param vrHisInspectionfee 检查项目费用
     * @return 检查项目费用
     */
    @Override
    public List<VrHisInspectionfee> selectVrHisInspectionfeeList(VrHisInspectionfee vrHisInspectionfee)
    {
        return vrHisInspectionfeeMapper.selectVrHisInspectionfeeList(vrHisInspectionfee);
    }

    /**
     * 新增检查项目费用
     * 
     * @param vrHisInspectionfee 检查项目费用
     * @return 结果
     */
    @Override
    public int insertVrHisInspectionfee(VrHisInspectionfee vrHisInspectionfee)
    {
        vrHisInspectionfee.setCreateTime(DateUtils.getNowDate());
        return vrHisInspectionfeeMapper.insertVrHisInspectionfee(vrHisInspectionfee);
    }

    /**
     * 修改检查项目费用
     * 
     * @param vrHisInspectionfee 检查项目费用
     * @return 结果
     */
    @Override
    public int updateVrHisInspectionfee(VrHisInspectionfee vrHisInspectionfee)
    {
        vrHisInspectionfee.setUpdateTime(DateUtils.getNowDate());
        return vrHisInspectionfeeMapper.updateVrHisInspectionfee(vrHisInspectionfee);
    }

    /**
     * 批量删除检查项目费用
     * 
     * @param insIds 需要删除的检查项目费用主键
     * @return 结果
     */
    @Override
    public int deleteVrHisInspectionfeeByInsIds(Long[] insIds)
    {
        return vrHisInspectionfeeMapper.deleteVrHisInspectionfeeByInsIds(insIds);
    }

    /**
     * 删除检查项目费用信息
     * 
     * @param insId 检查项目费用主键
     * @return 结果
     */
    @Override
    public int deleteVrHisInspectionfeeByInsId(Long insId)
    {
        return vrHisInspectionfeeMapper.deleteVrHisInspectionfeeByInsId(insId);
    }
}
