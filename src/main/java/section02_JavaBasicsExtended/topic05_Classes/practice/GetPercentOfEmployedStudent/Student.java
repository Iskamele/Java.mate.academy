package section02_JavaBasicsExtended.topic05_Classes.practice.GetPercentOfEmployedStudent;

public class Student {
    public String firstName;
    public String lastName;
    public int age;
    public boolean isEmployed;

    public Student(String firstName, String lastName, int age, boolean isEmployed) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isEmployed = isEmployed;
    }
}