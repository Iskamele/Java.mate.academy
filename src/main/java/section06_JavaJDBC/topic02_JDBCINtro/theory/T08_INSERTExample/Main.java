package section06_JavaJDBC.topic02_JDBCINtro.theory.T08_INSERTExample;

import section06_JavaJDBC.topic02_JDBCINtro.theory.T08_INSERTExample.dao.LiteraryFormatDao;
import section06_JavaJDBC.topic02_JDBCINtro.theory.T08_INSERTExample.dao.LiteraryFormatDaoImpl;
import section06_JavaJDBC.topic02_JDBCINtro.theory.T08_INSERTExample.models.LiteraryFormat;

public class Main {
    public static void main(String[] args) {
        LiteraryFormat format = new LiteraryFormat();
        format.setFormat("proza");
        LiteraryFormatDao literaryFormatDao = new LiteraryFormatDaoImpl();
        LiteraryFormat savedFormat = literaryFormatDao.create(format);
        System.out.println(savedFormat);

        literaryFormatDao.getAll().forEach(System.out::println);
    }
}
