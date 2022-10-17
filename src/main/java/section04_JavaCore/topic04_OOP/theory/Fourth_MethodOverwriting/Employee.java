package section04_JavaCore.topic04_OOP.theory.Fourth_MethodOverwriting;

public class Employee extends Person {
    private double baseSalary;

    public Employee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary() {
        return baseSalary * 1.1;
    }

    @Override
    public String getPersonalInfo() {
        return super.getPersonalInfo() + ", salary: " + getSalary();
    }
}
