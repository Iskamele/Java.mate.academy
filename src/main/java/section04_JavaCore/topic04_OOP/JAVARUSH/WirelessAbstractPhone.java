package section04_JavaCore.topic04_OOP.JAVARUSH;

public abstract class WirelessAbstractPhone extends AbstractPhone {
    private int hour;

    public WirelessAbstractPhone(int year, int hour) {
        super(year);
        this.hour = hour;
    }
}
