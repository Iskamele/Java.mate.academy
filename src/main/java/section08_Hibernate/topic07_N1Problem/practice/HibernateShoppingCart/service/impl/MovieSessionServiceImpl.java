package section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.service.impl;

import java.time.LocalDate;
import java.util.List;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.dao.MovieSessionDao;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.lib.Inject;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.lib.Service;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.model.MovieSession;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.service.MovieSessionService;

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
