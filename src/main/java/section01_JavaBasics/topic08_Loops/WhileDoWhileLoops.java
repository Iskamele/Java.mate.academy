package section01_JavaBasics.topic08_Loops;

public class WhileDoWhileLoops {
    public static void main(String[] args) {
        int n = 1240;
        int count = 0;

        System.out.println("-------While------");
        while (n % 2 == 0) {
            n = n / 2;
            System.out.println(n);
            count++;
        }
        System.out.println(count);

        System.out.println("-------Do While------");
        double v = 133;
        count=0;
        do {
            v = v / 2;
            System.out.println(v);
            count++;
        } while (v % 2 == 0);
        System.out.println(count);
    }
}
