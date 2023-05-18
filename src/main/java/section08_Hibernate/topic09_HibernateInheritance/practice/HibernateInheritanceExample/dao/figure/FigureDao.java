package section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.figure;

import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.model.figure.Figure;
import java.util.List;

public interface FigureDao<T extends Figure> {
    T save(T figure);

    List<T> findByColor(String color, Class<T> clazz);
}
