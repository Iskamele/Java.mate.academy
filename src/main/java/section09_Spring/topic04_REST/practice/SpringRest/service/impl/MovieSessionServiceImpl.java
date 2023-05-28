package section09_Spring.topic04_REST.practice.SpringRest.service.impl;

import java.util.List;
import java.time.LocalDate;
import section09_Spring.topic04_REST.practice.SpringRest.dao.MovieSessionDao;
import section09_Spring.topic04_REST.practice.SpringRest.model.MovieSession;
import section09_Spring.topic04_REST.practice.SpringRest.service.MovieSessionService;
import org.springframework.stereotype.Service;

@Service
public class MovieSessionServiceImpl implements MovieSessionService {
    private final MovieSessionDao sessionDao;

    public MovieSessionServiceImpl(MovieSessionDao sessionDao) {
        this.sessionDao = sessionDao;
    }

    @Override
    public List<MovieSession> findAvailableSessions(Long movieId, LocalDate date) {
        return sessionDao.findAvailableSessions(movieId, date);
    }

    @Override
    public MovieSession get(Long id) {
        return sessionDao.get(id).get();
    }

    @Override
    public MovieSession add(MovieSession session) {
        return sessionDao.add(session);
    }
}
