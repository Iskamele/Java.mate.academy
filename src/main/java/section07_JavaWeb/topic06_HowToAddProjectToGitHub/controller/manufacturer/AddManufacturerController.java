package section07_JavaWeb.topic06_HowToAddProjectToGitHub.controller.manufacturer;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import section07_JavaWeb.topic06_HowToAddProjectToGitHub.lib.Injector;
import section07_JavaWeb.topic06_HowToAddProjectToGitHub.model.Manufacturer;
import section07_JavaWeb.topic06_HowToAddProjectToGitHub.service.ManufacturerService;

//@WebServlet(urlPatterns = "/manufacturers/add")
public class AddManufacturerController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("taxi");
    private final ManufacturerService manufacturerService = (ManufacturerService) injector
            .getInstance(ManufacturerService.class);

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        List<Manufacturer> manufacturers = manufacturerService.getAll();
        req.setAttribute("manufacturers", manufacturers);
        req.getRequestDispatcher("/WEB-INF/views/manufacturers/add.jsp").forward(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        String country = req.getParameter("country");
        Manufacturer manufacturer = new Manufacturer(name, country);
        manufacturerService.create(manufacturer);
        resp.sendRedirect(req.getContextPath() + "/manufacturers/add");
    }
}
