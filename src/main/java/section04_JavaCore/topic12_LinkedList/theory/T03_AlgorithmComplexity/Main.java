package section04_JavaCore.topic12_LinkedList.theory.T03_AlgorithmComplexity;

public class Main {
    public static void main(String[] args) {
        // Algorithm Complexity.md

        // f(n) = С - количество операций не зависит от размера входных данных
        // f(n) = a*n + b - линейная функция
        // f(n) = a*n^2 + b*n + c - квадратная функция

        // Сложность алгоритма обозначается: Big O notation
        // O(1) - сложность алгоритма константная
        // O(n) - сложность алгоритма линейная
        // O(n^2) - сложность алгоритма квадратная

        int[] array = new int[]{1, 2, 3, 4, 5};
        // Лучший вариант
        getPosition(array, 1); // O(1)
        // Худший вариант
        getPosition(array, 7); // O(1)......O(n)
    }

    private static int getPosition(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
