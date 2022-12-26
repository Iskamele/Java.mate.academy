package section04_JavaCore.topic12_LinkedList.theory.T03_AlgorithmComplexity;

public class Linear {
    public static void main(String[] args) {
        // O(n) - linear
        int[] array = new int[]{1, 2, 3, 4, 5};
        printArray(array);
    }

    private static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) { // O(n)
            System.out.println(array[i]); // O(1)
        }
    }
}
