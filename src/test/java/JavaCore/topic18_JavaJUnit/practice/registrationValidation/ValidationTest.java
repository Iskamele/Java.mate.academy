package JavaCore.topic18_JavaJUnit.practice.registrationValidation;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import section04_JavaCore.topic18_JavaJUnit.practice.registrationValidation.dao.StorageDaoImpl;
import section04_JavaCore.topic18_JavaJUnit.practice.registrationValidation.db.Storage;
import section04_JavaCore.topic18_JavaJUnit.practice.registrationValidation.exceptions.RegistrationException;
import section04_JavaCore.topic18_JavaJUnit.practice.registrationValidation.model.User;
import section04_JavaCore.topic18_JavaJUnit.practice.registrationValidation.service.RegistrationServiceImpl;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class ValidationTest {
    private static RegistrationServiceImpl registrationService;
    private static List<User> validUserData;
    private static StorageDaoImpl storageDaoImpl;
    private static int expectedStorageSize;

    private static final User bob = new User("bob", "bobPassword27", 27);
    private static final User alice = new User("alice96", "qwerty", 21);
    private static final User john = new User("josh_goldberg", "sh43u#Idsh", 18);
    private static final User mark = new User("marku$", "markus5", 60);

    @BeforeAll
    static void beforeAll() {
        registrationService = new RegistrationServiceImpl();
        storageDaoImpl = new StorageDaoImpl();


        expectedStorageSize = 4;
    }

    @BeforeEach
    void setUp() {
        validUserData = new ArrayList<>();
        validUserData.add(bob);
        validUserData.add(alice);
        validUserData.add(john);
        validUserData.add(mark);
    }

    @AfterEach
    void tearDown() {
        Storage.people.clear();
    }

    @Test
    void CheckCountOfPrivateFieldsInRegistrationService() {
        List<Field> privateFields = new ArrayList<>();
        List<Field> allFields = Arrays.asList(RegistrationServiceImpl.class.getDeclaredFields());
        for (Field field : allFields) {
            if (Modifier.isPrivate(field.getModifiers())) {
                privateFields.add(field);
            }
        }
        assertEquals(allFields.size(), privateFields.size(), "You should have private fields only!\n");
        assertTrue(privateFields.size() >= allFields.size(), "You should have at least " + allFields.size() + " fields");
    }

    @Test
    void registerValidUsers_Ok() throws RegistrationException {
        List<User> actual = new ArrayList<>();
        for (User user : validUserData) {
            registrationService.register(user);
            actual.add(storageDaoImpl.get(user.getLogin()));
        }

        assertEquals(expectedStorageSize, Storage.people.size(),
                "Test failed! The size isn't correct. Expected " + expectedStorageSize + " but was " + Storage.people.size());

        assertTrue(actual.contains(new User("bob", "bobPassword27", 27)),
                "Test failed! Хранилище должно содержать пользователя с логином bob");
        assertTrue(actual.contains(new User("alice96", "qwerty", 21)),
                "Test failed! Хранилище должно содержать пользователя с логином alice96");
        assertTrue(actual.contains(new User("josh_goldberg", "sh43u#Idsh", 18)),
                "Test failed! Хранилище должно содержать пользователя с логином josh_goldberg");
        assertTrue(actual.contains(new User("marku$", "markus5", 60)),
                "Test failed! Хранилище должно содержать пользователя с логином marku$");
    }

    @Test
    void registerNullUser_NotOk() {
        assertThrows(RegistrationException.class, () -> {
                    registrationService.register(null);
                },
                "Тест провален! Метод должен пробрасывать ошибку, если пользователь == null" + "\n");
    }

    @Test
    void registerSomeUser_NotOk() throws RegistrationException {
        registrationService.register(bob);
        registrationService.register(alice);
        assertEquals(2, Storage.people.size(),
                "Test failed! The size isn't correct. Expected " + 2 + " but was " + Storage.people.size());

        assertThrows(RegistrationException.class, () -> {
            registrationService.register(bob);
        }, "Ваш метод должен пробрасывать ошибку, если логин уже занят!" + "\n");
    }

    @Test
    void registerInvalidAge_NotOk() {
        assertThrows(RegistrationException.class, () -> {
            registrationService.register(new User("steve", "steveLongLongPasswordOfCourse", 15));
        }, "Ваш метод должен пробрасывать ошибку, если возраст пользователя не соответствует требованиям!" + "\n");
    }

    @Test
    void registerInvalidPasswordLength_NotOk() {
        assertThrows(RegistrationException.class, () -> {
            registrationService.register(new User("steve", "short", 25));
        }, "Ваш метод должен пробрасывать ошибку, если длина пароля не соответствует требованиям!" + "\n");
    }

    @Test
    void registerNullPassword_NotOk() {
        assertThrows(RegistrationException.class, () -> {
            registrationService.register(new User("steve", null, 25));
        }, "Ваш метод должен пробрасывать ошибку, если пароль == null!" + "\n");
    }

    @Test
    void registerAndGetValidUsers_Ok() throws RegistrationException {
        for (User user : validUserData) {
            registrationService.register(user);
        }
        assertEquals(expectedStorageSize, Storage.people.size(),
                "Test failed! The size isn't correct. Expected " + expectedStorageSize + " but was " + Storage.people.size());

        User actualBobUser = storageDaoImpl.get(bob.getLogin());
        User actualAliceUser = storageDaoImpl.get(alice.getLogin());
        User actualJohnUser = storageDaoImpl.get(john.getLogin());
        User actualMarkUser = storageDaoImpl.get(mark.getLogin());

        assertEquals(bob, actualBobUser,
                "Test failed! Storage expects to contain " + bob.getLogin() + ", "
                        + " but was " + actualBobUser);
        assertEquals(alice, actualAliceUser,
                "Test failed! Storage expects to contain " + alice.getLogin() + ", "
                        + " but was " + actualAliceUser);
        assertEquals(john, actualJohnUser,
                "Test failed! Storage expects to contain " + john.getLogin() + ", "
                        + " but was " + actualJohnUser);
        assertEquals(mark, actualMarkUser,
                "Test failed! Storage expects to contain " + mark.getLogin() + ", "
                        + " but was " + actualMarkUser);
    }

    @Test
    public void registerNullLogin_NotOk() {
        assertThrows(RegistrationException.class, () -> {
                    registrationService.register(new User(null, "pasdasd325", 52));
                },
                "Тест провален! Метод должен пробрасывать ошибку, если логин == null!" + "\n");
    }

    @Test
    public void registerNullAge_NotOk() {
        assertThrows(RegistrationException.class, () -> {
                    registrationService.register(new User("steve", "pasdas4d325", null));
                },
                "Тест провален! Метод должен пробрасывать ошибку, если возраст == null!" + "\n");
    }

    @Test
    void getNull_Ok() throws RegistrationException {
        for (User user : validUserData) {
            registrationService.register(user);
        }
        assertNull(storageDaoImpl.get(null),
                "Test failed! Метод должен вернуть null");
    }

    @Test
    void getByNonExistUser() {
        assertNull(storageDaoImpl.get(alice.getLogin()),
                "Test failed! Метод должен был вернуть null при несуществующем ключе " + alice.getLogin());
    }

    @Test
    void registerNegativeAge_NotOk() {
        assertThrows(RegistrationException.class, () -> {
                    registrationService.register(new User("steve", "pasdas4d325", -16));
                },
                "Тест провален! Метод должен пробрасывать ошибку, если возраст является негативным числом!" + "\n");
    }

    @Test
    void changeIndexAfterAdd_Ok() throws RegistrationException {
        registrationService.register(bob);
        long bobIndex = bob.getId();
        registrationService.register(alice);
        long aliceIndex = alice.getId();
        assertNotEquals(bobIndex, aliceIndex,
                "Тест провален! Индекс должен меняться (в нашем случае инкрементироваться) при добавлении регистрации пользователей!" + "\n");
    }
}
