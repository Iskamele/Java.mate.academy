package section06_JavaJDBC.topic04_INNERJOIN.T01_RelationTypes;

import section06_JavaJDBC.topic04_INNERJOIN.T01_RelationTypes.service.LiteraryFormatService;
import section06_JavaJDBC.topic04_INNERJOIN.T01_RelationTypes.util.Injector;

public class Main {
    private static Injector injector = Injector.getInstance("section06_JavaJDBC.topic03_DAOVsService.theory.T02_InjectorUsageExample"); // имя пакета со всеми классами

    public static void main(String[] args) {
        LiteraryFormatService literaryFormatService = (LiteraryFormatService)
                injector.getInstance(LiteraryFormatService.class);
        literaryFormatService.getAll().forEach(System.out::println);
    }
}
