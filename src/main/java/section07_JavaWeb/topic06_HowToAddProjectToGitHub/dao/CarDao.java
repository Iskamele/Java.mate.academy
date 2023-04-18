package section07_JavaWeb.topic06_HowToAddProjectToGitHub.dao;

import java.util.List;
import section07_JavaWeb.topic06_HowToAddProjectToGitHub.model.Car;

public interface CarDao extends GenericDao<Car> {
    List<Car> getAllByDriver(Long driverId);
}
