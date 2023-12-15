package hlr.thread;

import com.hlr.core.event.AbstractLoopThread;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * DomeThread
 * Description:
 * date: 2023/12/11 16:25
 *
 * @author hlr
 */
public class DomeThread extends AbstractLoopThread {

    private Logger logger = LoggerFactory.getLogger(DomeThread.class);

    public DomeThread(String name) {
        super(name);
    }

    public DomeThread(String name, boolean needlog) {
        super(name, needlog);
    }

    /**
     * 执行的方法
     *
     * @param var1
     */
    @Override
    public void work(int var1) {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        logger.info("do domeThread");
    }

    @Override
    public void destory() {
        logger.info("do domeThread destory");
    }
}
