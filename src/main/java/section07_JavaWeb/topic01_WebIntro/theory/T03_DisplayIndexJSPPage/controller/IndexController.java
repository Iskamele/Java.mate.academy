package section07_JavaWeb.topic01_WebIntro.theory.T03_DisplayIndexJSPPage.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexController extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // return page
        req.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(req, resp);
    }
}
