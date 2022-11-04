package section04_JavaCore.topic05_AbstractClassVsInterface.T06_FieldsInitializationOrder.Test_02;

public class Main {
    public static void main(String[] args) {
        /* fields initialization order
        1. Static fields and static blocks of ancestors.
           In each class they are initialized in order of appearance.
        2. Static fields and static block of instantiated class.
        3. Instance fields and initialization blocks of ancestors.
        4. Constructor of ancestor after initialization of its instance fields.
        5. Instance fields and initialization blocks of the current class.
           Also in order of appearance.
        6. Constructor of the current class.
         */

        /* В статических методах мы можем иметь доступ
         к статическим полям, мы можем вызывать
         их даже без создания экземпляров классов
         */
        String staticValue = Animal.STATIC_FIELD;

        System.out.println();

        Cat cat = new Cat("Meow");

    }
}
