package section07_JavaWeb.topic04_SecurityInWeb.theory.T05_WhatIsFilter.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T05_WhatIsFilter.exception.AuthenticationException;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T05_WhatIsFilter.service.AuthenticationService;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T05_WhatIsFilter.service.AuthenticationServiceImpl;

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
            authenticationService.login(username, password);
            resp.sendRedirect("/index");
        } catch (AuthenticationException e) {
            req.setAttribute("errorMsg", e.getMessage());
            req.getRequestDispatcher("WEB-INF/views/login.jsp").forward(req, resp);
        }
    }
}
