package section07_JavaWeb.topic03_WebPractice.practice.WebPractice.controller.car;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.model.Car;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.model.Driver;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.model.Manufacturer;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.service.CarService;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.service.DriverService;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.service.ManufacturerService;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.lib.Injector;

//@WebServlet(urlPatterns = "/cars/add")
public class AddCarController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("mate");
    private final CarService carService =
            (CarService) injector.getInstance(CarService.class);
    private final ManufacturerService manufacturerService =
            (ManufacturerService) injector.getInstance(ManufacturerService.class);
    private final DriverService driverService =
            (DriverService) injector.getInstance(DriverService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        List<Manufacturer> manufacturers = manufacturerService.getAll();
        req.setAttribute("manufacturers", manufacturers);
        List<Driver> drivers = driverService.getAll();
        req.setAttribute("drivers", drivers);
        req.getRequestDispatcher("/WEB-INF/views/cars/add.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String model = req.getParameter("model");
        Long manufacturerId = Long.valueOf(req.getParameter("manufacturer_id"));
        Manufacturer manufacturer = manufacturerService.get(manufacturerId);
        Long driverId = Long.valueOf(req.getParameter("driver_id"));
        Driver driver = driverService.get(driverId);
        Car car = new Car();
        car.setModel(model);
        car.setManufacturer(manufacturer);
        car.setDrivers(List.of(driver));
        carService.create(car);
        resp.sendRedirect(req.getContextPath() + "/success");
    }
}
