package section01_JavaBasics.topic07_Conditionals.practice;

public class GetDriverLicense {
    public static void main(String[] args) {
        System.out.println(getDriverLicense(14));
        System.out.println(getDriverLicense(16));
        System.out.println(getDriverLicense(25));
    }
    public static String getDriverLicense(int age) {
        if (age >= 16){
            return "You can get a license";
        } else {
            return "You can't get a license";
        }
    }
}
