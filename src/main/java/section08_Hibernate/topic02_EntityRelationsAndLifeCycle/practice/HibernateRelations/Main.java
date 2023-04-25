package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations;

import java.util.List;
import org.hibernate.SessionFactory;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.dao.impl.ActorDaoImpl;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.dao.impl.CountryDaoImpl;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.dao.impl.MovieDaoImpl;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.model.Actor;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.model.Country;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.model.Movie;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.service.ActorService;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.service.CountryService;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.service.MovieService;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.service.impl.ActorServiceImpl;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.service.impl.CountryServiceImpl;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.service.impl.MovieServiceImpl;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.util.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        // use this session factory when you will initialize service instances
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Country usa = new Country("USA");
        CountryService countryService = new CountryServiceImpl(new CountryDaoImpl(sessionFactory));
        countryService.add(usa);

        Actor vinDiesel = new Actor("Vin Diesel");
        vinDiesel.setCountry(usa);
        ActorService actorService = new ActorServiceImpl(new ActorDaoImpl(sessionFactory));
        actorService.add(vinDiesel);

        Movie fastAndFurious = new Movie("Fast and Furious");
        fastAndFurious.setActors(List.of(vinDiesel));
        MovieService movieService = new MovieServiceImpl(new MovieDaoImpl(sessionFactory));
        movieService.add(fastAndFurious);
        System.out.println(movieService.get(fastAndFurious.getId()));
    }
}
