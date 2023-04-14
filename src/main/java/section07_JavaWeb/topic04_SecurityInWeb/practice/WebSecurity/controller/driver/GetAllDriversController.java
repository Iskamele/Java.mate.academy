package section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.controller.driver;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.lib.Injector;
import section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.model.Driver;
import section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.service.DriverService;

//@WebServlet(urlPatterns = "/drivers")
public class GetAllDriversController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("taxi");
    private final DriverService driverService = (DriverService) injector
            .getInstance(DriverService.class);

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        List<Driver> drivers = driverService.getAll();
        req.setAttribute("drivers", drivers);
        req.getRequestDispatcher("/WEB-INF/views/drivers/all.jsp").forward(req, resp);
    }
}
