package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.service;

import java.util.List;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);

    List<Movie> getAll();
}
