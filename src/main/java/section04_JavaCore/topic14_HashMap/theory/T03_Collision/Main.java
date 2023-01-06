package section04_JavaCore.topic14_HashMap.theory.T03_Collision;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10,20);
        Map<Rectangle, Integer> map = new HashMap<>();
        map.put(rectangle1, 100);
        System.out.println(map.toString());

        // По дефолту rectangle1 и rectangle2 - два разных объекта
        // Соблюдение контракта между equals и hashCode есть основоположным при работе с HashMap
        // Для работы с HashMap для ключа должны быть переопределены методы equals и hashCode
        Rectangle rectangle2 = new Rectangle(10,20);
        System.out.println(map.get(rectangle2));
    }
}
