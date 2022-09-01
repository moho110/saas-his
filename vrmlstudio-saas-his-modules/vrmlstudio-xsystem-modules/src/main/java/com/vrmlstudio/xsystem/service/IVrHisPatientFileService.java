package com.vrmlstudio.xsystem.service;

import java.util.List;
import com.vrmlstudio.xsystem.domain.VrHisPatientFile;

/**
 * 患者用户档案Service接口
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public interface IVrHisPatientFileService 
{
    /**
     * 查询患者用户档案
     * 
     * @param fileId 患者用户档案主键
     * @return 患者用户档案
     */
    public VrHisPatientFile selectVrHisPatientFileByFileId(Long fileId);

    /**
     * 查询患者用户档案列表
     * 
     * @param vrHisPatientFile 患者用户档案
     * @return 患者用户档案集合
     */
    public List<VrHisPatientFile> selectVrHisPatientFileList(VrHisPatientFile vrHisPatientFile);

    /**
     * 新增患者用户档案
     * 
     * @param vrHisPatientFile 患者用户档案
     * @return 结果
     */
    public int insertVrHisPatientFile(VrHisPatientFile vrHisPatientFile);

    /**
     * 修改患者用户档案
     * 
     * @param vrHisPatientFile 患者用户档案
     * @return 结果
     */
    public int updateVrHisPatientFile(VrHisPatientFile vrHisPatientFile);

    /**
     * 批量删除患者用户档案
     * 
     * @param fileIds 需要删除的患者用户档案主键集合
     * @return 结果
     */
    public int deleteVrHisPatientFileByFileIds(Long[] fileIds);

    /**
     * 删除患者用户档案信息
     * 
     * @param fileId 患者用户档案主键
     * @return 结果
     */
    public int deleteVrHisPatientFileByFileId(Long fileId);
}
