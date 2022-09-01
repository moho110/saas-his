package com.vrmlstudio.tenant.service;

import com.vrmlstudio.tenant.domain.MasterTenant;
import com.vrmlstudio.tenant.dto.TenantDatabaseDTO;

/**
 * 参数配置 服务层
 * 
 * @author vrmlstudio
 */
public interface IMasterTenantService
{

     MasterTenant selectMasterTenant(String tenant);

    int insertMasterTenant(TenantDatabaseDTO tenantDatabaseDTO);

    String checkTenantNameUnique(String tenantName);
}
