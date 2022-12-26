package section04_JavaCore.topic12_LinkedList.theory.T04_WhatIsFasterLLOrAL;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InsertInTheMiddle {
    public void start(int size) {
        insertToArrayList(size);
        System.out.println();
        insertToLinkedList(size);
    }

    private void insertToArrayList(int size) {
        List<Integer> arrayList = new ArrayList<>();
        System.out.println("Starting insertion in the middle of ArrayList ...");
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.add(arrayList.size() / 2, i);
        }
        long end = System.nanoTime();

        System.out.println("Insertion in the middle of ArrayList completed!");
        System.out.println("Took: " + ((end - start) / 1_000_000) + "ms");
    }

    private void insertToLinkedList(int size) {
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("Starting insertion in the middle of LinkedList ...");
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedList.add(linkedList.size() / 2, i);
        }
        long end = System.nanoTime();

        System.out.println("Insertion in the middle of LinkedList completed!");
        System.out.println("Took: " + ((end - start) / 1_000_000) + "ms");
    }
}
