package section06_JavaJDBC.topic03_DAOVsService.practice.service.impl;

import java.util.List;
import java.util.NoSuchElementException;
import section06_JavaJDBC.topic03_DAOVsService.practice.dao.DriverDao;
import section06_JavaJDBC.topic03_DAOVsService.practice.lib.Inject;
import section06_JavaJDBC.topic03_DAOVsService.practice.lib.Service;
import section06_JavaJDBC.topic03_DAOVsService.practice.model.Driver;
import section06_JavaJDBC.topic03_DAOVsService.practice.service.DriverService;

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
        return driverDao.get(id).orElseThrow(
                () -> new NoSuchElementException("Driver with id " + id + " not found"));
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
}
