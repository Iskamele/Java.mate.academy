package section04_JavaCore.topic10_Generics.theory.T05_WhatCanBeUsedInsteadOfGenericType;

public class Main {
    public static void main(String[] args) {
        // Generics

        Box<Cloneable> cloneableBox = new Box<>();
        Box<Integer> integerBox = new Box<>();
        // Box<int> intBox = new Box<>();
        // Box<integerBox> intBox = new Box<>();
        Box<Season> seasonBox = new Box<>();
    }
    enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }
}
