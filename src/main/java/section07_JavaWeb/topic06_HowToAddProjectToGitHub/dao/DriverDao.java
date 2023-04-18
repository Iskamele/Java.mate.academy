package section07_JavaWeb.topic06_HowToAddProjectToGitHub.dao;

import java.util.Optional;
import section07_JavaWeb.topic06_HowToAddProjectToGitHub.model.Driver;

public interface DriverDao extends GenericDao<Driver> {
    Optional<Driver> findByLogin(String login);
}
