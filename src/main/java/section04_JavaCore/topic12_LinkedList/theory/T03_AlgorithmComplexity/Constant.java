package section04_JavaCore.topic12_LinkedList.theory.T03_AlgorithmComplexity;

public class Constant {
    public static void main(String[] args) {
        // Algorithm Complexity

        // O(1) - constant

    }
    // 2 * O(1) --> O(1)
    // 2 поскольку мы выполняем две операции
    private static int getSum(int a, int b) {
        // Такая операция будет выполняться за константное время,
        // т.е. скорость зависит от мощности процессора
        int sum = a + b; // O(1)
        System.out.println(sum); // O(1)
        return sum;
    }
}
