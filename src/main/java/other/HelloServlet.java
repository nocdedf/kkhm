package other;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Creat with IntelliJ IDEA.
 * Description:
 * User: WHM
 * Date: 2020-01-13
 * Time: 11:32
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text-plain");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().println("HelloServlet");
    }
}
