package com.vrmlstudio.department.service.impl;

import java.util.List;
import com.vrmlstudio.common.utils.DateUtils;
import com.vrmlstudio.department.service.IVrHisDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.department.mapper.VrHisDictionaryMapper;
import com.vrmlstudio.department.domain.VrHisDictionary;

/**
 * 字典Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisDictionaryServiceImpl implements IVrHisDictionaryService
{
    @Autowired
    private VrHisDictionaryMapper vrHisDictionaryMapper;

    /**
     * 查询字典
     * 
     * @param did 字典主键
     * @return 字典
     */
    @Override
    public VrHisDictionary selectVrHisDictionaryByDid(Long did)
    {
        return vrHisDictionaryMapper.selectVrHisDictionaryByDid(did);
    }

    /**
     * 查询字典列表
     * 
     * @param vrHisDictionary 字典
     * @return 字典
     */
    @Override
    public List<VrHisDictionary> selectVrHisDictionaryList(VrHisDictionary vrHisDictionary)
    {
        return vrHisDictionaryMapper.selectVrHisDictionaryList(vrHisDictionary);
    }

    /**
     * 新增字典
     * 
     * @param vrHisDictionary 字典
     * @return 结果
     */
    @Override
    public int insertVrHisDictionary(VrHisDictionary vrHisDictionary)
    {
        vrHisDictionary.setCreateTime(DateUtils.getNowDate());
        return vrHisDictionaryMapper.insertVrHisDictionary(vrHisDictionary);
    }

    /**
     * 修改字典
     * 
     * @param vrHisDictionary 字典
     * @return 结果
     */
    @Override
    public int updateVrHisDictionary(VrHisDictionary vrHisDictionary)
    {
        vrHisDictionary.setUpdateTime(DateUtils.getNowDate());
        return vrHisDictionaryMapper.updateVrHisDictionary(vrHisDictionary);
    }

    /**
     * 批量删除字典
     * 
     * @param dids 需要删除的字典主键
     * @return 结果
     */
    @Override
    public int deleteVrHisDictionaryByDids(Long[] dids)
    {
        return vrHisDictionaryMapper.deleteVrHisDictionaryByDids(dids);
    }

    /**
     * 删除字典信息
     * 
     * @param did 字典主键
     * @return 结果
     */
    @Override
    public int deleteVrHisDictionaryByDid(Long did)
    {
        return vrHisDictionaryMapper.deleteVrHisDictionaryByDid(did);
    }
}
