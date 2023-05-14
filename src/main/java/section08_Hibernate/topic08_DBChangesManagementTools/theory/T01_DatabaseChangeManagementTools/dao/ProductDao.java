package section08_Hibernate.topic08_DBChangesManagementTools.theory.T01_DatabaseChangeManagementTools.dao;

import java.util.List;
import section08_Hibernate.topic08_DBChangesManagementTools.theory.T01_DatabaseChangeManagementTools.model.Product;

public interface ProductDao {
    Product save(Product product);

    Product get(Long id);

    List<Product> findAll();
}
