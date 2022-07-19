package section01_JavaBasics.topic06_Boolean;

public class LogicalNot {
    public static void main(String[] args) {
        int age = 17;
        boolean hasAccess = age >= 18;
        System.out.println(hasAccess);

        if(hasAccess){
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }
}
