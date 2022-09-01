package com.vrmlstudio.xsystem.mapper;

import java.util.List;
import com.vrmlstudio.xsystem.domain.VrHisWxmp;

/**
 * 微信公众平台信息Mapper接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface VrHisWxmpMapper 
{
    /**
     * 查询微信公众平台信息
     * 
     * @param id 微信公众平台信息主键
     * @return 微信公众平台信息
     */
    public VrHisWxmp selectVrHisWxmpById(Integer id);

    /**
     * 查询微信公众平台信息列表
     * 
     * @param vrHisWxmp 微信公众平台信息
     * @return 微信公众平台信息集合
     */
    public List<VrHisWxmp> selectVrHisWxmpList(VrHisWxmp vrHisWxmp);

    /**
     * 新增微信公众平台信息
     * 
     * @param vrHisWxmp 微信公众平台信息
     * @return 结果
     */
    public int insertVrHisWxmp(VrHisWxmp vrHisWxmp);

    /**
     * 修改微信公众平台信息
     * 
     * @param vrHisWxmp 微信公众平台信息
     * @return 结果
     */
    public int updateVrHisWxmp(VrHisWxmp vrHisWxmp);

    /**
     * 删除微信公众平台信息
     * 
     * @param id 微信公众平台信息主键
     * @return 结果
     */
    public int deleteVrHisWxmpById(Integer id);

    /**
     * 批量删除微信公众平台信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrHisWxmpByIds(Integer[] ids);
}
