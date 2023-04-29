package Slack.T05_ManytoOneDeleteExample;

import java.math.BigDecimal;
import section06_JavaJDBC.topic04_INNERJOIN.T05_ManytoOneDeleteExample.dao.BookDao;
import section06_JavaJDBC.topic04_INNERJOIN.T05_ManytoOneDeleteExample.dao.BookDaoImpl;
import section06_JavaJDBC.topic04_INNERJOIN.T05_ManytoOneDeleteExample.model.Book;
import section06_JavaJDBC.topic04_INNERJOIN.T05_ManytoOneDeleteExample.service.LiteraryFormatService;
import section06_JavaJDBC.topic04_INNERJOIN.T05_ManytoOneDeleteExample.util.Injector;

public class Main {
    private static Injector injector = Injector.getInstance("section06_JavaJDBC.topic04_INNERJOIN.T04_ManytoOneSelectExample");

    public static void main(String[] args) {
        LiteraryFormatService literaryFormatService = (LiteraryFormatService)
                injector.getInstance(LiteraryFormatService.class);
        literaryFormatService.getAll().forEach(System.out::println);

        BookDao bookDao = new BookDaoImpl();
        Book book = new Book();
        book.setTitle("Kobzar");
        book.setPrice(BigDecimal.valueOf(200));
        book.setFormat(literaryFormatService.get(3L));
        bookDao.create(book);

        bookDao.delete("Kobzar");
    }
}
