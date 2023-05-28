package section09_Spring.topic04_REST.practice.SpringRest.dao;

import java.util.List;
import java.util.Optional;
import section09_Spring.topic04_REST.practice.SpringRest.model.Movie;

public interface MovieDao extends GenericDao<Movie> {
    Optional<Movie> get(Long id);

    List<Movie> getAll();
}
