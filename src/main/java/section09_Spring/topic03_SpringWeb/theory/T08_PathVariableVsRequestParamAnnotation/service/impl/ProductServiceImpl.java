package section09_Spring.topic03_SpringWeb.theory.T08_PathVariableVsRequestParamAnnotation.service.impl;

import java.util.List;
import java.util.NoSuchElementException;
import section09_Spring.topic03_SpringWeb.theory.T08_PathVariableVsRequestParamAnnotation.dao.ProductDao;
import section09_Spring.topic03_SpringWeb.theory.T08_PathVariableVsRequestParamAnnotation.model.Product;
import section09_Spring.topic03_SpringWeb.theory.T08_PathVariableVsRequestParamAnnotation.service.ProductService;
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
