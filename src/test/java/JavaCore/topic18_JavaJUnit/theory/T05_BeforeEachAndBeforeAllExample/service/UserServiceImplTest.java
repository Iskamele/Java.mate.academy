package JavaCore.topic18_JavaJUnit.theory.T05_BeforeEachAndBeforeAllExample.service;

import org.junit.jupiter.api.*;
import section04_JavaCore.topic18_JavaJUnit.theory.T05_BeforeEachAndBeforeAllExample.model.User;
import section04_JavaCore.topic18_JavaJUnit.theory.T05_BeforeEachAndBeforeAllExample.service.UserService;
import section04_JavaCore.topic18_JavaJUnit.theory.T05_BeforeEachAndBeforeAllExample.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {
    private static UserService userService;
    private List<User> users;

    @BeforeAll
    static void beforeAll() {
        userService = new UserServiceImpl();
    }

    @BeforeEach
    void setUp() {
        System.out.println("SetUp method");
        users = new ArrayList<>();
        users.add(new User("Bob", 23));
        users.add(new User("Alice", 22));
        users.add(new User("John", 17));
    }

    @Test
    void checkEmptyList_OK() {
        System.out.println("1");
        List<User> actual = userService.findByAgeGreaterThat(new ArrayList<>(), 10);
        assertTrue(actual.isEmpty());
    }

    @Test
    void validUserCase_OK() {
        System.out.println("2");
        List<User> actual = userService.findByAgeGreaterThat(users, 18);
        assertEquals(2, actual.size());
        assertTrue(actual.contains(new User("Bob", 23)));
        assertTrue(actual.contains(new User("Alice", 22)));
    }

    @Test
    void largeAge_Ok() {
        System.out.println("3");
        List<User> actual = userService.findByAgeGreaterThat(new ArrayList<>(), 81);
        assertEquals(0, actual.size());
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all");
        // This method need for to close some resources, which be open in beforeAll
    }
}