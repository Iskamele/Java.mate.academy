package section06_JavaJDBC.topic04_INNERJOIN.T11_DeleteAndUpdateEntityWithManytoMany;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import section06_JavaJDBC.topic04_INNERJOIN.T11_DeleteAndUpdateEntityWithManytoMany.model.Author;
import section06_JavaJDBC.topic04_INNERJOIN.T11_DeleteAndUpdateEntityWithManytoMany.model.Book;
import section06_JavaJDBC.topic04_INNERJOIN.T11_DeleteAndUpdateEntityWithManytoMany.model.LiteraryFormat;
import section06_JavaJDBC.topic04_INNERJOIN.T11_DeleteAndUpdateEntityWithManytoMany.service.BookService;
import section06_JavaJDBC.topic04_INNERJOIN.T11_DeleteAndUpdateEntityWithManytoMany.service.LiteraryFormatService;
import section06_JavaJDBC.topic04_INNERJOIN.T11_DeleteAndUpdateEntityWithManytoMany.util.Injector;

public class Main {
    private static Injector injector = Injector.getInstance("section06_JavaJDBC.topic04_INNERJOIN.T11_DeleteAndUpdateEntityWithManytoMany");

    public static void main(String[] args) {
        LiteraryFormatService literaryFormatService = (LiteraryFormatService) injector.getInstance(LiteraryFormatService.class);

        BookService bookService = (BookService) injector.getInstance(BookService.class);

        Author max = new Author();
        max.setFirstName("Max");
        max.setLastName("Duchovny");
        max.setId(4L);

        Author ellie = new Author();
        ellie.setFirstName("Ellie");
        ellie.setLastName("Righter");
        ellie.setId(5L);

        List<Author> authors = new ArrayList<>();
        authors.add(max);
        authors.add(ellie);

        LiteraryFormat literaryFormat = new LiteraryFormat();
        literaryFormat.setId(13L);
        literaryFormat.setFormat("education");

        Book book = new Book();
        book.setTitle("Chemistry");
        book.setPrice(BigDecimal.valueOf(300));
        book.setAuthors(authors);
        book.setFormat(literaryFormat);

        Author taras = new Author();
        taras.setFirstName("Taras");
        taras.setLastName("Shevchenko");
        taras.setId(1L);

        Author olena = new Author();
        olena.setFirstName("Olena");
        olena.setLastName("Ivanova");
        olena.setId(2L);

        List<Author> updateAuthors = new ArrayList<>();
        updateAuthors.add(taras);
        updateAuthors.add(olena);

        LiteraryFormat literaryFormatTrash = literaryFormatService.get(14L);

        Book updateBook = new Book();
        updateBook.setId(10L);
        updateBook.setTitle("Bashorg trash");
        updateBook.setPrice(BigDecimal.valueOf(10));
        updateBook.setAuthors(updateAuthors);
        updateBook.setFormat(literaryFormatTrash);

        bookService.update(updateBook);
    }
}
