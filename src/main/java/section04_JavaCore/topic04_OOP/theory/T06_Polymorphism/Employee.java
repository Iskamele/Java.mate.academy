package section04_JavaCore.topic04_OOP.theory.T06_Polymorphism;

public class Employee extends Person {
    private double baseSalary;

    public Employee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary() {
        return baseSalary * 1.1;
    }

    // Method overloading
    public double getSalary(double coefficient) {
        return baseSalary * coefficient;
    }

    @Override
    public String getPersonalInfo() {
        return super.getPersonalInfo() + ", salary: " + getSalary();
    }
}
