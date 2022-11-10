package section04_JavaCore.topic05_AbstractClassVsInterface.theory.T02_WhatIsInterface.Model;

public class Square implements Figure, Comparable<Square> {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public int compareTo(Square o) {
        if (this.side == o.side) {
            return 0;
        }
        if (this.side < o.side) {
            return -1;
        }
        return 1;
    }
}
