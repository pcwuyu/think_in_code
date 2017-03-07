package cc.openhome.web;

import cc.openhome.model.UserService;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * package/file: cc.openhome.web/GossipListener
 * author: pcwuyu
 * version: 2016/9/19 16:41
 */
@WebListener
public class GossipListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        String USERS = sce.getServletContext().getInitParameter("USERS");
        context.setAttribute("userService", new UserService(USERS));
    }

    public void contextDestoryed(ServletContextEvent sce) {

    }
}
