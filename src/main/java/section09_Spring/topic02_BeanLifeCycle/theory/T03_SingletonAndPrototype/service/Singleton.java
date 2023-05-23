package section09_Spring.topic02_BeanLifeCycle.theory.T03_SingletonAndPrototype.service;

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
        // писать new для beans - плохая практика
        //return new Prototype();
        return prototype;
    }

    @PreDestroy
    public void destroyBean() {
        System.out.println("Singleton pre destroy called...");
    }
}
