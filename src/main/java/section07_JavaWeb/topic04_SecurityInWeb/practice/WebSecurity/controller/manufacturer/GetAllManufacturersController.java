package section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.controller.manufacturer;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.lib.Injector;
import section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.model.Manufacturer;
import section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.service.ManufacturerService;

//@WebServlet(urlPatterns = "/manufacturers")
public class GetAllManufacturersController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("taxi");
    private final ManufacturerService manufacturerService = (ManufacturerService) injector
            .getInstance(ManufacturerService.class);

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        List<Manufacturer> manufacturers = manufacturerService.getAll();
        req.setAttribute("manufacturers", manufacturers);
        req.getRequestDispatcher("/WEB-INF/views/manufacturers/all.jsp").forward(req, resp);
    }
}
