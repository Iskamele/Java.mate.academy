package section06_JavaJDBC.topic02_JDBCINtro.theory.T10_DELETEExample.dao;

import java.util.List;
import section06_JavaJDBC.topic02_JDBCINtro.theory.T10_DELETEExample.models.LiteraryFormat;

public interface LiteraryFormatDao {
    List<LiteraryFormat> getAll();

    LiteraryFormat create(LiteraryFormat format);

    boolean delete(Long id);
}
