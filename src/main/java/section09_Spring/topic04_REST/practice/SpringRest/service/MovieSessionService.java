package section09_Spring.topic04_REST.practice.SpringRest.service;

import java.util.List;
import java.time.LocalDate;
import section09_Spring.topic04_REST.practice.SpringRest.model.MovieSession;

public interface MovieSessionService {
    List<MovieSession> findAvailableSessions(Long movieId, LocalDate date);

    MovieSession get(Long id);

    MovieSession add(MovieSession session);
}
