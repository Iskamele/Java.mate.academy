package section07_JavaWeb.topic06_HowToAddProjectToGitHub.controller.car;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import section07_JavaWeb.topic06_HowToAddProjectToGitHub.lib.Injector;
import section07_JavaWeb.topic06_HowToAddProjectToGitHub.service.CarService;

//@WebServlet(urlPatterns = "/cars/delete")
public class DeleteCarController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("taxi");
    private final CarService carService = (CarService) injector.getInstance(CarService.class);

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        carService.delete(Long.parseLong(req.getParameter("id")));
        resp.sendRedirect(req.getContextPath() + "/cars");
    }
}
