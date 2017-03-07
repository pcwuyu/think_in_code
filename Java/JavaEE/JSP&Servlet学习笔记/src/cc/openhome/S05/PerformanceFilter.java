package cc.openhome.S05;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.logging.Filter;

/**
 * package/file: cc.openhome/PerformanceFilter
 * author: pcwuyu
 * version: 2016/9/19 10:09
 */
@WebFilter(filterName = "Performance", urlPatterns = {"/*"})  //使用@webFilter标注
public class PerformanceFilter implements Filter {  //实现filter接口
    private FilterConfig config;

    @Override
    public void init(FilterConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        long begin = System.currentTimeMillis();
        chain.doFilter(request, response);
        config.getServletContext().log("request process in" + (System.currentTimeMillis() - begin) + " milliseconds");
    }

    @Override
    public void destory() {
    }
}
