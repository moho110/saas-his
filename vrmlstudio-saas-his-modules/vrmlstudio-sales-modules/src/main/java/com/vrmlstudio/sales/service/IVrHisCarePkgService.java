package com.vrmlstudio.sales.service;

import java.util.List;
import com.vrmlstudio.sales.domain.VrHisCarePkg;

/**
 * 收费总Service接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface IVrHisCarePkgService 
{
    /**
     * 查询收费总
     * 
     * @param id 收费总主键
     * @return 收费总
     */
    public VrHisCarePkg selectVrHisCarePkgById(Integer id);

    /**
     * 查询收费总列表
     * 
     * @param vrHisCarePkg 收费总
     * @return 收费总集合
     */
    public List<VrHisCarePkg> selectVrHisCarePkgList(VrHisCarePkg vrHisCarePkg);

    /**
     * 新增收费总
     * 
     * @param vrHisCarePkg 收费总
     * @return 结果
     */
    public int insertVrHisCarePkg(VrHisCarePkg vrHisCarePkg);

    /**
     * 修改收费总
     * 
     * @param vrHisCarePkg 收费总
     * @return 结果
     */
    public int updateVrHisCarePkg(VrHisCarePkg vrHisCarePkg);

    /**
     * 批量删除收费总
     * 
     * @param ids 需要删除的收费总主键集合
     * @return 结果
     */
    public int deleteVrHisCarePkgByIds(Integer[] ids);

    /**
     * 删除收费总信息
     * 
     * @param id 收费总主键
     * @return 结果
     */
    public int deleteVrHisCarePkgById(Integer id);
}
