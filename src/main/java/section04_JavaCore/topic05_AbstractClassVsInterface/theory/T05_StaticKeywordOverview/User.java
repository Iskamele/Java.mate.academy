package section04_JavaCore.topic05_AbstractClassVsInterface.theory.T05_StaticKeywordOverview;

public class User {
    // Статичное поле не описывает состояние объекта, оно описывает состояние класса
    public static String name;
    public int age;

    /*
    public static void accessToFields() {
        name = "Bob";
        age = 12; //Non-static field 'age' cannot be referenced from a static context
    }
     */

    @Override
    public String toString() {
        age = 12;
        name = "John";
        return "name is " + name;
    }
}
