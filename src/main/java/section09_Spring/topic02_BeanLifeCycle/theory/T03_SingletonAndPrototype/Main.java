package section09_Spring.topic02_BeanLifeCycle.theory.T03_SingletonAndPrototype;

import section09_Spring.topic02_BeanLifeCycle.theory.T03_SingletonAndPrototype.config.AppConfig;
import section09_Spring.topic02_BeanLifeCycle.theory.T03_SingletonAndPrototype.service.Singleton;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        Singleton singleton = context.getBean(Singleton.class);
        for (int i = 0; i < 10000; i++) {
            System.out.println(singleton.getPrototype().getCreationTime());
        }
        System.out.println(singleton.getPrototype().getUserService().getAll());
    }
}
