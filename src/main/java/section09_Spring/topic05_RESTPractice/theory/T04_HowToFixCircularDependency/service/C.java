package section09_Spring.topic05_RESTPractice.theory.T04_HowToFixCircularDependency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class C {
    // как один из способов, ставить @Autowired прямо над полем и не юзать сеттер
    // Autowired
    // Ленивая инициализация бинов. Это означает, что поля будут
    // проинициализованы после того, как будет создан объект
    private A a;

//    @Autowired
//    public C(A a) {
//        this.a = a;
//    }

    // сеттером можно решить Circular dependency проблему
    @Autowired
    public void setA(A a) {
        this.a = a;
    }

    public A getA() {
        return a;
    }

    public String getName() {
        return "C";
    }
}
