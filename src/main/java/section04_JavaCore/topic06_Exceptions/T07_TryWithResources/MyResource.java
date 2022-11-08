package section04_JavaCore.topic06_Exceptions.T07_TryWithResources;

public class MyResource implements AutoCloseable{
    @Override
    public void close() {
        System.out.println("Resources were closed ...");
    }
}
