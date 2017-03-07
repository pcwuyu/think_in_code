package cc.openhome.S05;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * package/file: cc.openhome/EscapeFilter
 * author: pcwuyu
 * version: 2016/9/19 10:49
 */
@WebFilter("/*")
public class EscapeFilter implements Filter {
    public void init(FilterConfig fConfig) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest requestWrapper = new EscapeWrapper((HttpServletRequest) request);  //将源请求对象包裹至EscapeWrapper
        chain.doFilter(requestWrapper, response);  //将~对象当做请求对象传入doFilter(
    }

    public void destory() {
    }
}
