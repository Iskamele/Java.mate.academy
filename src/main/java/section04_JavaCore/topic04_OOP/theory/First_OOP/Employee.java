package section04_JavaCore.topic04_OOP.theory.First_OOP;

public class Employee {
    private double baseSalary;

    public Employee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary() {
        return baseSalary * 1.1;
    }
}
