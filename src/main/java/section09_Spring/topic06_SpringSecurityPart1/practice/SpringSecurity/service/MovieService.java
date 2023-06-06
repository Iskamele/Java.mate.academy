package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service;

import java.util.List;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);

    List<Movie> getAll();
}
