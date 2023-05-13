package section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.service.impl;

import java.util.List;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.dao.MovieDao;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.lib.Inject;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.lib.Service;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.model.Movie;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao movieDao;

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).get();
    }

    @Override
    public List<Movie> getAll() {
        return movieDao.getAll();
    }
}
