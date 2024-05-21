package com.hlr.gateway;

import com.hlr.gateway.config.LoadBalancerConfig;
import com.hlr.gateway.route.TagCustomLoadBalancer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;

/**
 * HlrGatewayApplication
 * Description:
 * date: 2024/2/20 19:29
 *
 * @author hlr
 */
@SpringBootApplication
@LoadBalancerClients(defaultConfiguration = LoadBalancerConfig.class)
public class HlrGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(HlrGatewayApplication.class);
    }

}
