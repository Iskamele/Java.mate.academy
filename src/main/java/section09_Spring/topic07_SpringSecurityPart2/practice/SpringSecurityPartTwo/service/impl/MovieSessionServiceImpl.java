package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.impl;

import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dao.MovieSessionDao;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.MovieSession;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.MovieSessionService;

@Service
public class MovieSessionServiceImpl implements MovieSessionService {
    private final MovieSessionDao movieSessionDao;

    public MovieSessionServiceImpl(MovieSessionDao movieSessionDao) {
        this.movieSessionDao = movieSessionDao;
    }

    @Override
    public List<MovieSession> findAvailableSessions(Long movieId, LocalDate date) {
        return movieSessionDao.findAvailableSessions(movieId, date);
    }

    @Override
    public MovieSession add(MovieSession session) {
        return movieSessionDao.add(session);
    }

    @Override
    public MovieSession get(Long id) {
        return movieSessionDao.get(id).orElseThrow(
                () -> new RuntimeException("Session with id " + id + " not found"));
    }

    @Override
    public MovieSession update(MovieSession movieSession) {
        return movieSessionDao.update(movieSession);
    }

    @Override
    public void delete(Long id) {
        movieSessionDao.delete(id);
    }
}
