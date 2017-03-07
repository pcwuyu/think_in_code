package cc.openhome.web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * package/file: cc.openhome.web/MemberFilter
 * author: pcwuyu
 * version: 2016/9/19 16:32
 */
@WebFilter(
        urlPatterns = {"/delete.do", "/logout.do", "/message.do", "/member.view"},
        initParams = {@WebInitParam(name = "LOGIN_VIEW", value = "index.html")}
)
public class MemberFilter implements Filter {
    private String LOGIN_VIEW;

    public void init(FilterConfig config) throws ServletException {
        this.LOGIN_VIEW = config.getInitParameter("LOGIN_VIEW");  //设置登录页面
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        if (req.getSession().getAttribute("login") != null) {
            chain.doFilter(request, response);  //只有具备 login 属性的时候,才调用 doFilter()
        } else {
            HttpServletResponse resp = (HttpServletResponse) response;
            resp.sendRedirect(LOGIN_VIEW);  //否则重新定向至登录页面
        }
    }
}
