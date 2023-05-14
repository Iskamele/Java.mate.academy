package section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.service.impl;

import java.util.List;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.dao.CinemaHallDao;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.lib.Inject;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.lib.Service;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.CinemaHall;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.service.CinemaHallService;

@Service
public class CinemaHallServiceImpl implements CinemaHallService {
    @Inject
    private CinemaHallDao cinemaHallDao;

    @Override
    public CinemaHall add(CinemaHall cinemaHall) {
        return cinemaHallDao.add(cinemaHall);
    }

    @Override
    public CinemaHall get(Long id) {
        return cinemaHallDao.get(id).get();
    }

    @Override
    public List<CinemaHall> getAll() {
        return cinemaHallDao.getAll();
    }
}
