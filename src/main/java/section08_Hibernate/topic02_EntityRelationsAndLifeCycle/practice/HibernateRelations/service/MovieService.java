package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.service;

import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.model.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);
}
