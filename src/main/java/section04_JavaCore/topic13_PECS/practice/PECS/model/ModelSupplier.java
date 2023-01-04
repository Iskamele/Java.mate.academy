package section04_JavaCore.topic13_PECS.practice.PECS.model;

import java.util.Random;

public class ModelSupplier {
    private final Random random = new Random();

    public String getRandomModel() {
        int index = random.nextInt(Model.values().length);
        return Model.values()[index].name();
    }
}
