package section07_JavaWeb.topic03_WebPractice.practice.WebPractice.service;

import java.util.List;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.dao.CarDao;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.lib.Inject;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.lib.Service;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.model.Car;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.model.Driver;

@Service
public class CarServiceImpl implements CarService {
    @Inject
    private CarDao carDao;

    @Override
    public void addDriverToCar(Driver driver, Car car) {
        car.getDrivers().add(driver);
        carDao.update(car);
    }

    @Override
    public void removeDriverFromCar(Driver driver, Car car) {
        car.getDrivers().remove(driver);
        carDao.update(car);
    }

    @Override
    public List<Car> getAllByDriver(Long driverId) {
        return carDao.getAllByDriver(driverId);
    }

    @Override
    public Car create(Car car) {
        return carDao.create(car);
    }

    @Override
    public Car get(Long id) {
        return carDao.get(id).get();
    }

    @Override
    public List<Car> getAll() {
        return carDao.getAll();
    }

    @Override
    public Car update(Car car) {
        return carDao.update(car);
    }

    @Override
    public boolean delete(Long id) {
        return carDao.delete(id);
    }
}
