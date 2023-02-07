package section04_JavaCore.topic19_Java8Part3.theory.T03_HowToUseOptional;

import java.util.Optional;

public class DataBase {
    public Optional<User> getById(Long id){
        if (id == 10) {
            return Optional.of(new User("Bob"));
        }
        return Optional.empty();
    }
}
