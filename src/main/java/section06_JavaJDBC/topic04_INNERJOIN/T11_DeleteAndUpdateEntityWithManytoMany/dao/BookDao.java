package section06_JavaJDBC.topic04_INNERJOIN.T11_DeleteAndUpdateEntityWithManytoMany.dao;

import java.util.List;
import java.util.Optional;
import section06_JavaJDBC.topic04_INNERJOIN.T11_DeleteAndUpdateEntityWithManytoMany.model.Book;

public interface BookDao {
    List<Book> getAll();

    Book create(Book book);

    Optional<Book> get(Long id);

    Book update(Book book);

    boolean delete(Long bookId);
}
