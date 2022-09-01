package com.vrmlstudio.xsystem.service.impl;

import java.util.List;
import com.vrmlstudio.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrmlstudio.xsystem.mapper.VrHisPatientFileMapper;
import com.vrmlstudio.xsystem.domain.VrHisPatientFile;
import com.vrmlstudio.xsystem.service.IVrHisPatientFileService;

/**
 * 患者用户档案Service业务层处理
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
@Service
public class VrHisPatientFileServiceImpl implements IVrHisPatientFileService 
{
    @Autowired
    private VrHisPatientFileMapper vrHisPatientFileMapper;

    /**
     * 查询患者用户档案
     * 
     * @param fileId 患者用户档案主键
     * @return 患者用户档案
     */
    @Override
    public VrHisPatientFile selectVrHisPatientFileByFileId(Long fileId)
    {
        return vrHisPatientFileMapper.selectVrHisPatientFileByFileId(fileId);
    }

    /**
     * 查询患者用户档案列表
     * 
     * @param vrHisPatientFile 患者用户档案
     * @return 患者用户档案
     */
    @Override
    public List<VrHisPatientFile> selectVrHisPatientFileList(VrHisPatientFile vrHisPatientFile)
    {
        return vrHisPatientFileMapper.selectVrHisPatientFileList(vrHisPatientFile);
    }

    /**
     * 新增患者用户档案
     * 
     * @param vrHisPatientFile 患者用户档案
     * @return 结果
     */
    @Override
    public int insertVrHisPatientFile(VrHisPatientFile vrHisPatientFile)
    {
        vrHisPatientFile.setCreateTime(DateUtils.getNowDate());
        return vrHisPatientFileMapper.insertVrHisPatientFile(vrHisPatientFile);
    }

    /**
     * 修改患者用户档案
     * 
     * @param vrHisPatientFile 患者用户档案
     * @return 结果
     */
    @Override
    public int updateVrHisPatientFile(VrHisPatientFile vrHisPatientFile)
    {
        vrHisPatientFile.setUpdateTime(DateUtils.getNowDate());
        return vrHisPatientFileMapper.updateVrHisPatientFile(vrHisPatientFile);
    }

    /**
     * 批量删除患者用户档案
     * 
     * @param fileIds 需要删除的患者用户档案主键
     * @return 结果
     */
    @Override
    public int deleteVrHisPatientFileByFileIds(Long[] fileIds)
    {
        return vrHisPatientFileMapper.deleteVrHisPatientFileByFileIds(fileIds);
    }

    /**
     * 删除患者用户档案信息
     * 
     * @param fileId 患者用户档案主键
     * @return 结果
     */
    @Override
    public int deleteVrHisPatientFileByFileId(Long fileId)
    {
        return vrHisPatientFileMapper.deleteVrHisPatientFileByFileId(fileId);
    }
}
