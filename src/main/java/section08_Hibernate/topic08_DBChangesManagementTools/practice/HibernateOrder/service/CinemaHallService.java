package section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.service;

import java.util.List;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.CinemaHall;


public interface CinemaHallService {
    CinemaHall add(CinemaHall cinemaHall);

    CinemaHall get(Long id);
    
    List<CinemaHall> getAll();
}
