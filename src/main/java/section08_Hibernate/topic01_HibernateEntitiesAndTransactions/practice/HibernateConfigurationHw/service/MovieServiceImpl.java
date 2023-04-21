package section08_Hibernate.topic01_HibernateEntitiesAndTransactions.practice.HibernateConfigurationHw.service;

import java.util.NoSuchElementException;
import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.practice.HibernateConfigurationHw.dao.MovieDao;
import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.practice.HibernateConfigurationHw.lib.Inject;
import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.practice.HibernateConfigurationHw.lib.Service;
import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.practice.HibernateConfigurationHw.model.Movie;

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
        return movieDao.get(id).orElseThrow(() ->
                new NoSuchElementException("Can't get movie by ID: " + id));
    }
}
