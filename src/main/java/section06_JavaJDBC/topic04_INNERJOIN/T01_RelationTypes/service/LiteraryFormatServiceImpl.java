package section06_JavaJDBC.topic04_INNERJOIN.T01_RelationTypes.service;

import java.util.List;
import java.util.Optional;
import section06_JavaJDBC.topic04_INNERJOIN.T01_RelationTypes.dao.LiteraryFormatDao;
import section06_JavaJDBC.topic04_INNERJOIN.T01_RelationTypes.lib.Inject;
import section06_JavaJDBC.topic04_INNERJOIN.T01_RelationTypes.lib.Service;
import section06_JavaJDBC.topic04_INNERJOIN.T01_RelationTypes.model.LiteraryFormat;

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
    public Optional<LiteraryFormat> get(Long id) {
        return literaryFormatDao.get(id);
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
