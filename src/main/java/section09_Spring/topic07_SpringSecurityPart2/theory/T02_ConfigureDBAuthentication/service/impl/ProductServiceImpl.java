package section09_Spring.topic07_SpringSecurityPart2.theory.T02_ConfigureDBAuthentication.service.impl;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import section09_Spring.topic07_SpringSecurityPart2.theory.T02_ConfigureDBAuthentication.dao.ProductDao;
import section09_Spring.topic07_SpringSecurityPart2.theory.T02_ConfigureDBAuthentication.model.Product;
import section09_Spring.topic07_SpringSecurityPart2.theory.T02_ConfigureDBAuthentication.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductDao productDao;

    @Autowired
    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public Product save(Product user) {
        return productDao.save(user);
    }

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public Product get(Long id) {
        return productDao.get(id).orElseThrow(() ->
                new NoSuchElementException("Can't find product by id: " + id));
    }

    @Override
    public List<Product> findByBrand(String brand) {
        return null;
    }

    @Override
    public void delete(Long id) {
        productDao.delete(id);
    }

    @Override
    public Product update(Product product) {
        return productDao.update(product);
    }
}
