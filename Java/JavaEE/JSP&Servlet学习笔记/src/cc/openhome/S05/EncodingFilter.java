package cc.openhome.S05;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * package/file: cc.openhome/EncodingFilter
 * author: pcwuyu
 * version: 2016/9/19 11:29
 */
@WebFilter(
        urlPatterns = {"/*"},
        initParams = {@WebInitParam(name = "ENCODING", value = "UTF-8")}
)
public class EncodingFilter implements Filter {
    private String ENCODING;

    public void init(FilterConfig config) throws ServletException {
        ENCODING = config.getInitParameter("ENCODING");  //读取初始参数
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        if ("GET".equals(req.getMethod())) {
            req = new EncodingWrapper(req, ENCODING);  //GET请求时创建分装器
        } else {
            req.setCharacterEncoding(ENCODING);
        }
        chain.doFilter(req, response);  //调用filterChain的 foFilter()
    }

    public void destory() {

    }

}
