package com.hlr.service.impl;

import com.hlr.api.DomeProviderOne;
import com.hlr.dao.ConfigDao;
import com.hlr.db.HlrPoolException;
import com.hlr.service.ConfigService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ConfigServiceImpl
 * Description:
 * date: 2023/12/8 12:16
 *
 * @author hlr
 */
@Service
public class ConfigServiceImpl implements ConfigService {
    
    
    @DubboReference
    private DomeProviderOne domeProviderOne;
    
    @Autowired
    private ConfigDao configDao;
    @Override
    public String queryTop() throws HlrPoolException {
        System.out.println("----------");
        System.out.println(domeProviderOne.getBoolean());
        return String.valueOf(domeProviderOne.getBoolean());
    }
}
