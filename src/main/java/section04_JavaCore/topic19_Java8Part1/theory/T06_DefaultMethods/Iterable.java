package section04_JavaCore.topic19_Java8Part1.theory.T06_DefaultMethods;

public interface Iterable<T> {
    default void printAll() {
        for (T t : getAll()) {
            System.out.println(t);
        }
    }

    T[] getAll();
}
