package section02_JavaBasicsExtended.topic06_ClassesAdvanced.AccessModifiers.model;

import section02_JavaBasicsExtended.topic06_ClassesAdvanced.ClassInheritance.Animal;

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
