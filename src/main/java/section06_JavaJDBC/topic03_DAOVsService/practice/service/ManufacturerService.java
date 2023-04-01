package section06_JavaJDBC.topic03_DAOVsService.practice.service;

import java.util.List;
import section06_JavaJDBC.topic03_DAOVsService.practice.model.Manufacturer;

public interface ManufacturerService {

    Manufacturer create(Manufacturer manufacturer);

    Manufacturer get(Long id);

    List<Manufacturer> getAll();

    Manufacturer update(Manufacturer manufacturer);

    boolean delete(Long id);
}
