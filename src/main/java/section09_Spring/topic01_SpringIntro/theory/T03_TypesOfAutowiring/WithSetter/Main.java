package section09_Spring.topic01_SpringIntro.theory.T03_TypesOfAutowiring.WithSetter;

import java.math.BigDecimal;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import section09_Spring.topic01_SpringIntro.theory.T03_TypesOfAutowiring.WithSetter.config.AppConfig;
import section09_Spring.topic01_SpringIntro.theory.T03_TypesOfAutowiring.WithSetter.model.Product;
import section09_Spring.topic01_SpringIntro.theory.T03_TypesOfAutowiring.WithSetter.service.ProductService;

public class Main {

    public static void main(String[] args) {
        /*
        Steps to implement:
        1. Add spring-context maven dependency
        2. Create AppConfig class and mark it with @Configuration annotation
        3. Replace @Dao and @Service annotations with corresponding from Spring Framework
        4. Replace @Inject annotation with @Autowired in ProductServiceImpl
        5. Replace creating of Injector instance with AnnotationConfigApplicationContext
        */

        // create products
        Product iPhone = new Product();
        iPhone.setName("iPhone 7");
        iPhone.setPrice(BigDecimal.valueOf(499));

        Product samsung = new Product();
        samsung.setName("Samsung S20");
        samsung.setPrice(BigDecimal.valueOf(695));

        // save products
        // Injector injector = Injector.getInstance("section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts");
        // ProductService productService = (ProductService) injector.getInstance(ProductService.class);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService productService = context.getBean(ProductService.class);

        productService.save(iPhone);
        productService.save(samsung);

        // print products
        System.out.println(productService.findAll());
    }
}
