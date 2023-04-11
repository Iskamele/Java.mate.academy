package section07_JavaWeb.topic02_ServletLifeCycle.theory.T05_ForwardVsSendRedirect.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ItemsController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("ItemsController was called ...");
        req.getRequestDispatcher("/WEB-INF/views/items.jsp").forward(req, resp);
    }
}
