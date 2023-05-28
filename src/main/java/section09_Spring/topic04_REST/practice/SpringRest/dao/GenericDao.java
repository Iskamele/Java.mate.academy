package section09_Spring.topic04_REST.practice.SpringRest.dao;

public interface GenericDao<T> {
    T add(T entity);
}
