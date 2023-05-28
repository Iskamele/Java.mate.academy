package section09_Spring.topic04_REST.practice.SpringRest.dao;

import java.util.List;
import java.util.Optional;
import section09_Spring.topic04_REST.practice.SpringRest.model.CinemaHall;

public interface CinemaHallDao extends GenericDao<CinemaHall> {
    Optional<CinemaHall> get(Long id);

    List<CinemaHall> getAll();
}
