package section06_JavaJDBC.topic02_JDBCINtro.theory.T11_CRUD.dao;

import java.util.List;
import section06_JavaJDBC.topic02_JDBCINtro.theory.T11_CRUD.models.LiteraryFormat;

// CRUD
public interface LiteraryFormatDao {
    List<LiteraryFormat> getAll();

    LiteraryFormat create(LiteraryFormat format);

    LiteraryFormat get(Long id);

    LiteraryFormat update(LiteraryFormat format);

    boolean delete(Long id);
}
