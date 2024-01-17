package com.server.service.impl;

import com.server.api.DomeProviderOne;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * ConfigServiceImpl
 * Description:
 * date: 2023/12/8 12:16
 *
 * @author hlr
 */
@DubboService
public class ConfigServiceImpl implements DomeProviderOne {


    @Override
    public boolean getBoolean() {
        return false;
    }
}
