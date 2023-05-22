package section09_Spring.topic01_SpringIntro.theory.T06_PropertiesFileUsage;

import java.math.BigDecimal;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import section09_Spring.topic01_SpringIntro.theory.T06_PropertiesFileUsage.config.AppConfig;
import section09_Spring.topic01_SpringIntro.theory.T06_PropertiesFileUsage.model.Product;
import section09_Spring.topic01_SpringIntro.theory.T06_PropertiesFileUsage.service.ProductService;

public class Main {

    public static void main(String[] args) {
        /*
        Steps to implement:
        1. Add spring-orm and commons-dbcp2 dependency
        2. Create DataSource and LocalSessionFactoryBean beans in AppConfig class
        3. Mark them with @Bean annotation
        */

        // create products
        Product iPhone = new Product();
        iPhone.setName("iPhone 7");
        iPhone.setPrice(BigDecimal.valueOf(499));

        Product samsung = new Product();
        samsung.setName("Samsung S20");
        samsung.setPrice(BigDecimal.valueOf(695));

        // save products
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService productService = context.getBean(ProductService.class);

        productService.save(iPhone);
        productService.save(samsung);

        // print products
        System.out.println(productService.findAll());
    }
}
