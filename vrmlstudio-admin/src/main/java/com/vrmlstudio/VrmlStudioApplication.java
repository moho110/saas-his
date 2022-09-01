package com.vrmlstudio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author vrmlstudio
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class VrmlStudioApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(VrmlStudioApplication.class, args);
        System.out.println("vrmlstudioCRM-Admin启动成功=======");
    }
}
