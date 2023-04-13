package section07_JavaWeb.topic03_WebPractice.practice.WebPractice.service;

import java.util.List;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.model.Car;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.model.Driver;

public interface CarService extends GenericService<Car> {
    void addDriverToCar(Driver driver, Car car);

    void removeDriverFromCar(Driver driver, Car car);

    List<Car> getAllByDriver(Long driverId);
}
