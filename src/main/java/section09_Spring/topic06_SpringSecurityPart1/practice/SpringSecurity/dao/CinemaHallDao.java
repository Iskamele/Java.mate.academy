package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.dao;

import java.util.List;
import java.util.Optional;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.CinemaHall;

public interface CinemaHallDao {
    CinemaHall add(CinemaHall cinemaHall);

    Optional<CinemaHall> get(Long id);

    List<CinemaHall> getAll();
}
