package section06_JavaJDBC.topic04_INNERJOIN.T09_GetEntitiesWithManytoManyRelation;

import section06_JavaJDBC.topic04_INNERJOIN.T09_GetEntitiesWithManytoManyRelation.dao.BookDao;
import section06_JavaJDBC.topic04_INNERJOIN.T09_GetEntitiesWithManytoManyRelation.dao.BookDaoImpl;
import section06_JavaJDBC.topic04_INNERJOIN.T09_GetEntitiesWithManytoManyRelation.model.Book;
import section06_JavaJDBC.topic04_INNERJOIN.T09_GetEntitiesWithManytoManyRelation.service.LiteraryFormatService;
import section06_JavaJDBC.topic04_INNERJOIN.T09_GetEntitiesWithManytoManyRelation.util.Injector;

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
