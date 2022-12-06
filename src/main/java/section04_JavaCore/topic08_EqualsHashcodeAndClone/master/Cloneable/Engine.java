package section04_JavaCore.topic08_EqualsHashcodeAndClone.master.Cloneable;

public class Engine implements Cloneable {
    private String model;
    private int enginePower;
    private int torque;
    private double fuelConsumption;
    private int cost;

    public Engine() {
    }

    public Engine(String model, int enginePower, int torque, double fuelConsumption, int cost) {
        this.model = model;
        this.enginePower = enginePower;
        this.torque = torque;
        this.fuelConsumption = fuelConsumption;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(model, enginePower, torque, fuelConsumption, cost);
    }
}
