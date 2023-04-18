package section07_JavaWeb.topic06_HowToAddProjectToGitHub.controller.car;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import section07_JavaWeb.topic06_HowToAddProjectToGitHub.lib.Injector;
import section07_JavaWeb.topic06_HowToAddProjectToGitHub.model.Car;
import section07_JavaWeb.topic06_HowToAddProjectToGitHub.service.CarService;

//@WebServlet(urlPatterns = "/cars/my")
public class GetMyCurrentCarsController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("taxi");
    private final CarService carService = (CarService) injector.getInstance(CarService.class);

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Long driverId = (Long) req.getSession().getAttribute("driver_id");
        List<Car> cars = carService.getAllByDriver(driverId);
        req.setAttribute("cars", cars);
        req.getRequestDispatcher("/WEB-INF/views/cars/all.jsp").forward(req, resp);
    }
}
