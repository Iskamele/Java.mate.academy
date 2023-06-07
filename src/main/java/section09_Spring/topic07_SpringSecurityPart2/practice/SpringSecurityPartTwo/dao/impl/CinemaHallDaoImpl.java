package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dao.AbstractDao;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dao.CinemaHallDao;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.CinemaHall;

@Repository
public class CinemaHallDaoImpl extends AbstractDao<CinemaHall> implements CinemaHallDao {
    public CinemaHallDaoImpl(SessionFactory factory) {
        super(factory, CinemaHall.class);
    }
}
