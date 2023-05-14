package section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.service.impl;

import java.time.LocalDate;
import java.util.List;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.dao.MovieSessionDao;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.lib.Inject;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.lib.Service;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.MovieSession;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.service.MovieSessionService;

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
