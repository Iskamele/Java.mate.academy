package section04_JavaCore.topic19_Java8Part1.theory.T06_DefaultMethods;

public class ArrayList<T> implements Iterable<T> {
    private T[] values;

    public ArrayList(T[] values) {
        this.values = values;
    }

    @Override
    public T[] getAll() {
        return values;
    }
}
