package section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts.WithInjector;

import java.math.BigDecimal;
import section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts.WithInjector.lib.Injector;
import section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts.WithInjector.model.Product;
import section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts.WithInjector.service.ProductService;

public class Main {

    public static void main(String[] args) {
        // create products
        Product iPhone = new Product();
        iPhone.setName("iPhone 7");
        iPhone.setPrice(BigDecimal.valueOf(499));

        Product samsung = new Product();
        samsung.setName("Samsung S20");
        samsung.setPrice(BigDecimal.valueOf(695));

        // save products
        Injector injector = Injector.getInstance("section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts");
        ProductService productService = (ProductService) injector.getInstance(ProductService.class);

        productService.save(iPhone);
        productService.save(samsung);

        // print products
        System.out.println(productService.findAll());
    }
}
