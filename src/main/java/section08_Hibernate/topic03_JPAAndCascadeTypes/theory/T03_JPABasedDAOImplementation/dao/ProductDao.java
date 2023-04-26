package section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T03_JPABasedDAOImplementation.dao;

import section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T03_JPABasedDAOImplementation.model.Product;

public interface ProductDao {
    Product save(Product product);

    Product get(Long id);

    Product remove(Product product);
}
