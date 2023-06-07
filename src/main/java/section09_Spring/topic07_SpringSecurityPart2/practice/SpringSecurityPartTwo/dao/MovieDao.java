package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dao;

import java.util.List;
import java.util.Optional;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.Movie;

public interface MovieDao {
    Movie add(Movie movie);

    Optional<Movie> get(Long id);

    List<Movie> getAll();
}
