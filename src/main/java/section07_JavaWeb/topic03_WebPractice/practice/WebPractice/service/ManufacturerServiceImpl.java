package section07_JavaWeb.topic03_WebPractice.practice.WebPractice.service;

import java.util.List;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.dao.ManufacturerDao;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.lib.Inject;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.lib.Service;
import section07_JavaWeb.topic03_WebPractice.practice.WebPractice.model.Manufacturer;

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
        return manufacturerDao.get(id).get();
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
