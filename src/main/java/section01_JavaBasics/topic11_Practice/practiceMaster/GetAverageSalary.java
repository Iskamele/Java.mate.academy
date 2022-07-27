package section01_JavaBasics.topic11_Practice.practiceMaster;

public class GetAverageSalary {
    public static void main(String[] args) {
        System.out.println(getAverageSalary(new double[]{1000.00, 500.00})); // 750.00
        System.out.println(getAverageSalary(new double[]{100.00, 200.00, 300.00})); // 200.00
        System.out.println(getAverageSalary(new double[0])); // 0.00
    }

    public static double getAverageSalary(double[] salaries) {
        // variable to store sum of all salaries
        double totalAmount = 0.0;

        // we need to check if the array is empty, because if in java we divide double by 0 we get Infinity
        if (salaries.length == 0) {
            return totalAmount;
        }

        // get the sum of all elements from double array
        for (double salary : salaries) {
            totalAmount += salary;
        }
        return totalAmount / salaries.length;
    }
}