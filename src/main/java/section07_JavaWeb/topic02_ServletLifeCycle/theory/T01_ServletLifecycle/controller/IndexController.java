package section07_JavaWeb.topic02_ServletLifeCycle.theory.T01_ServletLifecycle.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet life cycle
 */
public class IndexController extends HttpServlet {
    /**
     * 1. Servlet has a life cycle.
     * 2. When does servlet instance creates?
     *    Создаётся servlet контейнером при первом запросе на этот servlet.
     *    load-on-startup - объект servlet создаётся сразу при поднятии Tomcat.
     * 3. Who is responsible to create a servlet instance?
     *    За создание объекта servlet отвечает servlet контейнер.
     * 4. All servlets live in a servlet container.
     * 5. Tomcat is a servlet container.
     * 6. Servlet container (e.g. Tomcat) is responsible for managing servlets lifecycle.
     */
    
    static {
        System.out.println("IndexController war loaded ...");
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
