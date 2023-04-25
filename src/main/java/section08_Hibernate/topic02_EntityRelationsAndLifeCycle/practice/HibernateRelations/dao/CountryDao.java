package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.dao;

import java.util.Optional;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.model.Country;

public interface CountryDao {
    Country add(Country country);

    Optional<Country> get(Long id);
}
