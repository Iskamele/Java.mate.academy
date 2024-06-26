package section07_JavaWeb.topic06_HowToAddProjectToGitHub.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import section07_JavaWeb.topic06_HowToAddProjectToGitHub.dao.DriverDao;
import section07_JavaWeb.topic06_HowToAddProjectToGitHub.lib.Inject;
import section07_JavaWeb.topic06_HowToAddProjectToGitHub.lib.Service;
import section07_JavaWeb.topic06_HowToAddProjectToGitHub.model.Driver;

@Service
public class DriverServiceImpl implements DriverService {
    @Inject
    private DriverDao driverDao;

    @Override
    public Driver create(Driver driver) {
        return driverDao.create(driver);
    }

    @Override
    public Driver get(Long id) {
        return driverDao.get(id).orElseThrow(() ->
            new NoSuchElementException("Can't get driver by id: " + id)
        );
    }

    @Override
    public List<Driver> getAll() {
        return driverDao.getAll();
    }

    @Override
    public Driver update(Driver driver) {
        return driverDao.update(driver);
    }

    @Override
    public boolean delete(Long id) {
        return driverDao.delete(id);
    }

    public Optional<Driver> findByLogin(String login) {
        return driverDao.findByLogin(login);
    }
}
