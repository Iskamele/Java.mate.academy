package section06_JavaJDBC.topic04_INNERJOIN.T03_ManytoOneInsertExample.service;

import java.util.List;
import section06_JavaJDBC.topic04_INNERJOIN.T03_ManytoOneInsertExample.model.LiteraryFormat;

public interface LiteraryFormatService {
    List<LiteraryFormat> getAll();

    LiteraryFormat create(LiteraryFormat format);

    LiteraryFormat get(Long id);

    LiteraryFormat update(LiteraryFormat format);

    boolean delete(Long id);
}
