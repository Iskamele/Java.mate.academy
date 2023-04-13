package section07_JavaWeb.topic03_WebPractice.practice.WebPractice.controller.manufacturer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.lib.Injector;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.service.ManufacturerService;

//@WebServlet("/manufacturers/delete")
public class DeleteManufacturerController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("mate");
    private final ManufacturerService manufacturerService =
            (ManufacturerService) injector.getInstance(ManufacturerService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Long id = Long.valueOf(req.getParameter("id"));
        manufacturerService.delete(id);
        resp.sendRedirect(req.getContextPath() + "/manufacturers");
    }
}
