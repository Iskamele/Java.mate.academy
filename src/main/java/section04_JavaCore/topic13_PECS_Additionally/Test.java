package section04_JavaCore.topic13_PECS_Additionally;


import java.util.ArrayList;
import java.util.List;

public class Test {
    static class Fruit {
        int weight;
    }

    static class Citrus extends Fruit {
        int tasty;
    }

    static class Orange extends Citrus {
        int color;
    }

    static class BigRoundOrange extends Orange {
        int size;
    }

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Citrus citrus = new Citrus();
        Orange orange = new Orange();
        BigRoundOrange bigRoundOrange = new BigRoundOrange();

        List<Fruit> fruits = new ArrayList<>();
        List<Fruit> anotherFruits = new ArrayList<>();
        List<Citrus> citruses = new ArrayList<>();
        List<Orange> oranges = new ArrayList<>();
        List<BigRoundOrange> bigRoundOranges = new ArrayList<>();

        // ИНВАРИАНТНЫЙ List<Type>
        // Присвоить: Только List<Type>
        fruits = anotherFruits;

        // Читать get(): Type и предки Type
        fruit = citruses.get(0);
        fruit = fruits.get(0);
        orange = bigRoundOranges.get(0);
        orange = oranges.get(0);
        // orange = citruses.get(0); // ERROR

        // Запись add(): Type и наследники Type
        citruses.add(new Citrus());
        citruses.add(new Orange());
        citruses.add(new BigRoundOrange());
        // citruses.add(new Fruit()); // ERROR

        // КОВАРИАНТНЫЙ List<? extends Type>
        // Присвоить: List<Type> и List наследников Type
        List<? extends Orange> extendsOranges = new ArrayList<>();
        extendsOranges = oranges;
        extendsOranges = bigRoundOranges;

        // Читать get(): Type и предки Type
        // Смотри totalWeight()
        totalWeight(extendsOranges);

        // Запись add(): ничего

        // КОНТРВАРИАНТНЫЙ List<? super Type>
        // Присвоить: List<Type> и List предков Type
        List<? super Orange> superOranges = new ArrayList<>();
        superOranges = oranges;
        superOranges = citruses;
        superOranges = fruits;

        // Читать get(): Object
        // Смотри addOrange()

        // Запись add(): Type и наследники Type
        ArrayList<Orange> onlyOranges = new ArrayList<>();
        ArrayList<Citrus> onlyCitruses = new ArrayList<>();
        addOrange(onlyOranges);
        addOrange(onlyCitruses);
        // Смотри addOrange(): oranges.add(new BigRoundOrange());
    }

    private static void addOrange(ArrayList<? super Orange> oranges) {
        for (int i = 0; i < 10; i++) {
            oranges.add(new Orange());
        }
        // Citrus citrus = oranges.get(0); // ERROR
        Object object = oranges.get(0);

        oranges.add(new BigRoundOrange());
    }

    private static int totalWeight(List<? extends Orange> list) {
        int totalWeight = 0;
        for (int i = 0; i < list.size(); i++) {
            totalWeight += list.get(i).weight;
        }
        Fruit fruit = list.get(0);
        Citrus citrus = list.get(0);
        Orange orange = list.get(0);
        // BigRoundOrange bigRoundOrange = list.get(0); // ERROR
        return totalWeight;
    }
}
