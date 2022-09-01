package com.vrmlstudio.department.mapper;

import java.util.List;
import com.vrmlstudio.department.domain.VrHisDictionary;

/**
 * 字典Mapper接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface VrHisDictionaryMapper 
{
    /**
     * 查询字典
     * 
     * @param did 字典主键
     * @return 字典
     */
    public VrHisDictionary selectVrHisDictionaryByDid(Long did);

    /**
     * 查询字典列表
     * 
     * @param vrHisDictionary 字典
     * @return 字典集合
     */
    public List<VrHisDictionary> selectVrHisDictionaryList(VrHisDictionary vrHisDictionary);

    /**
     * 新增字典
     * 
     * @param vrHisDictionary 字典
     * @return 结果
     */
    public int insertVrHisDictionary(VrHisDictionary vrHisDictionary);

    /**
     * 修改字典
     * 
     * @param vrHisDictionary 字典
     * @return 结果
     */
    public int updateVrHisDictionary(VrHisDictionary vrHisDictionary);

    /**
     * 删除字典
     * 
     * @param did 字典主键
     * @return 结果
     */
    public int deleteVrHisDictionaryByDid(Long did);

    /**
     * 批量删除字典
     * 
     * @param dids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrHisDictionaryByDids(Long[] dids);
}
