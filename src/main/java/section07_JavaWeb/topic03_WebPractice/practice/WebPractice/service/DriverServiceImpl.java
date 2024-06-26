package section07_JavaWeb.topic03_WebPractice.practice.WebPractice.service;

import java.util.List;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.dao.DriverDao;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.lib.Inject;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.lib.Service;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.model.Driver;

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
        return driverDao.get(id).get();
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
