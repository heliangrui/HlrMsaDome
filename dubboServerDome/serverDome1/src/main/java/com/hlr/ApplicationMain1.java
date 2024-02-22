package com.hlr;

import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * ApplicationMain
 * Description:
 * date: 2023/12/8 11:44
 *
 * @author hlr
 */
@SpringBootApplication
@EnableScheduling
public class ApplicationMain1 {

    
    
    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain1.class);
    }
    
    
    @Scheduled(cron = "0/10 * * * * ? ")
    public void sout(){

        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();

        long[] allThreadIds = threadMXBean.getAllThreadIds();
        ThreadInfo[] threadInfo = threadMXBean.getThreadInfo(allThreadIds);

        for (ThreadInfo info : threadInfo) {
            System.out.println(info.getThreadId());
            System.out.print("-");
            System.out.print(info.getThreadName());
            System.out.print("-");
            System.out.println(info.getThreadState());
            System.out.print("-");
            System.out.println(info.getLockInfo());
            System.out.print("-");
            System.out.println(info.getWaitedTime());
            
        }
        
        

    }
    
    
}
