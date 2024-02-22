package com.hlr.open.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * ApplicationMain
 * Description:
 * date: 2023/12/8 11:44
 *
 * @author hlr
 */
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.hlr.feign"})
public class OpenFeignClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(OpenFeignClientApplication.class);
    }
    
}
