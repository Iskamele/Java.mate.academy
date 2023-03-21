package section06_JavaJDBC.topic02_JDBCINtro.practice.JDBC.dao;

import java.util.List;
import java.util.Optional;
import section06_JavaJDBC.topic02_JDBCINtro.practice.JDBC.model.Manufacturer;

public interface ManufacturerDao {
    Manufacturer create(Manufacturer manufacturer);

    Optional<Manufacturer> get(Long id);

    List<Manufacturer> getAll();

    Manufacturer update(Manufacturer manufacturer);

    boolean delete(Long id);
}
