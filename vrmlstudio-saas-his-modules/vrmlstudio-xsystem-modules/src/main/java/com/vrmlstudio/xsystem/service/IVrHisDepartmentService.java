package com.vrmlstudio.xsystem.service;

import java.util.List;
import com.vrmlstudio.xsystem.domain.VrHisDepartment;

/**
 * 科室Service接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface IVrHisDepartmentService 
{
    /**
     * 查询科室
     * 
     * @param did 科室主键
     * @return 科室
     */
    public VrHisDepartment selectVrHisDepartmentByDid(Long did);

    /**
     * 查询科室列表
     * 
     * @param vrHisDepartment 科室
     * @return 科室集合
     */
    public List<VrHisDepartment> selectVrHisDepartmentList(VrHisDepartment vrHisDepartment);

    /**
     * 新增科室
     * 
     * @param vrHisDepartment 科室
     * @return 结果
     */
    public int insertVrHisDepartment(VrHisDepartment vrHisDepartment);

    /**
     * 修改科室
     * 
     * @param vrHisDepartment 科室
     * @return 结果
     */
    public int updateVrHisDepartment(VrHisDepartment vrHisDepartment);

    /**
     * 批量删除科室
     * 
     * @param dids 需要删除的科室主键集合
     * @return 结果
     */
    public int deleteVrHisDepartmentByDids(Long[] dids);

    /**
     * 删除科室信息
     * 
     * @param did 科室主键
     * @return 结果
     */
    public int deleteVrHisDepartmentByDid(Long did);
}
