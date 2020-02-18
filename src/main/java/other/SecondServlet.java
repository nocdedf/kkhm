package other;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Creat with IntelliJ IDEA.
 * Description:
 * User: WHM
 * Date: 2020-01-13
 * Time: 11:54
 */

//表单
@WebServlet("/second")
public class SecondServlet extends HttpServlet {

    private void run(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        out.println("<h1>" + req.getMethod() + "</h1>");
        out.println("<p>用户名: " + username + "</p>");
        out.println("<p>密码: " + password + "</p>");


    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        run(req,resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        run(req,resp);
    }
}
