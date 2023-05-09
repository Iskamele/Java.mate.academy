package section08_Hibernate.topic04_WorkingWithLazyInitialization.practice.HibernateCreateMovieSession.dao;

import java.util.List;
import java.util.Optional;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.practice.HibernateCreateMovieSession.model.Movie;

public interface MovieDao {
    Movie add(Movie movie);

    Optional<Movie> get(Long id);

    List<Movie> getAll();
}
