package section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.service;

import java.util.List;
import section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.model.Car;
import section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.model.Driver;

public interface CarService extends GenericService<Car> {
    void addDriverToCar(Driver driver, Car car);

    void removeDriverFromCar(Driver driver, Car car);

    List<Car> getAllByDriver(Long driverId);
}
