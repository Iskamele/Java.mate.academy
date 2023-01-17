package section04_JavaCore.topic17_SetQueueStackAndComparator.theory.T01_WhatIsSet;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Set overview
        Set<String> names = new HashSet<>();
        names.add("Bob");
        names.add("Bob");
        names.add("Bob");
        names.add("Bob");
        names.add("Alice");
        names.add("Alice");
        names.add("Alice");
        names.add("Alice");
        names.add("Alice");

        System.out.println(names.contains("Bob"));
        System.out.println(names.contains("Jane"));

    }
}
