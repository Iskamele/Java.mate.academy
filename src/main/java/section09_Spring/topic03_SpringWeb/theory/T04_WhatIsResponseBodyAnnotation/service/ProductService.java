package section09_Spring.topic03_SpringWeb.theory.T04_WhatIsResponseBodyAnnotation.service;

import java.util.List;
import section09_Spring.topic03_SpringWeb.theory.T04_WhatIsResponseBodyAnnotation.model.Product;

public interface ProductService {
    Product save(Product user);

    List<Product> findAll();
}
