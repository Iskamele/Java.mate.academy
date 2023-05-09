package section08_Hibernate.topic04_WorkingWithLazyInitialization.practice.HibernateCreateMovieSession.dao;

import java.util.List;
import java.util.Optional;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.practice.HibernateCreateMovieSession.model.CinemaHall;

public interface CinemaHallDao {
    CinemaHall add(CinemaHall cinemaHall);

    Optional<CinemaHall> get(Long id);

    List<CinemaHall> getAll();
}
