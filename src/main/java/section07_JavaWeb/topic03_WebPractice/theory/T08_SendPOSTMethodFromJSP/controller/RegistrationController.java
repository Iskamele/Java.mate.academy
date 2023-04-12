package section07_JavaWeb.topic03_WebPractice.theory.T08_SendPOSTMethodFromJSP.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import section07_JavaWeb.topic03_WebPractice.theory.T08_SendPOSTMethodFromJSP.service.UserService;
import section07_JavaWeb.topic03_WebPractice.theory.T08_SendPOSTMethodFromJSP.service.UserServiceImpl;

public class RegistrationController extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println(req.getParameterMap());
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String repeatPassword = req.getParameter("repeatPassword");
        userService.register(username, password, repeatPassword);
        System.out.println("POST was called");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/users/register.jsp").forward(req, resp);
    }
}
