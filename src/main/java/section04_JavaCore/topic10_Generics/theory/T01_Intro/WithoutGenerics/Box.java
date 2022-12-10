package section04_JavaCore.topic10_Generics.theory.T01_Intro.WithoutGenerics;

public class Box {
    private Object value;

    public Box(Object value){
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
