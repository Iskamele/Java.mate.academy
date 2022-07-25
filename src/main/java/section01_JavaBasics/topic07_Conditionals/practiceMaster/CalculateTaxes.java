package section01_JavaBasics.topic07_Conditionals.practiceMaster;

public class CalculateTaxes {
    public static void main(String[] args) {
        System.out.println(calculateTaxes(900));
        System.out.println(calculateTaxes(5000));
        System.out.println(calculateTaxes(10500));
    }

    public static double calculateTaxes(double income) {
        if (income <= 1000) {
            return income * 0.02;
        }
        if (income <= 10000) {
            return income * 0.03;
        }
        return income * 0.05;
    }
}
