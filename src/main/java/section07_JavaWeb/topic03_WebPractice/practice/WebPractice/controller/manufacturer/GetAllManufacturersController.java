package section07_JavaWeb.topic03_WebPractice.practice.WebPractice.controller.manufacturer;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.lib.Injector;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.model.Manufacturer;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.service.ManufacturerService;

//@WebServlet(urlPatterns = "/manufacturers")
public class GetAllManufacturersController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("mate");
    private final ManufacturerService manufacturerService =
            (ManufacturerService) injector.getInstance(ManufacturerService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        List<Manufacturer> manufacturers = manufacturerService.getAll();
        req.setAttribute("manufacturers", manufacturers);
        req.getRequestDispatcher("/WEB-INF/views/manufacturers/all.jsp")
                .forward(req, resp);
    }
}
