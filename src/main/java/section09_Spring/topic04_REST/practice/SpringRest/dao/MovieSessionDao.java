package section09_Spring.topic04_REST.practice.SpringRest.dao;

import java.util.List;
import java.util.Optional;
import java.time.LocalDate;
import section09_Spring.topic04_REST.practice.SpringRest.model.MovieSession;

public interface MovieSessionDao extends GenericDao<MovieSession> {
    List<MovieSession> findAvailableSessions(Long movieId, LocalDate date);

    Optional<MovieSession> get(Long id);

    MovieSession update(MovieSession movieSession);

    void delete(Long id);
}
