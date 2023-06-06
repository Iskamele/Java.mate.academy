package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.dao;

import java.util.List;
import java.util.Optional;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.Movie;

public interface MovieDao {
    Movie add(Movie movie);

    Optional<Movie> get(Long id);

    List<Movie> getAll();
}
