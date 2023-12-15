package com.hlr.dao;

import com.hlr.db.HlrPoolException;

/**
 * ConfigDao
 * Description:
 * date: 2023/12/8 12:17
 *
 * @author hlr
 */
public interface ConfigDao {
    String getTop() throws HlrPoolException;
}
