package section04_JavaCore.topic11_ArrayList.theory.T02_WhatIsList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // size()
        // isEmpty()
        // add(E e)
        // get(int value)
        // set(int index, E element)
        // add(int index, E element)

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 15);
        list.remove(2);
        list.set(2, 100);
        list.remove(Integer.valueOf(100));
        System.out.println(list.get(0));
        System.out.println(list.size());

        System.out.println(list);
    }
}
