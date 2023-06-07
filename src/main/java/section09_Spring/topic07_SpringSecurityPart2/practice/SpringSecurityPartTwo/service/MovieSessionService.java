package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service;

import java.time.LocalDate;
import java.util.List;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.MovieSession;

public interface MovieSessionService {
    List<MovieSession> findAvailableSessions(Long movieId, LocalDate date);

    MovieSession add(MovieSession session);

    MovieSession get(Long id);

    MovieSession update(MovieSession movieSession);

    void delete(Long id);
}
