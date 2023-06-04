package section09_Spring.topic06_SpringSecurityPart1.theory.T05_ObtainInformationAboutCurrentUser.service;

import java.util.List;
import section09_Spring.topic06_SpringSecurityPart1.theory.T02_StartSecurityConfiguration.model.Product;

public interface ProductService {
    Product save(Product user);

    List<Product> findAll();

    Product get(Long id);

    List<Product> findByBrand(String brand);

    void delete(Long id);

    Product update(Product product);
}
