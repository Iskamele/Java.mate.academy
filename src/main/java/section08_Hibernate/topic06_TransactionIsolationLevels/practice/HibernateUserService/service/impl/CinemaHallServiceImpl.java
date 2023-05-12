package section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.service.impl;

import java.util.List;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.dao.CinemaHallDao;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.lib.Inject;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.lib.Service;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.model.CinemaHall;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.service.CinemaHallService;

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
