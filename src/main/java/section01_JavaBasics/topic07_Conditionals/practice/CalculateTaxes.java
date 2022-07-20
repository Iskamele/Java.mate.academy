package section01_JavaBasics.topic07_Conditionals.practice;

public class CalculateTaxes {
    public static void main(String[] args) {
        System.out.println(calculateTaxes(900));
        System.out.println(calculateTaxes(5000));
        System.out.println(calculateTaxes(10500));
    }
    public static double calculateTaxes(double income) {
        if (income <= 1000.0) {
            return income * 0.02;
        } else if (income <= 10000.0) {
            return income * 0.03;
        } else {
            return income * 0.05;
        }
    }
}
