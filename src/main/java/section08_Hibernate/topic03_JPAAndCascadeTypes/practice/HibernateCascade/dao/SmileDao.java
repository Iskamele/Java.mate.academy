package section08_Hibernate.topic03_JPAAndCascadeTypes.practice.HibernateCascade.dao;

import section08_Hibernate.topic03_JPAAndCascadeTypes.practice.HibernateCascade.model.Smile;
import java.util.List;

public interface SmileDao {
    Smile create(Smile smile);

    Smile get(Long id);

    List<Smile> getAll();
}
