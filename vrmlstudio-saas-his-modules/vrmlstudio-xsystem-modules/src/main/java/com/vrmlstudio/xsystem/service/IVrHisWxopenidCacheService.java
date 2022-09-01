package com.vrmlstudio.xsystem.service;

import java.util.List;
import com.vrmlstudio.xsystem.domain.VrHisWxopenidCache;

/**
 * openid跨域名获取Service接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface IVrHisWxopenidCacheService 
{
    /**
     * 查询openid跨域名获取
     * 
     * @param id openid跨域名获取主键
     * @return openid跨域名获取
     */
    public VrHisWxopenidCache selectVrHisWxopenidCacheById(Integer id);

    /**
     * 查询openid跨域名获取列表
     * 
     * @param vrHisWxopenidCache openid跨域名获取
     * @return openid跨域名获取集合
     */
    public List<VrHisWxopenidCache> selectVrHisWxopenidCacheList(VrHisWxopenidCache vrHisWxopenidCache);

    /**
     * 新增openid跨域名获取
     * 
     * @param vrHisWxopenidCache openid跨域名获取
     * @return 结果
     */
    public int insertVrHisWxopenidCache(VrHisWxopenidCache vrHisWxopenidCache);

    /**
     * 修改openid跨域名获取
     * 
     * @param vrHisWxopenidCache openid跨域名获取
     * @return 结果
     */
    public int updateVrHisWxopenidCache(VrHisWxopenidCache vrHisWxopenidCache);

    /**
     * 批量删除openid跨域名获取
     * 
     * @param ids 需要删除的openid跨域名获取主键集合
     * @return 结果
     */
    public int deleteVrHisWxopenidCacheByIds(Integer[] ids);

    /**
     * 删除openid跨域名获取信息
     * 
     * @param id openid跨域名获取主键
     * @return 结果
     */
    public int deleteVrHisWxopenidCacheById(Integer id);
}
