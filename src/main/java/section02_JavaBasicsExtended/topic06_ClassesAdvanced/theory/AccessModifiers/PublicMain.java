package section02_JavaBasicsExtended.topic06_ClassesAdvanced.theory.AccessModifiers;

import section02_JavaBasicsExtended.topic06_ClassesAdvanced.theory.AccessModifiers.model.Dog;

public class PublicMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.tailLength = 14;
        dog.name = "Billy";
        dog.age = 3;
        boolean hasOwner = dog.hasOwner();

        dog.setOwner("Alice");
    }
}