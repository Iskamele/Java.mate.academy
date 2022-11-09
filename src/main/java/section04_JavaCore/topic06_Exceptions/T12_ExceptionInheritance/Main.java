package section04_JavaCore.topic06_Exceptions.T12_ExceptionInheritance;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // exception and inheritance
    }

    private static void print() throws IOException{
        throw new IOException();
    }
}
