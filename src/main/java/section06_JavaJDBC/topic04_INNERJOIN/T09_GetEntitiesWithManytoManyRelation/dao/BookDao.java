package section06_JavaJDBC.topic04_INNERJOIN.T09_GetEntitiesWithManytoManyRelation.dao;

import section06_JavaJDBC.topic04_INNERJOIN.T09_GetEntitiesWithManytoManyRelation.model.Book;

public interface BookDao {
    Book create(Book book);

    Book get(Long id);

    boolean delete(String title);
}
