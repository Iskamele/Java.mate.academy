package section06_JavaJDBC.topic02_JDBCINtro.theory.T10_DELETEExample;

import section06_JavaJDBC.topic02_JDBCINtro.theory.T10_DELETEExample.dao.LiteraryFormatDao;
import section06_JavaJDBC.topic02_JDBCINtro.theory.T10_DELETEExample.dao.LiteraryFormatDaoImpl;

public class Main {
    public static void main(String[] args) {
        LiteraryFormatDao literaryFormatDao = new LiteraryFormatDaoImpl();
        literaryFormatDao.getAll().forEach(System.out::println);
        literaryFormatDao.delete(10L);
        literaryFormatDao.getAll().forEach(System.out::println);
    }
}
