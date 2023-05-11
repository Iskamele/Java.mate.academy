package section08_Hibernate.topic05_CriteriaAPI.practice.HibernateCriteriaQuery.dao;

import java.util.List;
import java.util.Map;
import section08_Hibernate.topic05_CriteriaAPI.practice.HibernateCriteriaQuery.model.Phone;

public interface PhoneDao {
    Phone create(Phone phone);

    // Use CriteriaQuery for this method
    List<Phone> findAll(Map<String, String[]> params);
}
