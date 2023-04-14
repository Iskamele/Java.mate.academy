package section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.dao;

import java.util.Optional;
import section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.model.Driver;

public interface DriverDao extends GenericDao<Driver> {
    Optional<Driver> findByLogin(String login);
}
