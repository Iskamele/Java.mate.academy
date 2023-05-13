package section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.service;

import java.time.LocalDate;
import java.util.List;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.model.MovieSession;

public interface MovieSessionService {
    List<MovieSession> findAvailableSessions(Long movieId, LocalDate date);

    MovieSession get(Long id);

    MovieSession add(MovieSession session);
}
