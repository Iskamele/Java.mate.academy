package section04_JavaCore.topic12_LinkedList.theory.T04_WhatIsFasterLLOrAL;

public class Main {
    public static void main(String[] args) {
        // AL vs LL performance

        // 1. Insertion at the end -- AL
        System.out.println("1. Insertion at the end");
        InsertionAtTheEnd insertionAtTheEnd = new InsertionAtTheEnd();
        insertionAtTheEnd.start(1_000_000);
        System.out.println("------------------------------");

        // 2. Insertion at the start -- LL
        System.out.println("2. Insertion at the start");
        System.out.println("ArrayList = O(n)");
        System.out.println("LinkedList = O(1)");
        InsertAtTheStart insertAtTheStart = new InsertAtTheStart();
        insertAtTheStart.start(100_000);

        // 3. Insertion in the middle -- AL
        System.out.println("3. Insertion in the middle");
        InsertInTheMiddle middle = new InsertInTheMiddle();
        middle.start(100_000);
    }
}
