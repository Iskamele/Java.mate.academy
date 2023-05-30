package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.dao;

public interface GenericDao<T> {
    T add(T entity);
}
