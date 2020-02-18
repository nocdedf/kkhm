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

@WebServlet("/success")
public class SuccessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter writer = resp.getWriter();
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null) {
            writer.println("<h1>没登陆</h1>");
        } else {
            writer.printf("<h1>ID：%d</h1>%n",user.getId());
            writer.printf("<h1>用户名：%s</h1>%n",user.getUsername());
            writer.printf("<h1>昵称：%s</h1>%n",user.getNickname());
        }

        resp.sendRedirect("/post.html");
    }
}
