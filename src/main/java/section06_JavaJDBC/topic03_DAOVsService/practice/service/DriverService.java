package section06_JavaJDBC.topic03_DAOVsService.practice.service;

import java.util.List;
import section06_JavaJDBC.topic03_DAOVsService.practice.model.Driver;

public interface DriverService {

    Driver create(Driver driver);

    Driver get(Long id);

    List<Driver> getAll();

    Driver update(Driver driver);

    boolean delete(Long id);
}
