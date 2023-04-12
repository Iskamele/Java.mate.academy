package section07_JavaWeb.topic03_WebPractice.theory.T09_DeleteUserFromDB.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import section07_JavaWeb.topic03_WebPractice.theory.T09_DeleteUserFromDB.dao.UserDaoImpl;
import section07_JavaWeb.topic03_WebPractice.theory.T09_DeleteUserFromDB.service.UserService;
import section07_JavaWeb.topic03_WebPractice.theory.T09_DeleteUserFromDB.service.UserServiceImpl;

public class DeleteUserController extends HttpServlet {
    UserService userService = new UserServiceImpl(new UserDaoImpl());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.valueOf(req.getParameter("id"));
        System.out.println("Delete method was called ...");
        userService.delete(id);
    }
}
