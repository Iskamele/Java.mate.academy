package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.service.impl;

import java.util.List;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.dao.CinemaHallDao;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.CinemaHall;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.service.CinemaHallService;
import org.springframework.stereotype.Service;

@Service
public class CinemaHallServiceImpl implements CinemaHallService {
    private final CinemaHallDao cinemaHallDao;

    public CinemaHallServiceImpl(CinemaHallDao cinemaHallDao) {
        this.cinemaHallDao = cinemaHallDao;
    }

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
