package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.service.impl;

import java.util.NoSuchElementException;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.dao.CountryDao;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.model.Country;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.service.CountryService;

public class CountryServiceImpl implements CountryService {
    private CountryDao countryDao;

    public CountryServiceImpl(CountryDao countryDao) {
        this.countryDao = countryDao;
    }

    @Override
    public Country add(Country country) {
        return countryDao.add(country);
    }

    @Override
    public Country get(Long id) {
        return countryDao.get(id).orElseThrow(() ->
                new NoSuchElementException("Can't get country by ID: " + id));
    }
}
