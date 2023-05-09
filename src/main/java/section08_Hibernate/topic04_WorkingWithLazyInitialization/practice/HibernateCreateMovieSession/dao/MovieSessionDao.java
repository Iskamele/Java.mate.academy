package section08_Hibernate.topic04_WorkingWithLazyInitialization.practice.HibernateCreateMovieSession.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.practice.HibernateCreateMovieSession.model.MovieSession;

public interface MovieSessionDao {
    MovieSession add(MovieSession movieSession);

    Optional<MovieSession> get(Long id);

    List<MovieSession> findAvailableSessions(Long movieId, LocalDate date);
}
