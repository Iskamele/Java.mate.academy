package section07_JavaWeb.topic02_ServletLifeCycle.theory.T06_ForwardVsInclude.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // forward vs include
        req.getRequestDispatcher("/WEB-INF/views/items.jsp").include(req, resp);
        req.getRequestDispatcher("/WEB-INF/views/index.jsp").include(req, resp);
    }
}
