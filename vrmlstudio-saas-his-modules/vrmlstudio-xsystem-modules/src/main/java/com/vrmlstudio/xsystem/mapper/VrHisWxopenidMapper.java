package com.vrmlstudio.xsystem.mapper;

import java.util.List;
import com.vrmlstudio.xsystem.domain.VrHisWxopenid;

/**
 * 绑定微信openid和用户id的关系Mapper接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface VrHisWxopenidMapper 
{
    /**
     * 查询绑定微信openid和用户id的关系
     * 
     * @param id 绑定微信openid和用户id的关系主键
     * @return 绑定微信openid和用户id的关系
     */
    public VrHisWxopenid selectVrHisWxopenidById(Integer id);

    /**
     * 查询绑定微信openid和用户id的关系列表
     * 
     * @param vrHisWxopenid 绑定微信openid和用户id的关系
     * @return 绑定微信openid和用户id的关系集合
     */
    public List<VrHisWxopenid> selectVrHisWxopenidList(VrHisWxopenid vrHisWxopenid);

    /**
     * 新增绑定微信openid和用户id的关系
     * 
     * @param vrHisWxopenid 绑定微信openid和用户id的关系
     * @return 结果
     */
    public int insertVrHisWxopenid(VrHisWxopenid vrHisWxopenid);

    /**
     * 修改绑定微信openid和用户id的关系
     * 
     * @param vrHisWxopenid 绑定微信openid和用户id的关系
     * @return 结果
     */
    public int updateVrHisWxopenid(VrHisWxopenid vrHisWxopenid);

    /**
     * 删除绑定微信openid和用户id的关系
     * 
     * @param id 绑定微信openid和用户id的关系主键
     * @return 结果
     */
    public int deleteVrHisWxopenidById(Integer id);

    /**
     * 批量删除绑定微信openid和用户id的关系
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrHisWxopenidByIds(Integer[] ids);
}
