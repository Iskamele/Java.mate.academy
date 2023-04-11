package section07_JavaWeb.topic02_ServletLifeCycle.theory.T05_ForwardVsSendRedirect.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // redirect
        //req.getRequestDispatcher("items").forward(req, resp);

        // forwarding
        resp.sendRedirect("/items");
    }
}
