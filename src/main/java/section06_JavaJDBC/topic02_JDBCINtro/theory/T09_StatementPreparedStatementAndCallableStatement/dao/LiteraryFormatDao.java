package section06_JavaJDBC.topic02_JDBCINtro.theory.T09_StatementPreparedStatementAndCallableStatement.dao;

import java.util.List;
import section06_JavaJDBC.topic02_JDBCINtro.theory.T09_StatementPreparedStatementAndCallableStatement.models.LiteraryFormat;

public interface LiteraryFormatDao {
    List<LiteraryFormat> getAll();

    LiteraryFormat create(LiteraryFormat format);

    List<LiteraryFormat> createAllWithStatement(List<LiteraryFormat> formats);

    List<LiteraryFormat> createAll(List<LiteraryFormat> formats);
}
