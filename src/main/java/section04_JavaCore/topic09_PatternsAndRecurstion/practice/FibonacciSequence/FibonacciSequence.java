package section04_JavaCore.topic09_PatternsAndRecurstion.practice.FibonacciSequence;

public class FibonacciSequence {
    public int getFibonacciNumber(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return getFibonacciNumber(n - 2) + getFibonacciNumber(n - 1);
    }
}

