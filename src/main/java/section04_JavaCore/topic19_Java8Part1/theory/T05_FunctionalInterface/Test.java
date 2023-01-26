package section04_JavaCore.topic19_Java8Part1.theory.T05_FunctionalInterface;

// Lambda выражения могут реализовывать только функциональные интерфейсы
@FunctionalInterface
public interface Test {
    void print(String value);
}
