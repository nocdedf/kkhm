package other;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Creat with IntelliJ IDEA.
 * Description:
 * User: WHM
 * Date: 2020-01-15
 * Time: 9:11
 */
public class ServletDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(400);
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        resp.setHeader("X-Room","301");//x 开头的是自定义的header，不是标准
        resp.setIntHeader("X-Count",18);
        resp.setDateHeader("X-Now",new Date().getTime());

        System.out.println("写入响应体");
        resp.getWriter().print("<h1>响应体</h1>");
    }
}
