package com.vrmlstudio.sales.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.sales.mapper.VrHisCarePkgMapper;
import com.vrmlstudio.sales.domain.VrHisCarePkg;
import com.vrmlstudio.sales.service.IVrHisCarePkgService;

/**
 * 收费总Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisCarePkgServiceImpl implements IVrHisCarePkgService 
{
    @Autowired
    private VrHisCarePkgMapper vrHisCarePkgMapper;

    /**
     * 查询收费总
     * 
     * @param id 收费总主键
     * @return 收费总
     */
    @Override
    public VrHisCarePkg selectVrHisCarePkgById(Integer id)
    {
        return vrHisCarePkgMapper.selectVrHisCarePkgById(id);
    }

    /**
     * 查询收费总列表
     * 
     * @param vrHisCarePkg 收费总
     * @return 收费总
     */
    @Override
    public List<VrHisCarePkg> selectVrHisCarePkgList(VrHisCarePkg vrHisCarePkg)
    {
        return vrHisCarePkgMapper.selectVrHisCarePkgList(vrHisCarePkg);
    }

    /**
     * 新增收费总
     * 
     * @param vrHisCarePkg 收费总
     * @return 结果
     */
    @Override
    public int insertVrHisCarePkg(VrHisCarePkg vrHisCarePkg)
    {
        return vrHisCarePkgMapper.insertVrHisCarePkg(vrHisCarePkg);
    }

    /**
     * 修改收费总
     * 
     * @param vrHisCarePkg 收费总
     * @return 结果
     */
    @Override
    public int updateVrHisCarePkg(VrHisCarePkg vrHisCarePkg)
    {
        return vrHisCarePkgMapper.updateVrHisCarePkg(vrHisCarePkg);
    }

    /**
     * 批量删除收费总
     * 
     * @param ids 需要删除的收费总主键
     * @return 结果
     */
    @Override
    public int deleteVrHisCarePkgByIds(Integer[] ids)
    {
        return vrHisCarePkgMapper.deleteVrHisCarePkgByIds(ids);
    }

    /**
     * 删除收费总信息
     * 
     * @param id 收费总主键
     * @return 结果
     */
    @Override
    public int deleteVrHisCarePkgById(Integer id)
    {
        return vrHisCarePkgMapper.deleteVrHisCarePkgById(id);
    }
}
