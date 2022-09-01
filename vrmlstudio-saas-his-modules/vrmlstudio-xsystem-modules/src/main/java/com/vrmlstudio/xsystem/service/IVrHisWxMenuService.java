package com.vrmlstudio.xsystem.service;

import java.util.List;
import com.vrmlstudio.xsystem.domain.VrHisWxMenu;

/**
 * 保存微信公众平台菜单Service接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface IVrHisWxMenuService 
{
    /**
     * 查询保存微信公众平台菜单
     * 
     * @param id 保存微信公众平台菜单主键
     * @return 保存微信公众平台菜单
     */
    public VrHisWxMenu selectVrHisWxMenuById(Integer id);

    /**
     * 查询保存微信公众平台菜单列表
     * 
     * @param vrHisWxMenu 保存微信公众平台菜单
     * @return 保存微信公众平台菜单集合
     */
    public List<VrHisWxMenu> selectVrHisWxMenuList(VrHisWxMenu vrHisWxMenu);

    /**
     * 新增保存微信公众平台菜单
     * 
     * @param vrHisWxMenu 保存微信公众平台菜单
     * @return 结果
     */
    public int insertVrHisWxMenu(VrHisWxMenu vrHisWxMenu);

    /**
     * 修改保存微信公众平台菜单
     * 
     * @param vrHisWxMenu 保存微信公众平台菜单
     * @return 结果
     */
    public int updateVrHisWxMenu(VrHisWxMenu vrHisWxMenu);

    /**
     * 批量删除保存微信公众平台菜单
     * 
     * @param ids 需要删除的保存微信公众平台菜单主键集合
     * @return 结果
     */
    public int deleteVrHisWxMenuByIds(Integer[] ids);

    /**
     * 删除保存微信公众平台菜单信息
     * 
     * @param id 保存微信公众平台菜单主键
     * @return 结果
     */
    public int deleteVrHisWxMenuById(Integer id);
}
