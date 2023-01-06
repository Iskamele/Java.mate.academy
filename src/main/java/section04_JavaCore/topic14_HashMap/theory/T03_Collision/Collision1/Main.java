package section04_JavaCore.topic14_HashMap.theory.T03_Collision.Collision1;

import section04_JavaCore.topic14_HashMap.theory.T03_Collision.Rectangle;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Collision
        Rectangle rectangle1 = new Rectangle(10,20);
        Rectangle rectangle2 = new Rectangle(15,15);

        Map<Rectangle, Integer> map = new HashMap<>();

        // Для обоих объектов одинаковый HashCode
        // У кадой ноды есть параметр next
        // Если повторно в тот же бакет вставляется нода, то предыдущая имеет на неё ссылку
        map.put(rectangle1, 100); // 30 % 16 = 14
        map.put(rectangle2, 200); // 30 % 16 = 14
        System.out.println(map.get(rectangle1));
        System.out.println(map.get(rectangle2));
    }
}
