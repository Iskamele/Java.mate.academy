package section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts.WithSpring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts.WithSpring.dao.ProductDao;
import section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts.WithSpring.model.Product;
import section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts.WithSpring.service.ProductService;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public Product save(Product product) {
        return productDao.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }
}
