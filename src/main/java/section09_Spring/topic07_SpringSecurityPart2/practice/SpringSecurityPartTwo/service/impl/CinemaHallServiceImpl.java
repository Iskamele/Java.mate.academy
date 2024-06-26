package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dao.CinemaHallDao;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.CinemaHall;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.CinemaHallService;

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
        return cinemaHallDao.get(id).orElseThrow(
                () -> new RuntimeException("Can't get cinema hall by id " + id));
    }

    @Override
    public List<CinemaHall> getAll() {
        return cinemaHallDao.getAll();
    }
}
