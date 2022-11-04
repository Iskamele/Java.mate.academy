package section04_JavaCore.topic05_AbstractClassVsInterface.WhatIsInterface.Model;

public class Circle implements Figure {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
