package section06_JavaJDBC.topic04_INNERJOIN.T04_ManytoOneSelectExample.dao;

import java.util.Optional;
import section06_JavaJDBC.topic04_INNERJOIN.T04_ManytoOneSelectExample.model.Book;

public interface BookDao {
    Book create(Book book);

    Optional<Book> get(Long id);
}
