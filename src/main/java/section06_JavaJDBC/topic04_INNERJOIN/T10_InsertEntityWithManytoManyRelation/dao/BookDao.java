package section06_JavaJDBC.topic04_INNERJOIN.T10_InsertEntityWithManytoManyRelation.dao;

import section06_JavaJDBC.topic04_INNERJOIN.T10_InsertEntityWithManytoManyRelation.model.Book;

public interface BookDao {
    Book create(Book book);

    Book get(Long id);

    boolean delete(String title);
}
