package section07_JavaWeb.topic03_WebPractice.practice.WebPractice.dao;

import java.util.List;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.model.Car;

public interface CarDao extends GenericDao<Car> {
    List<Car> getAllByDriver(Long driverId);
}
