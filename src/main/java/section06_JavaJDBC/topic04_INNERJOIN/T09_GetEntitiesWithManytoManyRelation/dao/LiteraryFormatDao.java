package section06_JavaJDBC.topic04_INNERJOIN.T09_GetEntitiesWithManytoManyRelation.dao;

import java.util.List;
import java.util.Optional;
import section06_JavaJDBC.topic04_INNERJOIN.T09_GetEntitiesWithManytoManyRelation.model.LiteraryFormat;

public interface LiteraryFormatDao {
    List<LiteraryFormat> getAll();

    LiteraryFormat create(LiteraryFormat format);

    Optional<LiteraryFormat> get(Long id);

    LiteraryFormat update(LiteraryFormat format);

    boolean delete(Long id);
}
