package hlr.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * JmsKafkaController
 * Description:
 * date: 2023/12/11 16:40
 *
 * @author hlr
 */
@RestController
@RefreshScope
public class JmsKafkaController {

    public final static String topic = "jms-test-topic";


    @Value("${fhm_redirect_url}")
    private String ip;


    /**
     * 发送消息
     *
     * @param message
     */
    @GetMapping("/send")
    public void send(String message) {
        System.out.println(ip);
    }

}
