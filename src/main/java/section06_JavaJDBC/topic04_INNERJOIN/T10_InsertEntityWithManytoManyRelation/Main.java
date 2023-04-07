package section06_JavaJDBC.topic04_INNERJOIN.T10_InsertEntityWithManytoManyRelation;

import section06_JavaJDBC.topic04_INNERJOIN.T10_InsertEntityWithManytoManyRelation.dao.BookDao;
import section06_JavaJDBC.topic04_INNERJOIN.T10_InsertEntityWithManytoManyRelation.dao.BookDaoImpl;
import section06_JavaJDBC.topic04_INNERJOIN.T10_InsertEntityWithManytoManyRelation.model.Book;
import section06_JavaJDBC.topic04_INNERJOIN.T10_InsertEntityWithManytoManyRelation.service.LiteraryFormatService;
import section06_JavaJDBC.topic04_INNERJOIN.T10_InsertEntityWithManytoManyRelation.util.Injector;

public class Main {
    private static Injector injector = Injector.getInstance("section06_JavaJDBC.topic04_INNERJOIN.T09_GetEntitiesWithManytoManyRelation");

    public static void main(String[] args) {
        LiteraryFormatService literaryFormatService = (LiteraryFormatService)
                injector.getInstance(LiteraryFormatService.class);

        BookDao bookDao = new BookDaoImpl();
        Book book = bookDao.get(2L);
        System.out.println(book);
    }
}
