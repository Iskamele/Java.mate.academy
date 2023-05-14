package section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.service;

import java.time.LocalDate;
import java.util.List;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.MovieSession;


public interface MovieSessionService {
    List<MovieSession> findAvailableSessions(Long movieId, LocalDate date);

    MovieSession get(Long id);

    MovieSession add(MovieSession session);
}
