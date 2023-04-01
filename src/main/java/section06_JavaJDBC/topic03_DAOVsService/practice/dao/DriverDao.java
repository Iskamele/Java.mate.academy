package section06_JavaJDBC.topic03_DAOVsService.practice.dao;

import java.util.List;
import java.util.Optional;
import section06_JavaJDBC.topic03_DAOVsService.practice.model.Driver;

public interface DriverDao {

    Driver create(Driver driver);

    Optional<Driver> get(Long id);

    List<Driver> getAll();

    Driver update(Driver driver);

    boolean delete(Long id);
}
