package section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.service;

import java.util.List;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.model.CinemaHall;

public interface CinemaHallService {
    CinemaHall add(CinemaHall cinemaHall);

    CinemaHall get(Long id);
    
    List<CinemaHall> getAll();
}
