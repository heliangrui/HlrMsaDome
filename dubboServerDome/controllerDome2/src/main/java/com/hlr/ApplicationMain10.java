package com.hlr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * ApplicationMain
 * Description:
 * date: 2023/12/8 11:44
 *
 * @author hlr
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.hlr.api", "com.hlr"})
public class ApplicationMain10 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain10.class);
    }

}
