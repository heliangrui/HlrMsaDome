package com.hlr.controller;

import com.hlr.db.HlrPoolException;
import com.hlr.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * dome
 * Description:
 * date: 2023/12/8 11:44
 *
 * @author hlr
 */
@RestController
public class dome {
    
    @Autowired
    private ConfigService configService;

    @GetMapping("/hello")
    public String hello() throws HlrPoolException {
        return configService.queryTop();
    }

}
