package section04_JavaCore.topic19_Java8Part1.theory.T03_Lambda;

public class TestMain {

    public static void main(String[] args) {
        Test test = new Test() {
            @Override
            public void print(String value) {
                System.out.println(value);
            }
        };
        test.print("Hello");

        Test test2 = (value) -> System.out.println(value);
        test2.print("Hello");
    }
}
