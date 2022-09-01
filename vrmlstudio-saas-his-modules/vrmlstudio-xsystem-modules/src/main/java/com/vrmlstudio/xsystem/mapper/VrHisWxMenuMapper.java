package com.vrmlstudio.xsystem.mapper;

import java.util.List;
import com.vrmlstudio.xsystem.domain.VrHisWxMenu;

/**
 * 保存微信公众平台菜单Mapper接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface VrHisWxMenuMapper 
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
     * 删除保存微信公众平台菜单
     * 
     * @param id 保存微信公众平台菜单主键
     * @return 结果
     */
    public int deleteVrHisWxMenuById(Integer id);

    /**
     * 批量删除保存微信公众平台菜单
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrHisWxMenuByIds(Integer[] ids);
}
