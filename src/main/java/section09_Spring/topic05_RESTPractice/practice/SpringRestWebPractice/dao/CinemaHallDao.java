package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.dao;

import java.util.List;
import java.util.Optional;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.CinemaHall;

public interface CinemaHallDao extends GenericDao<CinemaHall> {
    Optional<CinemaHall> get(Long id);

    List<CinemaHall> getAll();
}
