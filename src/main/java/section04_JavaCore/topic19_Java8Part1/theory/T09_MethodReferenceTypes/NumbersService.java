package section04_JavaCore.topic19_Java8Part1.theory.T09_MethodReferenceTypes;

public interface NumbersService<T extends Number> {
    T getFromString(String value);
}
