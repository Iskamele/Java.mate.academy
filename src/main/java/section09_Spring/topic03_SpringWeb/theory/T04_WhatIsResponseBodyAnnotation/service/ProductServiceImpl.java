package section09_Spring.topic03_SpringWeb.theory.T04_WhatIsResponseBodyAnnotation.service;

import java.util.List;
import section09_Spring.topic03_SpringWeb.theory.T04_WhatIsResponseBodyAnnotation.dao.ProductDao;
import section09_Spring.topic03_SpringWeb.theory.T04_WhatIsResponseBodyAnnotation.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductDao userDao;

    @Autowired
    public ProductServiceImpl(ProductDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Product save(Product user) {
        return userDao.save(user);
    }

    @Override
    public List<Product> findAll() {
        return userDao.findAll();
    }
}
