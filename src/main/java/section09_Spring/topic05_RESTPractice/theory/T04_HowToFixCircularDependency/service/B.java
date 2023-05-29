package section09_Spring.topic05_RESTPractice.theory.T04_HowToFixCircularDependency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
    // как один из способов, ставить @Autowired прямо над полем и не юзать сеттер
    // @Autowired
    // Ленивая инициализация бинов. Это означает, что поля будут
    // проинициализованы после того, как будет создан объект
    private C c;

//    @Autowired
//    public B(C c) {
//        this.c = c;
//    }

    // сеттером можно решить Circular dependency проблему
    @Autowired
    public void setC(C c) {
        this.c = c;
    }

    public C getC() {
        return c;
    }

    public String getName() {
        return "B";
    }
}
