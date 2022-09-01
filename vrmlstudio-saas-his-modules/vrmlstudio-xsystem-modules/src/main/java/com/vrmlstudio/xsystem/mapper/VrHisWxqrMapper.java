package com.vrmlstudio.xsystem.mapper;

import java.util.List;
import com.vrmlstudio.xsystem.domain.VrHisWxqr;

/**
 * 保存微信永久二维码及用户关系Mapper接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface VrHisWxqrMapper 
{
    /**
     * 查询保存微信永久二维码及用户关系
     * 
     * @param id 保存微信永久二维码及用户关系主键
     * @return 保存微信永久二维码及用户关系
     */
    public VrHisWxqr selectVrHisWxqrById(Integer id);

    /**
     * 查询保存微信永久二维码及用户关系列表
     * 
     * @param vrHisWxqr 保存微信永久二维码及用户关系
     * @return 保存微信永久二维码及用户关系集合
     */
    public List<VrHisWxqr> selectVrHisWxqrList(VrHisWxqr vrHisWxqr);

    /**
     * 新增保存微信永久二维码及用户关系
     * 
     * @param vrHisWxqr 保存微信永久二维码及用户关系
     * @return 结果
     */
    public int insertVrHisWxqr(VrHisWxqr vrHisWxqr);

    /**
     * 修改保存微信永久二维码及用户关系
     * 
     * @param vrHisWxqr 保存微信永久二维码及用户关系
     * @return 结果
     */
    public int updateVrHisWxqr(VrHisWxqr vrHisWxqr);

    /**
     * 删除保存微信永久二维码及用户关系
     * 
     * @param id 保存微信永久二维码及用户关系主键
     * @return 结果
     */
    public int deleteVrHisWxqrById(Integer id);

    /**
     * 批量删除保存微信永久二维码及用户关系
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrHisWxqrByIds(Integer[] ids);
}
