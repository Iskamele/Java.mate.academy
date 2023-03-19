package section06_JavaJDBC.topic02_JDBCINtro.theory.T11_CRUD;

import section06_JavaJDBC.topic02_JDBCINtro.theory.T11_CRUD.dao.LiteraryFormatDao;
import section06_JavaJDBC.topic02_JDBCINtro.theory.T11_CRUD.dao.LiteraryFormatDaoImpl;

public class Main {
    public static void main(String[] args) {
        LiteraryFormatDao literaryFormatDao = new LiteraryFormatDaoImpl();
        literaryFormatDao.getAll().forEach(System.out::println);
        literaryFormatDao.delete(10L);
        literaryFormatDao.getAll().forEach(System.out::println);
    }
}
