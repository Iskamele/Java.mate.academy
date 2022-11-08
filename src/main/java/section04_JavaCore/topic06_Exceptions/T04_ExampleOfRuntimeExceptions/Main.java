package section04_JavaCore.topic06_Exceptions.T04_ExampleOfRuntimeExceptions;

public class Main {
    public static void main(String[] args) {
        // Runtime Exception
        String name = null;
        // Заниматься отловом null нет смысла, как и
        // Runtime Exception. Надо писать качественный код
        try {
            String upperCaseValue = name.toUpperCase();
        } catch (NullPointerException e) {
            System.out.println("Name is null");
        }
    }
}
