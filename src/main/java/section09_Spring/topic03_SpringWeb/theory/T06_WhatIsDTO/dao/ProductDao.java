package section09_Spring.topic03_SpringWeb.theory.T06_WhatIsDTO.dao;

import java.util.List;
import section09_Spring.topic03_SpringWeb.theory.T06_WhatIsDTO.model.Product;

public interface ProductDao {
    Product save(Product user);

    List<Product> findAll();
}
