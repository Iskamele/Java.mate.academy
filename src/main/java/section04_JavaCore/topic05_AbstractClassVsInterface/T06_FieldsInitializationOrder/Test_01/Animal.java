package section04_JavaCore.topic05_AbstractClassVsInterface.T06_FieldsInitializationOrder.Test_01;

public class Animal {
    private static String STATIC_FIELD = "abc";

    // 1 Сначала вызываются статические блоки инициализации
    static {
        STATIC_FIELD = "cbd";
        System.out.println("Animal static block");
    }

    private String name = "abc";

    // 2 Потом не статические блоки инициализации
    {
        name = "xyz";
        STATIC_FIELD = "bdd";
        System.out.println("Animal non static block");
    }

    // 3 И потом уже конструктор
    public Animal(String name) {
        System.out.println("Animal constructor");
        this.name = name;
        STATIC_FIELD = ""; // Так никто не делает
    }
}
