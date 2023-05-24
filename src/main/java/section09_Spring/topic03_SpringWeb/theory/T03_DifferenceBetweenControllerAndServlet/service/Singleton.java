package section09_Spring.topic03_SpringWeb.theory.T03_DifferenceBetweenControllerAndServlet.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class Singleton {
    @Autowired
    private Prototype prototype;

    public Singleton() {
    }

    @PostConstruct
    public void init() {
        System.out.println("Singleton post construct");
    }

    @Lookup
    public Prototype getPrototype() {
        return prototype;
    }

    @PreDestroy
    public void destroyBean() {
        System.out.println("Singleton pre destroy called...");
    }
}
