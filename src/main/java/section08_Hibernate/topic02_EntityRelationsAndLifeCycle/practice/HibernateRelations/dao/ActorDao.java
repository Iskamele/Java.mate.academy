package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.dao;

import java.util.Optional;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.model.Actor;

public interface ActorDao {
    Actor add(Actor actor);

    Optional<Actor> get(Long id);
}
