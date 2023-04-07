package section06_JavaJDBC.topic04_INNERJOIN.T11_DeleteAndUpdateEntityWithManytoMany.service.impl;

import java.util.List;
import java.util.NoSuchElementException;
import section06_JavaJDBC.topic04_INNERJOIN.T11_DeleteAndUpdateEntityWithManytoMany.dao.LiteraryFormatDao;
import section06_JavaJDBC.topic04_INNERJOIN.T11_DeleteAndUpdateEntityWithManytoMany.lib.Inject;
import section06_JavaJDBC.topic04_INNERJOIN.T11_DeleteAndUpdateEntityWithManytoMany.lib.Service;
import section06_JavaJDBC.topic04_INNERJOIN.T11_DeleteAndUpdateEntityWithManytoMany.model.LiteraryFormat;
import section06_JavaJDBC.topic04_INNERJOIN.T11_DeleteAndUpdateEntityWithManytoMany.service.LiteraryFormatService;

@Service
public class LiteraryFormatServiceImpl implements LiteraryFormatService {
    @Inject
    private LiteraryFormatDao literaryFormatDao;

    @Override
    public List<LiteraryFormat> getAll() {
        return literaryFormatDao.getAll();
    }

    @Override
    public LiteraryFormat create(LiteraryFormat format) {
        return literaryFormatDao.create(format);
    }

    @Override
    public LiteraryFormat get(Long id) {
        return literaryFormatDao.get(id).orElseThrow(
                () -> new NoSuchElementException("Literary format with id " + id + " not found"));
    }

    @Override
    public LiteraryFormat update(LiteraryFormat format) {
        return literaryFormatDao.update(format);
    }

    @Override
    public boolean delete(Long id) {
        return literaryFormatDao.delete(id);
    }
}
