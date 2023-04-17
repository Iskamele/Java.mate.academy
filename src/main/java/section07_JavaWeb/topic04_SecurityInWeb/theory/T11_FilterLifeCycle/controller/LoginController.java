package section07_JavaWeb.topic04_SecurityInWeb.theory.T11_FilterLifeCycle.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T11_FilterLifeCycle.exception.AuthenticationException;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T11_FilterLifeCycle.model.User;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T11_FilterLifeCycle.service.AuthenticationService;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T11_FilterLifeCycle.service.AuthenticationServiceImpl;

//@WebServlet(urlPatterns = "/login")
public class LoginController extends HttpServlet {
    private AuthenticationService authenticationService =
            new AuthenticationServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/views/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String username = req.getParameter("login");
        String password = req.getParameter("password");
        try {
            User user = authenticationService.login(username, password);
            HttpSession session = req.getSession();
            session.setAttribute("user_id", user.getId());
            resp.sendRedirect("/index");
        } catch (AuthenticationException e) {
            req.setAttribute("errorMsg", e.getMessage());
            req.getRequestDispatcher("WEB-INF/views/login.jsp").forward(req, resp);
        }
    }
}
