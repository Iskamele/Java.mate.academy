package section08_Hibernate.topic07_N1Problem.theory.T02_NProblem.dao;

import java.util.List;
import section08_Hibernate.topic07_N1Problem.theory.T02_NProblem.model.Author;

public interface AuthorDao {
    Author save(Author author);

    Author get(Long id);

    List<Author> getAll();
}
