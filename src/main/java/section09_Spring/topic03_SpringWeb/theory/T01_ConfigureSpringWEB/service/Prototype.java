package section09_Spring.topic03_SpringWeb.theory.T01_ConfigureSpringWEB.service;

import java.time.LocalDateTime;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// TODO Не будет храниться в IoC-контейнере. Это отличие жизненного цикла prototype
@Component
@Scope(value = "prototype")
public class Prototype {
    @Autowired
    private ProductService userService;

    private LocalDateTime creationTime;

    @PostConstruct
    public void init() {
        System.out.println("Prototype post construct");
    }

    public Prototype(){creationTime = LocalDateTime.now();}

    public LocalDateTime getCreationTime(){
        return creationTime;
    }

    public ProductService getUserService(){return userService;}

    @PreDestroy
    public void destroyBean(){
        System.out.println("Singleton pre destroy called...");
    }
}
