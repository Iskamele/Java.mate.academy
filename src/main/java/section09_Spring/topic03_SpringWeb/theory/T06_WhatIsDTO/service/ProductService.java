package section09_Spring.topic03_SpringWeb.theory.T06_WhatIsDTO.service;

import java.util.List;
import section09_Spring.topic03_SpringWeb.theory.T06_WhatIsDTO.model.Product;

public interface ProductService {
    Product save(Product user);

    List<Product> findAll();
}
