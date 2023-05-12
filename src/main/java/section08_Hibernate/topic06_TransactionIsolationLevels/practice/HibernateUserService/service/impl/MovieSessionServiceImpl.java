package section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.service.impl;

import java.time.LocalDate;
import java.util.List;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.dao.MovieSessionDao;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.lib.Inject;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.lib.Service;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.model.MovieSession;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.service.MovieSessionService;

@Service
public class MovieSessionServiceImpl implements MovieSessionService {
    @Inject
    private MovieSessionDao sessionDao;

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
