package section09_Spring.topic02_BeanLifeCycle.theory.T04_SingletonAndPrototypeLifecycleDifference;

import section09_Spring.topic02_BeanLifeCycle.theory.T04_SingletonAndPrototypeLifecycleDifference.config.AppConfig;
import section09_Spring.topic02_BeanLifeCycle.theory.T04_SingletonAndPrototypeLifecycleDifference.service.Singleton;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        Singleton singleton = context.getBean(Singleton.class);
        System.out.println(singleton.getPrototype().getCreationTime());
        System.out.println(singleton.getPrototype().getCreationTime());
        System.out.println(singleton.getPrototype().getCreationTime());

        context.close();
    }
}
