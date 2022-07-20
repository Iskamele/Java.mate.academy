package section01_JavaBasics.topic08_Loops.practice;

public class CreateLoop {
    public static void main(String[] args) {
        System.out.println(getSumOfFirstTenNumbers());
    }
    public static int getSumOfFirstTenNumbers() {
        int result = 0;

        for (int i = 0; i < 10; i++) {
            result += i;
        }

        return result;
    }
}
