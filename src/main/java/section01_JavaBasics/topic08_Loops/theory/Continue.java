package section01_JavaBasics.topic08_Loops.theory;

public class Continue {
    public static void main(String[] args) {
        {
            // Вложенность кода - это плохо и её надо избегать
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
