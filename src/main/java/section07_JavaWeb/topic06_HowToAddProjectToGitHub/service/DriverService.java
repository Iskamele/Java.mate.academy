package section07_JavaWeb.topic06_HowToAddProjectToGitHub.service;

import java.util.Optional;
import section07_JavaWeb.topic06_HowToAddProjectToGitHub.model.Driver;

public interface DriverService extends GenericService<Driver> {
    Optional<Driver> findByLogin(String login);
}
