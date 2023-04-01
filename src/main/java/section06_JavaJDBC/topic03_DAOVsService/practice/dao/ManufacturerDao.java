package section06_JavaJDBC.topic03_DAOVsService.practice.dao;

import java.util.List;
import java.util.Optional;
import section06_JavaJDBC.topic03_DAOVsService.practice.model.Manufacturer;

public interface ManufacturerDao {

    Manufacturer create(Manufacturer manufacturer);

    Optional<Manufacturer> get(Long id);

    List<Manufacturer> getAll();

    Manufacturer update(Manufacturer manufacturer);

    boolean delete(Long id);
}
