package com.hlr.open.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/feign/hello")
public class HelloController {

    @GetMapping("/get")
    public String get(@RequestParam String param) {
        return "feign-->" + param;
    }


}
