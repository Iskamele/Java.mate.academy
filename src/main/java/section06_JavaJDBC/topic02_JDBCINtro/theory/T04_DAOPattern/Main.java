package section06_JavaJDBC.topic02_JDBCINtro.theory.T04_DAOPattern;

import java.util.List;
import section06_JavaJDBC.topic02_JDBCINtro.theory.T04_DAOPattern.dao.LiteraryFormatDao;
import section06_JavaJDBC.topic02_JDBCINtro.theory.T04_DAOPattern.dao.LiteraryFormatDaoImpl;
import section06_JavaJDBC.topic02_JDBCINtro.theory.T04_DAOPattern.models.LiteraryFormat;

public class Main {
    public static void main(String[] args) {
        LiteraryFormatDao literaryFormatDao = new LiteraryFormatDaoImpl();
        List<LiteraryFormat> allFormats = literaryFormatDao.getAll();
        for (LiteraryFormat format : allFormats) {
            System.out.println(format);
        }
    }
}
