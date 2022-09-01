package com.vrmlstudio.xsystem.mapper;

import java.util.List;
import com.vrmlstudio.xsystem.domain.VrHisWxqrlogin;

/**
 * 微信扫码登录Mapper接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface VrHisWxqrloginMapper 
{
    /**
     * 查询微信扫码登录
     * 
     * @param id 微信扫码登录主键
     * @return 微信扫码登录
     */
    public VrHisWxqrlogin selectVrHisWxqrloginById(Long id);

    /**
     * 查询微信扫码登录列表
     * 
     * @param vrHisWxqrlogin 微信扫码登录
     * @return 微信扫码登录集合
     */
    public List<VrHisWxqrlogin> selectVrHisWxqrloginList(VrHisWxqrlogin vrHisWxqrlogin);

    /**
     * 新增微信扫码登录
     * 
     * @param vrHisWxqrlogin 微信扫码登录
     * @return 结果
     */
    public int insertVrHisWxqrlogin(VrHisWxqrlogin vrHisWxqrlogin);

    /**
     * 修改微信扫码登录
     * 
     * @param vrHisWxqrlogin 微信扫码登录
     * @return 结果
     */
    public int updateVrHisWxqrlogin(VrHisWxqrlogin vrHisWxqrlogin);

    /**
     * 删除微信扫码登录
     * 
     * @param id 微信扫码登录主键
     * @return 结果
     */
    public int deleteVrHisWxqrloginById(Long id);

    /**
     * 批量删除微信扫码登录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrHisWxqrloginByIds(Long[] ids);
}
