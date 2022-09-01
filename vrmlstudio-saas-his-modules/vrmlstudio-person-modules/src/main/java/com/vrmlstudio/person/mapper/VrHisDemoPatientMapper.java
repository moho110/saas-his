package com.vrmlstudio.person.mapper;

import java.util.List;
import com.vrmlstudio.person.domain.VrHisDemoPatient;

/**
 * 公众数据--患者Mapper接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface VrHisDemoPatientMapper 
{
    /**
     * 查询公众数据--患者
     * 
     * @param id 公众数据--患者主键
     * @return 公众数据--患者
     */
    public VrHisDemoPatient selectVrHisDemoPatientById(Integer id);

    /**
     * 查询公众数据--患者列表
     * 
     * @param vrHisDemoPatient 公众数据--患者
     * @return 公众数据--患者集合
     */
    public List<VrHisDemoPatient> selectVrHisDemoPatientList(VrHisDemoPatient vrHisDemoPatient);

    /**
     * 新增公众数据--患者
     * 
     * @param vrHisDemoPatient 公众数据--患者
     * @return 结果
     */
    public int insertVrHisDemoPatient(VrHisDemoPatient vrHisDemoPatient);

    /**
     * 修改公众数据--患者
     * 
     * @param vrHisDemoPatient 公众数据--患者
     * @return 结果
     */
    public int updateVrHisDemoPatient(VrHisDemoPatient vrHisDemoPatient);

    /**
     * 删除公众数据--患者
     * 
     * @param id 公众数据--患者主键
     * @return 结果
     */
    public int deleteVrHisDemoPatientById(Integer id);

    /**
     * 批量删除公众数据--患者
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrHisDemoPatientByIds(Integer[] ids);
}
