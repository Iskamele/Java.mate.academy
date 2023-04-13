package section07_JavaWeb.topic03_WebPractice.practice.WebPractice.controller.driver;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.lib.Injector;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.model.Driver;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.service.DriverService;

//@WebServlet(urlPatterns = "/drivers/add")
public class AddDriverController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("mate");
    private final DriverService driverService =
            (DriverService) injector.getInstance(DriverService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/drivers/add.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name = req.getParameter("name");
        String licenceNumber = req.getParameter("licence_number");
        Driver driver = new Driver();
        driver.setName(name);
        driver.setLicenseNumber(licenceNumber);
        driverService.create(driver);
        resp.sendRedirect(req.getContextPath() + "/success");
    }
}
