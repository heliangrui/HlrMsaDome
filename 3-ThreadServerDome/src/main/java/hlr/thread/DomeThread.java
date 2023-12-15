package hlr.thread;

import com.hlr.core.event.AbstractLoopThread;
import com.hlr.core.event.async.IAsyncExecer;
import com.hlr.core.event.async.TaskExecuter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * DomeThread
 * Description:
 * date: 2023/12/11 16:25
 *
 * @author hlr
 */
@Component
public class DomeThread extends AbstractLoopThread {

    private Logger logger = LoggerFactory.getLogger(DomeThread.class);

    @Autowired
    private TaskExecuter taskExecuter;

    public DomeThread() {
        super("DomeThread", false);
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
        taskExecuter.add(new IAsyncExecer() {
            @Override
            public void asyncExec(Object[] params) throws Exception {
                logger.info((String) params[0]);
            }

            @Override
            public String getExecName() {
                return null;
            }
        }, "dome");

        taskExecuter.add(new IAsyncExecer() {
            @Override
            public void asyncExec(Object[] params) throws Exception {
                logger.info((String) params[0]);
            }

            @Override
            public String getExecName() {
                return null;
            }
        }, "dome111");

    }

    @Override
    public void destory() {
        logger.info("do domeThread destory");
    }
}
