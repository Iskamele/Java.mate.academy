package section04_JavaCore.topic06_Exceptions.T12_ExceptionInheritance;

import java.io.IOException;

public class ColorPrinter extends AbstractPrinter {

    @Override
    public void print() throws IOException {
        throw new IOException();
    }
}
