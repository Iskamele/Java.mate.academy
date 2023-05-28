package section09_Spring.topic04_REST.practice.SpringRest.service.impl;

import java.util.List;
import section09_Spring.topic04_REST.practice.SpringRest.dao.MovieDao;
import section09_Spring.topic04_REST.practice.SpringRest.model.Movie;
import section09_Spring.topic04_REST.practice.SpringRest.service.MovieService;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieDao movieDao;

    public MovieServiceImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).get();
    }

    @Override
    public List<Movie> getAll() {
        return movieDao.getAll();
    }
}
