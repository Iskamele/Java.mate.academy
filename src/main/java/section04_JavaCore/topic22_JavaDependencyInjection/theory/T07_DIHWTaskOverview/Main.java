package section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview;

import section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.app.AtmApp;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.app.ClientApp;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.lib.Injector;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Injector injector = Injector.getInjector();
        ClientApp clientApp = (ClientApp) injector.getInstance(ClientApp.class);

        clientApp.login("bob", "1234");
        clientApp.sendMoney("5678", BigDecimal.valueOf(100));

        AtmApp atmApp = (AtmApp) injector.getInstance(AtmApp.class);
        atmApp.login("12345");
        atmApp.sendMoney("5678", BigDecimal.valueOf(200));
    }
}
