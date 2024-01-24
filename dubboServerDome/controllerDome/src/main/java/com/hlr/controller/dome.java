package com.hlr.controller;

import com.hlr.db.HlrPoolException;
import com.hlr.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * dome
 * Description:
 * date: 2023/12/8 11:44
 *
 * @author hlr
 */
@RestController
@RequestMapping("/de")
public class dome {
    
    @Autowired
    private ConfigService configService;

    @GetMapping("/hello")
    public String hello() throws HlrPoolException {
        return configService.queryTop();
    }

    @GetMapping("/hello1")
    public String hello1() throws HlrPoolException {
        return configService.queryTop();
    }

}
