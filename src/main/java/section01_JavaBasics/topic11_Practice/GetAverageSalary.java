package section01_JavaBasics.topic11_Practice;

public class GetAverageSalary {
    public static void main(String[] args) {
        System.out.println(getAverageSalary(new double[]{1000.00, 500.00})); // 750.00
        System.out.println(getAverageSalary(new double[]{100.00, 200.00, 300.00})); // 200.00
        System.out.println(getAverageSalary(new double[0])); // 0.00
    }

    public static double getAverageSalary(double[] salaries) {
        double total = 0;
        for (double salary : salaries) {
            total += salary;
        }
        return (salaries.length != 0) ? total / salaries.length : 0.00;
    }
}