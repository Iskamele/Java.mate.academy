package section07_JavaWeb.topic03_WebPractice.theory.T09_DeleteUserFromDB.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import section07_JavaWeb.topic03_WebPractice.theory.T09_DeleteUserFromDB.dao.UserDaoImpl;
import section07_JavaWeb.topic03_WebPractice.theory.T09_DeleteUserFromDB.model.User;
import section07_JavaWeb.topic03_WebPractice.theory.T09_DeleteUserFromDB.service.UserService;
import section07_JavaWeb.topic03_WebPractice.theory.T09_DeleteUserFromDB.service.UserServiceImpl;

public class GetAllUsersController extends HttpServlet {
    UserService userService = new UserServiceImpl(new UserDaoImpl());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        List<User> allUsers = userService.getAll();
        req.setAttribute("users", allUsers);
        req.getRequestDispatcher("/WEB-INF/views/users/all.jsp").forward(req, resp);
    }
}
