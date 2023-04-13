package section07_JavaWeb.topic03_WebPractice.practice.WebPractice.controller.manufacturer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.lib.Injector;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.model.Manufacturer;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.service.ManufacturerService;

//@WebServlet(urlPatterns = "/manufacturers/add")
public class AddManufacturerController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("mate");
    private final ManufacturerService manufacturerService =
            (ManufacturerService) injector.getInstance(ManufacturerService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/manufacturers/add.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name = req.getParameter("name");
        String country = req.getParameter("country");
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setName(name);
        manufacturer.setCountry(country);
        manufacturerService.create(manufacturer);
        resp.sendRedirect(req.getContextPath() + "/success");
    }
}
