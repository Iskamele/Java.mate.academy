package section04_JavaCore.topic04_OOP.JAVARUSH;

public class Smartphone extends CellAbstractPhone {
    private String operationSystem;

    public Smartphone(int year, int hour, String operationSystem) {
        super(year, hour);
        this.operationSystem = operationSystem;
    }
    public void install(String program){
        System.out.println("Устанавливаю " + program + " для " + operationSystem);
    }
}
