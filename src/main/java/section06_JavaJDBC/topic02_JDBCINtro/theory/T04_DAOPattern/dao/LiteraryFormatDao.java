package section06_JavaJDBC.topic02_JDBCINtro.theory.T04_DAOPattern.dao;

import java.util.List;
import section06_JavaJDBC.topic02_JDBCINtro.theory.T04_DAOPattern.models.LiteraryFormat;

public interface LiteraryFormatDao {
    List<LiteraryFormat> getAll();
}
