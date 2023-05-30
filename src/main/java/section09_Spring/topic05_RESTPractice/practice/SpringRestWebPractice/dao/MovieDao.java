package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.dao;

import java.util.List;
import java.util.Optional;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.Movie;

public interface MovieDao extends GenericDao<Movie> {
    Optional<Movie> get(Long id);

    List<Movie> getAll();
}
