package section02_JavaBasicsExtended.topic06_ClassesAdvanced.theory.ThisKeyword;

public class Dog {
    public long tailLength;
    private String owner;

    public boolean hasOwner() {
        if (owner == null){
            return false;
        }
        return true;
    }

    // this - указывает на объект при работе с полем
    public void setOwner (String ownerName) {
        owner = ownerName;
    }
}
