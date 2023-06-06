package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.dao.MovieDao;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.Movie;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.MovieService;

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
        return movieDao.get(id).orElseThrow(
                () -> new RuntimeException("Can't get movie by id " + id));
    }

    @Override
    public List<Movie> getAll() {
        return movieDao.getAll();
    }
}
