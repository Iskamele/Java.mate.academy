package Another.section04_JavaCore.topic14_PECS.InvarianceCovarianceAndContravariance;

import section04_JavaCore.topic11_ArrayList.practice.ArrayList.ArrayList;

public class Main {
    static class Fruit {
        int weight;
    }

    static class Citrus extends Fruit {
        int weight;
    }

    static class Orange extends Citrus {
        int color;
    }

    static class BigRoundOrange extends Orange {
        int size = 100;
    }

    private static int totalWeight (ArrayList<? extends Citrus> oranges) {
        int weight = 0;
        for (int i = 0; i < oranges.size(); i++) {
            weight += oranges.get(i).weight;
        }
        Fruit fruit = oranges.get(0);
        // oranges.add(new Citrus());
        // не сработает, поскольку мы не знаем точный тип списка <? extends Citrus> oranges
        // так как нет информации, вставив что-нибудь мы можем не угадать с классом и записать нечто,
        // что сломает безопасность или логику
        return weight;
    }
    
    private static void addOrange(ArrayList<? super Orange> oranges) {
        for (int i = 0; i < 10; i++) {
            oranges.add(new Orange());
        }
        //Citrus citrus = oranges.get(0); // ERROR
        Object object = oranges.get(0); // Список oranges придназначен для записи, а не чтения

        oranges.add(new BigRoundOrange());
    }

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Citrus citrus = new Citrus();
        Orange orange = new Orange();

        ArrayList<Citrus> citrusList = new ArrayList<>();
        fruit = citrusList.get(0);
        citrus = citrusList.get(0);

        ArrayList<Orange> orangeList = new ArrayList<>();

        totalWeight(orangeList);
        totalWeight(citrusList);

        addOrange(orangeList);
        addOrange(citrusList);
        citrusList.add(new Orange());
    }
}
