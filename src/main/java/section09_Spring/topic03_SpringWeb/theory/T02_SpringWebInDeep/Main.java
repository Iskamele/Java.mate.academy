package section09_Spring.topic03_SpringWeb.theory.T02_SpringWebInDeep;

import java.math.BigDecimal;
import section09_Spring.topic03_SpringWeb.theory.T02_SpringWebInDeep.config.AppConfig;
import section09_Spring.topic03_SpringWeb.theory.T02_SpringWebInDeep.model.Product;
import section09_Spring.topic03_SpringWeb.theory.T02_SpringWebInDeep.service.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        /*
        Steps to implement:
        1. Add <packaging>war</packaging> to pom.xml
        2. Add spring-webmvc dependency to pom.xml
        3. Add spring-webmvc dependency to pom.xml
        4. Add javax.servlet-api dependency to pom.xml
        5. Add maven-war-plugin plugin to pom.xml
        6. Create WebConfig class with @EnableWebMvc, @Configuration and @ComponentScan annotations
        7. Create WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer class
        8. Create controller
        9. Create add jsp page to src/main/webapp/WEB-INF/views/index.jsp
        10. Implement WebMvcConfigurer interface in the WebConfig class
        11. Configure InternalResourceViewResolver bean in the WebConfig class
        12. Configure InternalResourceViewResolver bean in the WebConfig class
        13. Add javax.servlet.jsp-api dependency to pom.xml
        14. Add javax.servlet.jsp.jstl-api dependency to pom.xml
        15. Add javax.servlet.jsp.jstl-api dependency to pom.xml
        16. Add taglibs standard dependency to pom.xml
        17. Configure Tomcat and run app
        */

        // create products
        Product iPhone = new Product();
        iPhone.setName("iPhone 7");
        iPhone.setPrice(BigDecimal.valueOf(499));

        Product samsung = new Product();
        samsung.setName("Samsung S20");
        samsung.setPrice(BigDecimal.valueOf(695));

        Product samsung10 = new Product();
        samsung10.setName("Samsung S10");
        samsung10.setPrice(BigDecimal.valueOf(600));

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService productService = context.getBean(ProductService.class);

        // save products
        productService.save(iPhone);
        productService.save(samsung);
        productService.save(samsung10);

        // get products
        System.out.println(productService.findAll());
    }
}
