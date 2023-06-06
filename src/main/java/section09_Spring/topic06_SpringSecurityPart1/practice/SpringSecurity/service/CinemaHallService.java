package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service;

import java.util.List;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.CinemaHall;

public interface CinemaHallService {
    CinemaHall add(CinemaHall cinemaHall);

    CinemaHall get(Long id);

    List<CinemaHall> getAll();
}
