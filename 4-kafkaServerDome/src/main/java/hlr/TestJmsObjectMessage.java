package hlr;

import com.hlr.core.jms.JmsObject;

/**
 * TestJmsObjectMessage
 * Description:
 * date: 2023/12/11 16:43
 *
 * @author hlr
 */
public class TestJmsObjectMessage extends JmsObject {
    
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
