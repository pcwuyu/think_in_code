package cc.openhome.S05;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * package/file: cc.openhome/Login2
 * author: pcwuyu
 * version: 2016/9/14 15:43
 */
@WebServlet("/login.do")
public class Login2 extends HttpServlet {
    private Map<String, String> users;

    public Login() {
        users = new HashMap<String, String>();
        users.put("caterpillar", "123456");
        users.put("momor", "987654321");
        users.put("hamimi", "13579");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String passwd = request.getParameter("passwd");

        String page = "form.html";

        if (users.containsKey(name) && users.get(name).equals(passwd)) {
            request.getSession().setAttribute("user", name);
            page = "welcome.view";
        }

        response.sendRedirect(page);
    }
}
