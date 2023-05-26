package section09_Spring.topic03_SpringWeb.theory.T07_HowToCreateDTO.service;

import java.time.LocalDateTime;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

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
