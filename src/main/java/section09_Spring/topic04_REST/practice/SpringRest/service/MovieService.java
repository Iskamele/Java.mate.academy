package section09_Spring.topic04_REST.practice.SpringRest.service;

import java.util.List;
import section09_Spring.topic04_REST.practice.SpringRest.model.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);

    List<Movie> getAll();
}
