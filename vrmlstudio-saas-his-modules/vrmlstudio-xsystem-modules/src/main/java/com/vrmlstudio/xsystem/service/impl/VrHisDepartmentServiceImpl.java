package com.vrmlstudio.xsystem.service.impl;

import java.util.List;
import com.vrmlstudio.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.xsystem.mapper.VrHisDepartmentMapper;
import com.vrmlstudio.xsystem.domain.VrHisDepartment;
import com.vrmlstudio.xsystem.service.IVrHisDepartmentService;

/**
 * 科室Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisDepartmentServiceImpl implements IVrHisDepartmentService 
{
    @Autowired
    private VrHisDepartmentMapper vrHisDepartmentMapper;

    /**
     * 查询科室
     * 
     * @param did 科室主键
     * @return 科室
     */
    @Override
    public VrHisDepartment selectVrHisDepartmentByDid(Long did)
    {
        return vrHisDepartmentMapper.selectVrHisDepartmentByDid(did);
    }

    /**
     * 查询科室列表
     * 
     * @param vrHisDepartment 科室
     * @return 科室
     */
    @Override
    public List<VrHisDepartment> selectVrHisDepartmentList(VrHisDepartment vrHisDepartment)
    {
        return vrHisDepartmentMapper.selectVrHisDepartmentList(vrHisDepartment);
    }

    /**
     * 新增科室
     * 
     * @param vrHisDepartment 科室
     * @return 结果
     */
    @Override
    public int insertVrHisDepartment(VrHisDepartment vrHisDepartment)
    {
        vrHisDepartment.setCreateTime(DateUtils.getNowDate());
        return vrHisDepartmentMapper.insertVrHisDepartment(vrHisDepartment);
    }

    /**
     * 修改科室
     * 
     * @param vrHisDepartment 科室
     * @return 结果
     */
    @Override
    public int updateVrHisDepartment(VrHisDepartment vrHisDepartment)
    {
        vrHisDepartment.setUpdateTime(DateUtils.getNowDate());
        return vrHisDepartmentMapper.updateVrHisDepartment(vrHisDepartment);
    }

    /**
     * 批量删除科室
     * 
     * @param dids 需要删除的科室主键
     * @return 结果
     */
    @Override
    public int deleteVrHisDepartmentByDids(Long[] dids)
    {
        return vrHisDepartmentMapper.deleteVrHisDepartmentByDids(dids);
    }

    /**
     * 删除科室信息
     * 
     * @param did 科室主键
     * @return 结果
     */
    @Override
    public int deleteVrHisDepartmentByDid(Long did)
    {
        return vrHisDepartmentMapper.deleteVrHisDepartmentByDid(did);
    }
}
