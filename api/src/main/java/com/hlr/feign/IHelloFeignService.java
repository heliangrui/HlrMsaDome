package com.hlr.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * IHelloFeignService
 * Description:
 * date: 2024/2/22 10:19
 *
 * @author hlr
 */
@FeignClient("openFeignProvider")
public interface IHelloFeignService {
    
    @GetMapping("/feign/hello/get")
    public String get(@RequestParam("param") String param);
    
    
}
