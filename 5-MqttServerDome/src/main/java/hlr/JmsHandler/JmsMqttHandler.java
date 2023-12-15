package hlr.JmsHandler;

import com.hlr.core.config.EnumConfig;
import com.hlr.core.jms.JmsSourceMessageListener;
import com.hlr.core.jms.annotation.JmsSourceListener;
import hlr.controller.JmsKafkaController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * JmsMqttHandler
 * Description:
 * date: 2023/12/11 17:24
 *
 * @author hlr
 */
@JmsSourceListener(topic = JmsKafkaController.topic,jmsType = EnumConfig.JmsSourceType.JMS_MQTT)
public class JmsMqttHandler implements JmsSourceMessageListener {
    private Logger logger = LoggerFactory.getLogger(JmsMqttHandler.class);
    @Override
    public void handleMessage(String topic, String jmsString) {
        logger.info("topic:{},message:{}",topic,jmsString);
    }
}
