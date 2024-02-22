package com.hlr.open.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ApplicationMain
 * Description:
 * date: 2023/12/8 11:44
 *
 * @author hlr
 */
@SpringBootApplication
public class OpenFeignProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OpenFeignProviderApplication.class);
    }
    
}
