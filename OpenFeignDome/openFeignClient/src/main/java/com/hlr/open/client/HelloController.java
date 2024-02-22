package com.hlr.open.client;

import com.hlr.feign.IHelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 * Description:
 * date: 2024/2/22 10:25
 *
 * @author hlr
 */
@RestController
public class HelloController {
    
    @Autowired
    private IHelloFeignService helloFeignService;
    
    @GetMapping("/get")
    public String get(@RequestParam String age){
        return helloFeignService.get(age);
    }
    
    
}
