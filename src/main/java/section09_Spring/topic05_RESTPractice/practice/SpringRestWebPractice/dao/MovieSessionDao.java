package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.MovieSession;

public interface MovieSessionDao extends GenericDao<MovieSession> {
    List<MovieSession> findAvailableSessions(Long movieId, LocalDate date);

    Optional<MovieSession> get(Long id);

    MovieSession update(MovieSession movieSession);

    boolean remove(Long id);
}
