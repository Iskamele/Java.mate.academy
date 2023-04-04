package section06_JavaJDBC.topic03_DAOVsService.theory.T02_InjectorUsageExample.service;

import java.util.List;
import java.util.Optional;
import section06_JavaJDBC.topic03_DAOVsService.theory.T02_InjectorUsageExample.dao.LiteraryFormatDao;
import section06_JavaJDBC.topic03_DAOVsService.theory.T02_InjectorUsageExample.lib.Inject;
import section06_JavaJDBC.topic03_DAOVsService.theory.T02_InjectorUsageExample.lib.Service;
import section06_JavaJDBC.topic03_DAOVsService.theory.T02_InjectorUsageExample.model.LiteraryFormat;

@Service
public class LiteraryFormatServiceImpl implements LiteraryFormatService{
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
