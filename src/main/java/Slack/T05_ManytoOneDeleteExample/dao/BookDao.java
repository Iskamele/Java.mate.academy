package Slack.T05_ManytoOneDeleteExample.dao;

import java.util.Optional;
import section06_JavaJDBC.topic04_INNERJOIN.T05_ManytoOneDeleteExample.model.Book;

public interface BookDao {
    Book create(Book book);

    Optional<Book> get(Long id);

    boolean delete(String title);
}
