package section09_Spring.topic05_RESTPractice.theory.T04_HowToFixCircularDependency;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import section09_Spring.topic05_RESTPractice.theory.T04_HowToFixCircularDependency.config.AppConfig;
import section09_Spring.topic05_RESTPractice.theory.T04_HowToFixCircularDependency.service.A;

public class Main {

    public static void main(String[] args) {

        // Circular dependency example

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        A bean = context.getBean(A.class);

        System.out.println(bean.getB().getC().getName());
    }
}
