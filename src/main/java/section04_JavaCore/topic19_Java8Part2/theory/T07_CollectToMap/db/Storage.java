package section04_JavaCore.topic19_Java8Part2.theory.T07_CollectToMap.db;

import section04_JavaCore.topic19_Java8Part2.theory.T07_CollectToMap.model.Advertisement;
import section04_JavaCore.topic19_Java8Part2.theory.T07_CollectToMap.model.Car;
import section04_JavaCore.topic19_Java8Part2.theory.T07_CollectToMap.model.User;
import java.util.ArrayList;
import java.util.List;

public class Storage {
    public static List<Advertisement> getAdvertisement() {
        List<Advertisement> advertisements = new ArrayList<>();

        User bob = new User("Bob", "+38 011 09 09 090");
        User alice = new User("Alice", "+38 022 18 18 181");
        User john = new User("John", "38 021 21 21 221");

        Advertisement camry = new Advertisement(bob, new Car("Toyota", "Camry", 2011));
        Advertisement corolla = new Advertisement(bob, new Car("Toyota", "Corolla", 2018));
        Advertisement yaris = new Advertisement(bob, new Car("Toyota", "Yaris", 2020));
        Advertisement accord = new Advertisement(alice, new Car("Honda", "Accord", 2018));
        Advertisement matiz = new Advertisement(john, new Car("Daewoo", "Matiz", 2008));
        Advertisement lanos = new Advertisement(john, new Car("Daewoo", "Lanos", 2017));

        advertisements.add(camry);
        advertisements.add(corolla);
        advertisements.add(yaris);
        advertisements.add(accord);
        advertisements.add(matiz);
        advertisements.add(lanos);

        return advertisements;
    }
}
