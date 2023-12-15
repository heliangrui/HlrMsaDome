package hlr;

import com.hlr.core.event.ThreadsPoolFactory;
import com.hlr.core.jms.kafka.JmsKafkaMQSender;
import com.hlr.core.jms.mqtt.JmsMqttMqReceiver;
import com.hlr.core.jms.mqtt.JmsMqttMqSender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * ApplicationMain
 * Description:
 * date: 2023/12/8 11:44
 *
 * @author hlr
 */
@SpringBootApplication
public class ApplicationMain {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class);
    }

}
