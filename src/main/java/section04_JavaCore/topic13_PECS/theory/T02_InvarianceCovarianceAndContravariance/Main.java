package section04_JavaCore.topic13_PECS.theory.T02_InvarianceCovarianceAndContravariance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Invariance, Covariance and Contravariance
        List<Integer> myInts = new ArrayList<Integer>();

        // Invariance.
        // Все Generics являются инвариантными
        // List<Number> myNums = myInts;

        // Covariance
        // Когда используем wildcard ? extends, мы достигаем иерархии наследования
        List<? extends Number> numbers1 = new ArrayList<Integer>();
        List<? extends Number> numbers2 = new ArrayList<Double>();
        List<? extends Number> numbers3 = new ArrayList<Float>();

        List<Cat> cats = new ArrayList<>();
        List<? extends Animal> animals = cats;

        // Contravariance
        // В такую коллекцию можно добавить какой-угодно объект класса-наследника Number
        List<? super Number> numbers = new ArrayList<>();
        numbers.add(Integer.valueOf(10));
        numbers.add(Double.valueOf(10.15));
        numbers.add(Float.valueOf(10.15f));
    }
}
