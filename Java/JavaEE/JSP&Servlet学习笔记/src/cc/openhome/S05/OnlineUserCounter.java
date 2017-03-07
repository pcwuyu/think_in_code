package cc.openhome.S05;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * package/file: cc.openhome/OnlineUserCounter
 * author: pcwuyu
 * version: 2016/9/14 16:01
 */
@WebListener
public class OnlineUserCounter implements HttpSessionListener {
    private static int counter;

    public static int getCounter() {
        return counter;
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        OnlineUserCounter.counter++;
    }

    @Override
    public void sessionDestoryed(HttpSessionEvent se) {
        OnlineUserCounter.counter--;
    }
}
