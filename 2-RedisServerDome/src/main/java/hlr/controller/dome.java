package hlr.controller;

import com.hlr.core.cache.CacheService;
import com.hlr.core.cache.impl.RedisCacheService;
import com.hlr.db.HlrPoolException;
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
    private CacheService redisCacheService;

    @GetMapping("/hello")
    public String hello() throws HlrPoolException {
        return redisCacheService.getString("hello");
    }

    @GetMapping("/hello/world")
    public void helloWord(String world) {
        redisCacheService.setString("hello", world);
    }

}
