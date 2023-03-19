package section06_JavaJDBC.topic02_JDBCINtro.theory.T05_ConnectionClosingConnectionPool.dao;

import java.util.List;
import section06_JavaJDBC.topic02_JDBCINtro.theory.T05_ConnectionClosingConnectionPool.models.LiteraryFormat;

public interface LiteraryFormatDao {
    List<LiteraryFormat> getAll();
}
