package com.vrmlstudio.web.controller.system;

import com.vrmlstudio.common.constant.TenantConstants;
import com.vrmlstudio.framework.web.service.SysLoginService;
import com.vrmlstudio.framework.web.service.TenantRegisterService;
import com.vrmlstudio.tenant.dto.TenantDatabaseDTO;
import com.vrmlstudio.tenant.form.TenantRegisterBody;
import com.vrmlstudio.tenant.service.IMasterTenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.vrmlstudio.common.core.controller.BaseController;
import com.vrmlstudio.common.core.domain.AjaxResult;
import com.vrmlstudio.framework.web.service.SysRegisterService;
import com.vrmlstudio.system.service.ISysConfigService;

import java.sql.SQLException;

/**
 * 注册验证
 * 
 * @author vrmlstudio
 */
@RestController
public class SysRegisterController extends BaseController
{
    @Autowired
    private SysRegisterService registerService;

    @Autowired
    private ISysConfigService configService;

    @Autowired
    private TenantRegisterService tenantRegisterService;

    @Autowired
    private IMasterTenantService masterTenantService;

    @Autowired
    private SysLoginService loginService;


    @PostMapping("/register")
    public AjaxResult registerTenant(@RequestBody TenantRegisterBody tenantRegisterBody){
        loginService.validateCaptcha(tenantRegisterBody.getTenantName(), tenantRegisterBody.getCode(), tenantRegisterBody.getUuid());

        if (TenantConstants.NOT_UNIQUE.equals(masterTenantService.checkTenantNameUnique(tenantRegisterBody.tenantName)))
        {
            return AjaxResult.error("注册'" + tenantRegisterBody.getTenantName() + "'失败，账号已存在");
        }
        TenantDatabaseDTO tenantDatabase=null;
        try {
            tenantDatabase=tenantRegisterService.initDatabase(tenantRegisterBody);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return AjaxResult.error("注册'" + tenantRegisterBody.getTenantName() + "'失败，创建租户时发生错误");
        }catch (Exception ex){
            ex.printStackTrace();
            return AjaxResult.error("注册'" + tenantRegisterBody.getTenantName() + "'失败，请与我们联系");
        }
        int i = masterTenantService.insertMasterTenant(tenantDatabase);
        return toAjax(i);
    }
}
