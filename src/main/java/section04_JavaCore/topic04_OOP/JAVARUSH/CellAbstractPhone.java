package section04_JavaCore.topic04_OOP.JAVARUSH;

public class CellAbstractPhone extends WirelessAbstractPhone {
    public CellAbstractPhone(int year, int hour) {
        super(year, hour);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Вызываю номер " + outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Вам звонит абонент " + inputNumber);
    }
}
