package section04_JavaCore.topic16_Immutable.theory.T01_WhatIsImmutableClass;

public class Main {
    public static void main(String[] args) {
        // Immutable

        // - As a key in Map
        // - multithreading
        // - no-side effect rule

        // Examples in JDK

        String message = "Hello world";
        String toUpperCase = message.toUpperCase();
        System.out.println(message);
        System.out.println(toUpperCase);

        // Также все экземпляры классов-объвёрток тоже будут immutable
        // Integer; Double, Boolean
    }
}
