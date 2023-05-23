package section09_Spring.topic02_BeanLifeCycle.theory.T01_BeanLifecycle;

import section09_Spring.topic02_BeanLifeCycle.theory.T01_BeanLifecycle.config.AppConfig;
import section09_Spring.topic02_BeanLifeCycle.theory.T01_BeanLifecycle.service.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService productService = context.getBean(ProductService.class);
        System.out.println(productService.findAll());
        context.close();
    }
}
