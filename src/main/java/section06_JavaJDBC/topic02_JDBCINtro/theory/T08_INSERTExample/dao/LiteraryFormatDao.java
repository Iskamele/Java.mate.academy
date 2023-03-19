package section06_JavaJDBC.topic02_JDBCINtro.theory.T08_INSERTExample.dao;

import java.util.List;
import section06_JavaJDBC.topic02_JDBCINtro.theory.T08_INSERTExample.models.LiteraryFormat;

public interface LiteraryFormatDao {
    List<LiteraryFormat> getAll();

    LiteraryFormat create(LiteraryFormat format);
}
