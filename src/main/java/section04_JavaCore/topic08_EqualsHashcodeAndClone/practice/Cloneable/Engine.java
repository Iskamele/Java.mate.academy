package section04_JavaCore.topic08_EqualsHashcodeAndClone.practice.Cloneable;

public class Engine implements Cloneable {
    private String model;
    private int enginePower;
    private int torque;
    private double fuelConsumption;
    private int cost;

    public Engine() {
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
    public String toString() {
        return "Engine {" +
                "model = '" + model + " | "
                + "enginePower = '" + enginePower + " | "
                + "torque = " + torque + " | "
                + "fuel consumption = " + fuelConsumption + " | "
                + "cost = " + cost + " | "
                + "}";
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone engine ", e);
        }
    }
}
