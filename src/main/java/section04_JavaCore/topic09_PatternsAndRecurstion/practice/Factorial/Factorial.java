package section04_JavaCore.topic09_PatternsAndRecurstion.practice.Factorial;

public class Factorial {
    public int getFactorial(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * getFactorial(number - 1);
    }
}
