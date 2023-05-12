package section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.dao;

import java.util.List;
import java.util.Optional;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.model.Movie;

public interface MovieDao {
    Movie add(Movie movie);

    Optional<Movie> get(Long id);

    List<Movie> getAll();
}
