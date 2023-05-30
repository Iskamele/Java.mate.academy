package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.service;

import java.time.LocalDate;
import java.util.List;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.MovieSession;

public interface MovieSessionService {
    List<MovieSession> findAvailableSessions(Long movieId, LocalDate date);

    MovieSession get(Long id);

    MovieSession add(MovieSession session);

    MovieSession update(MovieSession movieSession);

    boolean remove(Long id);
}
