package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.MovieSession;

public interface MovieSessionDao {
    MovieSession add(MovieSession movieSession);

    Optional<MovieSession> get(Long id);

    List<MovieSession> findAvailableSessions(Long movieId, LocalDate date);

    MovieSession update(MovieSession movieSession);

    void delete(Long id);
}
