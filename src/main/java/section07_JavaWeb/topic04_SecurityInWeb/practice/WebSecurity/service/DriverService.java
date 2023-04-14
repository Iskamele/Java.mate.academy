package section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.service;

import java.util.Optional;
import section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.model.Driver;

public interface DriverService extends GenericService<Driver> {
    Optional<Driver> findByLogin(String login);
}
