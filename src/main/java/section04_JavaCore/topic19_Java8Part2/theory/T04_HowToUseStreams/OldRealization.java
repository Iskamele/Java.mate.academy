package section04_JavaCore.topic19_Java8Part2.theory.T04_HowToUseStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class OldRealization {
    public static void main(String[] args) {
        List<Phone> phonesFromDB = getPhonesFromDB();
        Stream<Phone> stream = phonesFromDB.stream();
        Stream<Phone> filteredByMakerAndMemory = stream.filter(p -> p.getMaker().equals("Apple") && p.getMemory() >= 64);
        filteredByMakerAndMemory.forEach(p -> System.out.println(p.getModel()));
    }

    private static List<Phone> getPhonesFromDB() {
        List<Phone> phones = new ArrayList<>();
        Phone.Builder iPhoneBuilder = new Phone.Builder("Apple");
        Phone iPhoneX = iPhoneBuilder.setModel("iPhone X").setMemory(64).setScreenDiagonal(5.8).setBatteryLife(22).build();
        Phone iPhone7 = iPhoneBuilder.setModel("iPhone 7").setMemory(32).setScreenDiagonal(4.7).setBatteryLife(18).build();
        Phone iPhone12 = iPhoneBuilder.setModel("iPhone 12").setMemory(128).setScreenDiagonal(6.1).setBatteryLife(23).build();

        Phone.Builder samsungBuilder = new Phone.Builder("Samsung");
        Phone samsungA5 = samsungBuilder.setModel("A5").setMemory(32).setScreenDiagonal(5.2).setBatteryLife(19).build();
        Phone samsung520 = samsungBuilder.setModel("250").setMemory(128).setScreenDiagonal(6.2).setBatteryLife(22).build();

        phones.add(iPhoneX);
        phones.add(iPhone7);
        phones.add(iPhone12);
        phones.add(samsungA5);
        phones.add(samsung520);
        return phones;
    }
}
