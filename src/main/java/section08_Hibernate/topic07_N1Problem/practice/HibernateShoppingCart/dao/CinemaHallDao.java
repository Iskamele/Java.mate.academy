package section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.dao;

import java.util.List;
import java.util.Optional;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.model.CinemaHall;

public interface CinemaHallDao {
    CinemaHall add(CinemaHall cinemaHall);

    Optional<CinemaHall> get(Long id);

    List<CinemaHall> getAll();
}
