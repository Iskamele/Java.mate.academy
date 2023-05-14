package section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.service.impl;

import java.util.List;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.dao.MovieDao;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.lib.Inject;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.lib.Service;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.Movie;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.service.MovieService;


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
