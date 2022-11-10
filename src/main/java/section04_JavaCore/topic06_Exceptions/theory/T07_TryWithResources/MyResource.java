package section04_JavaCore.topic06_Exceptions.theory.T07_TryWithResources;

public class MyResource implements AutoCloseable{
    @Override
    public void close() {
        System.out.println("Resources were closed ...");
    }
}
