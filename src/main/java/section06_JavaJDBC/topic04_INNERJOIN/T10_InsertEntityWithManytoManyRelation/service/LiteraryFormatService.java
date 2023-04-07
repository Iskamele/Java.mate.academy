package section06_JavaJDBC.topic04_INNERJOIN.T10_InsertEntityWithManytoManyRelation.service;

import java.util.List;
import section06_JavaJDBC.topic04_INNERJOIN.T10_InsertEntityWithManytoManyRelation.model.LiteraryFormat;

public interface LiteraryFormatService {
    List<LiteraryFormat> getAll();

    LiteraryFormat create(LiteraryFormat format);

    LiteraryFormat get(Long id);

    LiteraryFormat update(LiteraryFormat format);

    boolean delete(Long id);
}
