package cc.openhome.S05;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * package/file: PACKAGE_NAME/cc.openhome.S05.Login
 * author: pcwuyu
 * version: 2016/9/13 16:55
 */
@WebServlet(
        name = "login",  //设置Servlet名称
        urlPatterns = {"/login.do"},
        initParams = {  //设置初始参数
                @WebInitParam(name = "SUCCESS", value = "success.view"),
                @WebInitParam(name = "ERROR", value = "error.view")
        }
)
public class Login extends HttpServlet {
    private String SUCCESS_VIEW;
    private String ERROR_VIEW;

    @Override
    public void init() throws ServletException {
        SUCCESS_VIEW = getInitParameter("SUCCESS");  //取得初始参数
        ERROR_VIEW = getInitParameter("ERROR");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("name");
        String passwd = request.getParameter("passwd");

        if ("caterpillar".equals(name) && "123456".equals(passwd)) {
            request.getRequestDispatcher(SUCCESS_VIEW).forward(request, response);  //登陆成功
        } else {
            request.getRequestDispatcher(ERROR_VIEW).forward(request, response);  //登录失败
        }
    }

}
