package section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.dao;

import java.util.List;
import section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.model.Car;

public interface CarDao extends GenericDao<Car> {
    List<Car> getAllByDriver(Long driverId);
}
