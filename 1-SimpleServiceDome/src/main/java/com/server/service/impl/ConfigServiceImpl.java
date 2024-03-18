package com.server.service.impl;


import com.hlr.db.HlrPoolException;
import com.server.dao.ConfigDao;
import com.server.service.ConfigService;
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
    
    @Autowired
    private ConfigDao configDao;
    @Override
    public String queryTop() throws HlrPoolException {
        return configDao.getTop();
    }
}
