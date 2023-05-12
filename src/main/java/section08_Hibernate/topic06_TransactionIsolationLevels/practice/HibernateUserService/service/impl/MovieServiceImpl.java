package section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.service.impl;

import java.util.List;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.dao.MovieDao;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.lib.Inject;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.lib.Service;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.model.Movie;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.service.MovieService;

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
