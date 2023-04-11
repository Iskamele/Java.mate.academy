package section07_JavaWeb.topic02_ServletLifeCycle.theory.T02_LoadOnStartup.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * load-on-startup
 */
public class IndexController extends HttpServlet {

    static {
        System.out.println("IndexController war loaded after load-on-startup ...");
    }

    public IndexController() {
        System.out.println("IndexController was called ...");
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("IndexController method doGet was called ...");
        req.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(req, resp);
    }
}
