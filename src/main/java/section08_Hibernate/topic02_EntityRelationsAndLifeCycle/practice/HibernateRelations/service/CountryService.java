package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.service;

import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.model.Country;

public interface CountryService {
    Country add(Country country);

    Country get(Long id);
}
