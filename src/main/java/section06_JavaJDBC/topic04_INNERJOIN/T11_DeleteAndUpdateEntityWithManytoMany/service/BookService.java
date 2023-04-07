package section06_JavaJDBC.topic04_INNERJOIN.T11_DeleteAndUpdateEntityWithManytoMany.service;

import java.util.List;
import section06_JavaJDBC.topic04_INNERJOIN.T11_DeleteAndUpdateEntityWithManytoMany.model.Book;

public interface BookService {
    List<Book> getAll();

    Book create(Book book);

    Book get(Long id);

    Book update(Book book);

    boolean delete(Long id);
}
