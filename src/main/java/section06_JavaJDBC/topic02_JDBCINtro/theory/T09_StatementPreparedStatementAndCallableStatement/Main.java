package section06_JavaJDBC.topic02_JDBCINtro.theory.T09_StatementPreparedStatementAndCallableStatement;

import java.util.ArrayList;
import java.util.List;
import section06_JavaJDBC.topic02_JDBCINtro.theory.T09_StatementPreparedStatementAndCallableStatement.dao.LiteraryFormatDao;
import section06_JavaJDBC.topic02_JDBCINtro.theory.T09_StatementPreparedStatementAndCallableStatement.dao.LiteraryFormatDaoImpl;
import section06_JavaJDBC.topic02_JDBCINtro.theory.T09_StatementPreparedStatementAndCallableStatement.models.LiteraryFormat;

public class Main {
    public static void main(String[] args) {
        LiteraryFormatDao literaryFormatDao = new LiteraryFormatDaoImpl();

        System.out.println("With original statement:");
        long originalStatementStart = System.currentTimeMillis();
        List<LiteraryFormat> allWithStatement = literaryFormatDao
                .createAllWithStatement(getRandomGeneratedFormats());
        long originalStatementEnd = System.currentTimeMillis();
        long originalDiff = originalStatementEnd - originalStatementStart;
        System.out.println("Created " + allWithStatement.size() + " new items. Time: " + originalDiff);

        System.out.println("With prepared statement:");
        long preparedStatementStart = System.currentTimeMillis();
        List<LiteraryFormat> all = literaryFormatDao
                .createAll(getRandomGeneratedFormats());
        long preparedStatementEnd = System.currentTimeMillis();
        long diff = preparedStatementEnd - preparedStatementStart;
        System.out.println("Created " + all.size() + " new items. Time: " + diff);
    }

    private static List<LiteraryFormat> getRandomGeneratedFormats() {
        List<LiteraryFormat> formats = new ArrayList<>(50_000);
        for (int i = 0; i < 50_000; i++) {
            formats.add(new LiteraryFormat("Format #" + i));
        }
        return formats;
    }
}
