package section04_JavaCore.topic19_Java8Part3.theory.T01_Optional.Wrapper;

import java.util.function.Consumer;
import section04_JavaCore.topic19_Java8Part3.theory.T01_Optional.Optional.User;

public class Wrapper<T> {
    private T value;

    public Wrapper(T value) {
        this.value = value;
    }

    public static Wrapper<User> empty() {
        return new Wrapper<>(null);
    }

    public T getValue() {
        return value;
    }

    public boolean isPresent() {
        return value != null;
    }

    public void ifPresent(Consumer<T> consumer) {
        if (value != null) {
            consumer.accept(value);
        }
    }
}
