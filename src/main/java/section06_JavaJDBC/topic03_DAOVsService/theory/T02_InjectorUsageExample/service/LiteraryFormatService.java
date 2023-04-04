package section06_JavaJDBC.topic03_DAOVsService.theory.T02_InjectorUsageExample.service;

import java.util.List;
import java.util.Optional;
import section06_JavaJDBC.topic03_DAOVsService.theory.T02_InjectorUsageExample.model.LiteraryFormat;

public interface LiteraryFormatService {
    List<LiteraryFormat> getAll();

    LiteraryFormat create(LiteraryFormat format);

    Optional<LiteraryFormat> get(Long id);

    LiteraryFormat update(LiteraryFormat format);

    boolean delete(Long id);
}
