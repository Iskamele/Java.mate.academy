package section04_JavaCore.topic19_Java8Part1.theory.T05_FunctionalInterface;

public class TestMain {

    public static void main(String[] args) {
        Test test = new Test() {
            @Override
            public void print(String value) {
                System.out.println(value);
            }
        };

        Test test2 = (value) -> System.out.println(value);
        test2.print("Hello");
    }
}
