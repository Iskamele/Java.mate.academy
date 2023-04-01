package section06_JavaJDBC.topic03_DAOVsService.practice.service.impl;

import java.util.List;
import java.util.NoSuchElementException;
import section06_JavaJDBC.topic03_DAOVsService.practice.dao.ManufacturerDao;
import section06_JavaJDBC.topic03_DAOVsService.practice.lib.Inject;
import section06_JavaJDBC.topic03_DAOVsService.practice.lib.Service;
import section06_JavaJDBC.topic03_DAOVsService.practice.model.Manufacturer;
import section06_JavaJDBC.topic03_DAOVsService.practice.service.ManufacturerService;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {
    @Inject
    private ManufacturerDao manufacturerDao;

    @Override
    public Manufacturer create(Manufacturer manufacturer) {
        return manufacturerDao.create(manufacturer);
    }

    @Override
    public Manufacturer get(Long id) {
        return manufacturerDao.get(id).orElseThrow(
                () -> new NoSuchElementException("Manufacturer with id " + id + " not found"));
    }

    @Override
    public List<Manufacturer> getAll() {
        return manufacturerDao.getAll();
    }

    @Override
    public Manufacturer update(Manufacturer manufacturer) {
        return manufacturerDao.update(manufacturer);
    }

    @Override
    public boolean delete(Long id) {
        return manufacturerDao.delete(id);
    }
}
