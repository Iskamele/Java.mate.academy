package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.service;

import java.util.List;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.CinemaHall;

public interface CinemaHallService {
    CinemaHall add(CinemaHall cinemaHall);

    CinemaHall get(Long id);

    List<CinemaHall> getAll();
}
