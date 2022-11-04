package section04_JavaCore.topic05_AbstractClassVsInterface.T02_WhatIsInterface;

import section04_JavaCore.topic05_AbstractClassVsInterface.T02_WhatIsInterface.Model.Square;

public class Main {
    public static void main(String[] args) {
        // Interface

        Square square = new Square(10);
        Square square2 = new Square(20);

        square.compareTo(square2);
    }
}
