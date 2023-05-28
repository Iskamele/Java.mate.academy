package section09_Spring.topic04_REST.practice.SpringRest.service;

import java.util.List;
import section09_Spring.topic04_REST.practice.SpringRest.model.CinemaHall;

public interface CinemaHallService {
    CinemaHall add(CinemaHall cinemaHall);

    CinemaHall get(Long id);

    List<CinemaHall> getAll();
}
