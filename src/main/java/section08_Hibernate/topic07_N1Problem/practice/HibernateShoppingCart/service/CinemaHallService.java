package section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.service;

import java.util.List;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.model.CinemaHall;

public interface CinemaHallService {
    CinemaHall add(CinemaHall cinemaHall);

    CinemaHall get(Long id);

    List<CinemaHall> getAll();
}
