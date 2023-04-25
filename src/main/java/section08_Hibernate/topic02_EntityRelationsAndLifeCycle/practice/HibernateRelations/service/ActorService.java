package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.service;

import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.model.Actor;

public interface ActorService {
    Actor add(Actor actor);

    Actor get(Long id);
}
