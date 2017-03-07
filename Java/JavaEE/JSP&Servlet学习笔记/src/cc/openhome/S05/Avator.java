package cc.openhome.S05;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * package/file: cc.openhome/Avator
 * author: pcwuyu
 * version: 2016/9/14 11:04
 */
@WebServlet(
        urlPatterns = {"/avatar.view"},
        initParams = {@WebInitParam(name = "AVATAR_DIR", value = "/avatars")}
)

public class Avator extends HttpServlet {
    private String AVATAR_DIR;

    @Override
    public void init() throws ServletException {
        AVATAR_DIR = getInitParameter("AVATAR_DIR");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>头像显示</title>");
        out.println("</head>");
        out.println("<body>");

        for (String avatar : getServletContext().getResourcePaths(AVATAR_DIR)) {  //去的头像路径
            avatar = avatar.replaceFirst("/", "");
            out.println("<img src='" + avatar + "'>");  //设置成<img>的src属性
        }

        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
