package section09_Spring.topic04_REST.theory.T02_RequestBodyAndPostman.service.impl;

import java.util.List;
import java.util.NoSuchElementException;
import section09_Spring.topic04_REST.theory.T02_RequestBodyAndPostman.dao.ProductDao;
import section09_Spring.topic04_REST.theory.T02_RequestBodyAndPostman.model.Product;
import section09_Spring.topic04_REST.theory.T02_RequestBodyAndPostman.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
