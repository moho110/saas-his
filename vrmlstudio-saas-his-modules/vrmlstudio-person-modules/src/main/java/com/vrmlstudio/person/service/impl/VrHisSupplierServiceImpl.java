package com.vrmlstudio.person.service.impl;

import java.util.List;
import com.vrmlstudio.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.person.mapper.VrHisSupplierMapper;
import com.vrmlstudio.person.domain.VrHisSupplier;
import com.vrmlstudio.person.service.IVrHisSupplierService;

/**
 * 供应商Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisSupplierServiceImpl implements IVrHisSupplierService 
{
    @Autowired
    private VrHisSupplierMapper vrHisSupplierMapper;

    /**
     * 查询供应商
     * 
     * @param sid 供应商主键
     * @return 供应商
     */
    @Override
    public VrHisSupplier selectVrHisSupplierBySid(Long sid)
    {
        return vrHisSupplierMapper.selectVrHisSupplierBySid(sid);
    }

    /**
     * 查询供应商列表
     * 
     * @param vrHisSupplier 供应商
     * @return 供应商
     */
    @Override
    public List<VrHisSupplier> selectVrHisSupplierList(VrHisSupplier vrHisSupplier)
    {
        return vrHisSupplierMapper.selectVrHisSupplierList(vrHisSupplier);
    }

    /**
     * 新增供应商
     * 
     * @param vrHisSupplier 供应商
     * @return 结果
     */
    @Override
    public int insertVrHisSupplier(VrHisSupplier vrHisSupplier)
    {
        vrHisSupplier.setCreateTime(DateUtils.getNowDate());
        return vrHisSupplierMapper.insertVrHisSupplier(vrHisSupplier);
    }

    /**
     * 修改供应商
     * 
     * @param vrHisSupplier 供应商
     * @return 结果
     */
    @Override
    public int updateVrHisSupplier(VrHisSupplier vrHisSupplier)
    {
        vrHisSupplier.setUpdateTime(DateUtils.getNowDate());
        return vrHisSupplierMapper.updateVrHisSupplier(vrHisSupplier);
    }

    /**
     * 批量删除供应商
     * 
     * @param sids 需要删除的供应商主键
     * @return 结果
     */
    @Override
    public int deleteVrHisSupplierBySids(Long[] sids)
    {
        return vrHisSupplierMapper.deleteVrHisSupplierBySids(sids);
    }

    /**
     * 删除供应商信息
     * 
     * @param sid 供应商主键
     * @return 结果
     */
    @Override
    public int deleteVrHisSupplierBySid(Long sid)
    {
        return vrHisSupplierMapper.deleteVrHisSupplierBySid(sid);
    }
}
