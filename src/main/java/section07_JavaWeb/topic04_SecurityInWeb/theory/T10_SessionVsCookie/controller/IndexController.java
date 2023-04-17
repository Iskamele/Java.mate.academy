package section07_JavaWeb.topic04_SecurityInWeb.theory.T10_SessionVsCookie.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Cookie cookie = new Cookie("city", "Kyiv");
        cookie.setMaxAge(1000000000);
        resp.addCookie(cookie);

        req.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(req, resp);
    }
}
