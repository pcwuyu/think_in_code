package cc.openhome.S05;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * package/file: cc.openhome/Welcome
 * author: pcwuyu
 * version: 2016/9/14 16:06
 */
@WebServlet("/welcome.view")
public class Welcome extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(false);

        out.println("...");
        out.println("<h1>目前在线人数为" + OnlineUserCounter.getCounter() + " 人</h1>");
        if (session != null) {
            String user = (String) session.getAttribute("user");
            out.println("欢迎: " + user);
            out.println("<a href='logout.do'>注销</a>");
        }

        out.close();
    }
}
