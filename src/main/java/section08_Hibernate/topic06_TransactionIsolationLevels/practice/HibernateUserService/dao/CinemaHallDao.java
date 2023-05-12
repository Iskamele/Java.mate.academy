package section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.dao;

import java.util.List;
import java.util.Optional;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.model.CinemaHall;

public interface CinemaHallDao {
    CinemaHall add(CinemaHall cinemaHall);

    Optional<CinemaHall> get(Long id);

    List<CinemaHall> getAll();
}
