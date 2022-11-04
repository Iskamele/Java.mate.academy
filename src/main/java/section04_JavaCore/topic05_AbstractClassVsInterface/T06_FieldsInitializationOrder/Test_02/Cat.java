package section04_JavaCore.topic05_AbstractClassVsInterface.T06_FieldsInitializationOrder.Test_02;

public class Cat extends Animal {
    static {
        System.out.println("Cat static block");
    }

    {
        System.out.println("Cat non static block");
    }

    public Cat(String name) {
        super(name);
        System.out.println("Cat constructor");
    }
}
