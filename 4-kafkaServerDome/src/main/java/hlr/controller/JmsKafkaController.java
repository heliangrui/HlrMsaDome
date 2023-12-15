package hlr.controller;

import com.hlr.core.jms.kafka.JmsKafkaMQSender;
import hlr.TestJmsObjectMessage;
import org.springframework.beans.factory.annotation.Autowired;
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
public class JmsKafkaController {

    public final static String topic = "jms-test-topic";

    @Autowired
    JmsKafkaMQSender jmsKafkaMQSender;

    /**
     * 发送消息
     * @param message
     */
    @GetMapping("/send")
    public void send(String message) {
        TestJmsObjectMessage jmsObjectMessage = new TestJmsObjectMessage();
        jmsObjectMessage.setMessage(message);
        jmsKafkaMQSender.send(topic, jmsObjectMessage);
    }

}
