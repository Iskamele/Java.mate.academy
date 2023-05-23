package section09_Spring.topic02_BeanLifeCycle.theory.T01_BeanLifecycle.service.impl;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import section09_Spring.topic02_BeanLifeCycle.theory.T01_BeanLifecycle.dao.ProductDao;
import section09_Spring.topic02_BeanLifeCycle.theory.T01_BeanLifecycle.model.Product;
import section09_Spring.topic02_BeanLifeCycle.theory.T01_BeanLifecycle.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
//    private ProductDao productDao;
//
//    @Autowired
//    public void setProductDao(ProductDao productDao) {
//        System.out.println("ProductServiceImpl constructor was called...");
//        this.productDao = productDao;
//    }
//
//    @PostConstruct
//    public void init() {
//        System.out.println("ProductServiceImpl init method was called");
//    }

    @Autowired
    private ProductDao productDao;

    @Autowired
    public void setProductDao() {
        System.out.println("ProductServiceImpl constructor was called... ProductDao = " + productDao);
    }

    @PostConstruct
    public void init() {
        System.out.println("ProductServiceImpl init method was called... ProductDao = " + productDao);
    }

    @Override
    public Product save(Product product) {
        return productDao.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @PreDestroy
    public void destroy(){
        System.out.println("ProductServiceImpl was destroyed ...");
    }
}
