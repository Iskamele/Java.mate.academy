package section09_Spring.topic03_SpringWeb.theory.T03_DifferenceBetweenControllerAndServlet;

import java.math.BigDecimal;
import section09_Spring.topic03_SpringWeb.theory.T03_DifferenceBetweenControllerAndServlet.config.AppConfig;
import section09_Spring.topic03_SpringWeb.theory.T03_DifferenceBetweenControllerAndServlet.model.Product;
import section09_Spring.topic03_SpringWeb.theory.T03_DifferenceBetweenControllerAndServlet.service.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
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
