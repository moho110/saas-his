package com.vrmlstudio.sales.mapper;

import java.util.List;
import com.vrmlstudio.sales.domain.VrHisCashOut;

/**
 * 用户提现申请Mapper接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface VrHisCashOutMapper 
{
    /**
     * 查询用户提现申请
     * 
     * @param id 用户提现申请主键
     * @return 用户提现申请
     */
    public VrHisCashOut selectVrHisCashOutById(Integer id);

    /**
     * 查询用户提现申请列表
     * 
     * @param vrHisCashOut 用户提现申请
     * @return 用户提现申请集合
     */
    public List<VrHisCashOut> selectVrHisCashOutList(VrHisCashOut vrHisCashOut);

    /**
     * 新增用户提现申请
     * 
     * @param vrHisCashOut 用户提现申请
     * @return 结果
     */
    public int insertVrHisCashOut(VrHisCashOut vrHisCashOut);

    /**
     * 修改用户提现申请
     * 
     * @param vrHisCashOut 用户提现申请
     * @return 结果
     */
    public int updateVrHisCashOut(VrHisCashOut vrHisCashOut);

    /**
     * 删除用户提现申请
     * 
     * @param id 用户提现申请主键
     * @return 结果
     */
    public int deleteVrHisCashOutById(Integer id);

    /**
     * 批量删除用户提现申请
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrHisCashOutByIds(Integer[] ids);
}
