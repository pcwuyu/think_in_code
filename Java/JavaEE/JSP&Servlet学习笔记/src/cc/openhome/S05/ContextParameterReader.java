package cc.openhome.S05;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * package/file: cc.openhome/ContextParameterReader
 * author: pcwuyu
 * version: 2016/9/14 11:19
 */
@WebListener  //使用weblistener标注
public class ContextParameterReader implements ServletContextListener {  //实现servletContentextListener
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();  //取得 ServletContext
        String avatars = context.getInitParameter("AVATAR");  //取得初始参数
        context.setAttribute("avatar", avatars);  //设置 ServletContext属性
    }

    public void contextDestoryed(ServletContextEvent sce) {
    }
}
