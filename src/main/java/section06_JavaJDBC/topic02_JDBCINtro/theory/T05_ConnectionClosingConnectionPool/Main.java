package section06_JavaJDBC.topic02_JDBCINtro.theory.T05_ConnectionClosingConnectionPool;

import java.util.List;
import section06_JavaJDBC.topic02_JDBCINtro.theory.T05_ConnectionClosingConnectionPool.dao.LiteraryFormatDao;
import section06_JavaJDBC.topic02_JDBCINtro.theory.T05_ConnectionClosingConnectionPool.dao.LiteraryFormatDaoImpl;
import section06_JavaJDBC.topic02_JDBCINtro.theory.T05_ConnectionClosingConnectionPool.models.LiteraryFormat;

public class Main {
    public static void main(String[] args) {
        LiteraryFormatDao literaryFormatDao = new LiteraryFormatDaoImpl();
        List<LiteraryFormat> allFormats = literaryFormatDao.getAll();
        for (LiteraryFormat format : allFormats) {
            System.out.println(format);
        }
    }
}
