package section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.service.impl;

import java.util.List;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.dao.CinemaHallDao;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.lib.Inject;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.lib.Service;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.model.CinemaHall;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.service.CinemaHallService;

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
