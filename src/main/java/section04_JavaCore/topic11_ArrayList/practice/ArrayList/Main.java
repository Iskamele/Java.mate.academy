package section04_JavaCore.topic11_ArrayList.practice.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("123");
        list.add("1223");
        list.add("1243");
        list.add("1253");

        list.remove(2);
        list.remove("1243");
    }
}
