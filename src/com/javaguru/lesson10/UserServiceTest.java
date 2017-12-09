package com.javaguru.lesson10;

public class UserServiceTest {

    private static Database database;
    private static UserService userService;

    public static void main(String[] args) {
        beforeTest();
        shouldSaveUser();

        beforeTest();
        shouldGetUserById();
    }

    public static void beforeTest() {
        database = new HashMapDatabaseImpl();
        userService = new UserService(database);
    }
    public static void shouldSaveUser() {
        User user = new User("Test_Name", "Test_Surname");

        userService.saveUser(user);

        printResult("shouldSaveUser", user.getId().equals(0L));
    }

    static void shouldGetUserById() {
        User user = new User("Test_name", "Test_name");

        userService.saveUser(user);

        User userFromService = userService.getUser(user.getId());
        printResult("shouldGetUserById", userFromService.equals(user));
    }

    private static void printResult(String testName, boolean isEquals) {
        if (isEquals) {
            System.out.println(testName + ": Success");
        } else {
            System.out.println(testName + ": Fail");
        }
    }
}
