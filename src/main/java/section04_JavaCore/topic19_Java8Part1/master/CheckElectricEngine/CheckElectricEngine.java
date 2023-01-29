package section04_JavaCore.topic19_Java8Part1.master.CheckElectricEngine;

import java.util.function.Predicate;

/*
  in this task we pass the parameter of Engine type
  and return boolean, so for this case we choose Predicate
*/
public class CheckElectricEngine implements Predicate<Engine> {
  @Override
  public boolean test(Engine engine) {
    // check if passed engine is electric
    return engine.getEngineType() == Engine.EngineType.ELECTRIC;
  }
}
