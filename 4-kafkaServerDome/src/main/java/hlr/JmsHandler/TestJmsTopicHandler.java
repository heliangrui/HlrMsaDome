package hlr.JmsHandler;

import com.alibaba.fastjson.JSONObject;
import com.hlr.core.config.EnumConfig;
import com.hlr.core.jms.JmsObject;
import com.hlr.core.jms.JmsObjectMessageListener;
import com.hlr.core.jms.annotation.JmsObjectListener;
import hlr.TestJmsObjectMessage;
import hlr.controller.JmsKafkaController;

/**
 * TestJmsTopicHandler
 * Description:
 * date: 2023/12/11 16:45
 *
 * @author hlr
 */
@JmsObjectListener(topic = JmsKafkaController.topic, jmsObject = TestJmsObjectMessage.class, jmsType = EnumConfig.JmsObjectType.JMS_KAFKA)
public class TestJmsTopicHandler implements JmsObjectMessageListener {
    @Override
    public void handleMessage(JmsObject jmsObject) {
        TestJmsObjectMessage message = (TestJmsObjectMessage) jmsObject;

        System.out.println(JSONObject.toJSONString(message));
        

    }
}
