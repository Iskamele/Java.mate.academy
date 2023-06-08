package section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.dao.ProductDao;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.Product;

@Repository
public class ProductDaoImpl extends AbstractDao<Product, Long> implements ProductDao {
    @Autowired
    public ProductDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory, Product.class);
    }
}
