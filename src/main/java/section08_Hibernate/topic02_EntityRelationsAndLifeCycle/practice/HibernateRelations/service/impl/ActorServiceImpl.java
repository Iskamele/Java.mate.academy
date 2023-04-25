package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.service.impl;

import java.util.NoSuchElementException;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.dao.ActorDao;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.model.Actor;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.service.ActorService;

public class ActorServiceImpl implements ActorService {
    private ActorDao actorDao;

    public ActorServiceImpl(ActorDao actorDao) {
        this.actorDao = actorDao;
    }

    @Override
    public Actor add(Actor actor) {
        return actorDao.add(actor);
    }

    @Override
    public Actor get(Long id) {
        return actorDao.get(id).orElseThrow(() ->
                new NoSuchElementException("Can't get actor by ID: " + id));
    }
}
