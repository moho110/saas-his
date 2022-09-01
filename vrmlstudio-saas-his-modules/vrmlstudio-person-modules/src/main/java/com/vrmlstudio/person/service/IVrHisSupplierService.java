package com.vrmlstudio.person.service;

import java.util.List;
import com.vrmlstudio.person.domain.VrHisSupplier;

/**
 * 供应商Service接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface IVrHisSupplierService 
{
    /**
     * 查询供应商
     * 
     * @param sid 供应商主键
     * @return 供应商
     */
    public VrHisSupplier selectVrHisSupplierBySid(Long sid);

    /**
     * 查询供应商列表
     * 
     * @param vrHisSupplier 供应商
     * @return 供应商集合
     */
    public List<VrHisSupplier> selectVrHisSupplierList(VrHisSupplier vrHisSupplier);

    /**
     * 新增供应商
     * 
     * @param vrHisSupplier 供应商
     * @return 结果
     */
    public int insertVrHisSupplier(VrHisSupplier vrHisSupplier);

    /**
     * 修改供应商
     * 
     * @param vrHisSupplier 供应商
     * @return 结果
     */
    public int updateVrHisSupplier(VrHisSupplier vrHisSupplier);

    /**
     * 批量删除供应商
     * 
     * @param sids 需要删除的供应商主键集合
     * @return 结果
     */
    public int deleteVrHisSupplierBySids(Long[] sids);

    /**
     * 删除供应商信息
     * 
     * @param sid 供应商主键
     * @return 结果
     */
    public int deleteVrHisSupplierBySid(Long sid);
}
