package section04_JavaCore.topic06_Exceptions.T07_TryWithResources;

public class Main {
    public static void main(String[] args) {
        // try - catch - finally
        // Все наследующие AutoCloseable объекты могут помещаться в try()

        try (MyResource resource = new MyResource()){
            System.out.println("Try with resources");
        }
    }
}
