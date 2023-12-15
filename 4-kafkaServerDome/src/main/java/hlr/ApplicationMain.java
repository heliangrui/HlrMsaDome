package hlr;

import com.hlr.core.event.ThreadsPoolFactory;
import com.hlr.core.jms.kafka.JmsKafkaMQReceiver;
import com.hlr.core.jms.kafka.JmsKafkaMQSender;
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

    @Bean
    public ThreadsPoolFactory threadsPoolFactory(JmsKafkaMQSender jmsKafkaMQSender, JmsKafkaMQReceiver jmsKafkaMQReceiver) {
        ThreadsPoolFactory threadsPoolFactory = new ThreadsPoolFactory();
        threadsPoolFactory.addPool(jmsKafkaMQSender);
        threadsPoolFactory.addPool(jmsKafkaMQReceiver);
        return threadsPoolFactory;
    }

}
