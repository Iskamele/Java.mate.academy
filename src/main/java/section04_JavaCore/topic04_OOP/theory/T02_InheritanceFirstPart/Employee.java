package section04_JavaCore.topic04_OOP.theory.T02_InheritanceFirstPart;

public class Employee extends Person {
    private double baseSalary;

    public Employee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary() {
        return baseSalary * 1.1;
    }
}
