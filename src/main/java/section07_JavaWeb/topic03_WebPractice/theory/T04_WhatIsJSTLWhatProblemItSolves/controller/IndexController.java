package section07_JavaWeb.topic03_WebPractice.theory.T04_WhatIsJSTLWhatProblemItSolves.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import section07_JavaWeb.topic03_WebPractice.theory.T04_WhatIsJSTLWhatProblemItSolves.model.User;

public class IndexController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        User bob = new User();
        bob.setName("Bob");
        bob.setRole("user");
        req.setAttribute("user", bob);
        req.getRequestDispatcher("WEB-INF/views/index.jsp").forward(req, resp);
    }
}
