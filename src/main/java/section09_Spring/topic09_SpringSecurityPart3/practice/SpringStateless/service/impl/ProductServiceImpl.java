package section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.dao.ProductDao;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.Product;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductDao productDao;

    @Autowired
    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public Product save(Product product) {
        return productDao.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public void delete(Long id) {
        productDao.delete(id);
    }
}
