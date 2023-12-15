package hlr;

import com.hlr.core.event.ThreadsPoolFactory;
import hlr.thread.DomeThread;
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
    public ThreadsPoolFactory threadsPoolFactory() {
        ThreadsPoolFactory threadsPoolFactory = new ThreadsPoolFactory();
        threadsPoolFactory.addPool(new DomeThread("dome-thread-1"));
        return threadsPoolFactory;
    }

}
