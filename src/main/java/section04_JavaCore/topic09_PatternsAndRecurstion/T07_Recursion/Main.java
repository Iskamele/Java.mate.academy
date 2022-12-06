package section04_JavaCore.topic09_PatternsAndRecurstion.T07_Recursion;

public class Main {
    public static void main(String[] args) {
        sayHi(5);
        // recursion

    }

    private static void sayHi(int number) {
        if (number == 0){
            System.out.println("Done!");
        } else {
            System.out.println(number);
            number--;
            sayHi(number);
        }
    }
}
