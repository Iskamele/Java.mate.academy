package section06_JavaJDBC.topic04_INNERJOIN.T10_InsertEntityWithManytoManyRelation.service;

import java.util.List;
import section06_JavaJDBC.topic04_INNERJOIN.T10_InsertEntityWithManytoManyRelation.dao.LiteraryFormatDao;
import section06_JavaJDBC.topic04_INNERJOIN.T10_InsertEntityWithManytoManyRelation.lib.Inject;
import section06_JavaJDBC.topic04_INNERJOIN.T10_InsertEntityWithManytoManyRelation.lib.Service;
import section06_JavaJDBC.topic04_INNERJOIN.T10_InsertEntityWithManytoManyRelation.model.LiteraryFormat;

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
        return literaryFormatDao.get(id).orElseThrow();
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
