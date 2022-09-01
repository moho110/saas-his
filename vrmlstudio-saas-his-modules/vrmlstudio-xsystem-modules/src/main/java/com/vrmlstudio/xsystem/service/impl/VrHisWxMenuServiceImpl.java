package com.vrmlstudio.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.xsystem.mapper.VrHisWxMenuMapper;
import com.vrmlstudio.xsystem.domain.VrHisWxMenu;
import com.vrmlstudio.xsystem.service.IVrHisWxMenuService;

/**
 * 保存微信公众平台菜单Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisWxMenuServiceImpl implements IVrHisWxMenuService 
{
    @Autowired
    private VrHisWxMenuMapper vrHisWxMenuMapper;

    /**
     * 查询保存微信公众平台菜单
     * 
     * @param id 保存微信公众平台菜单主键
     * @return 保存微信公众平台菜单
     */
    @Override
    public VrHisWxMenu selectVrHisWxMenuById(Integer id)
    {
        return vrHisWxMenuMapper.selectVrHisWxMenuById(id);
    }

    /**
     * 查询保存微信公众平台菜单列表
     * 
     * @param vrHisWxMenu 保存微信公众平台菜单
     * @return 保存微信公众平台菜单
     */
    @Override
    public List<VrHisWxMenu> selectVrHisWxMenuList(VrHisWxMenu vrHisWxMenu)
    {
        return vrHisWxMenuMapper.selectVrHisWxMenuList(vrHisWxMenu);
    }

    /**
     * 新增保存微信公众平台菜单
     * 
     * @param vrHisWxMenu 保存微信公众平台菜单
     * @return 结果
     */
    @Override
    public int insertVrHisWxMenu(VrHisWxMenu vrHisWxMenu)
    {
        return vrHisWxMenuMapper.insertVrHisWxMenu(vrHisWxMenu);
    }

    /**
     * 修改保存微信公众平台菜单
     * 
     * @param vrHisWxMenu 保存微信公众平台菜单
     * @return 结果
     */
    @Override
    public int updateVrHisWxMenu(VrHisWxMenu vrHisWxMenu)
    {
        return vrHisWxMenuMapper.updateVrHisWxMenu(vrHisWxMenu);
    }

    /**
     * 批量删除保存微信公众平台菜单
     * 
     * @param ids 需要删除的保存微信公众平台菜单主键
     * @return 结果
     */
    @Override
    public int deleteVrHisWxMenuByIds(Integer[] ids)
    {
        return vrHisWxMenuMapper.deleteVrHisWxMenuByIds(ids);
    }

    /**
     * 删除保存微信公众平台菜单信息
     * 
     * @param id 保存微信公众平台菜单主键
     * @return 结果
     */
    @Override
    public int deleteVrHisWxMenuById(Integer id)
    {
        return vrHisWxMenuMapper.deleteVrHisWxMenuById(id);
    }
}
