package section06_JavaJDBC.topic04_INNERJOIN.T03_ManytoOneInsertExample.dao;

import section06_JavaJDBC.topic04_INNERJOIN.T03_ManytoOneInsertExample.model.Book;

public interface BookDao {
    Book create(Book book);
}
