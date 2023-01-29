package section04_JavaCore.topic19_Java8Part1.practice.CheckElectricEngine;

import java.util.function.Predicate;

public class CheckElectricEngine implements Predicate<Engine> {
    @Override
    public boolean test(Engine engine) {
        return engine.getEngineType().equals(Engine.EngineType.ELECTRIC);
    }
}
