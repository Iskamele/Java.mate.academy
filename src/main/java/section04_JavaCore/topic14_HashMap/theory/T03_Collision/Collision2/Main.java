package section04_JavaCore.topic14_HashMap.theory.T03_Collision.Collision2;

import section04_JavaCore.topic14_HashMap.theory.T03_Collision.Rectangle;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Collision
        Rectangle rectangle1 = new Rectangle(10,20);
        Rectangle rectangle2 = new Rectangle(15,15);
        Rectangle rectangle3 = new Rectangle(4,10);
        Rectangle rectangle4 = new Rectangle(15,15);

        Map<Rectangle, Integer> map = new HashMap<>();

        map.put(rectangle1, 100);
        map.put(rectangle2, 200);
        map.put(rectangle3, 250);
        // Если equals и HashCode дадут true, то мы перезапишем объект
        map.put(rectangle4, 700);
        System.out.println(map.get(rectangle1));
        System.out.println(map.get(rectangle2));
        System.out.println(map.get(rectangle3));
        System.out.println(map.get(rectangle4));
    }
}
