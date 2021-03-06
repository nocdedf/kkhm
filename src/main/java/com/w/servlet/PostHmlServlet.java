package com.w.servlet;



import com.w.model.User;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/post.html")
public class PostHmlServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        System.out.println(session.getId());
        User user = (User) session.getAttribute("user");
        if (user == null) {
            resp.sendRedirect("/login.html");
            return;
        }

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>发布文章</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<form method=\"post\" action=\"/post\">");
        out.println("<center>");
        out.println("<label for=\"title\" class=\"sr-only\">标题: </label><br>");
        out.println("    <input type=\"text\" name=\"title\"/><br>");
        out.println("<label for=\"content\" class=\"sr-only\">正文: </label><br>");
        out.println("    <textarea name=\"content\" rows=\"20\" cols=\"50\" ></textarea><br>");
        out.println("    <button type=\"submit\">发布</button>");
        out.println("</center>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }
}
