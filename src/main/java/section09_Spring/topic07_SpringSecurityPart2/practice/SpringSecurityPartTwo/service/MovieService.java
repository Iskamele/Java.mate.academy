package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service;

import java.util.List;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);

    List<Movie> getAll();
}
