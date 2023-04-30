package section08_Hibernate.topic03_JPAAndCascadeTypes.practice.HibernateCascade.dao;

import java.util.List;

public interface GenericDao<T> {
    T create(T entity);

    T get(Long id);

    List<T> getAll();

    void remove(T entity);
}
