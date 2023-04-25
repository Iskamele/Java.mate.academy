package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.dao;

import java.util.Optional;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.model.Movie;

public interface MovieDao {
    Movie add(Movie movie);

    Optional<Movie> get(Long id);
}
