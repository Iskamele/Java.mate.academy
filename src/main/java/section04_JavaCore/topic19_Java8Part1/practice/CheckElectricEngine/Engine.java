package section04_JavaCore.topic19_Java8Part1.practice.CheckElectricEngine;

public class Engine {
  private EngineType engineType;

  public EngineType getEngineType() {
    return engineType;
  }

  public void setEngineType(EngineType engineType) {
    this.engineType = engineType;
  }

  @Override
  public String toString() {
    return "Engine {" + "engineType = " + engineType + '}';
  }

  public enum EngineType {
    GASOLINE,
    DIESEL,
    ELECTRIC
  }
}
