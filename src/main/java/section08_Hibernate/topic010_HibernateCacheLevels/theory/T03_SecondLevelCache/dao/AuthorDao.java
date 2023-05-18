package section08_Hibernate.topic010_HibernateCacheLevels.theory.T03_SecondLevelCache.dao;

import section08_Hibernate.topic010_HibernateCacheLevels.theory.T03_SecondLevelCache.model.Author;
import java.util.List;

public interface AuthorDao {
    Author save(Author author);

    Author get(Long id);

    List<Author> getAll();
}
