package section07_JavaWeb.topic03_WebPractice.practice.WebPractice.controller.car;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.lib.Injector;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.model.Car;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.service.CarService;

//@WebServlet(urlPatterns = "/cars")
public class GetAllCarsController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("mate");
    private final CarService carService =
            (CarService) injector.getInstance(CarService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        List<Car> cars = carService.getAll();
        req.setAttribute("cars", cars);
        req.getRequestDispatcher("/WEB-INF/views/cars/all.jsp")
                .forward(req, resp);
    }
}
