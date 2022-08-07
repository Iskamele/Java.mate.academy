package section01_JavaBasics.topic03_Operators.theory;

public class RemainderExample {
    public static void main(String[] args) {
        int candies = 11;
        int persons = 3;
        int result = candies / persons;
        System.out.println(result);

        int reminder = candies % persons;
        System.out.println(reminder);
    }
}
