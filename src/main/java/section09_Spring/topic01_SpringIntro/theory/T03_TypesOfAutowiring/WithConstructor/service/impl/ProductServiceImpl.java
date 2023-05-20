package section09_Spring.topic01_SpringIntro.theory.T03_TypesOfAutowiring.WithConstructor.service.impl;

import org.springframework.stereotype.Service;
import section09_Spring.topic01_SpringIntro.theory.T03_TypesOfAutowiring.WithConstructor.dao.ProductDao;
import section09_Spring.topic01_SpringIntro.theory.T03_TypesOfAutowiring.WithConstructor.model.Product;
import section09_Spring.topic01_SpringIntro.theory.T03_TypesOfAutowiring.WithConstructor.service.ProductService;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductDao productDao;

    //@Autowired если есть 1 конструктор, то аннотация не нужна
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
}
