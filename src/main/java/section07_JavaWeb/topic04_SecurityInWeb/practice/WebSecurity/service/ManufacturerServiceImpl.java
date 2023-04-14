package section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.service;

import java.util.List;
import java.util.NoSuchElementException;
import section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.dao.ManufacturerDao;
import section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.lib.Inject;
import section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.lib.Service;
import section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.model.Manufacturer;

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
        return manufacturerDao.get(id).orElseThrow(() ->
            new NoSuchElementException("Can't get manufacturer by id: " + id)
        );
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
