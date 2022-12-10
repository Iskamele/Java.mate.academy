package section04_JavaCore.topic10_Generics.theory.T01_Intro.WithGenerics;

public class Box<T> {
    private T value;

    public Box(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
