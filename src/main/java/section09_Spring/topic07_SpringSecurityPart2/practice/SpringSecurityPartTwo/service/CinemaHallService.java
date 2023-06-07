package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service;

import java.util.List;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.CinemaHall;

public interface CinemaHallService {
    CinemaHall add(CinemaHall cinemaHall);

    CinemaHall get(Long id);

    List<CinemaHall> getAll();
}
