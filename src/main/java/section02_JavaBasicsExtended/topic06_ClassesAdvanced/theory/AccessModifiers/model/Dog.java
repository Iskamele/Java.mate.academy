package section02_JavaBasicsExtended.topic06_ClassesAdvanced.theory.AccessModifiers.model;

import section02_JavaBasicsExtended.topic06_ClassesAdvanced.theory.ClassInheritance.Animal;

public class Dog extends Animal {
    public long tailLength;
    private String owner;

    public boolean hasOwner(){
        if (owner == null){
            return false;
        }
        return true;
    }
    public void setOwner(String ownerName){
        owner = ownerName;
    }
}
