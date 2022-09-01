package com.vrmlstudio.xsystem.service.impl;

import java.util.List;

import com.vrmlstudio.xsystem.service.IVrHisWxopenidCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.xsystem.mapper.VrHisWxopenidCacheMapper;
import com.vrmlstudio.xsystem.domain.VrHisWxopenidCache;

/**
 * openid跨域名获取Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisWxopenidCacheServiceImpl implements IVrHisWxopenidCacheService
{
    @Autowired
    private VrHisWxopenidCacheMapper vrHisWxopenidCacheMapper;

    /**
     * 查询openid跨域名获取
     * 
     * @param id openid跨域名获取主键
     * @return openid跨域名获取
     */
    @Override
    public VrHisWxopenidCache selectVrHisWxopenidCacheById(Integer id)
    {
        return vrHisWxopenidCacheMapper.selectVrHisWxopenidCacheById(id);
    }

    /**
     * 查询openid跨域名获取列表
     * 
     * @param vrHisWxopenidCache openid跨域名获取
     * @return openid跨域名获取
     */
    @Override
    public List<VrHisWxopenidCache> selectVrHisWxopenidCacheList(VrHisWxopenidCache vrHisWxopenidCache)
    {
        return vrHisWxopenidCacheMapper.selectVrHisWxopenidCacheList(vrHisWxopenidCache);
    }

    /**
     * 新增openid跨域名获取
     * 
     * @param vrHisWxopenidCache openid跨域名获取
     * @return 结果
     */
    @Override
    public int insertVrHisWxopenidCache(VrHisWxopenidCache vrHisWxopenidCache)
    {
        return vrHisWxopenidCacheMapper.insertVrHisWxopenidCache(vrHisWxopenidCache);
    }

    /**
     * 修改openid跨域名获取
     * 
     * @param vrHisWxopenidCache openid跨域名获取
     * @return 结果
     */
    @Override
    public int updateVrHisWxopenidCache(VrHisWxopenidCache vrHisWxopenidCache)
    {
        return vrHisWxopenidCacheMapper.updateVrHisWxopenidCache(vrHisWxopenidCache);
    }

    /**
     * 批量删除openid跨域名获取
     * 
     * @param ids 需要删除的openid跨域名获取主键
     * @return 结果
     */
    @Override
    public int deleteVrHisWxopenidCacheByIds(Integer[] ids)
    {
        return vrHisWxopenidCacheMapper.deleteVrHisWxopenidCacheByIds(ids);
    }

    /**
     * 删除openid跨域名获取信息
     * 
     * @param id openid跨域名获取主键
     * @return 结果
     */
    @Override
    public int deleteVrHisWxopenidCacheById(Integer id)
    {
        return vrHisWxopenidCacheMapper.deleteVrHisWxopenidCacheById(id);
    }
}
