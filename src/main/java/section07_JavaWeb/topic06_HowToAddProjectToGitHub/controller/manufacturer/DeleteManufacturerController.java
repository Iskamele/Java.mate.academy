package section07_JavaWeb.topic06_HowToAddProjectToGitHub.controller.manufacturer;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import section07_JavaWeb.topic06_HowToAddProjectToGitHub.lib.Injector;
import section07_JavaWeb.topic06_HowToAddProjectToGitHub.service.ManufacturerService;

//@WebServlet(urlPatterns = "/manufacturers/delete")
public class DeleteManufacturerController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("taxi");
    private final ManufacturerService manufacturerService = (ManufacturerService) injector
            .getInstance(ManufacturerService.class);

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        manufacturerService.delete(Long.parseLong(req.getParameter("id")));
        resp.sendRedirect(req.getContextPath() + "/manufacturers");
    }
}
