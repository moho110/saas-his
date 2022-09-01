package com.vrmlstudio.person.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.person.mapper.VrHisDemoPatientMapper;
import com.vrmlstudio.person.domain.VrHisDemoPatient;
import com.vrmlstudio.person.service.IVrHisDemoPatientService;

/**
 * 公众数据--患者Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisDemoPatientServiceImpl implements IVrHisDemoPatientService 
{
    @Autowired
    private VrHisDemoPatientMapper vrHisDemoPatientMapper;

    /**
     * 查询公众数据--患者
     * 
     * @param id 公众数据--患者主键
     * @return 公众数据--患者
     */
    @Override
    public VrHisDemoPatient selectVrHisDemoPatientById(Integer id)
    {
        return vrHisDemoPatientMapper.selectVrHisDemoPatientById(id);
    }

    /**
     * 查询公众数据--患者列表
     * 
     * @param vrHisDemoPatient 公众数据--患者
     * @return 公众数据--患者
     */
    @Override
    public List<VrHisDemoPatient> selectVrHisDemoPatientList(VrHisDemoPatient vrHisDemoPatient)
    {
        return vrHisDemoPatientMapper.selectVrHisDemoPatientList(vrHisDemoPatient);
    }

    /**
     * 新增公众数据--患者
     * 
     * @param vrHisDemoPatient 公众数据--患者
     * @return 结果
     */
    @Override
    public int insertVrHisDemoPatient(VrHisDemoPatient vrHisDemoPatient)
    {
        return vrHisDemoPatientMapper.insertVrHisDemoPatient(vrHisDemoPatient);
    }

    /**
     * 修改公众数据--患者
     * 
     * @param vrHisDemoPatient 公众数据--患者
     * @return 结果
     */
    @Override
    public int updateVrHisDemoPatient(VrHisDemoPatient vrHisDemoPatient)
    {
        return vrHisDemoPatientMapper.updateVrHisDemoPatient(vrHisDemoPatient);
    }

    /**
     * 批量删除公众数据--患者
     * 
     * @param ids 需要删除的公众数据--患者主键
     * @return 结果
     */
    @Override
    public int deleteVrHisDemoPatientByIds(Integer[] ids)
    {
        return vrHisDemoPatientMapper.deleteVrHisDemoPatientByIds(ids);
    }

    /**
     * 删除公众数据--患者信息
     * 
     * @param id 公众数据--患者主键
     * @return 结果
     */
    @Override
    public int deleteVrHisDemoPatientById(Integer id)
    {
        return vrHisDemoPatientMapper.deleteVrHisDemoPatientById(id);
    }
}
