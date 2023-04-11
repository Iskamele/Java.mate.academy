package section07_JavaWeb.topic02_ServletLifeCycle.theory.T03_ServletConfigVsServletContext.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexController extends HttpServlet {
    /**
     1. ServletConfig
        - user by a servlet container to pass information to a servlet
          during initialization

     2. ServletContext
        - Defines a set of methods that a servlet uses to communicate
          with its servlet container
        - The ServletContext is an object that contains meta information
          about your web application
        - The attributes stored in the ServletContext are available
          to all servlets in your application
     */

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(req, resp);
    }
}
