package Hibernate.topic02_EntityRelationsAndLifeCycle.HibernateRelations.dao.impl;

import Hibernate.topic02_EntityRelationsAndLifeCycle.HibernateRelations.dao.AbstractTest;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.dao.ActorDao;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.dao.CountryDao;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.dao.MovieDao;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.dao.impl.MovieDaoImpl;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.dao.impl.ActorDaoImpl;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.dao.impl.CountryDaoImpl;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.model.Actor;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.model.Country;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.model.Movie;
import java.util.List;
import java.util.Optional;
import org.junit.Assert;
import org.junit.Test;

public class MovieDaoImplTest extends AbstractTest {
    private static final Movie shawshankRedemption = new Movie("The Shawshank Redemption");
    private static final Actor morganFreeman = new Actor("Morgan Freeman");
    private static final Country usa = new Country("USA");

    @Override
    protected Class<?>[] entities() {
        return new Class[]{Movie.class, Actor.class, Country.class};
    }

    @Test
    public void create_Ok() {
        MovieDao movieDao = new MovieDaoImpl(getSessionFactory());
        verifyCreateMovieWorks(movieDao, shawshankRedemption.clone(), 1L);
    }

    @Test
    public void getById_Ok() {
        MovieDao movieDao = new MovieDaoImpl(getSessionFactory());
        verifyCreateMovieWorks(movieDao, shawshankRedemption.clone(), 1L);
        Optional<Movie> actualOptional = movieDao.get(1L);
        Assert.assertTrue(actualOptional.isPresent());
        Movie actual = actualOptional.get();
        Assert.assertNotNull(actual);
        Assert.assertEquals(1L, actual.getId().longValue());
        Assert.assertEquals(shawshankRedemption.getTitle(), actual.getTitle());
    }

    @Test
    public void saveWithActor_ok() {
        Actor morganFreemanClone = morganFreeman.clone();
        ActorDao actorDao = new ActorDaoImpl(getSessionFactory());
        ActorDaoImplTest.verifyCreateActorWorks(actorDao, morganFreemanClone, 1L);

        MovieDao movieDao = new MovieDaoImpl(getSessionFactory());
        Movie shawshankRedemptionWithActor = shawshankRedemption.clone();
        shawshankRedemptionWithActor.setActors(List.of(morganFreemanClone));
        verifyCreateMovieWorks(movieDao, shawshankRedemptionWithActor, 1L);

        Optional<Movie> actualOptional = movieDao.get(1L);
        Assert.assertTrue(actualOptional.isPresent());
        Movie actual = actualOptional.get();
        Assert.assertNotNull(actual);
        Assert.assertEquals(1L, actual.getId().longValue());
        Assert.assertEquals(shawshankRedemption.getTitle(), actual.getTitle());
        Assert.assertNotNull(actual.getActors());
        Assert.assertEquals(1, actual.getActors().size());
        Assert.assertEquals(morganFreeman.getName(), actual.getActors().get(0).getName());
    }

    @Test
    public void saveWithActorAndCountry_ok() {
        Country usaClone = usa.clone();
        CountryDao countryDao = new CountryDaoImpl(getSessionFactory());
        CountryDaoImplTest.verifyCreateCountryWorks(countryDao, usaClone, 1L);

        Actor morganFreemanClone = morganFreeman.clone();
        morganFreemanClone.setCountry(usaClone);
        ActorDao actorDao = new ActorDaoImpl(getSessionFactory());
        ActorDaoImplTest.verifyCreateActorWorks(actorDao, morganFreemanClone, 1L);

        MovieDao movieDao = new MovieDaoImpl(getSessionFactory());
        Movie shawshankRedemptionWithActor = shawshankRedemption.clone();
        shawshankRedemptionWithActor.setActors(List.of(morganFreemanClone));
        verifyCreateMovieWorks(movieDao, shawshankRedemptionWithActor, 1L);

        Optional<Movie> actualOptional = movieDao.get(1L);
        Assert.assertTrue(actualOptional.isPresent());
        Movie actual = actualOptional.get();
        Assert.assertNotNull(actual);
        Assert.assertEquals(1L, actual.getId().longValue());
        Assert.assertEquals(shawshankRedemption.getTitle(), actual.getTitle());
        Assert.assertNotNull(actual.getActors());
        Assert.assertEquals(1, actual.getActors().size());
        Assert.assertEquals(morganFreeman.getName(), actual.getActors().get(0).getName());
        Assert.assertNotNull(actual.getActors().get(0).getCountry());
        Assert.assertEquals(1, actual.getActors().get(0).getCountry().getId().longValue());
        Assert.assertEquals(usa.getName(), actual.getActors().get(0).getCountry().getName());
    }

    @Test
    public void getByNotExistingId_Ok() {
        MovieDao movieDao = new MovieDaoImpl(getSessionFactory());
        Optional<Movie> actual = movieDao.get(100L);
        Assert.assertFalse(actual.isPresent());
    }

    private void verifyCreateMovieWorks(MovieDao movieDao, Movie movie, Long expectedId) {
        Movie actual = movieDao.add(movie);
        Assert.assertNotNull("Check you have implemented the `create` method " +
                "in the MovieDaoImpl class", actual);
        Assert.assertNotNull("ID for movie should be autogenerated", actual.getId());
        Assert.assertEquals(expectedId, actual.getId());
        Assert.assertEquals(movie.getTitle(), actual.getTitle());
    }
}
