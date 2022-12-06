package section04_JavaCore.topic09_PatternsAndRecurstion.T08_RecursionPractice;

public class Main {
    public static void main(String[] args) {
        // get n-th power of 18
        int result = powerOf10(4);
        System.out.println(result);

        System.out.println();

        int result2 = recursionPowerOf10(4);
        System.out.println(result2);
    }

    public static int powerOf10(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * 10;
        }
        return result;
    }

    // tree
    public static int recursionPowerOf10(int n){
        if (n == 0){
            return 1;
        }
        return recursionPowerOf10(n-1) * 10;
    }
}
