package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T03_Proxy.model;

import java.util.List;
import org.hibernate.LazyInitializationException;

public class OrderProxy extends Order {
    private List<Product> products = null;
    boolean isSessionOpen = false;

    @Override
    public List<Product> getProducts() {
        if (products != null) {
            return products;
        }
        if (isSessionOpen) {
            products = initProducts();
            return products;
        }
        throw new LazyInitializationException("Can't initialize collection products - no Session");
    }

    private List<Product> initProducts() {
        // proxy will know how to initialize this collection
        return null;
    }
}
