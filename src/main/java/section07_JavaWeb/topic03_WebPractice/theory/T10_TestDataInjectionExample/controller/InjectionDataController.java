package section07_JavaWeb.topic03_WebPractice.theory.T10_TestDataInjectionExample.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import section07_JavaWeb.topic03_WebPractice.theory.T10_TestDataInjectionExample.model.User;
import section07_JavaWeb.topic03_WebPractice.theory.T10_TestDataInjectionExample.service.UserService;

public class InjectionDataController extends HttpServlet {
    private UserService userService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        User bob = new User();
        bob.setName("Bob");
        User alice = new User();
        User john = new User();

        userService.create(bob);
        userService.create(alice);
        userService.create(john);
    }
}
