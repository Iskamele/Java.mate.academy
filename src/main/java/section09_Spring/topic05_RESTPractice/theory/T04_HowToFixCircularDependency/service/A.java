package section09_Spring.topic05_RESTPractice.theory.T04_HowToFixCircularDependency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
    // как один из способов, ставить @Autowired прямо над полем и не юзать сеттер
    // @Autowired
    // Ленивая инициализация бинов. Это означает, что поля будут
    // проинициализованы после того, как будет создан объект
    private B b;

//    public A(B b) {
//        this.b = b;
//    }

    // сеттером можно решить Circular dependency проблему
    @Autowired
    public void setB(B b) {
        this.b = b;
    }

    public B getB() {
        return b;
    }

    public String getName() {
        return "A";
    }
}
