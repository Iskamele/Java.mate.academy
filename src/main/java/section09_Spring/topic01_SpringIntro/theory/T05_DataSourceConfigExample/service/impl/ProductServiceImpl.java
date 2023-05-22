package section09_Spring.topic01_SpringIntro.theory.T05_DataSourceConfigExample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import section09_Spring.topic01_SpringIntro.theory.T05_DataSourceConfigExample.dao.ProductDao;
import section09_Spring.topic01_SpringIntro.theory.T05_DataSourceConfigExample.model.Product;
import section09_Spring.topic01_SpringIntro.theory.T05_DataSourceConfigExample.service.ProductService;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductDao productDao;

    @Autowired
    public void setProductDao(ProductDao productDao) {
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
