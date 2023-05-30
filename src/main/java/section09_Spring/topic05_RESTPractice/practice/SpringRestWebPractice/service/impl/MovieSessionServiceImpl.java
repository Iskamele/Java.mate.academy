package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.service.impl;

import java.time.LocalDate;
import java.util.List;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.dao.MovieSessionDao;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.MovieSession;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.service.MovieSessionService;
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

    @Override
    public MovieSession update(MovieSession movieSession) {
        return sessionDao.update(movieSession);
    }

    @Override
    public boolean remove(Long id) {
        return sessionDao.remove(id);
    }
}
