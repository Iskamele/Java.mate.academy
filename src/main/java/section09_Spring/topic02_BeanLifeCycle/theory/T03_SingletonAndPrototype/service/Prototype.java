package section09_Spring.topic02_BeanLifeCycle.theory.T03_SingletonAndPrototype.service;

import java.time.LocalDateTime;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Prototype {
    @Autowired
    private UserService userService;

    private LocalDateTime creationTime;

    public Prototype(){creationTime = LocalDateTime.now();}

    public LocalDateTime getCreationTime(){
        return creationTime;
    }

    public UserService getUserService(){return userService;}

    @PreDestroy
    public void destroyBean(){
        System.out.println("Singleton pre destroy called...");
    }
}
