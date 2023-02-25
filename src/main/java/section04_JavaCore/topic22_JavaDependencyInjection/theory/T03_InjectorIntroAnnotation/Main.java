package section04_JavaCore.topic22_JavaDependencyInjection.theory.T03_InjectorIntroAnnotation;

import section04_JavaCore.topic22_JavaDependencyInjection.theory.T03_InjectorIntroAnnotation.app.AtmApp;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T03_InjectorIntroAnnotation.app.ClientApp;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {


        ClientApp clientApp = new ClientApp();
        clientApp.login("bob", "1234");
        clientApp.sendMoney("5678", BigDecimal.valueOf(100));

        AtmApp atmApp = new AtmApp();
        atmApp.login("12345");
        atmApp.sendMoney("5678", BigDecimal.valueOf(200));
    }
}
