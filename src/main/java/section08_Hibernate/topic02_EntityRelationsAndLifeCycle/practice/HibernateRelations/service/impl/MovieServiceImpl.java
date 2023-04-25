package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.service.impl;

import java.util.NoSuchElementException;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.dao.MovieDao;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.model.Movie;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.service.MovieService;

public class MovieServiceImpl implements MovieService {
    private MovieDao movieDao;

    public MovieServiceImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

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
