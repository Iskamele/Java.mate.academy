package section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.animal;

import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.model.zoo.Animal;
import java.util.List;

public interface AnimalDao {
    Animal save(Animal animal);

    List<Animal> findByNameFirstLetter(Character character);
}
