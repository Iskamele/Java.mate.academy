package section04_JavaCore.topic05_AbstractClassVsInterface.theory.T02_WhatIsInterface.Model;

public class Rectangle implements Figure{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
