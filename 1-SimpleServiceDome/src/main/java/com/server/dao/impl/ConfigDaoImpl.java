package com.server.dao.impl;

import com.server.dao.ConfigDao;
import com.hlr.db.HlrPoolException;
import com.hlr.db.template.DBTemplate;
import org.springframework.stereotype.Repository;

/**
 * ConfigDaoImpl
 * Description:
 * date: 2023/12/8 12:17
 *
 * @author hlr
 */
@Repository
public class ConfigDaoImpl implements ConfigDao {
    @Override
    public String getTop() throws HlrPoolException {
        return DBTemplate.queryFromSimpleObject("config", "select concat_group(top)  from config ", String.class);
    }
}
