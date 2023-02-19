package section04_JavaCore.topic22_JavaDependencyInjection.theory.T01_DependencyInjectionIntro;

import section04_JavaCore.topic22_JavaDependencyInjection.theory.T01_DependencyInjectionIntro.app.ClientApp;
import java.math.BigDecimal;

public class Main {

    // Dependency Injection
    // Inversion of Control
    // Dependency Inversion

    public static void main(String[] args) {
        ClientApp clientApp = new ClientApp();
        clientApp.login("bob", "1234");
        clientApp.sendMoney("5678", BigDecimal.valueOf(100));
    }
}
