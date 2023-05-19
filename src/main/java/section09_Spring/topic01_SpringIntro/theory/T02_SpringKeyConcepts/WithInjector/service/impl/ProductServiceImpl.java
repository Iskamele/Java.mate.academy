package section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts.WithInjector.service.impl;

import section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts.WithInjector.dao.ProductDao;
import section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts.WithInjector.lib.Inject;
import section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts.WithInjector.lib.Service;
import section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts.WithInjector.model.Product;
import section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts.WithInjector.service.ProductService;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Inject
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
